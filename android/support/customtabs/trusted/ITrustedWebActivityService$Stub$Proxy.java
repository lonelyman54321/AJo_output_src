/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import android.support.customtabs.trusted.ITrustedWebActivityService$_Parcel;

class ITrustedWebActivityService$Stub$Proxy
implements ITrustedWebActivityService {
    private IBinder mRemote;

    public ITrustedWebActivityService$Stub$Proxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public Bundle areNotificationsEnabled(Bundle object) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            string2 = null;
            ITrustedWebActivityService$_Parcel.access$100(parcel, (Parcelable)object, 0);
            object = this.mRemote;
            int n3 = 6;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ITrustedWebActivityService$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public void cancelNotification(Bundle bundle) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            string2 = null;
            ITrustedWebActivityService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            bundle = this.mRemote;
            int n3 = 3;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public Bundle extraCommand(String object, Bundle bundle, IBinder iBinder) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            parcel.writeString((String)object);
            object = null;
            ITrustedWebActivityService$_Parcel.access$100(parcel, (Parcelable)bundle, 0);
            parcel.writeStrongBinder(iBinder);
            bundle = this.mRemote;
            int n3 = 9;
            bundle.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ITrustedWebActivityService$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public Bundle getActiveNotifications() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            Object object = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 5;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ITrustedWebActivityService$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return ITrustedWebActivityService.DESCRIPTOR;
    }

    public Bundle getSmallIconBitmap() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            Object object = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken((String)object);
            object = this.mRemote;
            int n3 = 7;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ITrustedWebActivityService$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            object = (Bundle)object;
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public int getSmallIconId() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            string2 = this.mRemote;
            int n3 = 4;
            string2.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            int n4 = parcel2.readInt();
            return n4;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public Bundle notifyNotificationWithChannel(Bundle object) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            String string2 = ITrustedWebActivityService.DESCRIPTOR;
            parcel.writeInterfaceToken(string2);
            string2 = null;
            ITrustedWebActivityService$_Parcel.access$100(parcel, (Parcelable)object, 0);
            object = this.mRemote;
            int n3 = 2;
            object.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            object = Bundle.CREATOR;
            object = ITrustedWebActivityService$_Parcel.access$000(parcel2, (Parcelable.Creator)object);
            return object;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }
}

