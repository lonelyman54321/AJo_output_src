/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import kotlin.jvm.internal.Intrinsics;

public final class PriceRevealMetaInfo$Creator
implements Parcelable.Creator {
    public final PriceRevealMetaInfo createFromParcel(Parcel parcel) {
        Long l2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int n3 = parcel.readInt();
        Long l3 = null;
        if (n3 == 0) {
            n3 = 0;
            l2 = null;
        } else {
            long l4 = parcel.readLong();
            l2 = l4;
        }
        int n4 = parcel.readInt();
        if (n4 != 0) {
            long l7 = parcel.readLong();
            l3 = l7;
        }
        PriceRevealMetaInfo priceRevealMetaInfo = new PriceRevealMetaInfo(l2, l3);
        return priceRevealMetaInfo;
    }

    public final PriceRevealMetaInfo[] newArray(int n3) {
        return new PriceRevealMetaInfo[n3];
    }
}

