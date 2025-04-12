/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks$_Parcel;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

class IDynamicLinksCallbacks$Stub$Proxy
implements IDynamicLinksCallbacks {
    private IBinder mRemote;

    public IDynamicLinksCallbacks$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public String getInterfaceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";
    }

    public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        Parcel parcel = Parcel.obtain();
        String string2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";
        parcel.writeInterfaceToken(string2);
        int n3 = 0;
        string2 = null;
        IDynamicLinksCallbacks$_Parcel.access$100(parcel, status, 0);
        IDynamicLinksCallbacks$_Parcel.access$100(parcel, shortDynamicLinkImpl, 0);
        status = this.mRemote;
        shortDynamicLinkImpl = null;
        n3 = 1;
        int n4 = 2;
        try {
            status.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
        Parcel parcel = Parcel.obtain();
        String string2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";
        parcel.writeInterfaceToken(string2);
        int n3 = 0;
        string2 = null;
        IDynamicLinksCallbacks$_Parcel.access$100(parcel, status, 0);
        IDynamicLinksCallbacks$_Parcel.access$100(parcel, dynamicLinkData, 0);
        status = this.mRemote;
        dynamicLinkData = null;
        n3 = 1;
        try {
            status.transact(n3, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

