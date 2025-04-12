/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import android.support.customtabs.IPostMessageService$_Parcel;

class IPostMessageService$Stub$Proxy
implements IPostMessageService {
    private IBinder mRemote;

    public IPostMessageService$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public String getInterfaceDescriptor() {
        return IPostMessageService.DESCRIPTOR;
    }

    public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = IPostMessageService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            parcel.writeStrongInterface((IInterface)iCustomTabsCallback);
            iCustomTabsCallback = null;
            IPostMessageService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
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

    public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String string2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string3 = IPostMessageService.DESCRIPTOR;
            parcel.writeInterfaceToken(string3);
            parcel.writeStrongInterface((IInterface)iCustomTabsCallback);
            parcel.writeString(string2);
            iCustomTabsCallback = null;
            IPostMessageService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            string2 = this.mRemote;
            int n3 = 3;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }
}

