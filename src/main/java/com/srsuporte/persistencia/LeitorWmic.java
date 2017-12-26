/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sr computador
 */
public class LeitorWmic {
    
    public String executarProcesso(String comando, String delimitador) throws IOException{
        Process exec = Runtime.getRuntime().exec(comando);
        BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String texto = br.readLine();
        while(texto != null){
            if(texto.contains(delimitador)){
                br.readLine();
                texto = br.readLine();
                return texto;
            }
            texto = br.readLine();
        }
        return null;
    }
    
}
