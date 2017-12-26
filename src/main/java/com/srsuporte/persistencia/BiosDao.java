/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.Bios;
import com.srsuporte.srsptfx.servico.ConversorData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 *
 * @author Sr computador
 */
public class BiosDao {

    public Bios recuperarDadosBios() throws IOException {
        Process exec = Runtime.getRuntime().exec("wmic bios get manufacturer, releasedate, version /format:csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String texto = br.readLine();
        while(texto != null){
            if(texto.contains("Version")){
                br.readLine();
                texto = br.readLine();
                break;
            }
            texto = br.readLine();
        }
        String[] vetor = texto.split(",");
        Calendar data = new ConversorData().converterData(vetor[2]);
        return new Bios(data, vetor[3], vetor[1]);
    }

}
