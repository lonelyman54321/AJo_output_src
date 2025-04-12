/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza
implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zza(IBinder iBinder, String string2) {
        this.zza = iBinder;
        this.zzb = string2;
    }

    public IBinder asBinder() {
        return this.zza;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel parcel = Parcel.obtain();
        String string2 = this.zzb;
        parcel.writeInterfaceToken(string2);
        return parcel;
    }

    public final void transactOneway(int n3, Parcel parcel) {
        try {
            IBinder iBinder = this.zza;
            int n4 = 1;
            iBinder.transact(n4, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

