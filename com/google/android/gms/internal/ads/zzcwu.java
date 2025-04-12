/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcww;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdew;
import com.google.android.gms.internal.ads.zzfho;

public final class zzcwu
implements zzdew,
zzdaz {
    private final Clock zza;
    private final zzcww zzb;
    private final zzfho zzc;
    private final String zzd;

    public zzcwu(Clock clock, zzcww zzcww2, zzfho zzfho2, String string2) {
        this.zza = clock;
        this.zzb = zzcww2;
        this.zzc = zzfho2;
        this.zzd = string2;
    }

    public final void zza() {
        Clock clock = this.zza;
        zzcww zzcww2 = this.zzb;
        String string2 = this.zzd;
        long l2 = clock.elapsedRealtime();
        zzcww2.zze(string2, l2);
    }

    public final void zzs() {
        Object object = this.zzc;
        zzcww zzcww2 = this.zzb;
        object = ((zzfho)object).zzf;
        Clock clock = this.zza;
        String string2 = this.zzd;
        long l2 = clock.elapsedRealtime();
        zzcww2.zzd((String)object, string2, l2);
    }
}

