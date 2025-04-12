/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

public class CartSavings {
    private String bottomText;
    private float couponDiscountValue;
    private int discountPercent;
    private float discountPriceValue;
    private boolean isCoupon;
    private boolean isCouponApplied;
    private int position;
    private float promoDiscountValue;
    private String title;

    public CartSavings(String string2, float f5, float f6, int n3, float f7, String string3, int n4) {
        this.title = string2;
        this.discountPriceValue = f5;
        this.couponDiscountValue = f6;
        this.discountPercent = n3;
        this.bottomText = string3;
        this.promoDiscountValue = f7;
        this.position = n4;
    }

    public String getBottomText() {
        return this.bottomText;
    }

    public float getCouponDiscountValue() {
        return this.couponDiscountValue;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public float getDiscountPriceValue() {
        return this.discountPriceValue;
    }

    public int getPosition() {
        return this.position;
    }

    public float getPromoDiscountValue() {
        return this.promoDiscountValue;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isCoupon() {
        return this.isCoupon;
    }

    public boolean isCouponApplied() {
        return this.isCouponApplied;
    }

    public void setCoupon(boolean bl2) {
        this.isCoupon = bl2;
    }

    public void setCouponApplied(boolean bl2) {
        this.isCouponApplied = bl2;
    }
}

