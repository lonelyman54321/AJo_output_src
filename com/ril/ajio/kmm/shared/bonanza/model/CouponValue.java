/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponValue$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CouponValue {
    public static final CouponValue$Companion Companion;
    private String amount;
    private String moneyType;

    static {
        CouponValue$Companion couponValue$Companion;
        Companion = couponValue$Companion = new CouponValue$Companion(null);
    }

    public CouponValue() {
        this(null, null, 3, null);
    }

    public /* synthetic */ CouponValue(int n3, String string2, String string3, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.amount = n4 == 0 ? null : string2;
        this.moneyType = (n3 &= 2) == 0 ? null : string3;
    }

    public CouponValue(String string2, String string3) {
        this.amount = string2;
        this.moneyType = string3;
    }

    public /* synthetic */ CouponValue(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ CouponValue copy$default(CouponValue couponValue, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = couponValue.amount;
        }
        if ((n3 &= 2) != 0) {
            string3 = couponValue.moneyType;
        }
        return couponValue.copy(string2, string3);
    }

    public static final /* synthetic */ void write$Self$shared_release(CouponValue object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((CouponValue)object).amount) != null) {
            object2 = pe3_2.a;
            String string2 = ((CouponValue)object).amount;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, string2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((CouponValue)object).moneyType) != null) {
            object2 = pe3_2.a;
            object = ((CouponValue)object).moneyType;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.moneyType;
    }

    public final CouponValue copy(String string2, String string3) {
        CouponValue couponValue = new CouponValue(string2, string3);
        return couponValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponValue;
        if (!bl3) {
            return false;
        }
        object = (CouponValue)object;
        String string2 = this.amount;
        String string3 = ((CouponValue)object).amount;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.moneyType;
        object = ((CouponValue)object).moneyType;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getMoneyType() {
        return this.moneyType;
    }

    public int hashCode() {
        int n3;
        String string2 = this.amount;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.moneyType;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setAmount(String string2) {
        this.amount = string2;
    }

    public final void setMoneyType(String string2) {
        this.moneyType = string2;
    }

    public String toString() {
        String string2 = this.amount;
        String string3 = this.moneyType;
        return uc0_0.a("CouponValue(amount=", string2, ", moneyType=", string3, ")");
    }
}

