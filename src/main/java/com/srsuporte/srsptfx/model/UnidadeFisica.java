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
public class UnidadeFisica {
    private String description;
    private String deviceID;
    private int index;
    private String model;
    private int partitions;
    private String PNPDeviceID;
    private long size;
    private String status;
    private UnidadeLogica unidadeLogica;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String DeviceID) {
        this.deviceID = DeviceID;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPartitions() {
        return partitions;
    }

    public void setPartitions(int partitions) {
        this.partitions = partitions;
    }

    public String getPNPDeviceID() {
        return PNPDeviceID;
    }

    public void setPNPDeviceID(String PNPDeviceID) {
        this.PNPDeviceID = PNPDeviceID;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UnidadeLogica getUnidadeLogica() {
        return unidadeLogica;
    }

    public void setUnidadeLogica(UnidadeLogica unidadeLogica) {
        this.unidadeLogica = unidadeLogica;
    }

}
