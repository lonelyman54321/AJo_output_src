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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzboi;

public final class zzbog
extends zzbad
implements zzboi {
    public zzbog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void zze(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(2, parcel);
    }

    public final void zzf(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(3, parcel);
    }

    public final void zzg(zzboc zzboc2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzboc2);
        this.zzdc(1, parcel);
    }
}

