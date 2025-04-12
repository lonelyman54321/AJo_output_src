/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zba
implements IInterface {
    private final IBinder zba;
    private final String zbb;

    public zba(IBinder iBinder, String string2) {
        this.zba = iBinder;
        this.zbb = string2;
    }

    public final IBinder asBinder() {
        return this.zba;
    }

    public final Parcel zba() {
        Parcel parcel = Parcel.obtain();
        String string2 = this.zbb;
        parcel.writeInterfaceToken(string2);
        return parcel;
    }

    public final void zbb(int n3, Parcel parcel) {
        Parcel parcel2 = Parcel.obtain();
        try {
            IBinder iBinder = this.zba;
            iBinder.transact(n3, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }
}

