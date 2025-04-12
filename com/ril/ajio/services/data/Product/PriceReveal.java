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
import com.ril.ajio.services.data.Product.PriceReveal$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceReveal
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private Float bestPrice;
    private String discountPercent;

    static {
        PriceReveal$Creator priceReveal$Creator = new PriceReveal$Creator();
        CREATOR = priceReveal$Creator;
    }

    public PriceReveal() {
        this(null, null, 3, null);
    }

    public PriceReveal(Float f5, String string2) {
        this.bestPrice = f5;
        this.discountPercent = string2;
    }

    public /* synthetic */ PriceReveal(Float f5, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = null;
        }
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        this(f5, string2);
    }

    public static /* synthetic */ PriceReveal copy$default(PriceReveal priceReveal, Float f5, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = priceReveal.bestPrice;
        }
        if ((n3 &= 2) != 0) {
            string2 = priceReveal.discountPercent;
        }
        return priceReveal.copy(f5, string2);
    }

    public PriceReveal clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.PriceReveal");
        return (PriceReveal)object;
    }

    public final Float component1() {
        return this.bestPrice;
    }

    public final String component2() {
        return this.discountPercent;
    }

    public final PriceReveal copy(Float f5, String string2) {
        PriceReveal priceReveal = new PriceReveal(f5, string2);
        return priceReveal;
    }

    public final int describeContents() {
        return 0;
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
        Object object2 = this.bestPrice;
        Float f5 = ((PriceReveal)object).bestPrice;
        bl3 = Intrinsics.areEqual(object2, (Object)f5);
        if (!bl3) {
            return false;
        }
        object2 = this.discountPercent;
        object = ((PriceReveal)object).discountPercent;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getBestPrice() {
        return this.bestPrice;
    }

    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.bestPrice;
        int n4 = 0;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        n3 *= 31;
        String string2 = this.discountPercent;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final void setBestPrice(Float f5) {
        this.bestPrice = f5;
    }

    public final void setDiscountPercent(String string2) {
        this.discountPercent = string2;
    }

    public String toString() {
        Float f5 = this.bestPrice;
        String string2 = this.discountPercent;
        StringBuilder stringBuilder = new StringBuilder("PriceReveal(bestPrice=");
        stringBuilder.append(f5);
        stringBuilder.append(", discountPercent=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.bestPrice;
        if (object == null) {
            float f5 = 0.0f;
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            float f6 = ((Float)object).floatValue();
            parcel.writeFloat(f6);
        }
        object = this.discountPercent;
        parcel.writeString((String)object);
    }
}

