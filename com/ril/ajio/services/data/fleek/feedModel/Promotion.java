/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Promotion {
    private String discountPercentage;

    public Promotion() {
        this(null, 1, null);
    }

    public Promotion(String string2) {
        this.discountPercentage = string2;
    }

    public /* synthetic */ Promotion(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = promotion.discountPercentage;
        }
        return promotion.copy(string2);
    }

    public final String component1() {
        return this.discountPercentage;
    }

    public final Promotion copy(String string2) {
        Promotion promotion = new Promotion(string2);
        return promotion;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Promotion;
        if (!bl3) {
            return false;
        }
        object = (Promotion)object;
        String string2 = this.discountPercentage;
        object = ((Promotion)object).discountPercentage;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    public int hashCode() {
        int n3;
        String string2 = this.discountPercentage;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final void setDiscountPercentage(String string2) {
        this.discountPercentage = string2;
    }

    public String toString() {
        String string2 = this.discountPercentage;
        return cP.a("Promotion(discountPercentage=", string2, ")");
    }
}

