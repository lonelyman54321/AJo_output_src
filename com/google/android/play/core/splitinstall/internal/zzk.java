/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzk
implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzk(IBinder iBinder, String string2) {
        this.zza = iBinder;
        this.zzb = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel parcel = Parcel.obtain();
        String string2 = this.zzb;
        parcel.writeInterfaceToken(string2);
        return parcel;
    }

    public final void zzb(int n3, Parcel parcel) {
        try {
            IBinder iBinder = this.zza;
            int n4 = 1;
            iBinder.transact(n3, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

