/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzfmc;

public final class zzdww
implements Runnable {
    public final /* synthetic */ zzdxf zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzccn zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfmc zzf;

    public /* synthetic */ zzdww(zzdxf zzdxf2, Object object, zzccn zzccn2, String string2, long l2, zzfmc zzfmc2) {
        this.zza = zzdxf2;
        this.zzb = object;
        this.zzc = zzccn2;
        this.zzd = string2;
        this.zze = l2;
        this.zzf = zzfmc2;
    }

    public final void run() {
        zzdxf zzdxf2 = this.zza;
        Object object = this.zzb;
        zzccn zzccn2 = this.zzc;
        String string2 = this.zzd;
        long l2 = this.zze;
        zzfmc zzfmc2 = this.zzf;
        zzdxf2.zzq(object, zzccn2, string2, l2, zzfmc2);
    }
}

