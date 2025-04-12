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
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.TaxInformation$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class TaxInformation
implements Serializable,
Parcelable,
Cloneable {
    public static final Parcelable.Creator CREATOR;
    private final Price priceWithTaxes;
    private final Price totalTaxAmount;

    static {
        TaxInformation$Creator taxInformation$Creator = new TaxInformation$Creator();
        CREATOR = taxInformation$Creator;
    }

    public TaxInformation(Price price, Price price2) {
        Intrinsics.checkNotNullParameter(price, "priceWithTaxes");
        Intrinsics.checkNotNullParameter(price2, "totalTaxAmount");
        this.priceWithTaxes = price;
        this.totalTaxAmount = price2;
    }

    public static /* synthetic */ TaxInformation copy$default(TaxInformation taxInformation, Price price, Price price2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            price = taxInformation.priceWithTaxes;
        }
        if ((n3 &= 2) != 0) {
            price2 = taxInformation.totalTaxAmount;
        }
        return taxInformation.copy(price, price2);
    }

    public TaxInformation clone() {
        Object object = super.clone();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.TaxInformation");
        return (TaxInformation)object;
    }

    public final Price component1() {
        return this.priceWithTaxes;
    }

    public final Price component2() {
        return this.totalTaxAmount;
    }

    public final TaxInformation copy(Price price, Price price2) {
        Intrinsics.checkNotNullParameter(price, "priceWithTaxes");
        Intrinsics.checkNotNullParameter(price2, "totalTaxAmount");
        TaxInformation taxInformation = new TaxInformation(price, price2);
        return taxInformation;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TaxInformation;
        if (!bl3) {
            return false;
        }
        object = (TaxInformation)object;
        Price price = this.priceWithTaxes;
        Price price2 = ((TaxInformation)object).priceWithTaxes;
        bl3 = Intrinsics.areEqual(price, price2);
        if (!bl3) {
            return false;
        }
        price = this.totalTaxAmount;
        object = ((TaxInformation)object).totalTaxAmount;
        boolean bl4 = Intrinsics.areEqual(price, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Price getPriceWithTaxes() {
        return this.priceWithTaxes;
    }

    public final Price getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    public int hashCode() {
        int n3 = this.priceWithTaxes.hashCode() * 31;
        return this.totalTaxAmount.hashCode() + n3;
    }

    public String toString() {
        Price price = this.priceWithTaxes;
        Price price2 = this.totalTaxAmount;
        StringBuilder stringBuilder = new StringBuilder("TaxInformation(priceWithTaxes=");
        stringBuilder.append(price);
        stringBuilder.append(", totalTaxAmount=");
        stringBuilder.append(price2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Price price = this.priceWithTaxes;
        parcel.writeParcelable((Parcelable)price, n3);
        price = this.totalTaxAmount;
        parcel.writeParcelable((Parcelable)price, n3);
    }
}

