/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbh;
import com.google.android.gms.internal.ads.zzbi;
import com.google.android.gms.internal.ads.zzbj;
import com.google.android.gms.internal.ads.zzn;

public final class zzbk {
    public static final zzbk zza;
    public static final zzn zzb;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;

    static {
        zzbk zzbk2;
        Object object = new zzbi();
        zza = zzbk2 = new zzbk((zzbi)object);
        int n3 = 36;
        zzh = Integer.toString(0, n3);
        zzi = Integer.toString(1, n3);
        zzj = Integer.toString(2, n3);
        zzk = Integer.toString(3, n3);
        zzl = Integer.toString(4, n3);
        zzb = object = new zzbh();
    }

    private zzbk(zzbi zzbi2) {
        float f5;
        long l2;
        this.zzc = l2 = -9223372036854775807L;
        this.zzd = l2;
        this.zze = l2;
        this.zzf = f5 = -3.4028235E38f;
        this.zzg = f5;
    }

    public /* synthetic */ zzbk(zzbi zzbi2, zzbj zzbj2) {
        this(zzbi2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzbk;
        if (!bl3) {
            return false;
        }
        long cfr_ignored_0 = ((zzbk)object).zzc;
        return bl2;
    }

    public final int hashCode() {
        int n3 = (int)-9223372034707292159L;
        int n4 = ((n3 * 31 + n3) * 31 + n3) * 31;
        float f5 = -3.4028235E38f;
        n4 = UR0.a(f5, n4, 31);
        return Float.floatToIntBits(f5) + n4;
    }
}

