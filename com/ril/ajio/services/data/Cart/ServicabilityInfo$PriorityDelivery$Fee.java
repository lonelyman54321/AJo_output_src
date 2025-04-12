/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ServicabilityInfo$PriorityDelivery$Fee
implements Serializable {
    private final String currencyIso;
    private final String displayformattedValue;
    private final String formattedValue;
    private final String priceType;
    private final double value;

    public ServicabilityInfo$PriorityDelivery$Fee(String string2, String string3, String string4, String string5, double d2) {
        Intrinsics.checkNotNullParameter(string2, "currencyIso");
        Intrinsics.checkNotNullParameter(string3, "displayformattedValue");
        Intrinsics.checkNotNullParameter(string4, "formattedValue");
        Intrinsics.checkNotNullParameter(string5, "priceType");
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.formattedValue = string4;
        this.priceType = string5;
        this.value = d2;
    }

    public static /* synthetic */ ServicabilityInfo$PriorityDelivery$Fee copy$default(ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee, String string2, String object, String string3, String object2, double d2, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = servicabilityInfo$PriorityDelivery$Fee.currencyIso;
        }
        if ((n4 = n3 & 2) != 0) {
            object = servicabilityInfo$PriorityDelivery$Fee.displayformattedValue;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = servicabilityInfo$PriorityDelivery$Fee.formattedValue;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = servicabilityInfo$PriorityDelivery$Fee.priceType;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            d2 = servicabilityInfo$PriorityDelivery$Fee.value;
        }
        object = servicabilityInfo$PriorityDelivery$Fee;
        string3 = string2;
        object2 = object3;
        return servicabilityInfo$PriorityDelivery$Fee.copy(string2, (String)object3, string4, string5, d2);
    }

    public final String component1() {
        return this.currencyIso;
    }

    public final String component2() {
        return this.displayformattedValue;
    }

    public final String component3() {
        return this.formattedValue;
    }

    public final String component4() {
        return this.priceType;
    }

    public final double component5() {
        return this.value;
    }

    public final ServicabilityInfo$PriorityDelivery$Fee copy(String string2, String string3, String string4, String string5, double d2) {
        Intrinsics.checkNotNullParameter(string2, "currencyIso");
        Intrinsics.checkNotNullParameter(string3, "displayformattedValue");
        Intrinsics.checkNotNullParameter(string4, "formattedValue");
        Intrinsics.checkNotNullParameter(string5, "priceType");
        ServicabilityInfo$PriorityDelivery$Fee servicabilityInfo$PriorityDelivery$Fee = new ServicabilityInfo$PriorityDelivery$Fee(string2, string3, string4, string5, d2);
        return servicabilityInfo$PriorityDelivery$Fee;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ServicabilityInfo$PriorityDelivery$Fee;
        if (!bl3) {
            return false;
        }
        object = (ServicabilityInfo$PriorityDelivery$Fee)object;
        String string2 = this.currencyIso;
        String string3 = ((ServicabilityInfo$PriorityDelivery$Fee)object).currencyIso;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.displayformattedValue;
        string3 = ((ServicabilityInfo$PriorityDelivery$Fee)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.formattedValue;
        string3 = ((ServicabilityInfo$PriorityDelivery$Fee)object).formattedValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.priceType;
        string3 = ((ServicabilityInfo$PriorityDelivery$Fee)object).priceType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        double d2 = this.value;
        double d5 = ((ServicabilityInfo$PriorityDelivery$Fee)object).value;
        int n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final String getCurrencyIso() {
        return this.currencyIso;
    }

    public final String getDisplayformattedValue() {
        return this.displayformattedValue;
    }

    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public final String getPriceType() {
        return this.priceType;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.currencyIso.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.displayformattedValue;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.formattedValue;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.priceType;
        n3 = zy_2.b(n3, n4, string2);
        long l2 = Double.doubleToLongBits(this.value);
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        return n3 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.currencyIso;
        String string2 = this.displayformattedValue;
        String string3 = this.formattedValue;
        String string4 = this.priceType;
        double d2 = this.value;
        charSequence = og_1.a("Fee(currencyIso=", (String)charSequence, ", displayformattedValue=", string2, ", formattedValue=");
        X50.a((StringBuilder)charSequence, string3, ", priceType=", string4, ", value=");
        ((StringBuilder)charSequence).append(d2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

