/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.LeitorDiskPart;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class ParticoesTest {

    private LeitorDiskPart leitorDiskPart;
    private Map<Integer, List> parts;

    @Before
    public void onInit() throws IOException {
        leitorDiskPart = new LeitorDiskPart();
        parts = leitorDiskPart.executarProcesso("diskpart /s scripts/qtd_partcoes.txt");
    }

    @Test
    public void mostrarparticoes() {
        for (Map.Entry entry : parts.entrySet()) {
            System.err.println("-----------------------------------");
            System.err.println(entry.getKey());
            System.err.println(entry.getValue());
        }
    }

}
