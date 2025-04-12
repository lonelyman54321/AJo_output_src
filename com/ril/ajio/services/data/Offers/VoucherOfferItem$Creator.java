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
import com.ril.ajio.services.data.Offers.VoucherOfferItem;
import kotlin.jvm.internal.Intrinsics;

public final class VoucherOfferItem$Creator
implements Parcelable.Creator {
    public final VoucherOfferItem createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        VoucherOfferItem voucherOfferItem = new VoucherOfferItem(string2, string3, string4, string5, string6, string7, string8);
        return voucherOfferItem;
    }

    public final VoucherOfferItem[] newArray(int n3) {
        return new VoucherOfferItem[n3];
    }
}

