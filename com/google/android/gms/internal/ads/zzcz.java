/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzc;
import com.google.android.gms.internal.ads.zzcy;
import com.google.android.gms.internal.ads.zzd;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;

public final class zzcz {
    public static final zzn zza;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm;

    static {
        int n3 = 36;
        zzh = Integer.toString(0, n3);
        zzi = Integer.toString(1, n3);
        zzj = Integer.toString(2, n3);
        zzk = Integer.toString(3, n3);
        zzl = Integer.toString(4, n3);
        zzcy zzcy2 = new zzcy();
        zza = zzcy2;
    }

    public zzcz() {
        zzd zzd2;
        this.zzm = zzd2 = com.google.android.gms.internal.ads.zzd.zza;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (n3 = (object3 = zzcz.class).equals(object2 = object.getClass())) != 0) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            int n4;
            object = (zzcz)object;
            object2 = this.zzb;
            object3 = ((zzcz)object).zzb;
            n3 = zzgd.zzG(object2, object3);
            if (n3 != 0 && (n3 = zzgd.zzG(object2 = this.zzc, object3 = ((zzcz)object).zzc)) != 0 && (n3 = this.zzd) == (n4 = ((zzcz)object).zzd) && (l7 = (l4 = (l3 = this.zze) - (l2 = ((zzcz)object).zze)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (n3 = (int)(this.zzg ? 1 : 0)) == (n4 = (int)(((zzcz)object).zzg ? 1 : 0)) && (bl3 = zzgd.zzG(object2 = this.zzm, object = ((zzcz)object).zzm))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        Object object = this.zzb;
        int n4 = 0;
        zzd zzd2 = null;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        Object object2 = this.zzc;
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        n3 = ((n3 + 217) * 31 + n4) * 31;
        n4 = this.zzd;
        n3 += n4;
        long l2 = this.zze;
        long l3 = l2 >>> 32;
        n3 *= 31;
        int n7 = (int)(l2 ^= l3);
        n3 = (n3 + n7) * 961;
        n4 = (int)(this.zzg ? 1 : 0);
        n3 += n4;
        zzd2 = this.zzm;
        return zzd2.hashCode() + (n3 *= 31);
    }

    public final int zza(int n3) {
        return this.zzm.zza((int)n3).zzd;
    }

    public final int zzb() {
        int cfr_ignored_0 = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long l2) {
        return -1;
    }

    public final int zzd(long l2) {
        zzd zzd2 = this.zzm;
        int n3 = -1;
        zzd2.zzb(n3);
        return n3;
    }

    public final int zze(int n3) {
        return this.zzm.zza(n3).zza(-1);
    }

    public final int zzf(int n3, int n4) {
        return this.zzm.zza(n3).zza(n4);
    }

    public final int zzg() {
        int cfr_ignored_0 = this.zzm.zze;
        return 0;
    }

    public final long zzh(int n3, int n4) {
        zzd zzd2 = this.zzm;
        zzc zzc2 = zzd2.zza(n3);
        int n7 = zzc2.zzd;
        int n8 = -1;
        if (n7 != n8) {
            return zzc2.zzh[n4];
        }
        return -9223372036854775807L;
    }

    public final long zzi(int n3) {
        long cfr_ignored_0 = this.zzm.zza((int)n3).zzc;
        return 0L;
    }

    public final long zzj() {
        long cfr_ignored_0 = this.zzm.zzd;
        return 0L;
    }

    public final long zzk(int n3) {
        long cfr_ignored_0 = this.zzm.zza((int)n3).zzi;
        return 0L;
    }

    public final zzcz zzl(Object object, Object object2, int n3, long l2, long l3, zzd zzd2, boolean bl2) {
        this.zzb = object;
        this.zzc = object2;
        this.zzd = n3;
        this.zze = l2;
        this.zzf = 0L;
        this.zzm = zzd2;
        this.zzg = bl2;
        return this;
    }

    public final boolean zzm(int n3) {
        this.zzb();
        int n4 = -1;
        if (n3 == n4) {
            zzd zzd2 = this.zzm;
            zzd2.zzb(n4);
        }
        return false;
    }

    public final boolean zzn(int n3) {
        n3 = (int)(this.zzm.zza((int)n3).zzj ? 1 : 0);
        return false;
    }
}

