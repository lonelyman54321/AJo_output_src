/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzv;

final class zzaj
extends zzak {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzak zzc;

    public zzaj(zzak zzak2, int n3, int n4) {
        this.zzc = zzak2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zzv.zza(n3, n4, "index");
        zzak zzak2 = this.zzc;
        int n7 = this.zza;
        return zzak2.get(n3 += n7);
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

    public final zzak zzh(int n3, int n4) {
        int n7 = this.zzb;
        zzv.zzc(n3, n4, n7);
        n7 = this.zza;
        zzak zzak2 = this.zzc;
        return zzak2.zzh(n3 += n7, n4 += n7);
    }
}

