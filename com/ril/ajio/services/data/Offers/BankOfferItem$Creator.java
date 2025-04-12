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
import com.ril.ajio.services.data.Offers.BankOfferItem;
import kotlin.jvm.internal.Intrinsics;

public final class BankOfferItem$Creator
implements Parcelable.Creator {
    public final BankOfferItem createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        long l2 = parcel.readLong();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        BankOfferItem bankOfferItem = new BankOfferItem(string2, string3, string4, l2, string5, string6);
        return bankOfferItem;
    }

    public final BankOfferItem[] newArray(int n3) {
        return new BankOfferItem[n3];
    }
}

