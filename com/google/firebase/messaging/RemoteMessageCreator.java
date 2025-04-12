/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.messaging.RemoteMessage;

public class RemoteMessageCreator
implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        remoteMessage = remoteMessage.bundle;
        SafeParcelWriter.writeBundle(parcel, 2, (Bundle)remoteMessage, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public RemoteMessage createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Bundle bundle = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 2)) {
                SafeParcelReader.skipUnknownField(object, n3);
                continue;
            }
            bundle = SafeParcelReader.createBundle(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new RemoteMessage(bundle);
        return object;
    }

    public RemoteMessage[] newArray(int n3) {
        return new RemoteMessage[n3];
    }
}

