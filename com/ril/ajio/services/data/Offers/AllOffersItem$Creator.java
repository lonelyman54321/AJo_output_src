/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import kotlin.jvm.internal.Intrinsics;

public final class AllOffersItem$Creator
implements Parcelable.Creator {
    public final AllOffersItem createFromParcel(Parcel parcel) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        long l2 = parcel.readLong();
        long l3 = parcel.readLong();
        long l4 = parcel.readLong();
        String string7 = parcel.readString();
        int n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
            bl2 = true;
        } else {
            n3 = 0;
            bl2 = false;
        }
        AllOffersItem allOffersItem = new AllOffersItem(string2, string3, string4, string5, string6, l2, l3, l4, string7, bl2);
        return allOffersItem;
    }

    public final AllOffersItem[] newArray(int n3) {
        return new AllOffersItem[n3];
    }
}

