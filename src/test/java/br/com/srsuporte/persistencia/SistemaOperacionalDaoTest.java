/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.LeitorWmic;
import com.srsuporte.persistencia.SistemaOperacionalDao;
import com.srsuporte.srsptfx.model.SistemaOperacional;
import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class SistemaOperacionalDaoTest {

    private SistemaOperacional so;
    
    @Before
    public void onInit() throws IOException, FormatoDataInvalidaException{
        this.so = new SistemaOperacionalDao(new LeitorWmic(), new ConversorData()).recuperarDados();
    }
    
    @Test
    public void deveriaLerADescricaoDoNucleo(){
        Assert.assertTrue(this.so.getDescricaoNucleo() != null);
    }
    
    @Test
    public void deveriaLerOIdioma(){
        Assert.assertTrue(this.so.getIdioma() != null);
    }
    
    @Test
    public void deveriaLerONome(){
        Assert.assertTrue(this.so.getNome() != null);
    }
    
    @Test
    public void deveriaLerAVersao() {
        Assert.assertTrue(this.so.getVersao() != null);
    }
    
    @Test
    public void deveriaLerOPathDaPastaRaiz(){
        Assert.assertTrue(this.so.getPathPastaRaiz() != null);
    }
}
