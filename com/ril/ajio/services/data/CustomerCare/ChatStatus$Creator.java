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
import com.ril.ajio.services.data.CustomerCare.ChatStatus;
import kotlin.jvm.internal.Intrinsics;

public final class ChatStatus$Creator
implements Parcelable.Creator {
    public final ChatStatus createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object.readInt();
        object = new ChatStatus();
        return object;
    }

    public final ChatStatus[] newArray(int n3) {
        return new ChatStatus[n3];
    }
}

