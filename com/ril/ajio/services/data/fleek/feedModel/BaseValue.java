/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BaseValue {
    private Float resolutionHeight;
    private Float resolutionWidth;

    public BaseValue() {
        this(null, null, 3, null);
    }

    public BaseValue(Float f5, Float f6) {
        this.resolutionHeight = f5;
        this.resolutionWidth = f6;
    }

    public /* synthetic */ BaseValue(Float f5, Float f6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = null;
        }
        if ((n3 &= 2) != 0) {
            f6 = null;
        }
        this(f5, f6);
    }

    public static /* synthetic */ BaseValue copy$default(BaseValue baseValue, Float f5, Float f6, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = baseValue.resolutionHeight;
        }
        if ((n3 &= 2) != 0) {
            f6 = baseValue.resolutionWidth;
        }
        return baseValue.copy(f5, f6);
    }

    public final Float component1() {
        return this.resolutionHeight;
    }

    public final Float component2() {
        return this.resolutionWidth;
    }

    public final BaseValue copy(Float f5, Float f6) {
        BaseValue baseValue = new BaseValue(f5, f6);
        return baseValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BaseValue;
        if (!bl3) {
            return false;
        }
        object = (BaseValue)object;
        Float f5 = this.resolutionHeight;
        Float f6 = ((BaseValue)object).resolutionHeight;
        bl3 = Intrinsics.areEqual((Object)f5, (Object)f6);
        if (!bl3) {
            return false;
        }
        f5 = this.resolutionWidth;
        object = ((BaseValue)object).resolutionWidth;
        boolean bl4 = Intrinsics.areEqual((Object)f5, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getResolutionHeight() {
        return this.resolutionHeight;
    }

    public final Float getResolutionWidth() {
        return this.resolutionWidth;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.resolutionHeight;
        int n4 = 0;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        n3 *= 31;
        Float f6 = this.resolutionWidth;
        if (f6 != null) {
            n4 = ((Object)f6).hashCode();
        }
        return n3 + n4;
    }

    public final void setResolutionHeight(Float f5) {
        this.resolutionHeight = f5;
    }

    public final void setResolutionWidth(Float f5) {
        this.resolutionWidth = f5;
    }

    public String toString() {
        Float f5 = this.resolutionHeight;
        Float f6 = this.resolutionWidth;
        StringBuilder stringBuilder = new StringBuilder("BaseValue(resolutionHeight=");
        stringBuilder.append(f5);
        stringBuilder.append(", resolutionWidth=");
        stringBuilder.append(f6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

