/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart.pickfromstore;

import java.io.Serializable;

public class Status
implements Serializable {
    private String messageDescription;
    private int statusCode;

    public String getMessageDescription() {
        return this.messageDescription;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setMessageDescription(String string2) {
        this.messageDescription = string2;
    }

    public void setStatusCode(int n3) {
        this.statusCode = n3;
    }
}

