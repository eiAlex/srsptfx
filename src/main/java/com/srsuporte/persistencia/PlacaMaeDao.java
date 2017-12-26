/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.PlacaMae;
import java.io.IOException;

/**
 *
 * @author Sr computador
 */
public class PlacaMaeDao {
    
    private final String comando = "wmic baseboard get description, manufacturer, product, name, SerialNumber, version /format:csv";
    
    public PlacaMae recuperarDados() throws IOException{
        String texto = new LeitorWmic().executarProcesso(this.comando, "Node");
        String[] vetor = texto.split(",");
        return new PlacaMae(vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6]);
    }
    
}
