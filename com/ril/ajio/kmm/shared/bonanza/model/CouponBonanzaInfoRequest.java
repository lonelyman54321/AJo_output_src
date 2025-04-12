/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CouponBonanzaInfoRequest {
    private final String authorization;
    private final String email;
    private final String filter;
    private final String gameName;
    private final String offerIds;
    private final int pageNumber;
    private final String pageSize;

    public CouponBonanzaInfoRequest(String string2, String string3, int n3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "email");
        Intrinsics.checkNotNullParameter(string4, "pageSize");
        Intrinsics.checkNotNullParameter(string5, "gameName");
        this.email = string2;
        this.filter = string3;
        this.pageNumber = n3;
        this.pageSize = string4;
        this.gameName = string5;
        this.offerIds = string6;
        this.authorization = string7;
    }

    public /* synthetic */ CouponBonanzaInfoRequest(String string2, String string3, int n3, String string4, String string5, String string6, String string7, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 2;
        String string8 = n7 != 0 ? null : string3;
        n7 = n4 & 0x20;
        String string9 = n7 != 0 ? null : string6;
        n7 = n4 & 0x40;
        String string10 = n7 != 0 ? null : string7;
        this(string2, string8, n3, string4, string5, string9, string10);
    }

    public static /* synthetic */ CouponBonanzaInfoRequest copy$default(CouponBonanzaInfoRequest couponBonanzaInfoRequest, String string2, String object, int n3, String object2, String string3, String string4, String string5, int n4, Object object3) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = couponBonanzaInfoRequest.email;
        }
        if ((n7 = n4 & 2) != 0) {
            object = couponBonanzaInfoRequest.filter;
        }
        object3 = object;
        int n8 = n4 & 4;
        if (n8 != 0) {
            n3 = couponBonanzaInfoRequest.pageNumber;
        }
        int n10 = n3;
        n8 = n4 & 8;
        if (n8 != 0) {
            object2 = couponBonanzaInfoRequest.pageSize;
        }
        String string6 = object2;
        n8 = n4 & 0x10;
        if (n8 != 0) {
            string3 = couponBonanzaInfoRequest.gameName;
        }
        String string7 = string3;
        n8 = n4 & 0x20;
        if (n8 != 0) {
            string4 = couponBonanzaInfoRequest.offerIds;
        }
        String string8 = string4;
        n8 = n4 & 0x40;
        if (n8 != 0) {
            string5 = couponBonanzaInfoRequest.authorization;
        }
        String string9 = string5;
        object = couponBonanzaInfoRequest;
        object2 = object3;
        string4 = string6;
        string5 = string7;
        object3 = string9;
        return couponBonanzaInfoRequest.copy(string2, (String)object2, n10, string6, string7, string8, string9);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.filter;
    }

    public final int component3() {
        return this.pageNumber;
    }

    public final String component4() {
        return this.pageSize;
    }

    public final String component5() {
        return this.gameName;
    }

    public final String component6() {
        return this.offerIds;
    }

    public final String component7() {
        return this.authorization;
    }

    public final CouponBonanzaInfoRequest copy(String string2, String string3, int n3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "email");
        Intrinsics.checkNotNullParameter(string4, "pageSize");
        Intrinsics.checkNotNullParameter(string5, "gameName");
        CouponBonanzaInfoRequest couponBonanzaInfoRequest = new CouponBonanzaInfoRequest(string2, string3, n3, string4, string5, string6, string7);
        return couponBonanzaInfoRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CouponBonanzaInfoRequest;
        if (n3 == 0) {
            return false;
        }
        object = (CouponBonanzaInfoRequest)object;
        String string2 = this.email;
        String string3 = ((CouponBonanzaInfoRequest)object).email;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.filter;
        string3 = ((CouponBonanzaInfoRequest)object).filter;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.pageNumber;
        int n4 = ((CouponBonanzaInfoRequest)object).pageNumber;
        if (n3 != n4) {
            return false;
        }
        string2 = this.pageSize;
        string3 = ((CouponBonanzaInfoRequest)object).pageSize;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.gameName;
        string3 = ((CouponBonanzaInfoRequest)object).gameName;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.offerIds;
        string3 = ((CouponBonanzaInfoRequest)object).offerIds;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.authorization;
        object = ((CouponBonanzaInfoRequest)object).authorization;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final String getOfferIds() {
        return this.offerIds;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        int n3;
        String string2 = this.email;
        int n4 = string2.hashCode();
        int n7 = 31;
        n4 *= 31;
        String string3 = this.filter;
        int n8 = 0;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.pageNumber;
        n4 = (n4 + n3) * 31;
        string3 = this.pageSize;
        n4 = zy_2.b(n4, n7, string3);
        string3 = this.gameName;
        n4 = zy_2.b(n4, n7, string3);
        string3 = this.offerIds;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        String string4 = this.authorization;
        if (string4 != null) {
            n8 = string4.hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        CharSequence charSequence = this.email;
        String string2 = this.filter;
        int n3 = this.pageNumber;
        String string3 = this.pageSize;
        String string4 = this.gameName;
        String string5 = this.offerIds;
        String string6 = this.authorization;
        charSequence = og_1.a("CouponBonanzaInfoRequest(email=", charSequence, ", filter=", string2, ", pageNumber=");
        h30_0.b((StringBuilder)charSequence, n3, ", pageSize=", string3, ", gameName=");
        X50.a((StringBuilder)charSequence, string4, ", offerIds=", string5, ", authorization=");
        return h30_0.a((StringBuilder)charSequence, string6, ")");
    }
}

