/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import kotlin.jvm.internal.Intrinsics;

public final class RtoResponseData$Creator
implements Parcelable.Creator {
    public final RtoResponseData createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            Parcelable.Creator creator = RtoData.CREATOR;
            object = creator.createFromParcel(object);
        }
        object = (RtoData)object;
        RtoResponseData rtoResponseData = new RtoResponseData((RtoData)object);
        return rtoResponseData;
    }

    public final RtoResponseData[] newArray(int n3) {
        return new RtoResponseData[n3];
    }
}

