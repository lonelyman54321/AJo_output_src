/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcw;
import com.google.android.gms.internal.consent_sdk.zzdd;

final class zzdc
extends zzdd {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzdd zzc;

    public zzdc(zzdd zzdd2, int n3, int n4) {
        this.zzc = zzdd2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zzcw.zza(n3, n4, "index");
        zzdd zzdd2 = this.zzc;
        int n7 = this.zza;
        return zzdd2.get(n3 += n7);
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

    public final zzdd zzf(int n3, int n4) {
        int n7 = this.zzb;
        zzcw.zzc(n3, n4, n7);
        n7 = this.zza;
        zzdd zzdd2 = this.zzc;
        return zzdd2.zzf(n3 += n7, n4 += n7);
    }
}

