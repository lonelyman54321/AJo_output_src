/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class OrderActivePoints
implements Serializable {
    private String activationDate;
    private float amount;
    private String expiryDate;
    private String imageUrl;
    private boolean isExpired;
    private String itemId;
    private String moneyType;
    private String orderId;
    private float points;
    private String transactionDate;
    private String transactionDescription;
    private String transactionReason;

    public String getActivationDate() {
        return this.activationDate;
    }

    public float getAmount() {
        return this.amount;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public boolean getIsExpired() {
        return this.isExpired;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getMoneyType() {
        return this.moneyType;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public float getPoints() {
        return this.points;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getTransactionDescription() {
        return this.transactionDescription;
    }

    public String getTransactionReason() {
        return this.transactionReason;
    }

    public void setActivationDate(String string2) {
        this.activationDate = string2;
    }

    public void setAmount(float f5) {
        this.amount = f5;
    }

    public void setExpired(boolean bl2) {
        this.isExpired = bl2;
    }

    public void setExpiryDate(String string2) {
        this.expiryDate = string2;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setItemId(String string2) {
        this.itemId = string2;
    }

    public void setMoneyType(String string2) {
        this.moneyType = string2;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setPoints(float f5) {
        this.points = f5;
    }

    public void setTransactionDate(String string2) {
        this.transactionDate = string2;
    }

    public void setTransactionDescription(String string2) {
        this.transactionDescription = string2;
    }

    public void setTransactionReason(String string2) {
        this.transactionReason = string2;
    }
}

