/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.internal.location.zzex;

final class zzew
extends zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzex2, int n3, int n4) {
        this.zzc = zzex2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zzer.zzc(n3, n4, "index");
        zzex zzex2 = this.zzc;
        int n7 = this.zza;
        return zzex2.get(n3 += n7);
    }

    public final int size() {
        return this.zzb;
    }

    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    public final int zzc() {
        int n3 = this.zzc.zzc();
        int n4 = this.zza;
        return n3 + n4;
    }

    public final int zzd() {
        int n3 = this.zzc.zzc();
        int n4 = this.zza;
        n3 += n4;
        n4 = this.zzb;
        return n3 + n4;
    }

    public final boolean zzf() {
        return true;
    }

    public final zzex zzh(int n3, int n4) {
        int n7 = this.zzb;
        zzer.zze(n3, n4, n7);
        n7 = this.zza;
        zzex zzex2 = this.zzc;
        return zzex2.zzh(n3 += n7, n4 += n7);
    }
}

