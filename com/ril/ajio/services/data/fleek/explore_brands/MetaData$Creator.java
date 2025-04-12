/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.fleek.explore_brands.MetaData;
import kotlin.jvm.internal.Intrinsics;

public final class MetaData$Creator
implements Parcelable.Creator {
    public final MetaData createFromParcel(Parcel parcel) {
        MetaData metaData;
        Double d2;
        Double d5;
        Object object;
        Double d7;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        String string14 = parcel.readString();
        int n3 = parcel.readInt();
        Double d9 = null;
        if (n3 == 0) {
            d7 = null;
        } else {
            double d12 = parcel.readDouble();
            object = d12;
            d7 = object;
        }
        n3 = parcel.readInt();
        if (n3 == 0) {
            d5 = null;
        } else {
            double d13 = parcel.readDouble();
            object = d13;
            d5 = object;
        }
        n3 = parcel.readInt();
        if (n3 == 0) {
            d2 = null;
        } else {
            double d14 = parcel.readDouble();
            object = d14;
            d2 = object;
        }
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        String string18 = parcel.readString();
        String string19 = parcel.readString();
        String string20 = parcel.readString();
        String string21 = parcel.readString();
        String string22 = parcel.readString();
        String string23 = parcel.readString();
        String string24 = parcel.readString();
        String string25 = parcel.readString();
        String string26 = parcel.readString();
        object = metaData;
        d9 = d7;
        d7 = d5;
        d5 = d2;
        metaData = new MetaData(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, d9, d7, d2, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26);
        return metaData;
    }

    public final MetaData[] newArray(int n3) {
        return new MetaData[n3];
    }
}

