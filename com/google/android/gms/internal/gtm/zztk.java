/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztd;
import com.google.android.gms.internal.gtm.zztl;

final class zztk
extends zztl {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zztl zzc;

    public zztk(zztl zztl2, int n3, int n4) {
        this.zzc = zztl2;
        this.zza = n3;
        this.zzb = n4;
    }

    public final Object get(int n3) {
        int n4 = this.zzb;
        zztd.zza(n3, n4, "index");
        zztl zztl2 = this.zzc;
        int n7 = this.zza;
        return zztl2.get(n3 += n7);
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

    public final zztl zzf(int n3, int n4) {
        int n7 = this.zzb;
        zztd.zzc(n3, n4, n7);
        n7 = this.zza;
        zztl zztl2 = this.zzc;
        return zztl2.zzf(n3 += n7, n4 += n7);
    }
}

