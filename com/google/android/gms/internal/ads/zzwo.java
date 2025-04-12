/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzwr;
import com.google.android.gms.internal.ads.zzxf;

final class zzwo
implements zzxf {
    final /* synthetic */ zzwr zza;
    private final int zzb;

    public zzwo(zzwr zzwr2, int n3) {
        this.zza = zzwr2;
        this.zzb = n3;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzwo zzwo2) {
        return zzwo2.zzb;
    }

    public final int zza(zzlj zzlj2, zzin zzin2, int n3) {
        zzwr zzwr2 = this.zza;
        int n4 = this.zzb;
        return zzwr2.zzg(n4, zzlj2, zzin2, n3);
    }

    public final int zzb(long l2) {
        zzwr zzwr2 = this.zza;
        int n3 = this.zzb;
        return zzwr2.zzi(n3, l2);
    }

    public final void zzd() {
        zzwr zzwr2 = this.zza;
        int n3 = this.zzb;
        zzwr2.zzI(n3);
    }

    public final boolean zze() {
        zzwr zzwr2 = this.zza;
        int n3 = this.zzb;
        return zzwr2.zzP(n3);
    }
}

