/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseProductsResult {
    private final List invalidIds;
    private final List products;

    public AffiseProductsResult(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "products");
        Intrinsics.checkNotNullParameter(list2, "invalidIds");
        this.products = list;
        this.invalidIds = list2;
    }

    public static /* synthetic */ AffiseProductsResult copy$default(AffiseProductsResult affiseProductsResult, List list, List list2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = affiseProductsResult.products;
        }
        if ((n3 &= 2) != 0) {
            list2 = affiseProductsResult.invalidIds;
        }
        return affiseProductsResult.copy(list, list2);
    }

    public final List component1() {
        return this.products;
    }

    public final List component2() {
        return this.invalidIds;
    }

    public final AffiseProductsResult copy(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "products");
        Intrinsics.checkNotNullParameter(list2, "invalidIds");
        AffiseProductsResult affiseProductsResult = new AffiseProductsResult(list, list2);
        return affiseProductsResult;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffiseProductsResult;
        if (!bl3) {
            return false;
        }
        object = (AffiseProductsResult)object;
        List list = this.products;
        List list2 = ((AffiseProductsResult)object).products;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.invalidIds;
        object = ((AffiseProductsResult)object).invalidIds;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getInvalidIds() {
        return this.invalidIds;
    }

    public final List getProducts() {
        return this.products;
    }

    public int hashCode() {
        int n3 = ((Object)this.products).hashCode() * 31;
        return ((Object)this.invalidIds).hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseProductsResult(products=");
        List list = this.products;
        stringBuilder.append(list);
        stringBuilder.append(", invalidIds=");
        list = this.invalidIds;
        stringBuilder.append(list);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

