/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ProductSizeData
implements Serializable {
    private ArrayList sizeVariants;

    public ProductSizeData(ArrayList arrayList) {
        this.sizeVariants = arrayList;
    }

    public static /* synthetic */ ProductSizeData copy$default(ProductSizeData productSizeData, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = productSizeData.sizeVariants;
        }
        return productSizeData.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.sizeVariants;
    }

    public final ProductSizeData copy(ArrayList arrayList) {
        ProductSizeData productSizeData = new ProductSizeData(arrayList);
        return productSizeData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductSizeData;
        if (!bl3) {
            return false;
        }
        object = (ProductSizeData)object;
        ArrayList arrayList = this.sizeVariants;
        object = ((ProductSizeData)object).sizeVariants;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getSizeVariants() {
        return this.sizeVariants;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.sizeVariants;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public final void setSizeVariants(ArrayList arrayList) {
        this.sizeVariants = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.sizeVariants;
        StringBuilder stringBuilder = new StringBuilder("ProductSizeData(sizeVariants=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

