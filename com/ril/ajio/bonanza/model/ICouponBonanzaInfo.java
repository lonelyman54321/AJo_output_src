/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.bonanza.model;

import com.ril.ajio.bonanza.model.ICouponsAvailable;
import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ICouponBonanzaInfo {
    public static final int $stable = 8;
    private ICouponsAvailable couponsAvailable;
    private p83_0 myCoupons;
    private PointsBalance pointsBalance;

    public ICouponBonanzaInfo() {
        this(null, null, null, 7, null);
    }

    public ICouponBonanzaInfo(ICouponsAvailable iCouponsAvailable, p83_0 p83_02, PointsBalance pointsBalance) {
        this.couponsAvailable = iCouponsAvailable;
        this.myCoupons = p83_02;
        this.pointsBalance = pointsBalance;
    }

    public /* synthetic */ ICouponBonanzaInfo(ICouponsAvailable iCouponsAvailable, p83_0 p83_02, PointsBalance pointsBalance, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            iCouponsAvailable = null;
        }
        if ((n4 = n3 & 2) != 0) {
            p83_02 = null;
        }
        if ((n3 &= 4) != 0) {
            pointsBalance = null;
        }
        this(iCouponsAvailable, p83_02, pointsBalance);
    }

    public static /* synthetic */ ICouponBonanzaInfo copy$default(ICouponBonanzaInfo iCouponBonanzaInfo, ICouponsAvailable iCouponsAvailable, p83_0 p83_02, PointsBalance pointsBalance, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            iCouponsAvailable = iCouponBonanzaInfo.couponsAvailable;
        }
        if ((n4 = n3 & 2) != 0) {
            p83_02 = iCouponBonanzaInfo.myCoupons;
        }
        if ((n3 &= 4) != 0) {
            pointsBalance = iCouponBonanzaInfo.pointsBalance;
        }
        return iCouponBonanzaInfo.copy(iCouponsAvailable, p83_02, pointsBalance);
    }

    public final ICouponsAvailable component1() {
        return this.couponsAvailable;
    }

    public final p83_0 component2() {
        return this.myCoupons;
    }

    public final PointsBalance component3() {
        return this.pointsBalance;
    }

    public final ICouponBonanzaInfo copy(ICouponsAvailable iCouponsAvailable, p83_0 p83_02, PointsBalance pointsBalance) {
        ICouponBonanzaInfo iCouponBonanzaInfo = new ICouponBonanzaInfo(iCouponsAvailable, p83_02, pointsBalance);
        return iCouponBonanzaInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ICouponBonanzaInfo;
        if (!bl3) {
            return false;
        }
        object = (ICouponBonanzaInfo)object;
        Object object2 = this.couponsAvailable;
        Object object3 = ((ICouponBonanzaInfo)object).couponsAvailable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.myCoupons;
        object3 = ((ICouponBonanzaInfo)object).myCoupons;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pointsBalance;
        object = ((ICouponBonanzaInfo)object).pointsBalance;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ICouponsAvailable getCouponsAvailable() {
        return this.couponsAvailable;
    }

    public final p83_0 getMyCoupons() {
        return this.myCoupons;
    }

    public final PointsBalance getPointsBalance() {
        return this.pointsBalance;
    }

    public int hashCode() {
        int n3;
        int n4;
        ICouponsAvailable iCouponsAvailable = this.couponsAvailable;
        int n7 = 0;
        if (iCouponsAvailable == null) {
            n4 = 0;
            iCouponsAvailable = null;
        } else {
            n4 = iCouponsAvailable.hashCode();
        }
        n4 *= 31;
        Object object = this.myCoupons;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pointsBalance;
        if (object != null) {
            n7 = ((PointsBalance)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCouponsAvailable(ICouponsAvailable iCouponsAvailable) {
        this.couponsAvailable = iCouponsAvailable;
    }

    public final void setMyCoupons(p83_0 p83_02) {
        this.myCoupons = p83_02;
    }

    public final void setPointsBalance(PointsBalance pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    public String toString() {
        ICouponsAvailable iCouponsAvailable = this.couponsAvailable;
        p83_0 p83_02 = this.myCoupons;
        PointsBalance pointsBalance = this.pointsBalance;
        StringBuilder stringBuilder = new StringBuilder("ICouponBonanzaInfo(couponsAvailable=");
        stringBuilder.append(iCouponsAvailable);
        stringBuilder.append(", myCoupons=");
        stringBuilder.append(p83_02);
        stringBuilder.append(", pointsBalance=");
        stringBuilder.append(pointsBalance);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

