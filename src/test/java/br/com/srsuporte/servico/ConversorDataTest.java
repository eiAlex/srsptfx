/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.servico;

import com.srsuporte.srsptfx.servico.ConversorData;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class ConversorDataTest {
    
    @Test
    public void deveriaConverterUmaData(){
        ConversorData conversor = new ConversorData();
        Calendar data = conversor.converterData("20171226");
        GregorianCalendar valorEsperado = new GregorianCalendar();
        
        valorEsperado.set(Calendar.YEAR, 2017);
        valorEsperado.set(Calendar.MONTH, Calendar.DECEMBER);
        valorEsperado.set(Calendar.DAY_OF_MONTH, 26);
        
        Assert.assertEquals(valorEsperado.get(Calendar.YEAR), data.get(Calendar.YEAR));
        Assert.assertEquals(valorEsperado.get(Calendar.MONTH), data.get(Calendar.MONTH));
        Assert.assertEquals(valorEsperado.get(Calendar.DAY_OF_MONTH), data.get(Calendar.DAY_OF_MONTH));
    }
   
}
