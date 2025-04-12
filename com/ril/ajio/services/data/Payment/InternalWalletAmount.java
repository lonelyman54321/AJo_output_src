/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class InternalWalletAmount
implements Serializable {
    private float amount;
    private String name;

    public InternalWalletAmount(String string2, float f5) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.name = string2;
        this.amount = f5;
    }

    public static /* synthetic */ InternalWalletAmount copy$default(InternalWalletAmount internalWalletAmount, String string2, float f5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = internalWalletAmount.name;
        }
        if ((n3 &= 2) != 0) {
            f5 = internalWalletAmount.amount;
        }
        return internalWalletAmount.copy(string2, f5);
    }

    public final String component1() {
        return this.name;
    }

    public final float component2() {
        return this.amount;
    }

    public final InternalWalletAmount copy(String string2, float f5) {
        Intrinsics.checkNotNullParameter(string2, "name");
        InternalWalletAmount internalWalletAmount = new InternalWalletAmount(string2, f5);
        return internalWalletAmount;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InternalWalletAmount;
        if (!bl3) {
            return false;
        }
        object = (InternalWalletAmount)object;
        String string2 = this.name;
        String string3 = ((InternalWalletAmount)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        float f5 = this.amount;
        float f6 = ((InternalWalletAmount)object).amount;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final float getAmount() {
        return this.amount;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int n3 = this.name.hashCode() * 31;
        return Float.floatToIntBits(this.amount) + n3;
    }

    public final void setAmount(float f5) {
        this.amount = f5;
    }

    public final void setName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.name = string2;
    }

    public String toString() {
        String string2 = this.name;
        float f5 = this.amount;
        StringBuilder stringBuilder = new StringBuilder("InternalWalletAmount(name=");
        stringBuilder.append(string2);
        stringBuilder.append(", amount=");
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

