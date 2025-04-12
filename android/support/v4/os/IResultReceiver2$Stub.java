/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver2;
import android.support.v4.os.IResultReceiver2$Stub$Proxy;
import android.support.v4.os.IResultReceiver2$_Parcel;

public abstract class IResultReceiver2$Stub
extends Binder
implements IResultReceiver2 {
    static final int TRANSACTION_send = 1;

    public IResultReceiver2$Stub() {
        String string2 = IResultReceiver2.DESCRIPTOR;
        this.attachInterface(this, string2);
    }

    public static IResultReceiver2 asInterface(IBinder iBinder) {
        boolean bl2;
        if (iBinder == null) {
            return null;
        }
        Object object = IResultReceiver2.DESCRIPTOR;
        if ((object = iBinder.queryLocalInterface((String)object)) != null && (bl2 = object instanceof IResultReceiver2)) {
            return (IResultReceiver2)object;
        }
        object = new IResultReceiver2$Stub$Proxy(iBinder);
        return object;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7;
        String string2 = IResultReceiver2.DESCRIPTOR;
        int n8 = 1;
        if (n3 >= n8 && n3 <= (n7 = 0xFFFFFF)) {
            parcel.enforceInterface(string2);
        }
        if (n3 == (n7 = 1598968902)) {
            parcel2.writeString(string2);
            return n8;
        }
        if (n3 != n8) {
            return super.onTransact(n3, parcel, parcel2, n4);
        }
        n3 = parcel.readInt();
        parcel2 = Bundle.CREATOR;
        parcel = (Bundle)IResultReceiver2$_Parcel.access$000(parcel, (Parcelable.Creator)parcel2);
        this.send(n3, (Bundle)parcel);
        return n8;
    }
}

