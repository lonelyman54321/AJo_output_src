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
import com.ril.ajio.services.data.Product.Stock$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Stock
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String stockErrorDescription;
    private Integer stockLevel;

    static {
        Stock$Creator stock$Creator = new Stock$Creator();
        CREATOR = stock$Creator;
    }

    public Stock() {
        this(null, null, 3, null);
    }

    public Stock(Integer n3, String string2) {
        this.stockLevel = n3;
        this.stockErrorDescription = string2;
    }

    public /* synthetic */ Stock(Integer n3, String string2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = 0;
        }
        if ((n4 &= 2) != 0) {
            string2 = null;
        }
        this(n3, string2);
    }

    public static /* synthetic */ Stock copy$default(Stock stock, Integer n3, String string2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = stock.stockLevel;
        }
        if ((n4 &= 2) != 0) {
            string2 = stock.stockErrorDescription;
        }
        return stock.copy(n3, string2);
    }

    public final Integer component1() {
        return this.stockLevel;
    }

    public final String component2() {
        return this.stockErrorDescription;
    }

    public final Stock copy(Integer n3, String string2) {
        Stock stock = new Stock(n3, string2);
        return stock;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Stock;
        if (!bl3) {
            return false;
        }
        object = (Stock)object;
        Object object2 = this.stockLevel;
        Integer n3 = ((Stock)object).stockLevel;
        bl3 = Intrinsics.areEqual(object2, n3);
        if (!bl3) {
            return false;
        }
        object2 = this.stockErrorDescription;
        object = ((Stock)object).stockErrorDescription;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getStockErrorDescription() {
        return this.stockErrorDescription;
    }

    public final Integer getStockLevel() {
        return this.stockLevel;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.stockLevel;
        int n7 = 0;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = ((Object)n4).hashCode();
        }
        n3 *= 31;
        String string2 = this.stockErrorDescription;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n3 + n7;
    }

    public final void setStockErrorDescription(String string2) {
        this.stockErrorDescription = string2;
    }

    public final void setStockLevel(Integer n3) {
        this.stockLevel = n3;
    }

    public String toString() {
        Integer n3 = this.stockLevel;
        String string2 = this.stockErrorDescription;
        StringBuilder stringBuilder = new StringBuilder("Stock(stockLevel=");
        stringBuilder.append(n3);
        stringBuilder.append(", stockErrorDescription=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.stockLevel;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            n3 = (Integer)object;
        }
        parcel.writeInt(n3);
        object = this.stockErrorDescription;
        parcel.writeString((String)object);
    }
}

