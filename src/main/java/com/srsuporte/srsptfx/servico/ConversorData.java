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
public class ConversorData {
    
    /**
     * Exeplo de data (20100804)
     * @param data -> anomesdia (aaaammdd)
     * @return Java.Util.GregorianCalendar
     * @throws com.srsuporte.srsptfx.servico.FormatoDataInvalidaException
     */
    public Calendar converterData(String data) throws FormatoDataInvalidaException{
        if(data.length() < 8){
            throw new FormatoDataInvalidaException("Data: "+ data + " não deve ser menor que 8 caracteres");
        }
        int ano = Integer.parseInt(data.substring(0, 4));
        int mes = Integer.parseInt(data.substring(4, 6));
        int dia = Integer.parseInt(data.substring(6, 8));
        Calendar calendario = new GregorianCalendar(ano, mes-1, dia);
        return calendario;
    }
    
}
