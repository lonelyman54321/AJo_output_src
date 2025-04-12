/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import com.ril.ajio.services.data.referral.ReferrerCashData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralConfigCash {
    private ReferrerCashData referee;
    private ReferrerCashData referrer;

    public ReferralConfigCash() {
        this(null, null, 3, null);
    }

    public ReferralConfigCash(ReferrerCashData referrerCashData, ReferrerCashData referrerCashData2) {
        this.referee = referrerCashData;
        this.referrer = referrerCashData2;
    }

    public /* synthetic */ ReferralConfigCash(ReferrerCashData referrerCashData, ReferrerCashData referrerCashData2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            referrerCashData = null;
        }
        if ((n3 &= 2) != 0) {
            referrerCashData2 = null;
        }
        this(referrerCashData, referrerCashData2);
    }

    public static /* synthetic */ ReferralConfigCash copy$default(ReferralConfigCash referralConfigCash, ReferrerCashData referrerCashData, ReferrerCashData referrerCashData2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            referrerCashData = referralConfigCash.referee;
        }
        if ((n3 &= 2) != 0) {
            referrerCashData2 = referralConfigCash.referrer;
        }
        return referralConfigCash.copy(referrerCashData, referrerCashData2);
    }

    public final ReferrerCashData component1() {
        return this.referee;
    }

    public final ReferrerCashData component2() {
        return this.referrer;
    }

    public final ReferralConfigCash copy(ReferrerCashData referrerCashData, ReferrerCashData referrerCashData2) {
        ReferralConfigCash referralConfigCash = new ReferralConfigCash(referrerCashData, referrerCashData2);
        return referralConfigCash;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralConfigCash;
        if (!bl3) {
            return false;
        }
        object = (ReferralConfigCash)object;
        ReferrerCashData referrerCashData = this.referee;
        ReferrerCashData referrerCashData2 = ((ReferralConfigCash)object).referee;
        bl3 = Intrinsics.areEqual(referrerCashData, referrerCashData2);
        if (!bl3) {
            return false;
        }
        referrerCashData = this.referrer;
        object = ((ReferralConfigCash)object).referrer;
        boolean bl4 = Intrinsics.areEqual(referrerCashData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ReferrerCashData getReferee() {
        return this.referee;
    }

    public final ReferrerCashData getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        int n3;
        ReferrerCashData referrerCashData = this.referee;
        int n4 = 0;
        if (referrerCashData == null) {
            n3 = 0;
            referrerCashData = null;
        } else {
            n3 = referrerCashData.hashCode();
        }
        n3 *= 31;
        ReferrerCashData referrerCashData2 = this.referrer;
        if (referrerCashData2 != null) {
            n4 = referrerCashData2.hashCode();
        }
        return n3 + n4;
    }

    public final void setReferee(ReferrerCashData referrerCashData) {
        this.referee = referrerCashData;
    }

    public final void setReferrer(ReferrerCashData referrerCashData) {
        this.referrer = referrerCashData;
    }

    public String toString() {
        ReferrerCashData referrerCashData = this.referee;
        ReferrerCashData referrerCashData2 = this.referrer;
        StringBuilder stringBuilder = new StringBuilder("ReferralConfigCash(referee=");
        stringBuilder.append(referrerCashData);
        stringBuilder.append(", referrer=");
        stringBuilder.append(referrerCashData2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

