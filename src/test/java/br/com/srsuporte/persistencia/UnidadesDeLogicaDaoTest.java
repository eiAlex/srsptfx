/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.UnidadesDeArmazenamentoDao;
import com.srsuporte.persistencia.UnidadesLogicasDao;
import com.srsuporte.srsptfx.model.UnidadeLogica;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Suporte
 */
public class UnidadesDeLogicaDaoTest {

    private List<UnidadeLogica> unidadeLogica;
    @Before
    public void onInit() throws IOException {
        unidadeLogica = new UnidadesLogicasDao().recuperarDados();
    }

    @Test
    public void naoDeveSerVazia() {
        Assert.assertTrue(!unidadeLogica.isEmpty());
    }

    @Test
    public void deveriaLerDeviceId() {
        for (UnidadeLogica u : unidadeLogica) {
            Assert.assertTrue(u.getDeviceID() != null);
        }
    }

    @Test
    public void deveriaLerFileSystem() {
        for (UnidadeLogica u : unidadeLogica) {
            Assert.assertTrue(u.getFileSystem() != null);
        }
    }

    @Test
    public void deveriaLerVolumeName() {
        for (UnidadeLogica u : unidadeLogica) {
            Assert.assertTrue(u.getVolumeName() != null);
        }
    }

    @Test
    public void deveriaLerVolumeSerial() {
        for (UnidadeLogica u : unidadeLogica) {
            Assert.assertTrue(u.getVolumeSerialNumber() != null);
        }
    }

    @Test
    public void deveriaLerDriveType() {
        for (UnidadeLogica u : unidadeLogica) {
            Assert.assertTrue(u.getDriveType() != null);
        }
    }

    @Test
    public void deveriaLerSize() {
        for (UnidadeLogica u : unidadeLogica) {
            Assert.assertTrue(u.getSize() != null);
        }
    }

}
