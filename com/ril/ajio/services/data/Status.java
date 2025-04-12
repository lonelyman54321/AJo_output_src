/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

public class Status {
    private String message;
    private boolean success;

    public String getMessage() {
        return this.message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setSuccess(boolean bl2) {
        this.success = bl2;
    }
}

