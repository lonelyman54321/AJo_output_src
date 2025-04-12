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
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceRevealMetaInfo
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Long saleEndTime;
    private Long saleStartTime;

    static {
        PriceRevealMetaInfo$Creator priceRevealMetaInfo$Creator = new PriceRevealMetaInfo$Creator();
        CREATOR = priceRevealMetaInfo$Creator;
    }

    public PriceRevealMetaInfo() {
        this(null, null, 3, null);
    }

    public PriceRevealMetaInfo(Long l2, Long l3) {
        this.saleStartTime = l2;
        this.saleEndTime = l3;
    }

    public /* synthetic */ PriceRevealMetaInfo(Long l2, Long l3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = null;
        }
        if ((n3 &= 2) != 0) {
            l3 = null;
        }
        this(l2, l3);
    }

    public static /* synthetic */ PriceRevealMetaInfo copy$default(PriceRevealMetaInfo priceRevealMetaInfo, Long l2, Long l3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = priceRevealMetaInfo.saleStartTime;
        }
        if ((n3 &= 2) != 0) {
            l3 = priceRevealMetaInfo.saleEndTime;
        }
        return priceRevealMetaInfo.copy(l2, l3);
    }

    public final Long component1() {
        return this.saleStartTime;
    }

    public final Long component2() {
        return this.saleEndTime;
    }

    public final PriceRevealMetaInfo copy(Long l2, Long l3) {
        PriceRevealMetaInfo priceRevealMetaInfo = new PriceRevealMetaInfo(l2, l3);
        return priceRevealMetaInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceRevealMetaInfo;
        if (!bl3) {
            return false;
        }
        object = (PriceRevealMetaInfo)object;
        Long l2 = this.saleStartTime;
        Long l3 = ((PriceRevealMetaInfo)object).saleStartTime;
        bl3 = Intrinsics.areEqual(l2, l3);
        if (!bl3) {
            return false;
        }
        l2 = this.saleEndTime;
        object = ((PriceRevealMetaInfo)object).saleEndTime;
        boolean bl4 = Intrinsics.areEqual(l2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getSaleEndTime() {
        return this.saleEndTime;
    }

    public final Long getSaleStartTime() {
        return this.saleStartTime;
    }

    public int hashCode() {
        int n3;
        Long l2 = this.saleStartTime;
        int n4 = 0;
        if (l2 == null) {
            n3 = 0;
            l2 = null;
        } else {
            n3 = ((Object)l2).hashCode();
        }
        n3 *= 31;
        Long l3 = this.saleEndTime;
        if (l3 != null) {
            n4 = ((Object)l3).hashCode();
        }
        return n3 + n4;
    }

    public final void setSaleEndTime(Long l2) {
        this.saleEndTime = l2;
    }

    public final void setSaleStartTime(Long l2) {
        this.saleStartTime = l2;
    }

    public String toString() {
        Long l2 = this.saleStartTime;
        Long l3 = this.saleEndTime;
        StringBuilder stringBuilder = new StringBuilder("PriceRevealMetaInfo(saleStartTime=");
        stringBuilder.append(l2);
        stringBuilder.append(", saleEndTime=");
        stringBuilder.append(l3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Long l2 = this.saleStartTime;
        int n4 = 1;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l3 = l2;
            parcel.writeLong(l3);
        }
        l2 = this.saleEndTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l4 = l2;
            parcel.writeLong(l4);
        }
    }
}

