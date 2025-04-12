/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzat;

final class zzas
extends zzat {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzat zzc;

    public zzas(zzat zzat2, int n3, int n4) {
        this.zzc = zzat2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zzam.zza(n3, n4, "index");
        zzat zzat2 = this.zzc;
        int n7 = this.zza;
        return zzat2.get(n3 += n7);
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

    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzat zzf(int n3, int n4) {
        int n7 = this.zzb;
        zzam.zze(n3, n4, n7);
        zzat zzat2 = this.zzc;
        int n8 = this.zza;
        return zzat2.zzf(n3 += n8, n4 += n8);
    }
}

