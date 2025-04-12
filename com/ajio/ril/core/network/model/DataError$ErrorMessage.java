/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network.model;

import java.io.Serializable;

public class DataError$ErrorMessage
implements Serializable {
    private String code;
    private String description;
    private String logMessage;
    private String message;
    private String reason;
    private String subject;
    private String subjectType;
    private String type;

    public DataError$ErrorMessage() {
        String string2;
        this.message = string2 = "";
        this.reason = string2;
        this.subject = string2;
        this.subjectType = string2;
        this.type = string2;
        this.description = string2;
        this.code = string2;
        this.logMessage = string2;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLogMessage() {
        return this.logMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getSubjectType() {
        return this.subjectType;
    }

    public String getType() {
        return this.type;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setLogMessage(String string2) {
        this.logMessage = string2;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setReason(String string2) {
        this.reason = string2;
    }

    public void setSubject(String string2) {
        this.subject = string2;
    }

    public void setSubjectType(String string2) {
        this.subjectType = string2;
    }

    public void setType(String string2) {
        this.type = string2;
    }
}

