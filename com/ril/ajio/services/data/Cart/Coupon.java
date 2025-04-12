/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.ArrayList;

public class Coupon
implements Serializable {
    private String cartRequiredValue;
    private String discountValue;
    private boolean emailVerified = true;
    private String endTime;
    private boolean endTimerVisibility;
    private boolean isCouponValid;
    private boolean isSelected;
    private String productUrl;
    private String[] productsApplicable;
    private int productsApplicableCount;
    private long serverTime;
    private String timerStartBefore;
    private String voucherCode;
    private String voucherDescription;
    private String voucherName;
    private ArrayList voucherRestriction;

    public String getCartRequiredValue() {
        return this.cartRequiredValue;
    }

    public String getDiscountValue() {
        return this.discountValue;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getProductUrl() {
        return this.productUrl;
    }

    public String[] getProductsApplicable() {
        return this.productsApplicable;
    }

    public int getProductsApplicableCount() {
        return this.productsApplicableCount;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public String getTimerStartBefore() {
        return this.timerStartBefore;
    }

    public String getVoucherCode() {
        return this.voucherCode;
    }

    public String getVoucherDescription() {
        return this.voucherDescription;
    }

    public String getVoucherName() {
        return this.voucherName;
    }

    public ArrayList getVoucherRestriction() {
        return this.voucherRestriction;
    }

    public boolean isCouponValid() {
        return this.isCouponValid;
    }

    public boolean isEmailVerified() {
        return this.emailVerified;
    }

    public boolean isEndTimerVisibility() {
        return this.endTimerVisibility;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCartRequiredValue(String string2) {
        this.cartRequiredValue = string2;
    }

    public void setCouponValid(boolean bl2) {
        this.isCouponValid = bl2;
    }

    public void setDiscountValue(String string2) {
        this.discountValue = string2;
    }

    public void setEmailVerified(boolean bl2) {
        this.emailVerified = bl2;
    }

    public void setProductUrl(String string2) {
        this.productUrl = string2;
    }

    public void setProductsApplicable(String[] stringArray) {
        this.productsApplicable = stringArray;
    }

    public void setProductsApplicableCount(int n3) {
        this.productsApplicableCount = n3;
    }

    public void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public void setVoucherCode(String string2) {
        this.voucherCode = string2;
    }

    public void setVoucherDescription(String string2) {
        this.voucherDescription = string2;
    }

    public void setVoucherName(String string2) {
        this.voucherName = string2;
    }

    public void setVoucherRestriction(ArrayList arrayList) {
        this.voucherRestriction = arrayList;
    }
}

