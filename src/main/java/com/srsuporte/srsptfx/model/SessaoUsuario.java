/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.model;

import java.util.Calendar;

/**
 *
 * @author Sr computador
 */
public class SessaoUsuario {
    
    private String nomeComputador;
    private String nomeDominio;
    private String nomeUsuario; 
    
    private Calendar tempoAtivo;

    public SessaoUsuario() {
    }
    
    public SessaoUsuario(String nomeComputador, String nomeDominio, String nomeUsuario) {
        this.nomeComputador = nomeComputador;
        this.nomeDominio = nomeDominio;
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getNomeComputador() {
        return nomeComputador;
    }

    public void setNomeComputador(String nomeComputador) {
        this.nomeComputador = nomeComputador;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeDominio() {
        return nomeDominio;
    }

    public void setNomeDominio(String nomeDominio) {
        this.nomeDominio = nomeDominio;
    }

    public Calendar getTempoAtivo() {
        return tempoAtivo;
    }

    public void setTempoAtivo(Calendar tempoAtivo) {
        this.tempoAtivo = tempoAtivo;
    }
    
    
    
}
