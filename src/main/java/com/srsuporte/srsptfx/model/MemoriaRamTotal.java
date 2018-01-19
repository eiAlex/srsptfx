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
public class MemoriaRamTotal {

    private Long size;
    private Long freeSpace;
    private Long usage;

    public MemoriaRamTotal(String size, String freeSpace, String usage) {
        this.size = size.isEmpty() ? null : Long.valueOf(size);
        this.freeSpace = freeSpace.isEmpty() ? null : Long.valueOf(freeSpace);
        if (usage == null) {
            this.usage = this.size - this.freeSpace;
        } else {
            this.usage = usage.isEmpty() ? null : Long.valueOf(usage);
        }
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(Long freeSpace) {
        this.freeSpace = freeSpace;
    }

    public Long getUsage() {
        return usage;
    }

    public void setUsage(Long usage) {
        this.usage = usage;
    }

}
