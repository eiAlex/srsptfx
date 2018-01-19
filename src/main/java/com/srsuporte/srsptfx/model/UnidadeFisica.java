/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.model;

import java.util.List;

/**
 *
 * @author Suporte
 */
public class UnidadeFisica {
    private String description;
    private String deviceID;
    private Integer index;
    private String model;
    private Integer partitions;
    private String PNPDeviceID;
    private Long size;
    private String status; // OK, BAD, Caution, Unknow (Smart detect)
    private List<UnidadeLogica> unidadeLogica;

    public UnidadeFisica(String description, String deviceID, String index, String model, String partitions, String PNPDeviceID, String size, String status, List<UnidadeLogica> unidadeLogica) {
        this.description = description;
        this.deviceID = deviceID;
        this.index = index.isEmpty() ? null : Integer.valueOf(index);
        this.model = model;
        this.partitions = partitions.isEmpty() ? null : Integer.valueOf(partitions);
        this.PNPDeviceID = PNPDeviceID;
        this.size = size.isEmpty() ? null : Long.valueOf(size);
        this.status = status;
        this.unidadeLogica = unidadeLogica;
    }

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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPartitions() {
        return partitions;
    }

    public void setPartitions(Integer partitions) {
        this.partitions = partitions;
    }

    public String getPNPDeviceID() {
        return PNPDeviceID;
    }

    public void setPNPDeviceID(String PNPDeviceID) {
        this.PNPDeviceID = PNPDeviceID;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List getUnidadeLogica() {
        return unidadeLogica;
    }

    public void setUnidadeLogica(List<UnidadeLogica> unidadeLogica) {
        this.unidadeLogica = unidadeLogica;
    }

}
