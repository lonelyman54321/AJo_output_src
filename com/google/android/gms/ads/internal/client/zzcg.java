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
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

public final class zzcg
extends zzbad
implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    public final void zzb() {
        Parcel parcel = this.zza();
        this.zzdc(5, parcel);
    }

    public final void zzc() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }

    public final void zzd(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(1, parcel);
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }
}

