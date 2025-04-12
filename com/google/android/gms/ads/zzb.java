/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.AdSize;

public final class zzb {
    public static int zza(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzb(AdSize adSize) {
        return adSize.zza();
    }

    public static AdSize zzc(int n3, int n4, String string2) {
        AdSize adSize = new AdSize(n3, n4, string2);
        return adSize;
    }

    public static AdSize zzd(int n3, int n4) {
        AdSize adSize = new AdSize(n3, n4);
        adSize.zze(true);
        adSize.zzc(n4);
        return adSize;
    }

    public static AdSize zze(int n3, int n4) {
        AdSize adSize = new AdSize(n3, n4);
        adSize.zzf(true);
        adSize.zzd(n4);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zzg();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.zzi();
    }
}

