/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.model;

import java.util.Calendar;

/**
 *
 * @author joao
 */
public class Bios {

    private Calendar dataBios;
    private String versao;
    private Fabricante fabricante;

    public Calendar getDataBios() {
        return dataBios;
    }

    public void setDataBios(Calendar dataBios) {
        this.dataBios = dataBios;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
}
