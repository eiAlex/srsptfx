/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.model;

/**
 *
 * @author Suporte
 */
public class Particao {

    private Integer particaoIndex;
    private String letra;
    private Integer diskIndex;

    public Particao() {
    }

    public Particao(String diskIndex, String index, String letra) {
        this.diskIndex = Integer.valueOf(diskIndex);
        this.particaoIndex = Integer.valueOf(index);
        this.letra = letra;
    }

    public Integer getIndex() {
        return particaoIndex;
    }

    public void setIndex(Integer index) {
        this.particaoIndex = index;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getDiskIndex() {
        return diskIndex;
    }

    public void setDiskIndex(Integer diskIndex) {
        this.diskIndex = diskIndex;
    }

}
