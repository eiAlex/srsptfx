/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.MemoriaRamTotalDao;
import com.srsuporte.srsptfx.model.MemoriaRamTotal;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class MemoriaRamTotalDaoTest {

    MemoriaRamTotal memoria;

    public MemoriaRamTotalDaoTest() throws IOException {
        memoria = (new MemoriaRamTotalDao()).recuperarDados();
    }

    @Before
    public void setUp() {
        assertTrue(memoria != null);
    }

    @Test
    public void deveriaRetornarFreeSpace() throws Exception {
        Assert.assertTrue(memoria.getFreeSpace() != null);
    }

    @Test
    public void deveriaRetornarUsage() {
        Assert.assertTrue(memoria.getUsage() != null);
    }

    @Test
    public void deveriaRetornarSize() {
        Assert.assertTrue(memoria.getSize() != null);
    }
}
