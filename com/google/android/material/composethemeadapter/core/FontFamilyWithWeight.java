/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.composethemeadapter.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FontFamilyWithWeight {
    public static final int $stable;
    private final RU0 fontFamily;
    private final tv0_0 weight;

    public FontFamilyWithWeight(RU0 rU0, tv0_0 tv0_02) {
        Intrinsics.checkNotNullParameter(rU0, "fontFamily");
        Intrinsics.checkNotNullParameter(tv0_02, "weight");
        this.fontFamily = rU0;
        this.weight = tv0_02;
    }

    public FontFamilyWithWeight(RU0 rU0, tv0_0 tv0_02, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            tv0_02 = tv0_0.b;
            tv0_02 = tv0_0.m;
        }
        this(rU0, tv0_02);
    }

    public static /* synthetic */ FontFamilyWithWeight copy$default(FontFamilyWithWeight fontFamilyWithWeight, RU0 rU0, tv0_0 tv0_02, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            rU0 = fontFamilyWithWeight.fontFamily;
        }
        if ((n3 &= 2) != 0) {
            tv0_02 = fontFamilyWithWeight.weight;
        }
        return fontFamilyWithWeight.copy(rU0, tv0_02);
    }

    public final RU0 component1() {
        return this.fontFamily;
    }

    public final tv0_0 component2() {
        return this.weight;
    }

    public final FontFamilyWithWeight copy(RU0 rU0, tv0_0 tv0_02) {
        Intrinsics.checkNotNullParameter(rU0, "fontFamily");
        Intrinsics.checkNotNullParameter(tv0_02, "weight");
        FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight(rU0, tv0_02);
        return fontFamilyWithWeight;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FontFamilyWithWeight;
        if (!bl3) {
            return false;
        }
        object = (FontFamilyWithWeight)object;
        Object object2 = this.fontFamily;
        RU0 rU0 = ((FontFamilyWithWeight)object).fontFamily;
        bl3 = Intrinsics.areEqual(object2, rU0);
        if (!bl3) {
            return false;
        }
        object2 = this.weight;
        object = ((FontFamilyWithWeight)object).weight;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final RU0 getFontFamily() {
        return this.fontFamily;
    }

    public final tv0_0 getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int n3 = this.fontFamily.hashCode() * 31;
        int n4 = this.weight.a;
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FontFamilyWithWeight(fontFamily=");
        Object object = this.fontFamily;
        stringBuilder.append(object);
        stringBuilder.append(", weight=");
        object = this.weight;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

