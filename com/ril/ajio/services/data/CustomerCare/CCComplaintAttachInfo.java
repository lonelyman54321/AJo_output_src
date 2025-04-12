/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.io.Serializable;

public class CCComplaintAttachInfo
implements Serializable {
    private String base64String;
    private String comments;
    private String contentType;
    private String fileName;
    private String incidentId;

    public String getBase64String() {
        return this.base64String;
    }

    public String getComments() {
        return this.comments;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getIncidentId() {
        return this.incidentId;
    }

    public void setBase64String(String string2) {
        this.base64String = string2;
    }

    public void setComments(String string2) {
        this.comments = string2;
    }

    public void setContentType(String string2) {
        this.contentType = string2;
    }

    public void setFileName(String string2) {
        this.fileName = string2;
    }

    public void setIncidentId(String string2) {
        this.incidentId = string2;
    }
}

