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
import com.google.android.gms.internal.ads.zzbtb;

public final class zzbsz
extends zzbad
implements zzbtb {
    public zzbsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    public final void zze(String string2) {
        string2 = this.zza();
        string2.writeString("Adapter returned null.");
        this.zzdc(3, (Parcel)string2);
    }

    public final void zzf(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(4, parcel);
    }

    public final void zzg() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }
}

