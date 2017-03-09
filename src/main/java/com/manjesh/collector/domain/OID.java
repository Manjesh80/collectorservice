package com.manjesh.collector.domain;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 2/20/2017.
 */
public class OID {

    public int getOidNumber() {
        return oidNumber;
    }

    public void setOidNumber(int oidNumber) {
        this.oidNumber = oidNumber;
    }

    public String getOidName() {
        return oidName;
    }

    public void setOidName(String oidName) {
        this.oidName = oidName;
    }

    private int oidNumber;
    private String oidName;

    public OID() {

    }

    public OID(int oidNumber, String oidName) {
        this.oidNumber = oidNumber;
        this.oidName = oidName;
    }
}
