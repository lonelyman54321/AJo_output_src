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
package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService$_Parcel;

class IDynamicLinksService$Stub$Proxy
implements IDynamicLinksService {
    private IBinder mRemote;

    public IDynamicLinksService$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
        try {
            parcel.writeInterfaceToken(string2);
            parcel.writeStrongInterface((IInterface)iDynamicLinksCallbacks);
            iDynamicLinksCallbacks = null;
            IDynamicLinksService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
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

    public void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String string2) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        String string3 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
        parcel.writeInterfaceToken(string3);
        parcel.writeStrongInterface((IInterface)iDynamicLinksCallbacks);
        parcel.writeString(string2);
        iDynamicLinksCallbacks = this.mRemote;
        int n3 = 1;
        string3 = null;
        try {
            iDynamicLinksCallbacks.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }
}

