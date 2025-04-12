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
import com.google.android.gms.internal.ads.zzbth;

public final class zzbtf
extends zzbad
implements zzbth {
    public zzbtf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    public final void zze(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(1, parcel);
    }

    public final void zzf(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(2, parcel);
    }

    public final void zzg(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(3, parcel);
    }
}

