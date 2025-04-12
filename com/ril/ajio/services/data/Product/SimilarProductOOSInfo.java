/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SimilarProductOOSInfo {
    private List similarProducts;

    public SimilarProductOOSInfo() {
        this(null, 1, null);
    }

    public SimilarProductOOSInfo(List list) {
        this.similarProducts = list;
    }

    public /* synthetic */ SimilarProductOOSInfo(List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            list = null;
        }
        this(list);
    }

    public static /* synthetic */ SimilarProductOOSInfo copy$default(SimilarProductOOSInfo similarProductOOSInfo, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = similarProductOOSInfo.similarProducts;
        }
        return similarProductOOSInfo.copy(list);
    }

    public final List component1() {
        return this.similarProducts;
    }

    public final SimilarProductOOSInfo copy(List list) {
        SimilarProductOOSInfo similarProductOOSInfo = new SimilarProductOOSInfo(list);
        return similarProductOOSInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SimilarProductOOSInfo;
        if (!bl3) {
            return false;
        }
        object = (SimilarProductOOSInfo)object;
        List list = this.similarProducts;
        object = ((SimilarProductOOSInfo)object).similarProducts;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getSimilarProducts() {
        return this.similarProducts;
    }

    public int hashCode() {
        int n3;
        List list = this.similarProducts;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public final void setSimilarProducts(List list) {
        this.similarProducts = list;
    }

    public String toString() {
        List list = this.similarProducts;
        StringBuilder stringBuilder = new StringBuilder("SimilarProductOOSInfo(similarProducts=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

