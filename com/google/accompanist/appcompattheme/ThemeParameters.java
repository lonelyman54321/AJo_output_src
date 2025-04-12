/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.appcompattheme;

import kotlin.jvm.internal.Intrinsics;

public final class ThemeParameters {
    public static final int $stable;
    private final lZ colors;
    private final At3 typography;

    public ThemeParameters(lZ lZ2, At3 at3) {
        this.colors = lZ2;
        this.typography = at3;
    }

    public static /* synthetic */ ThemeParameters copy$default(ThemeParameters themeParameters, lZ lZ2, At3 at3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            lZ2 = themeParameters.colors;
        }
        if ((n3 &= 2) != 0) {
            at3 = themeParameters.typography;
        }
        return themeParameters.copy(lZ2, at3);
    }

    public final lZ component1() {
        return this.colors;
    }

    public final At3 component2() {
        return this.typography;
    }

    public final ThemeParameters copy(lZ lZ2, At3 at3) {
        ThemeParameters themeParameters = new ThemeParameters(lZ2, at3);
        return themeParameters;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ThemeParameters;
        if (!bl3) {
            return false;
        }
        object = (ThemeParameters)object;
        Object object2 = this.colors;
        lZ lZ2 = ((ThemeParameters)object).colors;
        bl3 = Intrinsics.areEqual(object2, lZ2);
        if (!bl3) {
            return false;
        }
        object2 = this.typography;
        object = ((ThemeParameters)object).typography;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final lZ getColors() {
        return this.colors;
    }

    public final At3 getTypography() {
        return this.typography;
    }

    public int hashCode() {
        int n3;
        lZ lZ2 = this.colors;
        int n4 = 0;
        if (lZ2 == null) {
            n3 = 0;
            lZ2 = null;
        } else {
            n3 = lZ2.hashCode();
        }
        n3 *= 31;
        At3 at3 = this.typography;
        if (at3 != null) {
            n4 = at3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ThemeParameters(colors=");
        Object object = this.colors;
        stringBuilder.append(object);
        stringBuilder.append(", typography=");
        object = this.typography;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

