/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.ImageVoucher;
import com.ril.ajio.services.data.Price;
import java.io.Serializable;
import java.util.ArrayList;

public class CartAppliedVoucher
implements Serializable {
    private Price appliedValue;
    private ArrayList cartEntryWithCouponList;
    private CartPromotion cartPromotion;
    private String code;
    private String description;
    private boolean freeShipping;
    private ImageVoucher imageForVoucher;
    private String name;
    private float value;
    private String valueFormatted;
    private String valueString;
    private String voucherCode;

    public CartAppliedVoucher() {
        ArrayList arrayList;
        this.cartEntryWithCouponList = arrayList = new ArrayList();
    }

    public Price getAppliedValue() {
        return this.appliedValue;
    }

    public ArrayList getCartEntryWithCouponList() {
        return this.cartEntryWithCouponList;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public ImageVoucher getImageForVoucher() {
        return this.imageForVoucher;
    }

    public String getName() {
        return this.name;
    }

    public float getValue() {
        return this.value;
    }

    public String getValueFormatted() {
        return this.valueFormatted;
    }

    public String getValueString() {
        return this.valueString;
    }

    public String getVoucherCode() {
        return this.voucherCode;
    }

    public boolean isFreeShipping() {
        return this.freeShipping;
    }

    public void setCartEntryWithCouponList(ArrayList arrayList) {
        this.cartEntryWithCouponList = arrayList;
    }

    public void setImageForVoucher(ImageVoucher imageVoucher) {
        this.imageForVoucher = imageVoucher;
    }
}

