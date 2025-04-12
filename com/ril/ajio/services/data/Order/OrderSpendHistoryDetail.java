/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class OrderSpendHistoryDetail
implements Serializable {
    private float amount;
    private String createdDate;
    private String imageUrl;
    private String itemId;
    private float points;
    private String transactionDescription;

    public float getAmount() {
        return this.amount;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getItemId() {
        return this.itemId;
    }

    public float getPoints() {
        return this.points;
    }

    public String getTransactionDescription() {
        return this.transactionDescription;
    }

    public void setAmount(float f5) {
        this.amount = f5;
    }

    public void setCreatedDate(String string2) {
        this.createdDate = string2;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setItemId(String string2) {
        this.itemId = string2;
    }

    public void setPoints(float f5) {
        this.points = f5;
    }

    public void setTransactionDescription(String string2) {
        this.transactionDescription = string2;
    }
}

