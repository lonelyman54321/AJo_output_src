/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks$Stub$Proxy;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks$_Parcel;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

public abstract class IDynamicLinksCallbacks$Stub
extends Binder
implements IDynamicLinksCallbacks {
    static final int TRANSACTION_onCreateShortDynamicLink = 2;
    static final int TRANSACTION_onGetDynamicLink = 1;

    public IDynamicLinksCallbacks$Stub() {
        this.attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public static IDynamicLinksCallbacks asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        if (iInterface != null && (bl2 = iInterface instanceof IDynamicLinksCallbacks)) {
            return (IDynamicLinksCallbacks)iInterface;
        }
        iInterface = new IDynamicLinksCallbacks$Stub$Proxy(iBinder);
        return iInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel object, Parcel parcel, int n4) {
        int n7;
        String string2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";
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
                Object object2 = Status.CREATOR;
                object2 = (Status)IDynamicLinksCallbacks$_Parcel.access$000(object, object2);
                parcel = ShortDynamicLinkImpl.CREATOR;
                object = (ShortDynamicLinkImpl)IDynamicLinksCallbacks$_Parcel.access$000(object, (Parcelable.Creator)parcel);
                this.onCreateShortDynamicLink((Status)object2, (ShortDynamicLinkImpl)object);
            } else {
                Object object3 = Status.CREATOR;
                object3 = (Status)IDynamicLinksCallbacks$_Parcel.access$000(object, object3);
                parcel = DynamicLinkData.CREATOR;
                object = (DynamicLinkData)IDynamicLinksCallbacks$_Parcel.access$000(object, (Parcelable.Creator)parcel);
                this.onGetDynamicLink((Status)object3, (DynamicLinkData)object);
            }
            return n8;
        }
        parcel.writeString(string2);
        return n8;
    }
}

