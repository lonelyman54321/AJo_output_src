/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzcdl;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcfb;

public final class zza {
    public final zzcdl zza;
    public final zzcfb zzb;

    public zza(zzcfb zzcfb2, zzcdl zzcdl2) {
        this.zzb = zzcfb2;
        this.zza = zzcdl2;
    }

    public static zza zza() {
        zzcfb zzcfb2 = new zzcfb();
        zzcdw zzcdw2 = new zzcdw();
        zza zza2 = new zza(zzcfb2, zzcdw2);
        return zza2;
    }
}

