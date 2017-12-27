/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.srsuporte.servico;

import com.srsuporte.srsptfx.servico.OperacaoData;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Sr computador
 */
public class OperacaoDataTest {
    
    @Test
    public void deveriaEncontrarADiferencaEntreDuasDatas(){
        GregorianCalendar dataInicial = new GregorianCalendar(2010, 0, 4, 10, 1, 30);
        dataInicial.set(Calendar.MILLISECOND, 10);
  
        GregorianCalendar dataFinal = new GregorianCalendar(2017, 11, 6, 12, 3, 34);
        dataFinal.set(Calendar.MILLISECOND, 40);
        Calendar data = new OperacaoData().encontrarDiferencaEntreDatas(dataInicial, dataFinal);
        
        Assert.assertEquals(7, data.get(Calendar.YEAR));
        Assert.assertEquals(11, data.get(Calendar.MONTH));
        Assert.assertEquals(2, data.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(2, data.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(2, data.get(Calendar.MINUTE));
        Assert.assertEquals(4, data.get(Calendar.SECOND));
        Assert.assertEquals(30, data.get(Calendar.MILLISECOND));
    }
    
}
