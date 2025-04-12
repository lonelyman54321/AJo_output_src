/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ImageDetails;
import kotlin.jvm.internal.Intrinsics;

public final class ImageDetails$Creator
implements Parcelable.Creator {
    public final ImageDetails createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        ImageDetails imageDetails = new ImageDetails(string2, (String)object);
        return imageDetails;
    }

    public final ImageDetails[] newArray(int n3) {
        return new ImageDetails[n3];
    }
}

