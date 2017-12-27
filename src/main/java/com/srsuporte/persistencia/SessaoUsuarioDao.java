/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.SessaoUsuario;
import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import com.srsuporte.srsptfx.servico.OperacaoData;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Sr computador
 */
public class SessaoUsuarioDao {
    
    private final String comando = "wmic computersystem get primaryownername, domain /format:csv";
    private final String comandoHoraLogin = "wmic logon get starttime";
    
    private final ConversorData conversor;
    private final OperacaoData operacaoData;
    
    public SessaoUsuarioDao(ConversorData conversor, OperacaoData operacaoData){
        this.conversor = conversor;
        this.operacaoData = operacaoData;
    }
    
    public SessaoUsuario recuperarDados() throws IOException, FormatoDataInvalidaException {
        String texto = new LeitorWmic().executarProcesso(this.comando, "Node");
        String[] vetor = texto.split(",");
        SessaoUsuario su = new SessaoUsuario(vetor[0], vetor[1], vetor[2]);
        su.setTempoAtivo(this.recuperarTempoAtivo());
        return su;
    }
    
    public Calendar recuperarTempoAtivo() throws IOException, FormatoDataInvalidaException{
        String texto = new LeitorWmic().executarProcesso(this.comandoHoraLogin, "StartTime");
        Calendar dataLogin = conversor.converterDataCompleta(texto);
        return this.operacaoData.encontrarDiferencaEntreDatas(dataLogin, Calendar.getInstance());
        
    }
}
