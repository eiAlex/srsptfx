/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.model;

/**
 *
 * @author Your Name <Leandro Cadete at your.org>
 */
public class MemoriaRam {
    private String bankLabel;
    private Long capacity;
    private String deviceLocator;
    private String manufacturer;
    private String positionInRow;
    private String serialNumber;
    private Long speed;
    private String tag;

    public MemoriaRam(String bankLabel, String capacity, String deviceLocator, String manufacturer, String positionInRow, String serialNumber, String speed, String tag) {
        this.bankLabel = bankLabel;
        this.capacity = capacity.isEmpty() ? null : Long.valueOf(capacity);
        this.deviceLocator = deviceLocator;
        this.manufacturer = manufacturer;
        this.positionInRow = positionInRow;
        this.serialNumber = serialNumber;
        this.speed = speed.isEmpty() ? null : Long.valueOf(speed);
        this.tag = tag;
    }

    public MemoriaRam() {
    }

    public String getBankLabel() {
        return bankLabel;
    }

    public void setBankLabel(String bankLabel) {
        this.bankLabel = bankLabel;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getDeviceLocator() {
        return deviceLocator;
    }

    public void setDeviceLocator(String deviceLocator) {
        this.deviceLocator = deviceLocator;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPositionInRow() {
        return positionInRow;
    }

    public void setPositionInRow(String positionInRow) {
        this.positionInRow = positionInRow;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
