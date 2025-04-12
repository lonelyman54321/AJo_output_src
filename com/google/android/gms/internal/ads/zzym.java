/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzza;
import com.google.android.gms.internal.ads.zzze;

final class zzym
extends zzza
implements Comparable {
    private final int zze;
    private final int zzf;

    public zzym(int n3, zzde zzde2, int n4, zzys zzys2, int n7) {
        super(n3, zzde2, n4);
        n3 = (int)(zzys2.zzT ? 1 : 0);
        this.zze = n3 = (int)(zzze.zzo(n7, n3 != 0) ? 1 : 0);
        this.zzf = n3 = this.zzd.zza();
    }

    public final int zza(zzym zzym2) {
        int n3 = this.zzf;
        int n4 = zzym2.zzf;
        return Integer.compare(n3, n4);
    }

    public final int zzb() {
        return this.zze;
    }
}

