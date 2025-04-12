/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Extra {
    private final Float amount;
    private final Float netAmount;

    public Extra() {
        this(null, null, 3, null);
    }

    public Extra(Float f5, Float f6) {
        this.amount = f5;
        this.netAmount = f6;
    }

    public /* synthetic */ Extra(Float f5, Float f6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = null;
        }
        if ((n3 &= 2) != 0) {
            f6 = null;
        }
        this(f5, f6);
    }

    public static /* synthetic */ Extra copy$default(Extra extra, Float f5, Float f6, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = extra.amount;
        }
        if ((n3 &= 2) != 0) {
            f6 = extra.netAmount;
        }
        return extra.copy(f5, f6);
    }

    public final Float component1() {
        return this.amount;
    }

    public final Float component2() {
        return this.netAmount;
    }

    public final Extra copy(Float f5, Float f6) {
        Extra extra = new Extra(f5, f6);
        return extra;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Extra;
        if (!bl3) {
            return false;
        }
        object = (Extra)object;
        Float f5 = this.amount;
        Float f6 = ((Extra)object).amount;
        bl3 = Intrinsics.areEqual((Object)f5, (Object)f6);
        if (!bl3) {
            return false;
        }
        f5 = this.netAmount;
        object = ((Extra)object).netAmount;
        boolean bl4 = Intrinsics.areEqual((Object)f5, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final Float getNetAmount() {
        return this.netAmount;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.amount;
        int n4 = 0;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        n3 *= 31;
        Float f6 = this.netAmount;
        if (f6 != null) {
            n4 = ((Object)f6).hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        Float f5 = this.amount;
        Float f6 = this.netAmount;
        StringBuilder stringBuilder = new StringBuilder("Extra(amount=");
        stringBuilder.append(f5);
        stringBuilder.append(", netAmount=");
        stringBuilder.append(f6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

