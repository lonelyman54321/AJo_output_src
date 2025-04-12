/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NoCostEmi
implements Serializable {
    private final Boolean enable;

    public NoCostEmi() {
        this(null, 1, null);
    }

    public NoCostEmi(Boolean bl2) {
        this.enable = bl2;
    }

    public /* synthetic */ NoCostEmi(Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            bl2 = null;
        }
        this(bl2);
    }

    public static /* synthetic */ NoCostEmi copy$default(NoCostEmi noCostEmi, Boolean bl2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            bl2 = noCostEmi.enable;
        }
        return noCostEmi.copy(bl2);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final NoCostEmi copy(Boolean bl2) {
        NoCostEmi noCostEmi = new NoCostEmi(bl2);
        return noCostEmi;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NoCostEmi;
        if (!bl3) {
            return false;
        }
        object = (NoCostEmi)object;
        Boolean bl4 = this.enable;
        object = ((NoCostEmi)object).enable;
        boolean bl5 = Intrinsics.areEqual(bl4, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.enable;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        return n3;
    }

    public String toString() {
        Boolean bl2 = this.enable;
        StringBuilder stringBuilder = new StringBuilder("NoCostEmi(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

