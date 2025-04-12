/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SaleGAData {
    private boolean isSalePriceAvailable;
    private String productPrice;
    private String productTD;

    public SaleGAData(boolean bl2, String string2, String string3) {
        this.isSalePriceAvailable = bl2;
        this.productPrice = string2;
        this.productTD = string3;
    }

    public /* synthetic */ SaleGAData(boolean bl2, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(bl2, string2, string3);
    }

    public final String getProductPrice() {
        return this.productPrice;
    }

    public final String getProductTD() {
        return this.productTD;
    }

    public final boolean isSalePriceAvailable() {
        return this.isSalePriceAvailable;
    }

    public final void setProductPrice(String string2) {
        this.productPrice = string2;
    }

    public final void setProductTD(String string2) {
        this.productTD = string2;
    }

    public final void setSalePriceAvailable(boolean bl2) {
        this.isSalePriceAvailable = bl2;
    }
}

