/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Debit
implements Serializable {
    private final Boolean enable;

    public Debit() {
        this(null, 1, null);
    }

    public Debit(Boolean bl2) {
        this.enable = bl2;
    }

    public /* synthetic */ Debit(Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            bl2 = null;
        }
        this(bl2);
    }

    public static /* synthetic */ Debit copy$default(Debit debit, Boolean bl2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            bl2 = debit.enable;
        }
        return debit.copy(bl2);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final Debit copy(Boolean bl2) {
        Debit debit = new Debit(bl2);
        return debit;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Debit;
        if (!bl3) {
            return false;
        }
        object = (Debit)object;
        Boolean bl4 = this.enable;
        object = ((Debit)object).enable;
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
        StringBuilder stringBuilder = new StringBuilder("Debit(enable=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

