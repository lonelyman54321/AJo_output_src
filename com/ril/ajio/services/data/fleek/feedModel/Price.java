/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Price {
    private Integer basePrice;
    private String currencyIso;
    private String displayformattedValue;
    private String formattedValue;
    private Integer listPrice;
    private Integer offerPrice;
    private String priceType;
    private String value;

    public Price() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public Price(Integer n3, String string2, String string3, String string4, Integer n4, Integer n7, String string5, String string6) {
        this.basePrice = n3;
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.formattedValue = string4;
        this.listPrice = n4;
        this.offerPrice = n7;
        this.priceType = string5;
        this.value = string6;
    }

    public /* synthetic */ Price(Integer object, String object2, String string2, String string3, Integer object3, Integer n3, String object4, String string4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        Integer n7;
        Integer n8;
        String string6;
        String string7;
        String string8;
        Integer n10;
        int n14 = n4;
        int n15 = n4 & 1;
        String string9 = null;
        if (n15 != 0) {
            n15 = 0;
            n10 = null;
        } else {
            n10 = object;
        }
        int n16 = n14 & 2;
        if (n16 != 0) {
            n16 = 0;
            string8 = null;
        } else {
            string8 = object2;
        }
        int n17 = n14 & 4;
        if (n17 != 0) {
            n17 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n18 = n14 & 8;
        if (n18 != 0) {
            n18 = 0;
            string6 = null;
        } else {
            string6 = string3;
        }
        int n19 = n14 & 0x10;
        if (n19 != 0) {
            n19 = 0;
            n8 = null;
        } else {
            n8 = object3;
        }
        int n20 = n14 & 0x20;
        if (n20 != 0) {
            n20 = 0;
            n7 = null;
        } else {
            n7 = n3;
        }
        int n21 = n14 & 0x40;
        if (n21 != 0) {
            n21 = 0;
            string5 = null;
        } else {
            string5 = object4;
        }
        if ((n14 &= 0x80) == 0) {
            string9 = string4;
        }
        object = this;
        object2 = n10;
        string2 = string8;
        string3 = string7;
        object3 = string6;
        n3 = n8;
        object4 = n7;
        string4 = string5;
        this(n10, string8, string7, string6, n8, n7, string5, string9);
    }

    public static /* synthetic */ Price copy$default(Price price, Integer n3, String string2, String string3, String string4, Integer n4, Integer n7, String string5, String string6, int n8, Object object) {
        Price price2 = price;
        int n10 = n8;
        int n14 = n8 & 1;
        Integer n15 = n14 != 0 ? price.basePrice : n3;
        int n16 = n10 & 2;
        String string7 = n16 != 0 ? price2.currencyIso : string2;
        int n17 = n10 & 4;
        String string8 = n17 != 0 ? price2.displayformattedValue : string3;
        int n18 = n10 & 8;
        String string9 = n18 != 0 ? price2.formattedValue : string4;
        int n19 = n10 & 0x10;
        Integer n20 = n19 != 0 ? price2.listPrice : n4;
        int n21 = n10 & 0x20;
        Integer n22 = n21 != 0 ? price2.offerPrice : n7;
        int n24 = n10 & 0x40;
        String string10 = n24 != 0 ? price2.priceType : string5;
        String string11 = (n10 &= 0x80) != 0 ? price2.value : string6;
        n3 = n15;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        n4 = n20;
        n7 = n22;
        string5 = string10;
        string6 = string11;
        return price.copy(n15, string7, string8, string9, n20, n22, string10, string11);
    }

    public final Integer component1() {
        return this.basePrice;
    }

    public final String component2() {
        return this.currencyIso;
    }

    public final String component3() {
        return this.displayformattedValue;
    }

    public final String component4() {
        return this.formattedValue;
    }

    public final Integer component5() {
        return this.listPrice;
    }

    public final Integer component6() {
        return this.offerPrice;
    }

    public final String component7() {
        return this.priceType;
    }

    public final String component8() {
        return this.value;
    }

    public final Price copy(Integer n3, String string2, String string3, String string4, Integer n4, Integer n7, String string5, String string6) {
        Price price = new Price(n3, string2, string3, string4, n4, n7, string5, string6);
        return price;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Price;
        if (!bl3) {
            return false;
        }
        object = (Price)object;
        Object object2 = this.basePrice;
        Object object3 = ((Price)object).basePrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currencyIso;
        object3 = ((Price)object).currencyIso;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.displayformattedValue;
        object3 = ((Price)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.formattedValue;
        object3 = ((Price)object).formattedValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.listPrice;
        object3 = ((Price)object).listPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerPrice;
        object3 = ((Price)object).offerPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceType;
        object3 = ((Price)object).priceType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.value;
        object = ((Price)object).value;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getBasePrice() {
        return this.basePrice;
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

    public final Integer getListPrice() {
        return this.listPrice;
    }

    public final Integer getOfferPrice() {
        return this.offerPrice;
    }

    public final String getPriceType() {
        return this.priceType;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.basePrice;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.currencyIso;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayformattedValue;
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
        object = this.listPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.value;
        if (object != null) {
            n8 = ((String)object).hashCode();
        }
        return n4 + n8;
    }

    public final void setBasePrice(Integer n3) {
        this.basePrice = n3;
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

    public final void setListPrice(Integer n3) {
        this.listPrice = n3;
    }

    public final void setOfferPrice(Integer n3) {
        this.offerPrice = n3;
    }

    public final void setPriceType(String string2) {
        this.priceType = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        Integer n3 = this.basePrice;
        String string2 = this.currencyIso;
        String string3 = this.displayformattedValue;
        String string4 = this.formattedValue;
        Integer n4 = this.listPrice;
        Integer n7 = this.offerPrice;
        String string5 = this.priceType;
        String string6 = this.value;
        StringBuilder stringBuilder = new StringBuilder("Price(basePrice=");
        stringBuilder.append(n3);
        stringBuilder.append(", currencyIso=");
        stringBuilder.append(string2);
        stringBuilder.append(", displayformattedValue=");
        X50.a(stringBuilder, string3, ", formattedValue=", string4, ", listPrice=");
        stringBuilder.append(n4);
        stringBuilder.append(", offerPrice=");
        stringBuilder.append(n7);
        stringBuilder.append(", priceType=");
        return ko_0.a(stringBuilder, string5, ", value=", string6, ")");
    }
}

