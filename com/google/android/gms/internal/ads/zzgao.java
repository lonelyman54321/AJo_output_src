/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzgdw;
import java.util.Comparator;

final class zzgao
extends zzgar {
    public zzgao() {
        super(null);
    }

    public static final zzgar zzg(int n3) {
        zzgar zzgar2 = n3 < 0 ? zzgar.zzj() : (n3 > 0 ? zzgar.zzi() : zzgar.zzh());
        return zzgar2;
    }

    public final int zza() {
        return 0;
    }

    public final zzgar zzb(int n3, int n4) {
        n3 = n3 < n4 ? -1 : (n3 > n4 ? 1 : 0);
        return zzgao.zzg(n3);
    }

    public final zzgar zzc(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        int n3 = object < 0 ? -1 : (object > 0 ? 1 : 0);
        return zzgao.zzg(n3);
    }

    public final zzgar zzd(Object object, Object object2, Comparator comparator) {
        return zzgao.zzg(comparator.compare(object, object2));
    }

    public final zzgar zze(boolean bl2, boolean bl3) {
        return zzgao.zzg(zzgdw.zza(bl2, bl3));
    }

    public final zzgar zzf(boolean bl2, boolean bl3) {
        return zzgao.zzg(zzgdw.zza(bl3, bl2));
    }
}

