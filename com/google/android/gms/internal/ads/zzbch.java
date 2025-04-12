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
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbcj;

public final class zzbch
extends zzbad
implements zzbcj {
    public zzbch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void zzb(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(2, parcel);
    }

    public final void zzc(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(3, parcel);
    }

    public final void zzd(zzbcg zzbcg2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbcg2);
        this.zzdc(1, parcel);
    }
}

