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
import com.ril.ajio.services.data.Product.StockInfo$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class StockInfo
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String stockErrorDescription;
    private Integer stockLevel;
    private final String stockStatus;

    static {
        StockInfo$Creator stockInfo$Creator = new StockInfo$Creator();
        CREATOR = stockInfo$Creator;
    }

    public StockInfo(Integer n3, String string2, String string3) {
        this.stockLevel = n3;
        this.stockStatus = string2;
        this.stockErrorDescription = string3;
    }

    public static /* synthetic */ StockInfo copy$default(StockInfo stockInfo, Integer n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = stockInfo.stockLevel;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = stockInfo.stockStatus;
        }
        if ((n4 &= 4) != 0) {
            string3 = stockInfo.stockErrorDescription;
        }
        return stockInfo.copy(n3, string2, string3);
    }

    public final Integer component1() {
        return this.stockLevel;
    }

    public final String component2() {
        return this.stockStatus;
    }

    public final String component3() {
        return this.stockErrorDescription;
    }

    public final StockInfo copy(Integer n3, String string2, String string3) {
        StockInfo stockInfo = new StockInfo(n3, string2, string3);
        return stockInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof StockInfo;
        if (!bl3) {
            return false;
        }
        object = (StockInfo)object;
        Object object2 = this.stockLevel;
        Object object3 = ((StockInfo)object).stockLevel;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.stockStatus;
        object3 = ((StockInfo)object).stockStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.stockErrorDescription;
        object = ((StockInfo)object).stockErrorDescription;
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

    public final String getStockStatus() {
        return this.stockStatus;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.stockLevel;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        String string2 = this.stockStatus;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.stockErrorDescription;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 + n8;
    }

    public final void setStockLevel(Integer n3) {
        this.stockLevel = n3;
    }

    public String toString() {
        Integer n3 = this.stockLevel;
        String string2 = this.stockStatus;
        String string3 = this.stockErrorDescription;
        StringBuilder stringBuilder = new StringBuilder("StockInfo(stockLevel=");
        stringBuilder.append(n3);
        stringBuilder.append(", stockStatus=");
        stringBuilder.append(string2);
        stringBuilder.append(", stockErrorDescription=");
        return h30_0.a(stringBuilder, string3, ")");
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
        object = this.stockStatus;
        parcel.writeString((String)object);
        object = this.stockErrorDescription;
        parcel.writeString((String)object);
    }
}

