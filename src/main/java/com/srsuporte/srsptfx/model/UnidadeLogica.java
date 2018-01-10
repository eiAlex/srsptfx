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
public class UnidadeLogica {

    private String deviceID; // exemplo C: D: 
    private String fileSystem;
    private String volumeSerialNumber;
    private Integer driveType;
    private Long freeSpace; // em bytes
    private Long size; // em bytes
    private String volumeName; // nome atribuido ao volume exemplo: DADOS
    private Integer index;

    public UnidadeLogica(String deviceID, String driveType, String fileSystem, String freeSpace, String size, String volumeName, String volumeSerialNumber) {
        this.deviceID = deviceID;
        this.fileSystem = fileSystem;
        this.volumeSerialNumber = volumeSerialNumber;
        this.driveType = driveType.isEmpty() ? null : Integer.valueOf(driveType);
        this.freeSpace = freeSpace.isEmpty() ? null : Long.valueOf(freeSpace);
        this.size = size.isEmpty() ? null : Long.valueOf(size);
        this.volumeName = volumeName;
    }

    

    public String getVolumeSerialNumber() {
        return volumeSerialNumber;
    }

    public void setVolumeSerialNumber(String volumeSerialNumber) {
        this.volumeSerialNumber = volumeSerialNumber;
    }

    
    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }

    public Integer getDriveType() {
        return driveType;
    }

    public void setDriveType(int driveType) {
        this.driveType = driveType;
    }

    public Long getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    
}
