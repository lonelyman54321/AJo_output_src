/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CashOnDeliveryInformation
implements Serializable {
    private String ga_reason;
    private Boolean isEligible;
    private String reason;

    public CashOnDeliveryInformation(Boolean bl2, String string2, String string3) {
        this.isEligible = bl2;
        this.reason = string2;
        this.ga_reason = string3;
    }

    public /* synthetic */ CashOnDeliveryInformation(Boolean bl2, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(bl2, string2, string3);
    }

    public static /* synthetic */ CashOnDeliveryInformation copy$default(CashOnDeliveryInformation cashOnDeliveryInformation, Boolean bl2, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = cashOnDeliveryInformation.isEligible;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = cashOnDeliveryInformation.reason;
        }
        if ((n3 &= 4) != 0) {
            string3 = cashOnDeliveryInformation.ga_reason;
        }
        return cashOnDeliveryInformation.copy(bl2, string2, string3);
    }

    public final Boolean component1() {
        return this.isEligible;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.ga_reason;
    }

    public final CashOnDeliveryInformation copy(Boolean bl2, String string2, String string3) {
        CashOnDeliveryInformation cashOnDeliveryInformation = new CashOnDeliveryInformation(bl2, string2, string3);
        return cashOnDeliveryInformation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CashOnDeliveryInformation;
        if (!bl3) {
            return false;
        }
        object = (CashOnDeliveryInformation)object;
        Object object2 = this.isEligible;
        Object object3 = ((CashOnDeliveryInformation)object).isEligible;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reason;
        object3 = ((CashOnDeliveryInformation)object).reason;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ga_reason;
        object = ((CashOnDeliveryInformation)object).ga_reason;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getGa_reason() {
        return this.ga_reason;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.isEligible;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        String string2 = this.reason;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.ga_reason;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isEligible() {
        return this.isEligible;
    }

    public final void setEligible(Boolean bl2) {
        this.isEligible = bl2;
    }

    public final void setGa_reason(String string2) {
        this.ga_reason = string2;
    }

    public final void setReason(String string2) {
        this.reason = string2;
    }

    public String toString() {
        Boolean bl2 = this.isEligible;
        String string2 = this.reason;
        String string3 = this.ga_reason;
        StringBuilder stringBuilder = new StringBuilder("CashOnDeliveryInformation(isEligible=");
        stringBuilder.append(bl2);
        stringBuilder.append(", reason=");
        stringBuilder.append(string2);
        stringBuilder.append(", ga_reason=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

