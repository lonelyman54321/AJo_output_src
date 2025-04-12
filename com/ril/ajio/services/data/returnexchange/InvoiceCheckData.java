/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import java.io.Serializable;

public class InvoiceCheckData
implements Serializable {
    private String errors;
    private String status;

    public String getErrors() {
        return this.errors;
    }

    public String getStatus() {
        return this.status;
    }

    public void setErrors(String string2) {
        this.errors = string2;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }
}

