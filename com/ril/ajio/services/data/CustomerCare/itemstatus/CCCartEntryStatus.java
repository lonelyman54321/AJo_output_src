/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare.itemstatus;

import java.util.ArrayList;

public class CCCartEntryStatus {
    private String consignmentNumber;
    private String entryNumber;
    private ArrayList itemStatusMap;
    private String newStatus;
    private String orderNumber;
    private ArrayList quickActionsMap;
    private String status;

    public String getConsignmentNumber() {
        return this.consignmentNumber;
    }

    public String getEntryNumber() {
        return this.entryNumber;
    }

    public ArrayList getItemStatusMap() {
        return this.itemStatusMap;
    }

    public String getNewStatus() {
        return this.newStatus;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public ArrayList getQuickActionsMap() {
        return this.quickActionsMap;
    }

    public String getStatus() {
        return this.status;
    }

    public void setConsignmentNumber(String string2) {
        this.consignmentNumber = string2;
    }

    public void setEntryNumber(String string2) {
        this.entryNumber = string2;
    }

    public void setItemStatusMap(ArrayList arrayList) {
        this.itemStatusMap = arrayList;
    }

    public void setNewStatus(String string2) {
        this.newStatus = string2;
    }

    public void setOrderNumber(String string2) {
        this.orderNumber = string2;
    }

    public void setQuickActionsMap(ArrayList arrayList) {
        this.quickActionsMap = arrayList;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }
}

