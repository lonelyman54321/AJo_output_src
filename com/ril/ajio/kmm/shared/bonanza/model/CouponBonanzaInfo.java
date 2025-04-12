/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.Coupon$$serializer;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo$Companion;
import com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable;
import com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable$$serializer;
import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance;
import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CouponBonanzaInfo {
    private static final KSerializer[] $childSerializers;
    public static final CouponBonanzaInfo$Companion Companion;
    private CouponsAvailable couponsAvailable;
    private List myCoupons;
    private PointsBalance pointsBalance;

    static {
        Object object = new CouponBonanzaInfo$Companion(null);
        Companion = object;
        KSerializer[] kSerializerArray = Coupon$$serializer.INSTANCE;
        object = new ip_2((KSerializer)kSerializerArray);
        kSerializerArray = new KSerializer[]{null, object, null};
        $childSerializers = kSerializerArray;
    }

    public CouponBonanzaInfo() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ CouponBonanzaInfo(int n3, CouponsAvailable couponsAvailable, List list, PointsBalance pointsBalance, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.couponsAvailable = n4 == 0 ? null : couponsAvailable;
        int n7 = n3 & 2;
        this.myCoupons = n7 == 0 ? null : list;
        this.pointsBalance = (n3 &= 4) == 0 ? null : pointsBalance;
    }

    public CouponBonanzaInfo(CouponsAvailable couponsAvailable, List list, PointsBalance pointsBalance) {
        this.couponsAvailable = couponsAvailable;
        this.myCoupons = list;
        this.pointsBalance = pointsBalance;
    }

    public /* synthetic */ CouponBonanzaInfo(CouponsAvailable couponsAvailable, List list, PointsBalance pointsBalance, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            couponsAvailable = null;
        }
        if ((n4 = n3 & 2) != 0) {
            list = null;
        }
        if ((n3 &= 4) != 0) {
            pointsBalance = null;
        }
        this(couponsAvailable, list, pointsBalance);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ CouponBonanzaInfo copy$default(CouponBonanzaInfo couponBonanzaInfo, CouponsAvailable couponsAvailable, List list, PointsBalance pointsBalance, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            couponsAvailable = couponBonanzaInfo.couponsAvailable;
        }
        if ((n4 = n3 & 2) != 0) {
            list = couponBonanzaInfo.myCoupons;
        }
        if ((n3 &= 4) != 0) {
            pointsBalance = couponBonanzaInfo.pointsBalance;
        }
        return couponBonanzaInfo.copy(couponsAvailable, list, pointsBalance);
    }

    public static final /* synthetic */ void write$Self$shared_release(CouponBonanzaInfo object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        int n3;
        Object object2;
        Object object3 = $childSerializers;
        int n4 = 0;
        Object object4 = null;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((CouponBonanzaInfo)object).couponsAvailable) != null) {
            object2 = CouponsAvailable$$serializer.INSTANCE;
            CouponsAvailable couponsAvailable = ((CouponBonanzaInfo)object).couponsAvailable;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, couponsAvailable);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n4 = 1)) || (object2 = ((CouponBonanzaInfo)object).myCoupons) != null) {
            object3 = object3[n4];
            object2 = ((CouponBonanzaInfo)object).myCoupons;
            u30_02.r(serialDescriptor, n4, (b03_0)object3, object2);
        }
        if ((n4 = (int)(u30_02.I(serialDescriptor, n3 = 2) ? 1 : 0)) != 0 || (object4 = ((CouponBonanzaInfo)object).pointsBalance) != null) {
            object4 = PointsBalance$$serializer.INSTANCE;
            object = ((CouponBonanzaInfo)object).pointsBalance;
            u30_02.r(serialDescriptor, n3, (b03_0)object4, object);
        }
    }

    public final CouponsAvailable component1() {
        return this.couponsAvailable;
    }

    public final List component2() {
        return this.myCoupons;
    }

    public final PointsBalance component3() {
        return this.pointsBalance;
    }

    public final CouponBonanzaInfo copy(CouponsAvailable couponsAvailable, List list, PointsBalance pointsBalance) {
        CouponBonanzaInfo couponBonanzaInfo = new CouponBonanzaInfo(couponsAvailable, list, pointsBalance);
        return couponBonanzaInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponBonanzaInfo;
        if (!bl3) {
            return false;
        }
        object = (CouponBonanzaInfo)object;
        Object object2 = this.couponsAvailable;
        Object object3 = ((CouponBonanzaInfo)object).couponsAvailable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.myCoupons;
        object3 = ((CouponBonanzaInfo)object).myCoupons;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pointsBalance;
        object = ((CouponBonanzaInfo)object).pointsBalance;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final CouponsAvailable getCouponsAvailable() {
        return this.couponsAvailable;
    }

    public final List getMyCoupons() {
        return this.myCoupons;
    }

    public final PointsBalance getPointsBalance() {
        return this.pointsBalance;
    }

    public int hashCode() {
        int n3;
        int n4;
        CouponsAvailable couponsAvailable = this.couponsAvailable;
        int n7 = 0;
        if (couponsAvailable == null) {
            n4 = 0;
            couponsAvailable = null;
        } else {
            n4 = couponsAvailable.hashCode();
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

    public final void setCouponsAvailable(CouponsAvailable couponsAvailable) {
        this.couponsAvailable = couponsAvailable;
    }

    public final void setMyCoupons(List list) {
        this.myCoupons = list;
    }

    public final void setPointsBalance(PointsBalance pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    public String toString() {
        CouponsAvailable couponsAvailable = this.couponsAvailable;
        List list = this.myCoupons;
        PointsBalance pointsBalance = this.pointsBalance;
        StringBuilder stringBuilder = new StringBuilder("CouponBonanzaInfo(couponsAvailable=");
        stringBuilder.append(couponsAvailable);
        stringBuilder.append(", myCoupons=");
        stringBuilder.append(list);
        stringBuilder.append(", pointsBalance=");
        stringBuilder.append(pointsBalance);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

