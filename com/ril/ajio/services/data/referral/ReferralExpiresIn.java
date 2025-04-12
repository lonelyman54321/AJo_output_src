/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.referral;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReferralExpiresIn {
    private String unit;
    private Integer value;

    public ReferralExpiresIn() {
        this(null, null, 3, null);
    }

    public ReferralExpiresIn(String string2, Integer n3) {
        this.unit = string2;
        this.value = n3;
    }

    public /* synthetic */ ReferralExpiresIn(String string2, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n4 &= 2) != 0) {
            n3 = null;
        }
        this(string2, n3);
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Integer getValue() {
        return this.value;
    }

    public final void setUnit(String string2) {
        this.unit = string2;
    }

    public final void setValue(Integer n3) {
        this.value = n3;
    }
}

