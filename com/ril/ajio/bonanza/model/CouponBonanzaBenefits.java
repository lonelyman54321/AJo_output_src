/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.bonanza.model;

import kotlin.jvm.internal.Intrinsics;

public final class CouponBonanzaBenefits {
    public static final int $stable = 8;
    private String desc;
    private int image;
    private String title;

    public CouponBonanzaBenefits(String string2, String string3, int n3) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "desc");
        this.title = string2;
        this.desc = string3;
        this.image = n3;
    }

    public static /* synthetic */ CouponBonanzaBenefits copy$default(CouponBonanzaBenefits couponBonanzaBenefits, String string2, String string3, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = couponBonanzaBenefits.title;
        }
        if ((n7 = n4 & 2) != 0) {
            string3 = couponBonanzaBenefits.desc;
        }
        if ((n4 &= 4) != 0) {
            n3 = couponBonanzaBenefits.image;
        }
        return couponBonanzaBenefits.copy(string2, string3, n3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.desc;
    }

    public final int component3() {
        return this.image;
    }

    public final CouponBonanzaBenefits copy(String string2, String string3, int n3) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "desc");
        CouponBonanzaBenefits couponBonanzaBenefits = new CouponBonanzaBenefits(string2, string3, n3);
        return couponBonanzaBenefits;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CouponBonanzaBenefits;
        if (n3 == 0) {
            return false;
        }
        object = (CouponBonanzaBenefits)object;
        String string2 = this.title;
        String string3 = ((CouponBonanzaBenefits)object).title;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.desc;
        string3 = ((CouponBonanzaBenefits)object).desc;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.image;
        int n4 = ((CouponBonanzaBenefits)object).image;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3 = this.title.hashCode() * 31;
        String string2 = this.desc;
        n3 = zy_2.b(n3, 31, string2);
        int n4 = this.image;
        return n3 + n4;
    }

    public final void setDesc(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.desc = string2;
    }

    public final void setImage(int n3) {
        this.image = n3;
    }

    public final void setTitle(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.title = string2;
    }

    public String toString() {
        CharSequence charSequence = this.title;
        String string2 = this.desc;
        int n3 = this.image;
        charSequence = og_1.a("CouponBonanzaBenefits(title=", charSequence, ", desc=", string2, ", image=");
        return g30.a(n3, ")", (StringBuilder)charSequence);
    }
}

