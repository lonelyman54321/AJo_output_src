/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.ProductData;

final class AutoValue_ProductData
extends ProductData {
    private final Integer productId;

    public AutoValue_ProductData(Integer n3) {
        this.productId = n3;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductData;
        if (bl3) {
            object = (ProductData)object;
            Integer n3 = this.productId;
            object = ((ProductData)object).getProductId();
            if (n3 == null) {
                if (object != null) {
                    bl2 = false;
                }
            } else {
                bl2 = n3.equals(object);
            }
            return bl2;
        }
        return false;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.productId;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = n4.hashCode();
        }
        return n3 ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProductData{productId=");
        Integer n3 = this.productId;
        stringBuilder.append(n3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

