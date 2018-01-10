/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.UnidadesDeArmazenamentoDao;
import com.srsuporte.srsptfx.model.UnidadeFisica;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Suporte
 */
public class UnidadesDeAramazenamentoDaoTest {

    private List<UnidadeFisica> unidadeFisicas;
    @Before
    public void onInit() throws IOException {
        unidadeFisicas = new UnidadesDeArmazenamentoDao().recuperarDados();
    }

    @Test
    public void naoDeveSerVazia() {
        Assert.assertTrue(!unidadeFisicas.isEmpty());
    }

    @Test
    public void deveriaLerDescription() {
        unidadeFisicas.forEach((u) -> {
            Assert.assertTrue(u.getDescription() != null);
        });
    }

    @Test
    public void deveriaLerDeviceId() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getDeviceID() != null);
        }
    }

    @Test
    public void deveriaLerModel() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getModel() != null);
        }
    }

    @Test
    public void deveriaLerPNPDeviceID() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getPNPDeviceID() != null);
        }
    }

    @Test
    public void deveriaLerStatus() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getStatus() != null);
        }
    }

    @Test
    public void deveriaLerIndex() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getIndex() != null);
        }
    }

    @Test
    public void deveriaLerPartitions() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getPartitions() != null);
        }
    }

    @Test
    public void deveriaLerSize() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(u.getSize() != null);
        }
    }

    @Test
    public void unidadeLogicaNaoDeveSerVazia() {
        for (UnidadeFisica u : unidadeFisicas) {
            Assert.assertTrue(!u.getUnidadeLogica().isEmpty());
        }
    }

}
