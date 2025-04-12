/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Parcel
 */
package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.cloudmessaging.IMessengerCompat;

public class IMessengerCompat$Proxy
implements IMessengerCompat {
    private final IBinder zza;

    public IMessengerCompat$Proxy(IBinder iBinder) {
        this.zza = iBinder;
    }

    public IBinder asBinder() {
        return this.zza;
    }

    public void send(Message message) {
        Parcel parcel = Parcel.obtain();
        String string2 = "com.google.android.gms.iid.IMessengerCompat";
        parcel.writeInterfaceToken(string2);
        int n3 = 1;
        parcel.writeInt(n3);
        message.writeToParcel(parcel, 0);
        try {
            message = this.zza;
            message.transact(n3, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

