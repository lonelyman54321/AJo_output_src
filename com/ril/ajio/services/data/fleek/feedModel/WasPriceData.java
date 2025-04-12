/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class WasPriceData {
    private String currencyIso;
    private String displayformattedValue;
    private String formattedValue;
    private String priceType;
    private String value;

    public WasPriceData() {
        this(null, null, null, null, null, 31, null);
    }

    public WasPriceData(String string2, String string3, String string4, String string5, String string6) {
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.formattedValue = string4;
        this.priceType = string5;
        this.value = string6;
    }

    public /* synthetic */ WasPriceData(String object, String object2, String string2, String string3, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        string4 = string7;
        this((String)object3, (String)object4, string6, string7, string5);
    }

    public static /* synthetic */ WasPriceData copy$default(WasPriceData wasPriceData, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = wasPriceData.currencyIso;
        }
        if ((n4 = n3 & 2) != 0) {
            object = wasPriceData.displayformattedValue;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = wasPriceData.formattedValue;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = wasPriceData.priceType;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = wasPriceData.value;
        }
        String string7 = string4;
        object = wasPriceData;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return wasPriceData.copy(string2, (String)object2, string5, string6, string7);
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

    public final String component5() {
        return this.value;
    }

    public final WasPriceData copy(String string2, String string3, String string4, String string5, String string6) {
        WasPriceData wasPriceData = new WasPriceData(string2, string3, string4, string5, string6);
        return wasPriceData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WasPriceData;
        if (!bl3) {
            return false;
        }
        object = (WasPriceData)object;
        String string2 = this.currencyIso;
        String string3 = ((WasPriceData)object).currencyIso;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.displayformattedValue;
        string3 = ((WasPriceData)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.formattedValue;
        string3 = ((WasPriceData)object).formattedValue;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.priceType;
        string3 = ((WasPriceData)object).priceType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((WasPriceData)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
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

    public final String getPriceType() {
        return this.priceType;
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
        String string3 = this.displayformattedValue;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.formattedValue;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.priceType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.value;
        if (string3 != null) {
            n7 = string3.hashCode();
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

    public final void setPriceType(String string2) {
        this.priceType = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        CharSequence charSequence = this.currencyIso;
        String string2 = this.displayformattedValue;
        String string3 = this.formattedValue;
        String string4 = this.priceType;
        String string5 = this.value;
        charSequence = og_1.a("WasPriceData(currencyIso=", charSequence, ", displayformattedValue=", string2, ", formattedValue=");
        X50.a((StringBuilder)charSequence, string3, ", priceType=", string4, ", value=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

