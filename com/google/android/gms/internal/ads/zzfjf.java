/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfje;

final class zzfjf {
    private final zzfje zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public zzfjf() {
        zzfje zzfje2;
        this.zza = zzfje2 = new zzfje();
    }

    public final zzfje zza() {
        zzfje zzfje2 = this.zza;
        zzfje zzfje3 = zzfje2.zza();
        zzfje2.zza = false;
        zzfje2.zzb = false;
        return zzfje3;
    }

    public final String zzb() {
        StringBuilder stringBuilder = new StringBuilder("\n\tPool does not exist: ");
        int n3 = this.zzd;
        stringBuilder.append(n3);
        stringBuilder.append("\n\tNew pools created: ");
        n3 = this.zzb;
        stringBuilder.append(n3);
        stringBuilder.append("\n\tPools removed: ");
        n3 = this.zzc;
        stringBuilder.append(n3);
        stringBuilder.append("\n\tEntries added: ");
        n3 = this.zzf;
        stringBuilder.append(n3);
        stringBuilder.append("\n\tNo entries retrieved: ");
        return g30.a(this.zze, "\n", stringBuilder);
    }

    public final void zzc() {
        int n3;
        this.zzf = n3 = this.zzf + 1;
    }

    public final void zzd() {
        int n3 = this.zzb;
        int n4 = 1;
        this.zzb = n3 += n4;
        this.zza.zza = n4;
    }

    public final void zze() {
        int n3;
        this.zze = n3 = this.zze + 1;
    }

    public final void zzf() {
        int n3;
        this.zzd = n3 = this.zzd + 1;
    }

    public final void zzg() {
        int n3 = this.zzc;
        int n4 = 1;
        this.zzc = n3 += n4;
        this.zza.zzb = n4;
    }
}

