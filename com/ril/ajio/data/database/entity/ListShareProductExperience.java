/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import kotlin.jvm.internal.Intrinsics;

public final class ListShareProductExperience {
    public static final int $stable = 8;
    private long cId;
    private boolean isDeleted;
    private int lId;
    private String productId = "";

    public final long getCId() {
        return this.cId;
    }

    public final int getLId() {
        return this.lId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final void setCId(long l2) {
        this.cId = l2;
    }

    public final void setDeleted(boolean bl2) {
        this.isDeleted = bl2;
    }

    public final void setLId(int n3) {
        this.lId = n3;
    }

    public final void setProductId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.productId = string2;
    }
}

