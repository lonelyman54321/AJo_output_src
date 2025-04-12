/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral.transform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralAjioWalletTransform {
    private Float amount;

    public ReferralAjioWalletTransform() {
        this(null, 1, null);
    }

    public ReferralAjioWalletTransform(Float f5) {
        this.amount = f5;
    }

    public /* synthetic */ ReferralAjioWalletTransform(Float f5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            f5 = Float.valueOf(0.0f);
        }
        this(f5);
    }

    public static /* synthetic */ ReferralAjioWalletTransform copy$default(ReferralAjioWalletTransform referralAjioWalletTransform, Float f5, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            f5 = referralAjioWalletTransform.amount;
        }
        return referralAjioWalletTransform.copy(f5);
    }

    public final Float component1() {
        return this.amount;
    }

    public final ReferralAjioWalletTransform copy(Float f5) {
        ReferralAjioWalletTransform referralAjioWalletTransform = new ReferralAjioWalletTransform(f5);
        return referralAjioWalletTransform;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralAjioWalletTransform;
        if (!bl3) {
            return false;
        }
        object = (ReferralAjioWalletTransform)object;
        Float f5 = this.amount;
        object = ((ReferralAjioWalletTransform)object).amount;
        boolean bl4 = Intrinsics.areEqual((Object)f5, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.amount;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        return n3;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public String toString() {
        Float f5 = this.amount;
        StringBuilder stringBuilder = new StringBuilder("ReferralAjioWalletTransform(amount=");
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

