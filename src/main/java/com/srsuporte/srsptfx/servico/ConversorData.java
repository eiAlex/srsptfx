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
    /**
     *Exemplo de data(20100804120334)
     * 
     * @param data -> ano/mes/dia/hora/minutos/segundos
     * @return Java.Util.GregorianCalendar 
     * @throws com.srsuporte.srsptfx.servico.FormatoDataInvalidaException 
     */
    public Calendar converterDataCompleta(String data) throws FormatoDataInvalidaException{
        if(data.length() < 14){
            throw new FormatoDataInvalidaException("Data: " + data + " não deve ser menor que 14 caracteres");
        }
        
        Calendar calendario = this.converterData(data.substring(0, 8));
        int hora = Integer.parseInt(data.substring(8, 10));
        int minutos = Integer.parseInt(data.substring(10, 12));
        int segundos = Integer.parseInt(data.substring(12, 14));
        calendario.set(Calendar.HOUR_OF_DAY, hora);
        calendario.set(Calendar.MINUTE, minutos);
        calendario.set(Calendar.SECOND, segundos);
        
        return calendario;
    }
}
