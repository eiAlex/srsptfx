/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.model;

/**
 *
 * @author joao
 */
public class Fabricante {

    private String nome;
    private String linkDownload;
    private String linkInformacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }

    public String getLinkInformacoes() {
        return linkInformacoes;
    }

    public void setLinkInformacoes(String linkInformacoes) {
        this.linkInformacoes = linkInformacoes;
    }

}
