/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.persistencia.LeitorWmic;
import com.srsuporte.srsptfx.model.MemoriaRamTotal;
import java.io.IOException;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class MemoriaRamTotalDao {
    private final String comandoFreeMemory = "wmic path win32_OperatingSystem get FreePhysicalMemory /format:csv";
    private final String comandoTotalMemory = "wmic path win32_OperatingSystem get FreePhysicalMemory /format:csv";

    public MemoriaRamTotal recuperarDados() throws IOException {
        LeitorWmic leitor = new LeitorWmic();
        String str1 = leitor.executarProcesso(comandoFreeMemory, "Node");
        String str2 = leitor.executarProcesso(comandoTotalMemory, "Node");
        String[] vet1 = str1.split(",");
        String[] vet2 = str2.split(",");
        MemoriaRamTotal memoriaRamTotal = new MemoriaRamTotal(vet2[1], vet1[1], null);
        return memoriaRamTotal;
    }
}
