/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;
import android.support.v4.os.IResultReceiver$_Parcel;

class IResultReceiver$Stub$Proxy
implements IResultReceiver {
    private IBinder mRemote;

    public IResultReceiver$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public String getInterfaceDescriptor() {
        return IResultReceiver.DESCRIPTOR;
    }

    public void send(int n3, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = IResultReceiver.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        n3 = 0;
        IBinder iBinder = null;
        IResultReceiver$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        iBinder = this.mRemote;
        bundle = null;
        int n4 = 1;
        try {
            iBinder.transact(n4, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

