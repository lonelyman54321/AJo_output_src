/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class CartEntity {
    public static final int $stable = 8;
    private String code;
    private boolean isDod;
    private float value;

    public CartEntity(String string2, float f5, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "code");
        this.code = string2;
        this.value = f5;
        this.isDod = bl2;
    }

    public /* synthetic */ CartEntity(String string2, float f5, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        this(string2, f5, bl2);
    }

    public boolean equals(Object object) {
        boolean bl2;
        String string2;
        boolean bl3;
        boolean bl4 = object instanceof CartEntity;
        if (!bl4 || !(bl3 = b.i(string2 = this.code, (String)(object = ((CartEntity)object).code), bl2 = true))) {
            bl2 = false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.code.hashCode() * 31;
        return Float.floatToIntBits(this.value) + n3;
    }

    public final boolean isDod() {
        return this.isDod;
    }

    public final void setCode(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.code = string2;
    }

    public final void setDod(boolean bl2) {
        this.isDod = bl2;
    }

    public final void setValue(float f5) {
        this.value = f5;
    }
}

