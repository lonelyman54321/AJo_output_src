/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CouponNudgeData
implements Serializable {
    private final String imageUrl;
    private final String subTitle;
    private final String title;

    public CouponNudgeData() {
        this(null, null, null, 7, null);
    }

    public CouponNudgeData(String string2, String string3, String string4) {
        this.title = string2;
        this.subTitle = string3;
        this.imageUrl = string4;
    }

    public /* synthetic */ CouponNudgeData(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ CouponNudgeData copy$default(CouponNudgeData couponNudgeData, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = couponNudgeData.title;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = couponNudgeData.subTitle;
        }
        if ((n3 &= 4) != 0) {
            string4 = couponNudgeData.imageUrl;
        }
        return couponNudgeData.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subTitle;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final CouponNudgeData copy(String string2, String string3, String string4) {
        CouponNudgeData couponNudgeData = new CouponNudgeData(string2, string3, string4);
        return couponNudgeData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CouponNudgeData;
        if (!bl3) {
            return false;
        }
        object = (CouponNudgeData)object;
        String string2 = this.title;
        String string3 = ((CouponNudgeData)object).title;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.subTitle;
        string3 = ((CouponNudgeData)object).subTitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageUrl;
        object = ((CouponNudgeData)object).imageUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.title;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.subTitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.imageUrl;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.title;
        String string3 = this.subTitle;
        String string4 = this.imageUrl;
        return h30_0.a(og_1.a("CouponNudgeData(title=", string2, ", subTitle=", string3, ", imageUrl="), string4, ")");
    }
}

