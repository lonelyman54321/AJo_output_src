/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import kotlin.jvm.internal.Intrinsics;

public final class ProductExperience {
    public static final int $stable = 8;
    private int expType;
    private int id;
    public String productId;
    private float sellingPrice;
    private int storeType;
    private long viewedMillis;

    public final int getExpType() {
        return this.expType;
    }

    public final int getId() {
        return this.id;
    }

    public final String getProductId() {
        String string2 = this.productId;
        if (string2 != null) {
            return string2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productId");
        return null;
    }

    public final float getSellingPrice() {
        return this.sellingPrice;
    }

    public final int getStoreType() {
        return this.storeType;
    }

    public final long getViewedMillis() {
        return this.viewedMillis;
    }

    public final void setExpType(int n3) {
        this.expType = n3;
    }

    public final void setId(int n3) {
        this.id = n3;
    }

    public final void setProductId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.productId = string2;
    }

    public final void setSellingPrice(float f5) {
        this.sellingPrice = f5;
    }

    public final void setStoreType(int n3) {
        this.storeType = n3;
    }

    public final void setViewedMillis(long l2) {
        this.viewedMillis = l2;
    }

    public String toString() {
        int n3 = this.id;
        String string2 = this.getProductId();
        float f5 = this.sellingPrice;
        int n4 = this.expType;
        long l2 = this.viewedMillis;
        StringBuilder stringBuilder = Fh3.a(n3, "ID: ", " :: Prod Id: ", string2, " :: Price: ");
        stringBuilder.append(f5);
        stringBuilder.append(" :: Type: ");
        stringBuilder.append(n4);
        stringBuilder.append(" :: Millis: ");
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }
}

