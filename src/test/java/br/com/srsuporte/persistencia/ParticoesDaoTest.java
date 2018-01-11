/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.ParticaoDao;
import com.srsuporte.srsptfx.model.Particao;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class ParticoesDaoTest {

    Particao particao;
    List<Particao> particoes;

    @Before
    public void onInit() throws IOException {
        particoes = (new ParticaoDao()).recuperarDados();
        naoDeveSerVazio();
        particao = particoes.get(0);
    }
    public void naoDeveSerVazio() {
        Assert.assertTrue(!particoes.isEmpty());
    }

    @Test
    public void deveriaRetornarIndex() {
        Assert.assertTrue(particao.getIndex() != null);
    }

    @Test
    public void deveriaRetornarDiskIndex() {
        Assert.assertTrue(particao.getDiskIndex() != null);
    }

    @Test
    public void deveriaRetornarLetra() {
        Assert.assertTrue(particao.getLetra() != null);
    }
}
