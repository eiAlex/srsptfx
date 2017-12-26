/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.PlacaMaeDao;
import com.srsuporte.srsptfx.model.PlacaMae;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class PlacaMaeDaoTest {
    
    private PlacaMae placaMae;
    
    @Before
    public void onInit() throws IOException{
        placaMae = new PlacaMaeDao().recuperarDados();
    }
    
    @Test
    public void deveriaLerOFabricate(){
        Assert.assertEquals("ASUSTeK Computer INC.", this.placaMae.getFabricante());
    }
    
    @Test
    public void deveriaLerOModelo(){
        Assert.assertEquals("M2N68-AM SE2", placaMae.getModelo());
    }
}