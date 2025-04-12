/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.util.List;

public class CCComplaintInfoHelper$CCComplaintInfo {
    private String category;
    private long incidentCreationTime;
    private String incidentID;
    private long incidentResolvedTime;
    private String incidentStatus;
    private String mandatoryUploadText;
    private String orderId;
    private List productImages;
    private long ticketDueDate;
    private String ticketId;

    public String getCategory() {
        return this.category;
    }

    public long getIncidentCreationTime() {
        return this.incidentCreationTime;
    }

    public String getIncidentID() {
        return this.incidentID;
    }

    public long getIncidentResolvedTime() {
        return this.incidentResolvedTime;
    }

    public String getIncidentStatus() {
        return this.incidentStatus;
    }

    public String getMandatoryUploadText() {
        return this.mandatoryUploadText;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public List getProductImages() {
        return this.productImages;
    }

    public long getTicketDueDate() {
        return this.ticketDueDate;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setCategory(String string2) {
        this.category = string2;
    }

    public void setIncidentCreationTime(long l2) {
        this.incidentCreationTime = l2;
    }

    public void setIncidentID(String string2) {
        this.incidentID = string2;
    }

    public void setIncidentResolvedTime(long l2) {
        this.incidentResolvedTime = l2;
    }

    public void setIncidentStatus(String string2) {
        this.incidentStatus = string2;
    }

    public void setMandatoryUploadText(String string2) {
        this.mandatoryUploadText = string2;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setProductImages(List list) {
        this.productImages = list;
    }

    public void setTicketDueDate(long l2) {
        this.ticketDueDate = l2;
    }

    public void setTicketId(String string2) {
        this.ticketId = string2;
    }
}

