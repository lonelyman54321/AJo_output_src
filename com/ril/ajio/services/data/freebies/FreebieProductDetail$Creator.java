/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.freebies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.freebies.FreebieProductDetail;
import kotlin.jvm.internal.Intrinsics;

public final class FreebieProductDetail$Creator
implements Parcelable.Creator {
    public final FreebieProductDetail createFromParcel(Parcel parcel) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        double d2 = parcel.readDouble();
        long l2 = parcel.readLong();
        int n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
            bl2 = true;
        } else {
            n3 = 0;
            bl2 = false;
        }
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        FreebieProductDetail freebieProductDetail = new FreebieProductDetail(string2, d2, l2, bl2, string3, string4, string5, string6, string7);
        return freebieProductDetail;
    }

    public final FreebieProductDetail[] newArray(int n3) {
        return new FreebieProductDetail[n3];
    }
}

