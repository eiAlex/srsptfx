/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.servico;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sr computador
 */
public class OperacaoData {

    public Calendar encontrarDiferencaEntreDatas(Calendar dataInicial, Calendar dataFinal){
        Calendar data = new GregorianCalendar();
        data.set(Calendar.YEAR, dataFinal.get(Calendar.YEAR) - dataInicial.get(Calendar.YEAR));
        data.set(Calendar.MONTH, dataFinal.get(Calendar.MONTH) - dataInicial.get(Calendar.MONTH));
        data.set(Calendar.DAY_OF_MONTH, dataFinal.get(Calendar.DAY_OF_MONTH) - dataInicial.get(Calendar.DAY_OF_MONTH));
        data.set(Calendar.HOUR_OF_DAY, dataFinal.get(Calendar.HOUR_OF_DAY) - dataInicial.get(Calendar.HOUR_OF_DAY));
        data.set(Calendar.MINUTE, dataFinal.get(Calendar.MINUTE) - dataInicial.get(Calendar.MINUTE));
        data.set(Calendar.SECOND, dataFinal.get(Calendar.SECOND) - dataInicial.get(Calendar.SECOND));
        data.set(Calendar.MILLISECOND, dataFinal.get(Calendar.MILLISECOND) - dataInicial.get(Calendar.MILLISECOND));
        return data;
    }
    
}
