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
public class SistemaOperacional {
    
    private String nome;
    private String idioma;
    private String descricaoNucleo;
    private String versao;
    private Calendar dataInstalacao;
    private String pathPastaRaiz;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDescricaoNucleo() {
        return descricaoNucleo;
    }

    public void setDescricaoNucleo(String descricaoNucleo) {
        this.descricaoNucleo = descricaoNucleo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Calendar getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(Calendar dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public String getPathPastaRaiz() {
        return pathPastaRaiz;
    }

    public void setPathPastaRaiz(String pathPastaRaiz) {
        this.pathPastaRaiz = pathPastaRaiz;
    }
    
    
}
