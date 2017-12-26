/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.BiosDao;
import com.srsuporte.srsptfx.model.Bios;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class BiosDaoTest {

    private Bios bios;

    @Before
    public void onInit() throws IOException {
        bios = new BiosDao().recuperarDadosBios();
    }

    @Test
    public void deveriaRecuperarUmObjetoBiosPopulado() {
        Assert.assertTrue(bios != null);
    }

    @Test
    public void deveriaRecuperarAVersaoDaBios() {
        Assert.assertEquals("060810 - 20100608", bios.getVersao());
    }
    
    @Test
    public void deveriaRecuperarOFabricanteDaBios() {
        Assert.assertEquals("American Megatrends Inc.", bios.getFabricante());
    }
    
    @Test
    public void deveriaRecuperarADataDaBios(){
        Assert.assertTrue(bios.getDataBios() != null);
    }

}
