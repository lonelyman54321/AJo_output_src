/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgbc;

final class zzgbb
extends zzgbc {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgbc zzc;

    public zzgbb(zzgbc zzgbc2, int n3, int n4) {
        this.zzc = zzgbc2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zzfyg.zza(n3, n4, "index");
        zzgbc zzgbc2 = this.zzc;
        int n7 = this.zza;
        return zzgbc2.get(n3 += n7);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        int n3 = this.zzc.zzc();
        int n4 = this.zza;
        n3 += n4;
        n4 = this.zzb;
        return n3 + n4;
    }

    public final int zzc() {
        int n3 = this.zzc.zzc();
        int n4 = this.zza;
        return n3 + n4;
    }

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final zzgbc zzh(int n3, int n4) {
        int n7 = this.zzb;
        zzfyg.zzi(n3, n4, n7);
        n7 = this.zza;
        zzgbc zzgbc2 = this.zzc;
        return zzgbc2.zzh(n3 += n7, n4 += n7);
    }
}

