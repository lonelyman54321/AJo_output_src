/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel$_Parcel;

class INotificationSideChannel$Stub$Proxy
implements INotificationSideChannel {
    private IBinder mRemote;

    public INotificationSideChannel$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void cancel(String string2, int n3, String string3) {
        Parcel parcel = Parcel.obtain();
        String string4 = INotificationSideChannel.DESCRIPTOR;
        parcel.writeInterfaceToken(string4);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        parcel.writeString(string3);
        string2 = this.mRemote;
        n3 = 0;
        int n4 = 1;
        int n7 = 2;
        try {
            string2.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public void cancelAll(String string2) {
        Parcel parcel = Parcel.obtain();
        String string3 = INotificationSideChannel.DESCRIPTOR;
        parcel.writeInterfaceToken(string3);
        parcel.writeString(string2);
        string2 = this.mRemote;
        string3 = null;
        int n3 = 1;
        int n4 = 3;
        try {
            string2.transact(n4, parcel, null, n3);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return INotificationSideChannel.DESCRIPTOR;
    }

    public void notify(String string2, int n3, String string3, Notification notification) {
        Parcel parcel = Parcel.obtain();
        String string4 = INotificationSideChannel.DESCRIPTOR;
        parcel.writeInterfaceToken(string4);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        parcel.writeString(string3);
        string2 = null;
        INotificationSideChannel$_Parcel.access$100(parcel, (Parcelable)notification, 0);
        string2 = this.mRemote;
        n3 = 0;
        int n4 = 1;
        try {
            string2.transact(n4, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

