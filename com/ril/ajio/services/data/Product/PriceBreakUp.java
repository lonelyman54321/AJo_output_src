/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.PriceBreakUp$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceBreakUp
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String description;
    private String discountedPrice;
    private String label;
    private String price;

    static {
        PriceBreakUp$Creator priceBreakUp$Creator = new PriceBreakUp$Creator();
        CREATOR = priceBreakUp$Creator;
    }

    public PriceBreakUp() {
        this(null, null, null, null, 15, null);
    }

    public PriceBreakUp(String string2, String string3, String string4, String string5) {
        this.label = string2;
        this.price = string3;
        this.discountedPrice = string4;
        this.description = string5;
    }

    public /* synthetic */ PriceBreakUp(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ PriceBreakUp copy$default(PriceBreakUp priceBreakUp, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = priceBreakUp.label;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = priceBreakUp.price;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = priceBreakUp.discountedPrice;
        }
        if ((n3 &= 8) != 0) {
            string5 = priceBreakUp.description;
        }
        return priceBreakUp.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.price;
    }

    public final String component3() {
        return this.discountedPrice;
    }

    public final String component4() {
        return this.description;
    }

    public final PriceBreakUp copy(String string2, String string3, String string4, String string5) {
        PriceBreakUp priceBreakUp = new PriceBreakUp(string2, string3, string4, string5);
        return priceBreakUp;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceBreakUp;
        if (!bl3) {
            return false;
        }
        object = (PriceBreakUp)object;
        String string2 = this.label;
        String string3 = ((PriceBreakUp)object).label;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.price;
        string3 = ((PriceBreakUp)object).price;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.discountedPrice;
        string3 = ((PriceBreakUp)object).discountedPrice;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.description;
        object = ((PriceBreakUp)object).description;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.label;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.price;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.discountedPrice;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.description;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setDiscountedPrice(String string2) {
        this.discountedPrice = string2;
    }

    public final void setLabel(String string2) {
        this.label = string2;
    }

    public final void setPrice(String string2) {
        this.price = string2;
    }

    public String toString() {
        String string2 = this.label;
        String string3 = this.price;
        String string4 = this.discountedPrice;
        String string5 = this.description;
        return ko_0.a(og_1.a("PriceBreakUp(label=", string2, ", price=", string3, ", discountedPrice="), string4, ", description=", string5, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.label;
        parcel.writeString(string2);
        string2 = this.price;
        parcel.writeString(string2);
        string2 = this.discountedPrice;
        parcel.writeString(string2);
        string2 = this.description;
        parcel.writeString(string2);
    }
}

