/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import kotlin.jvm.internal.Intrinsics;

public final class ImageData$Creator
implements Parcelable.Creator {
    public final ImageData createFromParcel(Parcel parcel) {
        ImageData imageData;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        Object object = ImageData.class.getClassLoader();
        Parcel parcel2 = parcel = parcel.readParcelable((ClassLoader)object);
        parcel2 = (Uri)parcel;
        object = imageData;
        imageData = new ImageData(string2, string3, string4, string5, (Uri)parcel2);
        return imageData;
    }

    public final ImageData[] newArray(int n3) {
        return new ImageData[n3];
    }
}

