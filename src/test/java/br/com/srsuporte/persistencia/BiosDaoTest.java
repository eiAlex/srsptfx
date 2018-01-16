
package br.com.srsuporte.persistencia;

import com.srsuporte.persistencia.BiosDao;
import com.srsuporte.srsptfx.model.Bios;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
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
    public void onInit() throws IOException, FormatoDataInvalidaException {
        bios = new BiosDao().recuperarDados();
    }

    @Test
    public void deveriaRecuperarUmObjetoBiosPopulado() {
        Assert.assertTrue(bios != null);
    }

    @Test
    public void deveriaRecuperarAVersaoDaBios() {
        Assert.assertTrue(bios.getVersao() != null);
    }
    
    @Test
    public void deveriaRecuperarOFabricanteDaBios() {
        Assert.assertTrue(bios.getFabricante() != null);
    }
    
    @Test
    public void deveriaRecuperarADataDaBios(){
        Assert.assertTrue(bios.getDataBios() != null);
    }

}
