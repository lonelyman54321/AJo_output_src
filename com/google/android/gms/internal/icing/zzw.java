/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzg;
import com.google.android.gms.internal.icing.zzi;
import com.google.android.gms.internal.icing.zzx;

public final class zzw {
    private zzi zza;
    private long zzb = -1;
    private int zzc = -1;
    private zzg zzd;
    private boolean zze = false;
    private int zzf = 0;

    public final zzw zza(zzi zzi2) {
        this.zza = zzi2;
        return this;
    }

    public final zzw zzb(long l2) {
        this.zzb = l2;
        return this;
    }

    public final zzw zzc(int n3) {
        this.zzc = n3;
        return this;
    }

    public final zzw zzd(zzg zzg2) {
        this.zzd = zzg2;
        return this;
    }

    public final zzw zze(boolean bl2) {
        this.zze = bl2;
        return this;
    }

    public final zzw zzf(int n3) {
        this.zzf = n3;
        return this;
    }

    public final zzx zzg() {
        zzi zzi2 = this.zza;
        long l2 = this.zzb;
        int n3 = this.zzc;
        zzg zzg2 = this.zzd;
        boolean bl2 = this.zze;
        int n4 = this.zzf;
        zzx zzx2 = new zzx(zzi2, l2, n3, null, zzg2, bl2, -1, n4, null);
        return zzx2;
    }
}

