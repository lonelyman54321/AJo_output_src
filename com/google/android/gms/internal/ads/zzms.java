/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzji;
import com.google.android.gms.internal.ads.zzjp;
import com.google.android.gms.internal.ads.zzjq;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zzmt;
import com.google.android.gms.internal.ads.zzzm;

public final class zzms {
    private final zzjq zza;

    public zzms(Context context, zzcgn zzcgn2) {
        zzjq zzjq2;
        this.zza = zzjq2 = new zzjq(context, zzcgn2);
    }

    public final zzms zza(zzlk zzlk2) {
        zzjq zzjq2 = this.zza;
        zzeq.zzf(zzjq2.zzq ^ true);
        zzlk2.getClass();
        zzji zzji2 = new zzji(zzlk2);
        zzjq2.zzf = zzji2;
        return this;
    }

    public final zzms zzb(zzzm zzzm2) {
        zzjq zzjq2 = this.zza;
        zzeq.zzf(zzjq2.zzq ^ true);
        zzzm2.getClass();
        zzjp zzjp2 = new zzjp(zzzm2);
        zzjq2.zze = zzjp2;
        return this;
    }

    public final zzmt zzc() {
        zzjq zzjq2 = this.zza;
        boolean bl2 = zzjq2.zzq;
        boolean bl3 = true;
        zzeq.zzf(bl2 ^ bl3);
        zzjq2.zzq = bl3;
        zzmt zzmt2 = new zzmt(zzjq2);
        return zzmt2;
    }
}

