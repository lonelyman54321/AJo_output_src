/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

public final class zzcix {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcix(int n3, int n4, int n7) {
        this.zzc = n3;
        this.zzb = n4;
        this.zza = n7;
    }

    public static zzcix zza() {
        zzcix zzcix2 = new zzcix(0, 0, 0);
        return zzcix2;
    }

    public static zzcix zzb(int n3, int n4) {
        zzcix zzcix2 = new zzcix(1, n3, n4);
        return zzcix2;
    }

    public static zzcix zzc(zzq object) {
        int n3 = ((zzq)object).zzd;
        if (n3 != 0) {
            object = new zzcix(3, 0, 0);
            return object;
        }
        n3 = ((zzq)object).zzi;
        if (n3 != 0) {
            object = new zzcix(2, 0, 0);
            return object;
        }
        n3 = ((zzq)object).zzh;
        if (n3 != 0) {
            return zzcix.zza();
        }
        n3 = ((zzq)object).zzf;
        int n4 = ((zzq)object).zzc;
        return zzcix.zzb(n3, n4);
    }

    public static zzcix zzd() {
        zzcix zzcix2 = new zzcix(5, 0, 0);
        return zzcix2;
    }

    public static zzcix zze() {
        zzcix zzcix2 = new zzcix(4, 0, 0);
        return zzcix2;
    }

    public final boolean zzf() {
        int n3 = this.zzc;
        return n3 == 0;
    }

    public final boolean zzg() {
        int n3 = this.zzc;
        int n4 = 2;
        return n3 == n4;
    }

    public final boolean zzh() {
        int n3 = this.zzc;
        int n4 = 5;
        return n3 == n4;
    }

    public final boolean zzi() {
        int n3 = this.zzc;
        int n4 = 3;
        return n3 == n4;
    }

    public final boolean zzj() {
        int n3 = this.zzc;
        int n4 = 4;
        return n3 == n4;
    }
}

