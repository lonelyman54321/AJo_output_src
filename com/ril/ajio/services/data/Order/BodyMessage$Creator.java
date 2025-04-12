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
import com.ril.ajio.services.data.Order.BodyMessage;
import kotlin.jvm.internal.Intrinsics;

public final class BodyMessage$Creator
implements Parcelable.Creator {
    public final BodyMessage createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        BodyMessage bodyMessage = new BodyMessage((String)object);
        return bodyMessage;
    }

    public final BodyMessage[] newArray(int n3) {
        return new BodyMessage[n3];
    }
}

