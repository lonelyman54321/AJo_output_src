/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfsl;

final class zzi
implements zzfsl {
    final /* synthetic */ zzj zza;

    public zzi(zzj zzj2) {
        this.zza = zzj2;
    }

    public final void zza(int n3, long l2) {
        zzfre zzfre2 = zzj.zza(this.zza);
        long l3 = System.currentTimeMillis() - l2;
        zzfre2.zzd(n3, l3);
    }

    public final void zzb(int n3, long l2, String string2) {
        zzfre zzfre2 = zzj.zza(this.zza);
        long l3 = System.currentTimeMillis() - l2;
        zzfre2.zze(n3, l3, string2);
    }
}

