/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.IEngagementSignalsCallback;
import android.support.customtabs.IEngagementSignalsCallback$_Parcel;

class IEngagementSignalsCallback$Stub$Proxy
implements IEngagementSignalsCallback {
    private IBinder mRemote;

    public IEngagementSignalsCallback$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public String getInterfaceDescriptor() {
        return IEngagementSignalsCallback.DESCRIPTOR;
    }

    public void onGreatestScrollPercentageIncreased(int n3, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = IEngagementSignalsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        parcel.writeInt(n3);
        n3 = 0;
        IBinder iBinder = null;
        IEngagementSignalsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        iBinder = this.mRemote;
        bundle = null;
        int n4 = 1;
        int n7 = 3;
        try {
            iBinder.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onSessionEnded(boolean bl2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = IEngagementSignalsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        string2 = null;
        int n3 = 1;
        parcel.writeInt((int)(bl2 ? 1 : 0));
        IEngagementSignalsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        IBinder iBinder = this.mRemote;
        int n4 = 4;
        string2 = null;
        try {
            iBinder.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void onVerticalScrollEvent(boolean bl2, Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        String string2 = IEngagementSignalsCallback.DESCRIPTOR;
        parcel.writeInterfaceToken(string2);
        string2 = null;
        int n3 = 1;
        parcel.writeInt((int)(bl2 ? 1 : 0));
        IEngagementSignalsCallback$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
        IBinder iBinder = this.mRemote;
        int n4 = 2;
        string2 = null;
        try {
            iBinder.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

