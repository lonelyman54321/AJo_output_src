/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel$Stub$Proxy;
import android.support.v4.app.INotificationSideChannel$_Parcel;

public abstract class INotificationSideChannel$Stub
extends Binder
implements INotificationSideChannel {
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    public INotificationSideChannel$Stub() {
        String string2 = INotificationSideChannel.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static INotificationSideChannel asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = INotificationSideChannel.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof INotificationSideChannel)) {
            return (INotificationSideChannel)object;
        }
        object = new INotificationSideChannel$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel object, Parcel parcel, int n4) {
        int n7;
        String string2 = INotificationSideChannel.DESCRIPTOR;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            object.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel.writeString(string2);
            return n8;
        }
        if (n3 != n8) {
            int n10 = 2;
            if (n3 != n10) {
                n10 = 3;
                if (n3 != n10) {
                    return super.onTransact(n3, object, parcel, n4);
                }
                String string3 = object.readString();
                this.cancelAll(string3);
            } else {
                String string4 = object.readString();
                int n14 = object.readInt();
                object = object.readString();
                this.cancel(string4, n14, (String)object);
            }
        } else {
            String string5 = object.readString();
            int n15 = object.readInt();
            String string6 = object.readString();
            string2 = Notification.CREATOR;
            object = (Notification)INotificationSideChannel$_Parcel.access$000(object, (Parcelable.Creator)string2);
            this.notify(string5, n15, string6, (Notification)object);
        }
        return n8;
    }
}

