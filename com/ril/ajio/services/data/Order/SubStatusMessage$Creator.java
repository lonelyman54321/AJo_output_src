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
import com.ril.ajio.services.data.Order.SubStatusMessage;
import kotlin.jvm.internal.Intrinsics;

public final class SubStatusMessage$Creator
implements Parcelable.Creator {
    public final SubStatusMessage createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        SubStatusMessage subStatusMessage = new SubStatusMessage((String)object);
        return subStatusMessage;
    }

    public final SubStatusMessage[] newArray(int n3) {
        return new SubStatusMessage[n3];
    }
}

