
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.UnidadeLogica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class UnidadesLogicasDao {

    private final String comando = "wmic LOGICALDISK get DeviceID, DriveType, FreeSpace, FileSystem, VolumeName, VolumeSerialNumber, Size /format:csv";

    public List<UnidadeLogica> recuperarDados() throws IOException, Exception {

        List<String> lines = new LeitorWmic().executarProcessoMuitasLinhas(this.comando, "Node");
        String vetorTemp[];
        String vetor[] = new String[8];
        UnidadeLogica unidadeLogica;
        List<UnidadeLogica> unidadeLogicas = new ArrayList<>();
        for (String line : lines) {
            vetorTemp = line.split(",");
            if (vetorTemp.length < 8) { // unidade inválida?
                continue;
            }
            System.arraycopy(vetorTemp, 0, vetor, 0, vetorTemp.length);
            unidadeLogica = new UnidadeLogica(vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], vetor[7]);
            unidadeLogicas.add(unidadeLogica);
        }
        return unidadeLogicas;
    }
}
