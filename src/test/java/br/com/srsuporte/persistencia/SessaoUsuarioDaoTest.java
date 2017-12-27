/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.SessaoUsuarioDao;
import com.srsuporte.srsptfx.model.SessaoUsuario;
import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import com.srsuporte.srsptfx.servico.OperacaoData;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class SessaoUsuarioDaoTest {

    private SessaoUsuario sessaoUsuario;
    
    @Before
    public void onInit() throws IOException, FormatoDataInvalidaException{
         this.sessaoUsuario = new SessaoUsuarioDao(new ConversorData(), new OperacaoData()).recuperarDados();
    }
    
    @Test
    public void deveriaLerONomeDoComputador(){
        Assert.assertEquals("DESENVOLVIMENTO", this.sessaoUsuario.getNomeComputador());
    }

    @Test
    public void deveriaLerONomeDoUsuario() {
        Assert.assertEquals("Sr computador", this.sessaoUsuario.getNomeUsuario());
    }
    
    @Test
    public void deveriaLerONomeDoDominio() {
        Assert.assertEquals("WORKGROUP", this.sessaoUsuario.getNomeDominio());
    }
    
    @Test
    public void deveriaLerOTempoAtivo() {
        Assert.assertTrue(this.sessaoUsuario.getTempoAtivo() != null);
    }
    
}
