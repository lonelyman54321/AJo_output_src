/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.composethemeadapter;

import kotlin.jvm.internal.Intrinsics;

public final class ThemeParameters {
    public static final int $stable;
    private final lZ colors;
    private final A13 shapes;
    private final At3 typography;

    public ThemeParameters(lZ lZ2, At3 at3, A13 a13) {
        this.colors = lZ2;
        this.typography = at3;
        this.shapes = a13;
    }

    public static /* synthetic */ ThemeParameters copy$default(ThemeParameters themeParameters, lZ lZ2, At3 at3, A13 a13, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            lZ2 = themeParameters.colors;
        }
        if ((n4 = n3 & 2) != 0) {
            at3 = themeParameters.typography;
        }
        if ((n3 &= 4) != 0) {
            a13 = themeParameters.shapes;
        }
        return themeParameters.copy(lZ2, at3, a13);
    }

    public final lZ component1() {
        return this.colors;
    }

    public final At3 component2() {
        return this.typography;
    }

    public final A13 component3() {
        return this.shapes;
    }

    public final ThemeParameters copy(lZ lZ2, At3 at3, A13 a13) {
        ThemeParameters themeParameters = new ThemeParameters(lZ2, at3, a13);
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
        Object object3 = ((ThemeParameters)object).colors;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.typography;
        object3 = ((ThemeParameters)object).typography;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.shapes;
        object = ((ThemeParameters)object).shapes;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final lZ getColors() {
        return this.colors;
    }

    public final A13 getShapes() {
        return this.shapes;
    }

    public final At3 getTypography() {
        return this.typography;
    }

    public int hashCode() {
        int n3;
        int n4;
        lZ lZ2 = this.colors;
        int n7 = 0;
        if (lZ2 == null) {
            n4 = 0;
            lZ2 = null;
        } else {
            n4 = lZ2.hashCode();
        }
        n4 *= 31;
        Object object = this.typography;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((At3)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.shapes;
        if (object != null) {
            n7 = ((A13)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ThemeParameters(colors=");
        Object object = this.colors;
        stringBuilder.append(object);
        stringBuilder.append(", typography=");
        object = this.typography;
        stringBuilder.append(object);
        stringBuilder.append(", shapes=");
        object = this.shapes;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

