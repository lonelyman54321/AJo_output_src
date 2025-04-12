/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ChatStatus$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class ChatStatus
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String messageDescription;
    private final int statusCode;

    static {
        ChatStatus$Creator chatStatus$Creator = new ChatStatus$Creator();
        CREATOR = chatStatus$Creator;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}

