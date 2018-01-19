/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.MemoriaRamDao;
import com.srsuporte.srsptfx.model.MemoriaRam;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class MemoriaRamDaoTest {
    MemoriaRam memoriaRam;
    List<MemoriaRam> memorias;

    @Before
    public void onInit() throws IOException {
        memorias = (new MemoriaRamDao()).recuperarDados();
        naoDeveSerVazio();
        memoriaRam = memorias.get(0);
    }

    public void naoDeveSerVazio() {
        Assert.assertTrue(!memorias.isEmpty());
    }

    @Test
    public void deveriaRetornarBankLabel() {
        Assert.assertTrue(memoriaRam.getBankLabel() != null);
    }

    @Test
    public void deveriaRetornarCapacity() {
        Assert.assertTrue(memoriaRam.getCapacity() != null);
    }

    @Test
    public void deveriaRetornarDeviceLocator() {
        Assert.assertTrue(memoriaRam.getDeviceLocator() != null);
    }

    @Test
    public void deveriaRetornarManufacture() {
        Assert.assertTrue(memoriaRam.getManufacturer() != null);
    }

    @Test
    public void deveriaRetornarPositionInRow() {
        Assert.assertTrue(memoriaRam.getPositionInRow() != null);
    }

    @Test
    public void deveriaRetornarSerialNumber() {
        Assert.assertTrue(memoriaRam.getSerialNumber() != null);
    }

    @Test
    public void deveriaRetornarSpeed() {
        Assert.assertTrue(memoriaRam.getSpeed() != null);
    }

    @Test
    public void deveriaRetornarTag() {
        Assert.assertTrue(memoriaRam.getTag() != null);
    }
}
