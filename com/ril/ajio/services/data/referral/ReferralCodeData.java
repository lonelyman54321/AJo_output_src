/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import kotlin.jvm.internal.Intrinsics;

public final class ReferralCodeData {
    private final String referralCode;

    public ReferralCodeData(String string2) {
        this.referralCode = string2;
    }

    public static /* synthetic */ ReferralCodeData copy$default(ReferralCodeData referralCodeData, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = referralCodeData.referralCode;
        }
        return referralCodeData.copy(string2);
    }

    public final String component1() {
        return this.referralCode;
    }

    public final ReferralCodeData copy(String string2) {
        ReferralCodeData referralCodeData = new ReferralCodeData(string2);
        return referralCodeData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReferralCodeData;
        if (!bl3) {
            return false;
        }
        object = (ReferralCodeData)object;
        String string2 = this.referralCode;
        object = ((ReferralCodeData)object).referralCode;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public int hashCode() {
        int n3;
        String string2 = this.referralCode;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        String string2 = this.referralCode;
        return cP.a("ReferralCodeData(referralCode=", string2, ")");
    }
}

