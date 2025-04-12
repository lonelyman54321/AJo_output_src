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
import com.ril.ajio.services.data.CustomerCare.InitiateChat;
import kotlin.jvm.internal.Intrinsics;

public final class InitiateChat$Creator
implements Parcelable.Creator {
    public final InitiateChat createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object.readInt();
        object = new InitiateChat();
        return object;
    }

    public final InitiateChat[] newArray(int n3) {
        return new InitiateChat[n3];
    }
}

