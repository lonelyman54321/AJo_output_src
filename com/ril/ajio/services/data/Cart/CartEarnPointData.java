/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartEarnPointData {
    private float additionalPurchaseAmount;
    private double eligibleEarnAmount;
    private String walletInfo;

    public CartEarnPointData() {
        this(0.0, 0.0f, null, 7, null);
    }

    public CartEarnPointData(double d2, float f5, String string2) {
        this.eligibleEarnAmount = d2;
        this.additionalPurchaseAmount = f5;
        this.walletInfo = string2;
    }

    public /* synthetic */ CartEarnPointData(double d2, float f5, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = 0.0;
        }
        if ((n4 = n3 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        this(d2, f5, string2);
    }

    public static /* synthetic */ CartEarnPointData copy$default(CartEarnPointData cartEarnPointData, double d2, float f5, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = cartEarnPointData.eligibleEarnAmount;
        }
        if ((n4 = n3 & 2) != 0) {
            f5 = cartEarnPointData.additionalPurchaseAmount;
        }
        if ((n3 &= 4) != 0) {
            string2 = cartEarnPointData.walletInfo;
        }
        return cartEarnPointData.copy(d2, f5, string2);
    }

    public final double component1() {
        return this.eligibleEarnAmount;
    }

    public final float component2() {
        return this.additionalPurchaseAmount;
    }

    public final String component3() {
        return this.walletInfo;
    }

    public final CartEarnPointData copy(double d2, float f5, String string2) {
        CartEarnPointData cartEarnPointData = new CartEarnPointData(d2, f5, string2);
        return cartEarnPointData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CartEarnPointData;
        if (n3 == 0) {
            return false;
        }
        object = (CartEarnPointData)object;
        double d2 = this.eligibleEarnAmount;
        double d5 = ((CartEarnPointData)object).eligibleEarnAmount;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        float f5 = this.additionalPurchaseAmount;
        float f6 = ((CartEarnPointData)object).additionalPurchaseAmount;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        String string2 = this.walletInfo;
        object = ((CartEarnPointData)object).walletInfo;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final float getAdditionalPurchaseAmount() {
        return this.additionalPurchaseAmount;
    }

    public final double getEligibleEarnAmount() {
        return this.eligibleEarnAmount;
    }

    public final String getWalletInfo() {
        return this.walletInfo;
    }

    public int hashCode() {
        double d2 = this.eligibleEarnAmount;
        long l2 = Double.doubleToLongBits(d2);
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3) * 31;
        float f5 = this.additionalPurchaseAmount;
        int n7 = UR0.a(f5, n4, 31);
        String string2 = this.walletInfo;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        return n7 + n4;
    }

    public final void setAdditionalPurchaseAmount(float f5) {
        this.additionalPurchaseAmount = f5;
    }

    public final void setEligibleEarnAmount(double d2) {
        this.eligibleEarnAmount = d2;
    }

    public final void setWalletInfo(String string2) {
        this.walletInfo = string2;
    }

    public String toString() {
        double d2 = this.eligibleEarnAmount;
        float f5 = this.additionalPurchaseAmount;
        String string2 = this.walletInfo;
        StringBuilder stringBuilder = new StringBuilder("CartEarnPointData(eligibleEarnAmount=");
        stringBuilder.append(d2);
        stringBuilder.append(", additionalPurchaseAmount=");
        stringBuilder.append(f5);
        return BW0.b(stringBuilder, ", walletInfo=", string2, ")");
    }
}

