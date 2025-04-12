/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class PointsBalance {
    public static final PointsBalance$Companion Companion;
    private Integer remainingBalance;
    private Integer totalCouponPointsAllocated;

    static {
        PointsBalance$Companion pointsBalance$Companion;
        Companion = pointsBalance$Companion = new PointsBalance$Companion(null);
    }

    public PointsBalance() {
        this(null, null, 3, null);
    }

    public /* synthetic */ PointsBalance(int n3, Integer n4, Integer n7, a03_0 a03_02) {
        int n8 = n3 & 1;
        this.remainingBalance = n8 == 0 ? null : n4;
        this.totalCouponPointsAllocated = (n3 &= 2) == 0 ? null : n7;
    }

    public PointsBalance(Integer n3, Integer n4) {
        this.remainingBalance = n3;
        this.totalCouponPointsAllocated = n4;
    }

    public /* synthetic */ PointsBalance(Integer n3, Integer n4, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = null;
        }
        if ((n7 &= 2) != 0) {
            n4 = null;
        }
        this(n3, n4);
    }

    public static /* synthetic */ PointsBalance copy$default(PointsBalance pointsBalance, Integer n3, Integer n4, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = pointsBalance.remainingBalance;
        }
        if ((n7 &= 2) != 0) {
            n4 = pointsBalance.totalCouponPointsAllocated;
        }
        return pointsBalance.copy(n3, n4);
    }

    public static final /* synthetic */ void write$Self$shared_release(PointsBalance object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((PointsBalance)object).remainingBalance) != null) {
            object2 = yi1_2.a;
            Integer n4 = ((PointsBalance)object).remainingBalance;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, n4);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((PointsBalance)object).totalCouponPointsAllocated) != null) {
            object2 = yi1_2.a;
            object = ((PointsBalance)object).totalCouponPointsAllocated;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Integer component1() {
        return this.remainingBalance;
    }

    public final Integer component2() {
        return this.totalCouponPointsAllocated;
    }

    public final PointsBalance copy(Integer n3, Integer n4) {
        PointsBalance pointsBalance = new PointsBalance(n3, n4);
        return pointsBalance;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PointsBalance;
        if (!bl3) {
            return false;
        }
        object = (PointsBalance)object;
        Integer n3 = this.remainingBalance;
        Integer n4 = ((PointsBalance)object).remainingBalance;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.totalCouponPointsAllocated;
        object = ((PointsBalance)object).totalCouponPointsAllocated;
        boolean bl4 = Intrinsics.areEqual(n3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getRemainingBalance() {
        return this.remainingBalance;
    }

    public final Integer getTotalCouponPointsAllocated() {
        return this.totalCouponPointsAllocated;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.remainingBalance;
        int n7 = 0;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = ((Object)n4).hashCode();
        }
        n3 *= 31;
        Integer n8 = this.totalCouponPointsAllocated;
        if (n8 != null) {
            n7 = ((Object)n8).hashCode();
        }
        return n3 + n7;
    }

    public final void setRemainingBalance(Integer n3) {
        this.remainingBalance = n3;
    }

    public final void setTotalCouponPointsAllocated(Integer n3) {
        this.totalCouponPointsAllocated = n3;
    }

    public String toString() {
        Integer n3 = this.remainingBalance;
        Integer n4 = this.totalCouponPointsAllocated;
        StringBuilder stringBuilder = new StringBuilder("PointsBalance(remainingBalance=");
        stringBuilder.append(n3);
        stringBuilder.append(", totalCouponPointsAllocated=");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

