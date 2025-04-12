/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza
implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zza(IBinder iBinder, String string2) {
        this.zza = iBinder;
        this.zzb = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";
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
        IBinder iBinder = this.zza;
        int n4 = 1;
        int n7 = 2;
        try {
            iBinder.transact(n7, parcel, null, n4);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

