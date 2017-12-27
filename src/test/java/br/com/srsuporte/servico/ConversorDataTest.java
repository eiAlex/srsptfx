/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.servico;

import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class ConversorDataTest {

    private ConversorData conversor;
    
    @Before
    public void onInit() {
        conversor = new ConversorData();
    }

    @Test
    public void deveriaConverterUmaData() throws FormatoDataInvalidaException {
        Calendar data = conversor.converterData("20171226");
        GregorianCalendar valorEsperado = new GregorianCalendar();

        valorEsperado.set(Calendar.YEAR, 2017);
        valorEsperado.set(Calendar.MONTH, Calendar.DECEMBER);
        valorEsperado.set(Calendar.DAY_OF_MONTH, 26);

        Assert.assertEquals(valorEsperado.get(Calendar.YEAR), data.get(Calendar.YEAR));
        Assert.assertEquals(valorEsperado.get(Calendar.MONTH), data.get(Calendar.MONTH));
        Assert.assertEquals(valorEsperado.get(Calendar.DAY_OF_MONTH), data.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void deveriaConverterUmaDataCompleto() throws FormatoDataInvalidaException{
        Calendar data = conversor.converterDataCompleta("20101204120334");
        GregorianCalendar valorEsperado = new GregorianCalendar();
        
        valorEsperado.set(Calendar.YEAR, 2010);
        valorEsperado.set(Calendar.MONTH, Calendar.DECEMBER);
        valorEsperado.set(Calendar.DAY_OF_MONTH, 4);
        valorEsperado.set(Calendar.HOUR_OF_DAY, 12);
        valorEsperado.set(Calendar.MINUTE, 3);
        valorEsperado.set(Calendar.SECOND, 34);
        
        Assert.assertEquals(valorEsperado.get(Calendar.YEAR), data.get(Calendar.YEAR));
        Assert.assertEquals(valorEsperado.get(Calendar.MONTH), data.get(Calendar.MONTH));
        Assert.assertEquals(valorEsperado.get(Calendar.DAY_OF_MONTH), data.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(valorEsperado.get(Calendar.HOUR_OF_DAY), data.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(valorEsperado.get(Calendar.MINUTE), data.get(Calendar.MINUTE));
        Assert.assertEquals(valorEsperado.get(Calendar.SECOND), data.get(Calendar.SECOND));
                
    }
    
    @Test(expected = FormatoDataInvalidaException.class)
    public void deveriaDispararUmFormatoDataInvalidaExcpetionDeMinimo8Digitos() throws FormatoDataInvalidaException {
        conversor.converterData("123");
    }
    
    @Test(expected = FormatoDataInvalidaException.class)
    public void deveriaDispararUmFormatoDataInvalidaExcpetionDeMinimo14Digitos() throws FormatoDataInvalidaException {
        conversor.converterDataCompleta("12345678910");
    }
}
