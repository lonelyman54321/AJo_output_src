/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcqa;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgge;

final class zzcqc
implements zzgfp {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcqd zzc;

    public zzcqc(zzcqd zzcqd2, zzfoe zzfoe2, String string2) {
        this.zza = zzfoe2;
        this.zzb = string2;
        this.zzc = zzcqd2;
    }

    public final void zza(Throwable throwable) {
        zzgge zzgge2 = zzcqd.zzf(this.zzc);
        zzfoe zzfoe2 = this.zza;
        String string2 = this.zzb;
        zzcqa zzcqa2 = new zzcqa(this, throwable, zzfoe2, string2);
        zzgge2.zza(zzcqa2);
    }
}

