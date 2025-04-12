/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceReveal {
    private String bestPrice;
    private String discountPercent;

    public PriceReveal() {
        this(null, null, 3, null);
    }

    public PriceReveal(String string2, String string3) {
        this.bestPrice = string2;
        this.discountPercent = string3;
    }

    public /* synthetic */ PriceReveal(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ PriceReveal copy$default(PriceReveal priceReveal, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = priceReveal.bestPrice;
        }
        if ((n3 &= 2) != 0) {
            string3 = priceReveal.discountPercent;
        }
        return priceReveal.copy(string2, string3);
    }

    public final String component1() {
        return this.bestPrice;
    }

    public final String component2() {
        return this.discountPercent;
    }

    public final PriceReveal copy(String string2, String string3) {
        PriceReveal priceReveal = new PriceReveal(string2, string3);
        return priceReveal;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceReveal;
        if (!bl3) {
            return false;
        }
        object = (PriceReveal)object;
        String string2 = this.bestPrice;
        String string3 = ((PriceReveal)object).bestPrice;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.discountPercent;
        object = ((PriceReveal)object).discountPercent;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBestPrice() {
        return this.bestPrice;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public int hashCode() {
        int n3;
        String string2 = this.bestPrice;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.discountPercent;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setBestPrice(String string2) {
        this.bestPrice = string2;
    }

    public final void setDiscountPercent(String string2) {
        this.discountPercent = string2;
    }

    public String toString() {
        String string2 = this.bestPrice;
        String string3 = this.discountPercent;
        return uc0_0.a("PriceReveal(bestPrice=", string2, ", discountPercent=", string3, ")");
    }
}

