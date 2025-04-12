/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RtoResponseData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private RtoData rtoData;

    static {
        RtoResponseData$Creator rtoResponseData$Creator = new RtoResponseData$Creator();
        CREATOR = rtoResponseData$Creator;
    }

    public RtoResponseData() {
        this(null, 1, null);
    }

    public RtoResponseData(RtoData rtoData) {
        this.rtoData = rtoData;
    }

    public /* synthetic */ RtoResponseData(RtoData rtoData, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            rtoData = null;
        }
        this(rtoData);
    }

    public static /* synthetic */ RtoResponseData copy$default(RtoResponseData rtoResponseData, RtoData rtoData, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            rtoData = rtoResponseData.rtoData;
        }
        return rtoResponseData.copy(rtoData);
    }

    public final RtoData component1() {
        return this.rtoData;
    }

    public final RtoResponseData copy(RtoData rtoData) {
        RtoResponseData rtoResponseData = new RtoResponseData(rtoData);
        return rtoResponseData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RtoResponseData;
        if (!bl3) {
            return false;
        }
        object = (RtoResponseData)object;
        RtoData rtoData = this.rtoData;
        object = ((RtoResponseData)object).rtoData;
        boolean bl4 = Intrinsics.areEqual(rtoData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final RtoData getRtoData() {
        return this.rtoData;
    }

    public int hashCode() {
        int n3;
        RtoData rtoData = this.rtoData;
        if (rtoData == null) {
            n3 = 0;
            rtoData = null;
        } else {
            n3 = rtoData.hashCode();
        }
        return n3;
    }

    public final void setRtoData(RtoData rtoData) {
        this.rtoData = rtoData;
    }

    public String toString() {
        RtoData rtoData = this.rtoData;
        StringBuilder stringBuilder = new StringBuilder("RtoResponseData(rtoData=");
        stringBuilder.append(rtoData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        RtoData rtoData = this.rtoData;
        if (rtoData == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            rtoData.writeToParcel(parcel, n3);
        }
    }
}

