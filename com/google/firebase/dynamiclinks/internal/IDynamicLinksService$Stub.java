/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks$Stub;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService$Stub$Proxy;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService$_Parcel;

public abstract class IDynamicLinksService$Stub
extends Binder
implements IDynamicLinksService {
    static final int TRANSACTION_createShortDynamicLink = 2;
    static final int TRANSACTION_getDynamicLink = 1;

    public IDynamicLinksService$Stub() {
        this.attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    }

    public static IDynamicLinksService asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (iInterface != null && (bl2 = iInterface instanceof IDynamicLinksService)) {
            return (IDynamicLinksService)iInterface;
        }
        iInterface = new IDynamicLinksService$Stub$Proxy(iBinder);
        return iInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel object, Parcel parcel, int n4) {
        int n7;
        String string2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            object.enforceInterface(string2);
        }
        if (n3 != (n7 = 1598968902)) {
            if (n3 != n8) {
                int n10 = 2;
                if (n3 != n10) {
                    return super.onTransact(n3, object, parcel, n4);
                }
                IDynamicLinksCallbacks iDynamicLinksCallbacks = IDynamicLinksCallbacks$Stub.asInterface(object.readStrongBinder());
                Parcelable.Creator creator = Bundle.CREATOR;
                object = (Bundle)IDynamicLinksService$_Parcel.access$000(object, creator);
                this.createShortDynamicLink(iDynamicLinksCallbacks, (Bundle)object);
                parcel.writeNoException();
            } else {
                IDynamicLinksCallbacks iDynamicLinksCallbacks = IDynamicLinksCallbacks$Stub.asInterface(object.readStrongBinder());
                object = object.readString();
                this.getDynamicLink(iDynamicLinksCallbacks, (String)object);
                parcel.writeNoException();
            }
            return n8;
        }
        parcel.writeString(string2);
        return n8;
    }
}

