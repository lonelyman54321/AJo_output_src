/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class TopExpiring
implements Serializable {
    private float amount;
    private String expiryDate;
    private float points;

    public float getAmount() {
        return this.amount;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public float getPoints() {
        return this.points;
    }

    public void setAmount(float f5) {
        this.amount = f5;
    }

    public void setExpiryDate(String string2) {
        this.expiryDate = string2;
    }

    public void setPoints(float f5) {
        this.points = f5;
    }
}

