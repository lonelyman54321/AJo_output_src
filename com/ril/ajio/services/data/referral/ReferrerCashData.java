/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import com.ril.ajio.services.data.referral.RefereeEarnCash;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReferrerCashData {
    private RefereeEarnCash refereeFirstOrder;
    private RefereeEarnCash refereeUserRegistration;
    private Float totalBonus;

    public ReferrerCashData() {
        this(null, null, null, 7, null);
    }

    public ReferrerCashData(Float f5, RefereeEarnCash refereeEarnCash, RefereeEarnCash refereeEarnCash2) {
        this.totalBonus = f5;
        this.refereeFirstOrder = refereeEarnCash;
        this.refereeUserRegistration = refereeEarnCash2;
    }

    public /* synthetic */ ReferrerCashData(Float f5, RefereeEarnCash refereeEarnCash, RefereeEarnCash refereeEarnCash2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            refereeEarnCash = null;
        }
        if ((n3 &= 4) != 0) {
            refereeEarnCash2 = null;
        }
        this(f5, refereeEarnCash, refereeEarnCash2);
    }

    public final RefereeEarnCash getRefereeFirstOrder() {
        return this.refereeFirstOrder;
    }

    public final RefereeEarnCash getRefereeUserRegistration() {
        return this.refereeUserRegistration;
    }

    public final Float getTotalBonus() {
        return this.totalBonus;
    }

    public final void setRefereeFirstOrder(RefereeEarnCash refereeEarnCash) {
        this.refereeFirstOrder = refereeEarnCash;
    }

    public final void setRefereeUserRegistration(RefereeEarnCash refereeEarnCash) {
        this.refereeUserRegistration = refereeEarnCash;
    }

    public final void setTotalBonus(Float f5) {
        this.totalBonus = f5;
    }
}

