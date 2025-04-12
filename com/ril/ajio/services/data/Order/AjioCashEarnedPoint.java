/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AjioCashEarnedPoint
implements Serializable {
    private String currencyIso;
    private String displayformattedValue;
    private Float value;

    public AjioCashEarnedPoint() {
        this(null, null, null, 7, null);
    }

    public AjioCashEarnedPoint(String string2, String string3, Float f5) {
        this.currencyIso = string2;
        this.displayformattedValue = string3;
        this.value = f5;
    }

    public /* synthetic */ AjioCashEarnedPoint(String string2, String string3, Float f5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = string4;
        }
        if ((n3 &= 4) != 0) {
            f5 = Float.valueOf(0.0f);
        }
        this(string2, string3, f5);
    }

    public static /* synthetic */ AjioCashEarnedPoint copy$default(AjioCashEarnedPoint ajioCashEarnedPoint, String string2, String string3, Float f5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = ajioCashEarnedPoint.currencyIso;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = ajioCashEarnedPoint.displayformattedValue;
        }
        if ((n3 &= 4) != 0) {
            f5 = ajioCashEarnedPoint.value;
        }
        return ajioCashEarnedPoint.copy(string2, string3, f5);
    }

    public final String component1() {
        return this.currencyIso;
    }

    public final String component2() {
        return this.displayformattedValue;
    }

    public final Float component3() {
        return this.value;
    }

    public final AjioCashEarnedPoint copy(String string2, String string3, Float f5) {
        AjioCashEarnedPoint ajioCashEarnedPoint = new AjioCashEarnedPoint(string2, string3, f5);
        return ajioCashEarnedPoint;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AjioCashEarnedPoint;
        if (!bl3) {
            return false;
        }
        object = (AjioCashEarnedPoint)object;
        Object object2 = this.currencyIso;
        String string2 = ((AjioCashEarnedPoint)object).currencyIso;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.displayformattedValue;
        string2 = ((AjioCashEarnedPoint)object).displayformattedValue;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.value;
        object = ((AjioCashEarnedPoint)object).value;
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

    public final Float getValue() {
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
        object = this.value;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setCurrencyIso(String string2) {
        this.currencyIso = string2;
    }

    public final void setDisplayformattedValue(String string2) {
        this.displayformattedValue = string2;
    }

    public final void setValue(Float f5) {
        this.value = f5;
    }

    public String toString() {
        CharSequence charSequence = this.currencyIso;
        String string2 = this.displayformattedValue;
        Float f5 = this.value;
        charSequence = og_1.a("AjioCashEarnedPoint(currencyIso=", (String)charSequence, ", displayformattedValue=", string2, ", value=");
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

