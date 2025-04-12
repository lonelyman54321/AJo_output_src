/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class Moneys
implements Serializable {
    private float amount;
    private String description;
    private String moneyStatus;
    private String moneyType;
    private float points;

    public float getAmount() {
        return this.amount;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMoneyStatus() {
        return this.moneyStatus;
    }

    public String getMoneyType() {
        return this.moneyType;
    }

    public float getPoints() {
        return this.points;
    }

    public void setAmount(float f5) {
        this.amount = f5;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setMoneyStatus(String string2) {
        this.moneyStatus = string2;
    }

    public void setMoneyType(String string2) {
        this.moneyType = string2;
    }

    public void setPoints(float f5) {
        this.points = f5;
    }
}

