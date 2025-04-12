/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SearchRv {
    public static final int $stable;
    private final long entryTime;
    private final long exitTime;
    private final String priceValue;
    private final String productCode;
    private final String sizeSelected;
    private final String storeType;

    public SearchRv(String string2, String string3, String string4, long l2, long l3, String string5) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        Intrinsics.checkNotNullParameter(string5, "storeType");
        this.productCode = string2;
        this.priceValue = string3;
        this.sizeSelected = string4;
        this.entryTime = l2;
        this.exitTime = l3;
        this.storeType = string5;
    }

    public /* synthetic */ SearchRv(String string2, String string3, String string4, long l2, long l3, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string6;
        int n4 = n3 & 0x20;
        String string7 = n4 != 0 ? (string6 = "ajio") : string5;
        this(string2, string3, string4, l2, l3, string7);
    }

    public final long getEntryTime() {
        return this.entryTime;
    }

    public final long getExitTime() {
        return this.exitTime;
    }

    public final String getPriceValue() {
        return this.priceValue;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSizeSelected() {
        return this.sizeSelected;
    }

    public final String getStoreType() {
        return this.storeType;
    }
}

