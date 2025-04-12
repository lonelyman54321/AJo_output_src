/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import com.ril.ajio.services.data.referral.ReferralExpiresIn;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RefereeEarnCash {
    private float amount;
    private ReferralExpiresIn expiresIn;

    public RefereeEarnCash(float f5, ReferralExpiresIn referralExpiresIn) {
        this.amount = f5;
        this.expiresIn = referralExpiresIn;
    }

    public /* synthetic */ RefereeEarnCash(float f5, ReferralExpiresIn referralExpiresIn, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            referralExpiresIn = null;
        }
        this(f5, referralExpiresIn);
    }

    public final float getAmount() {
        return this.amount;
    }

    public final ReferralExpiresIn getExpiresIn() {
        return this.expiresIn;
    }

    public final void setAmount(float f5) {
        this.amount = f5;
    }

    public final void setExpiresIn(ReferralExpiresIn referralExpiresIn) {
        this.expiresIn = referralExpiresIn;
    }
}

