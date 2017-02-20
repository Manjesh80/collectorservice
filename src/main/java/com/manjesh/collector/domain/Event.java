package com.manjesh.collector.domain;

import java.util.List;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 2/17/2017.
 */
public class Event {

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    private int eventID;
    private String eventName;
    private String networkID;

    public Event(int eventID, String eventName, String networkID, List<OID> oids) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.networkID = networkID;
        this.oids = oids;
    }

    private List<OID> oids;

    public List<OID> getOids() {
        return oids;
    }

    public Event() {
    }

    public void setOids(List<OID> oids) {
        this.oids = oids;
    }
}
