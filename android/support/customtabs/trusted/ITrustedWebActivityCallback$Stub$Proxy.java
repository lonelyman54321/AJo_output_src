/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityCallback$_Parcel;

class ITrustedWebActivityCallback$Stub$Proxy
implements ITrustedWebActivityCallback {
    private IBinder mRemote;

    public ITrustedWebActivityCallback$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public String getInterfaceDescriptor() {
        return ITrustedWebActivityCallback.DESCRIPTOR;
    }

    public void onExtraCallback(String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string3 = ITrustedWebActivityCallback.DESCRIPTOR;
            parcel.writeInterfaceToken(string3);
            parcel.writeString(string2);
            string2 = null;
            ITrustedWebActivityCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 2;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }
}

