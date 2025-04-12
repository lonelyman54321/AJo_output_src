/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

public final class ACTopExpiring {
    private Float amount;
    private String expiryDate;
    private Float points;

    public ACTopExpiring(Float f5, String string2, Float f6) {
        this.amount = f5;
        this.expiryDate = string2;
        this.points = f6;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final Float getPoints() {
        return this.points;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public final void setExpiryDate(String string2) {
        this.expiryDate = string2;
    }

    public final void setPoints(Float f5) {
        this.points = f5;
    }
}

