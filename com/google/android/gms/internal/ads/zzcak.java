/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcav;

public final class zzcak {
    private final Clock zza;
    private final zzcai zzb;

    public zzcak(Clock clock, zzcai zzcai2) {
        this.zza = clock;
        this.zzb = zzcai2;
    }

    public static zzcak zza(Context context) {
        return zzcav.zzd(context).zzb();
    }

    public final void zzb(int n3, long l2) {
        this.zzb.zza(n3, l2);
    }

    public final void zzc(zzff zzff2) {
        long l2 = this.zza.currentTimeMillis();
        this.zzb.zza(-1, l2);
    }

    public final void zzd() {
        long l2 = this.zza.currentTimeMillis();
        this.zzb.zza(-1, l2);
    }
}

