/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.PriceReveal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OfferPrice {
    private String currencyIso;
    private String displayformattedValue;
    private String formattedValue;
    private PriceReveal priceReveal;
    private String value;

    public OfferPrice() {
        this(null, null, null, null, null, 31, null);
    }

    public OfferPrice(String string2, String string3, String string4, PriceReveal priceReveal, String string5) {
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.formattedValue = string4;
        this.priceReveal = priceReveal;
        this.value = string5;
    }

    public /* synthetic */ OfferPrice(String object, String object2, String string2, PriceReveal object3, String object4, int n3, DefaultConstructorMarker object5) {
        String string3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string4 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = object4;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        object3 = string4;
        object4 = object7;
        this((String)object5, (String)object6, string4, (PriceReveal)object7, string3);
    }

    public static /* synthetic */ OfferPrice copy$default(OfferPrice offerPrice, String string2, String object, String string3, PriceReveal object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = offerPrice.currencyIso;
        }
        if ((n4 = n3 & 2) != 0) {
            object = offerPrice.displayformattedValue;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = offerPrice.formattedValue;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = offerPrice.priceReveal;
        }
        PriceReveal priceReveal = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = offerPrice.value;
        }
        String string6 = string4;
        object = offerPrice;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string6;
        return offerPrice.copy(string2, (String)object2, string5, priceReveal, string6);
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

    public final PriceReveal component4() {
        return this.priceReveal;
    }

    public final String component5() {
        return this.value;
    }

    public final OfferPrice copy(String string2, String string3, String string4, PriceReveal priceReveal, String string5) {
        OfferPrice offerPrice = new OfferPrice(string2, string3, string4, priceReveal, string5);
        return offerPrice;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OfferPrice;
        if (!bl3) {
            return false;
        }
        object = (OfferPrice)object;
        Object object2 = this.currencyIso;
        Object object3 = ((OfferPrice)object).currencyIso;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayformattedValue;
        object3 = ((OfferPrice)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.formattedValue;
        object3 = ((OfferPrice)object).formattedValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceReveal;
        object3 = ((OfferPrice)object).priceReveal;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.value;
        object = ((OfferPrice)object).value;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
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

    public final PriceReveal getPriceReveal() {
        return this.priceReveal;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.currencyIso;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.displayformattedValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.formattedValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceReveal;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PriceReveal)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.value;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCurrencyIso(String string2) {
        this.currencyIso = string2;
    }

    public final void setDisplayformattedValue(String string2) {
        this.displayformattedValue = string2;
    }

    public final void setFormattedValue(String string2) {
        this.formattedValue = string2;
    }

    public final void setPriceReveal(PriceReveal priceReveal) {
        this.priceReveal = priceReveal;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        CharSequence charSequence = this.currencyIso;
        String string2 = this.displayformattedValue;
        String string3 = this.formattedValue;
        PriceReveal priceReveal = this.priceReveal;
        String string4 = this.value;
        charSequence = og_1.a("OfferPrice(currencyIso=", (String)charSequence, ", displayformattedValue=", string2, ", formattedValue=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", priceReveal=");
        ((StringBuilder)charSequence).append(priceReveal);
        ((StringBuilder)charSequence).append(", value=");
        return h30_0.a((StringBuilder)charSequence, string4, ")");
    }
}

