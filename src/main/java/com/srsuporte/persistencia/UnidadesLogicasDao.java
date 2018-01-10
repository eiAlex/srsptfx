/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public List<UnidadeLogica> recuperarDados() throws IOException {
        List<String> lines = new LeitorWmic().executarProcessoMuitasLinhas(this.comando, "Node");
        String vetor[];
        UnidadeLogica unidadeLogica;
        List<UnidadeLogica> unidadeLogicas = new ArrayList<>();
        for (String line : lines) {
            vetor = line.split(",");
            unidadeLogica = new UnidadeLogica(vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], vetor[7]);
            unidadeLogicas.add(unidadeLogica);
        }
        return unidadeLogicas;
    }
}
