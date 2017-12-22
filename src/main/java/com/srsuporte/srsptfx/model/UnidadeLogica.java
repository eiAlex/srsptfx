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
    private int driveType;
    private long freeSpace; // em bytes
    private long size; // em bytes
    private String volumeName; // nome atribuido ao volume exemplo: DADOS
    
    

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

    public int getDriveType() {
        return driveType;
    }

    public void setDriveType(int driveType) {
        this.driveType = driveType;
    }

    public long getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }

    public long getSize() {
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

}
