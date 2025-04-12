/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbof;

public final class zzbod
extends zzbad
implements zzbof {
    public zzbod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final void zze(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(2, parcel);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }
}

