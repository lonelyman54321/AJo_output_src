/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order.orderhistory;

import java.io.Serializable;
import java.util.ArrayList;

public class Orders
implements Serializable {
    private String currency;
    private String customerFirstName;
    private String customerId;
    private float discount;
    private boolean fromCache;
    private boolean isFromCache;
    private String orderDate;
    private String orderId;
    private ArrayList orderItemLines = null;
    private String orderPlacedAt;
    private String orderType;
    private String paymentMode;
    private float shippingCharge;
    private String siteName;
    private float totalAmount;

    public String getCurrency() {
        return this.currency;
    }

    public String getCustomerFirstName() {
        return this.customerFirstName;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public float getDiscount() {
        return this.discount;
    }

    public String getOrderDate() {
        return this.orderDate;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public ArrayList getOrderItemLines() {
        return this.orderItemLines;
    }

    public String getOrderPlacedAt() {
        return this.orderPlacedAt;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public float getShippingCharge() {
        return this.shippingCharge;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public float getTotalAmount() {
        return this.totalAmount;
    }

    public boolean isFromCache() {
        return this.fromCache;
    }

    public boolean isIsFromCache() {
        return this.isFromCache;
    }

    public void setCurrency(String string2) {
        this.currency = string2;
    }

    public void setCustomerFirstName(String string2) {
        this.customerFirstName = string2;
    }

    public void setCustomerId(String string2) {
        this.customerId = string2;
    }

    public void setDiscount(float f5) {
        this.discount = f5;
    }

    public void setFromCache(boolean bl2) {
        this.fromCache = bl2;
    }

    public void setIsFromCache(boolean bl2) {
        this.isFromCache = bl2;
    }

    public void setOrderDate(String string2) {
        this.orderDate = string2;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setOrderItemLines(ArrayList arrayList) {
        this.orderItemLines = arrayList;
    }

    public void setOrderPlacedAt(String string2) {
        this.orderPlacedAt = string2;
    }

    public void setOrderType(String string2) {
        this.orderType = string2;
    }

    public void setPaymentMode(String string2) {
        this.paymentMode = string2;
    }

    public void setShippingCharge(float f5) {
        this.shippingCharge = f5;
    }

    public void setSiteName(String string2) {
        this.siteName = string2;
    }

    public void setTotalAmount(float f5) {
        this.totalAmount = f5;
    }
}

