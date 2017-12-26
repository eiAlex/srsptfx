/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.Bios;
import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Sr computador
 */
public class BiosDao {
    
    private final String comando = "wmic bios get manufacturer, releasedate, version /format:csv";
    
    public Bios recuperarDados() throws IOException, FormatoDataInvalidaException {
        String texto = new LeitorWmic().executarProcesso(this.comando, "Node");
        String[] vetor = texto.split(",");
        Calendar data = new ConversorData().converterData(vetor[2]);
        return new Bios(data, vetor[3], vetor[1]);
    }

}
