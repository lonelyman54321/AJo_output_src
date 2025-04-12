/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;
import com.google.android.gms.internal.ads.zzx;
import com.google.android.gms.internal.ads.zzy;
import com.google.android.gms.internal.ads.zzz;

public final class zzaa {
    public static final zzaa zza;
    public static final zzn zzb;
    private static final String zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;

    static {
        zzaa zzaa2;
        Object object = new zzy(0);
        zza = zzaa2 = new zzaa((zzy)object, null);
        int n3 = 36;
        zzg = Integer.toString(0, n3);
        zzh = Integer.toString(1, n3);
        zzi = Integer.toString(2, n3);
        zzj = Integer.toString(3, n3);
        zzb = object = new zzx();
    }

    public /* synthetic */ zzaa(zzy zzy2, zzz zzz2) {
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzaa;
        if (!bl3) {
            return false;
        }
        int n3 = ((zzaa)object).zzc;
        object = null;
        n3 = (int)(zzgd.zzG(null, null) ? 1 : 0);
        if (n3 != 0) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return 15699857;
    }
}

