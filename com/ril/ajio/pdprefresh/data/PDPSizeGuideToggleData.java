/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.data;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PDPSizeGuideToggleData {
    public static final int $stable = 8;
    private ArrayList sizeGuidToggleProducts;

    public PDPSizeGuideToggleData() {
        this(null, 1, null);
    }

    public PDPSizeGuideToggleData(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "sizeGuidToggleProducts");
        this.sizeGuidToggleProducts = arrayList;
    }

    public /* synthetic */ PDPSizeGuideToggleData(ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            arrayList = new ArrayList();
        }
        this(arrayList);
    }

    public static /* synthetic */ PDPSizeGuideToggleData copy$default(PDPSizeGuideToggleData pDPSizeGuideToggleData, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = pDPSizeGuideToggleData.sizeGuidToggleProducts;
        }
        return pDPSizeGuideToggleData.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.sizeGuidToggleProducts;
    }

    public final PDPSizeGuideToggleData copy(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "sizeGuidToggleProducts");
        PDPSizeGuideToggleData pDPSizeGuideToggleData = new PDPSizeGuideToggleData(arrayList);
        return pDPSizeGuideToggleData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PDPSizeGuideToggleData;
        if (!bl3) {
            return false;
        }
        object = (PDPSizeGuideToggleData)object;
        ArrayList arrayList = this.sizeGuidToggleProducts;
        object = ((PDPSizeGuideToggleData)object).sizeGuidToggleProducts;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getSizeGuidToggleProducts() {
        return this.sizeGuidToggleProducts;
    }

    public int hashCode() {
        return this.sizeGuidToggleProducts.hashCode();
    }

    public final void setSizeGuidToggleProducts(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.sizeGuidToggleProducts = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.sizeGuidToggleProducts;
        StringBuilder stringBuilder = new StringBuilder("PDPSizeGuideToggleData(sizeGuidToggleProducts=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

