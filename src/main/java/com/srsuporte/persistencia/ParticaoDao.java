
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.Particao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Suporte
 */
public class ParticaoDao {

    private final String comando = "wmic path win32_logicaldiskToPartition get * /format:csv";

    public List<Particao> recuperarDados() throws IOException {
        LeitorWmic leitor = new LeitorWmic();
        List<String> strs = leitor.executarProcessoMuitasLinhas(comando, "Node");
        List<Particao> particoes = new ArrayList<>();
        Particao particao;
        for (String s : strs) {
            String vet[] = s.split(",");
            String[] atributos = processarStrings(vet);
            particao = new Particao(atributos[0], atributos[1], atributos[2]);
            particoes.add(particao);
        };
        return particoes;
    }
    /**
     *
     * @param vet
     * @return String[3] : { Disk Index, Partition/Number, DeviceId/Letter }
     */
    private String[] processarStrings(String[] vet) {
        String diskIndex = vet[1].substring(vet[1].indexOf("Disk #") + 6);
        String partition = vet[2].substring(vet[2].indexOf("Partition #") + 11);
        partition = partition.replace("\"", "");
        String deviceId = vet[4].substring(vet[4].indexOf("ID=\"") + 4);
        deviceId = deviceId.replace(":\"", "") + "";
        return new String[]{diskIndex, partition, deviceId};
    }
}
