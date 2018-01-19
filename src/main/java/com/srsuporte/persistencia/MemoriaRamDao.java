/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.MemoriaRam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class MemoriaRamDao {
    private final String comando = "wmic path Win32_PhysicalMemory get BankLabel, Capacity, DeviceLocator, Manufacturer, PositionInRow, SerialNumber, Speed, Tag /format:csv";

    public List<MemoriaRam> recuperarDados() throws IOException {
        LeitorWmic leitor = new LeitorWmic();
        List<String> strs = leitor.executarProcessoMuitasLinhas(comando, "Node");
        List<MemoriaRam> memorias = new ArrayList<>();
        MemoriaRam memoria;
        for (String s : strs) {
            String vet[] = s.split(",");
            memoria = new MemoriaRam(vet[1], vet[2], vet[3], vet[4], vet[5], vet[6], vet[7], vet[8]);
            memorias.add(memoria);
        }
        return memorias;
    }
}
