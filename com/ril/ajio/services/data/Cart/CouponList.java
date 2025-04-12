/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.util.List;

public class CouponList {
    private int cartItemsQty;
    private String cartTotal;
    private String termsAndCondition;
    private List voucherList;

    public int getCartItemsQty() {
        return this.cartItemsQty;
    }

    public String getCartTotal() {
        return this.cartTotal;
    }

    public String getTermsAndCondition() {
        return this.termsAndCondition;
    }

    public List getVoucherList() {
        return this.voucherList;
    }

    public void setCartItemsQty(int n3) {
        this.cartItemsQty = n3;
    }

    public void setCartTotal(String string2) {
        this.cartTotal = string2;
    }

    public void setTermsAndCondition(String string2) {
        this.termsAndCondition = string2;
    }

    public void setVoucherList(List list) {
        this.voucherList = list;
    }
}

