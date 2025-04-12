/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

public class SimpleStringData {
    private String expires_in;
    private String message;
    private int statusCode;

    public String getExpires_in() {
        return this.expires_in;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setExpires_in(String string2) {
        this.expires_in = string2;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setStatusCode(int n3) {
        this.statusCode = n3;
    }
}

