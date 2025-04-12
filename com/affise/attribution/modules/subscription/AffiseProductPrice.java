/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import kotlin.jvm.internal.Intrinsics;

public final class AffiseProductPrice {
    private final String currencyCode;
    private final String formattedPrice;
    private final float value;

    public AffiseProductPrice(float f5, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "currencyCode");
        Intrinsics.checkNotNullParameter(string3, "formattedPrice");
        this.value = f5;
        this.currencyCode = string2;
        this.formattedPrice = string3;
    }

    public static /* synthetic */ AffiseProductPrice copy$default(AffiseProductPrice affiseProductPrice, float f5, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = affiseProductPrice.value;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = affiseProductPrice.currencyCode;
        }
        if ((n3 &= 4) != 0) {
            string3 = affiseProductPrice.formattedPrice;
        }
        return affiseProductPrice.copy(f5, string2, string3);
    }

    public final float component1() {
        return this.value;
    }

    public final String component2() {
        return this.currencyCode;
    }

    public final String component3() {
        return this.formattedPrice;
    }

    public final AffiseProductPrice copy(float f5, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "currencyCode");
        Intrinsics.checkNotNullParameter(string3, "formattedPrice");
        AffiseProductPrice affiseProductPrice = new AffiseProductPrice(f5, string2, string3);
        return affiseProductPrice;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AffiseProductPrice;
        if (n3 == 0) {
            return false;
        }
        object = (AffiseProductPrice)object;
        float f5 = this.value;
        float f6 = ((AffiseProductPrice)object).value;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        String string2 = this.currencyCode;
        String string3 = ((AffiseProductPrice)object).currencyCode;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.formattedPrice;
        object = ((AffiseProductPrice)object).formattedPrice;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = Float.floatToIntBits(this.value) * 31;
        String string2 = this.currencyCode;
        n3 = zy_2.b(n3, 31, string2);
        return this.formattedPrice.hashCode() + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseProductPrice(value=");
        float f5 = this.value;
        stringBuilder.append(f5);
        stringBuilder.append(", currencyCode=");
        String string2 = this.currencyCode;
        stringBuilder.append(string2);
        stringBuilder.append(", formattedPrice=");
        string2 = this.formattedPrice;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

