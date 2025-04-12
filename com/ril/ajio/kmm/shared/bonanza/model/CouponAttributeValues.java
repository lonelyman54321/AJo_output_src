/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CouponAttributeValues {
    public static final CouponAttributeValues$Companion Companion;
    private Boolean selected;
    private String value;

    static {
        CouponAttributeValues$Companion couponAttributeValues$Companion;
        Companion = couponAttributeValues$Companion = new CouponAttributeValues$Companion(null);
    }

    public CouponAttributeValues() {
        this(null, null, 3, null);
    }

    public /* synthetic */ CouponAttributeValues(int n3, Boolean bl2, String string2, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.selected = n4 == 0 ? null : bl2;
        this.value = (n3 &= 2) == 0 ? null : string2;
    }

    public CouponAttributeValues(Boolean bl2, String string2) {
        this.selected = bl2;
        this.value = string2;
    }

    public /* synthetic */ CouponAttributeValues(Boolean bl2, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(bl2, string2);
    }

    public static /* synthetic */ CouponAttributeValues copy$default(CouponAttributeValues couponAttributeValues, Boolean bl2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = couponAttributeValues.selected;
        }
        if ((n3 &= 2) != 0) {
            string2 = couponAttributeValues.value;
        }
        return couponAttributeValues.copy(bl2, string2);
    }

    public static final /* synthetic */ void write$Self$shared_release(CouponAttributeValues object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((CouponAttributeValues)object).selected) != null) {
            object2 = cz_2.a;
            Boolean bl3 = ((CouponAttributeValues)object).selected;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, bl3);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((CouponAttributeValues)object).value) != null) {
            object2 = pe3_2.a;
            object = ((CouponAttributeValues)object).value;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Boolean component1() {
        return this.selected;
    }

    public final String component2() {
        return this.value;
    }

    public final CouponAttributeValues copy(Boolean bl2, String string2) {
        CouponAttributeValues couponAttributeValues = new CouponAttributeValues(bl2, string2);
        return couponAttributeValues;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponAttributeValues;
        if (!bl3) {
            return false;
        }
        object = (CouponAttributeValues)object;
        Object object2 = this.selected;
        Boolean bl4 = ((CouponAttributeValues)object).selected;
        bl3 = Intrinsics.areEqual(object2, bl4);
        if (!bl3) {
            return false;
        }
        object2 = this.value;
        object = ((CouponAttributeValues)object).value;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.selected;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        String string2 = this.value;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final void setSelected(Boolean bl2) {
        this.selected = bl2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        Boolean bl2 = this.selected;
        String string2 = this.value;
        StringBuilder stringBuilder = new StringBuilder("CouponAttributeValues(selected=");
        stringBuilder.append(bl2);
        stringBuilder.append(", value=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

