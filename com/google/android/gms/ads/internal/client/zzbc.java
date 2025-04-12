/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbad;

public final class zzbc
extends zzbad
implements zzbe {
    public zzbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void zzb() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }
}

