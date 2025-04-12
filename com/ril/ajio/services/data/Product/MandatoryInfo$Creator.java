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
import com.ril.ajio.services.data.Product.MandatoryInfo;
import kotlin.jvm.internal.Intrinsics;

public final class MandatoryInfo$Creator
implements Parcelable.Creator {
    public final MandatoryInfo createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        MandatoryInfo mandatoryInfo = new MandatoryInfo(string2, string3, (String)object);
        return mandatoryInfo;
    }

    public final MandatoryInfo[] newArray(int n3) {
        return new MandatoryInfo[n3];
    }
}

