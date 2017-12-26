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
public class PlacaMae {

    private String descricao;
    private String modelo;
    private String nome;
    private String serial;
    private String versao;

    private String fabricante;

    public PlacaMae() {
    }
    
    public PlacaMae(String descricao, String modelo, String nome, String serial, String versao, String fabricante) {
        this.descricao = descricao;
        this.modelo = modelo;
        this.nome = nome;
        this.serial = serial;
        this.versao = versao;
        this.fabricante = fabricante;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
