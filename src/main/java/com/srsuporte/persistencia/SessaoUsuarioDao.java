/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.SessaoUsuario;
import java.io.IOException;

/**
 *
 * @author Sr computador
 */
public class SessaoUsuarioDao {
    
    private final String comando = "wmic computersystem get primaryownername, domain /format:csv";
    
    public void recuperarDados() throws IOException {
        String texto = new LeitorWmic().executarProcesso(comando, "Node");
        String[] vetor = texto.split(",");
        SessaoUsuario su = new SessaoUsuario(vetor[0], vetor[1], vetor[2]);
        
    }
    
}
