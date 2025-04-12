/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.Intrinsics;

public final class ProductRvStoreType {
    private final String productCode;
    private final int storeType;

    public ProductRvStoreType(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        this.productCode = string2;
        this.storeType = n3;
    }

    public static /* synthetic */ ProductRvStoreType copy$default(ProductRvStoreType productRvStoreType, String string2, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = productRvStoreType.productCode;
        }
        if ((n4 &= 2) != 0) {
            n3 = productRvStoreType.storeType;
        }
        return productRvStoreType.copy(string2, n3);
    }

    public final String component1() {
        return this.productCode;
    }

    public final int component2() {
        return this.storeType;
    }

    public final ProductRvStoreType copy(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        ProductRvStoreType productRvStoreType = new ProductRvStoreType(string2, n3);
        return productRvStoreType;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ProductRvStoreType;
        if (n3 == 0) {
            return false;
        }
        object = (ProductRvStoreType)object;
        String string2 = this.productCode;
        String string3 = ((ProductRvStoreType)object).productCode;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.storeType;
        int n4 = ((ProductRvStoreType)object).storeType;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final int getStoreType() {
        return this.storeType;
    }

    public int hashCode() {
        int n3 = this.productCode.hashCode() * 31;
        int n4 = this.storeType;
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.productCode;
        int n3 = this.storeType;
        StringBuilder stringBuilder = new StringBuilder("ProductRvStoreType(productCode=");
        stringBuilder.append(string2);
        stringBuilder.append(", storeType=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

