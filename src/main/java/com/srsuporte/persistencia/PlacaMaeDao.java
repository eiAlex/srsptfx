/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.PlacaMae;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sr computador
 */
public class PlacaMaeDao {
    
    public PlacaMae recuperarDados() throws IOException{
        Runtime runtime = Runtime.getRuntime();
        Process wmic = runtime.exec("wmic baseboard get description, manufacturer, model, name, SerialNumber, version /format:csv");
        BufferedReader leitor = new BufferedReader(new InputStreamReader(wmic.getInputStream()));
        String texto = leitor.readLine();
        while(texto != null){
            if(texto.contains("Node")){
                leitor.readLine();
                texto = leitor.readLine();
                break;
            }
            texto = leitor.readLine();
        }
        String[] vetor = texto.split(",");
        return new PlacaMae(vetor[1], vetor[3], vetor[4], vetor[5], vetor[6], vetor[2]);
    }
    
}
