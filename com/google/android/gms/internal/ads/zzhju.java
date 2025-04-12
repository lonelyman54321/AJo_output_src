/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhjs;

public final class zzhju
extends Enum
implements zzhbs {
    public static final /* enum */ zzhju zza;
    public static final /* enum */ zzhju zzb;
    public static final /* enum */ zzhju zzc;
    public static final /* enum */ zzhju zzd;
    public static final /* enum */ zzhju zze;
    public static final /* enum */ zzhju zzf;
    public static final /* enum */ zzhju zzg;
    private static final zzhbt zzh;
    private static final /* synthetic */ zzhju[] zzi;
    private final int zzj;

    static {
        zzhju zzhju2;
        zzhju zzhju3;
        zzhju zzhju4;
        zzhju zzhju5;
        zzhju zzhju6;
        zzhju zzhju7;
        int n3 = 1;
        Object object = new zzhju("EVENT_URL", 0, n3);
        zza = object;
        int n4 = 2;
        zzb = zzhju7 = new zzhju("LANDING_PAGE", n3, n4);
        int n7 = 3;
        zzc = zzhju6 = new zzhju("LANDING_REFERRER", n4, n7);
        int n8 = 4;
        zzd = zzhju5 = new zzhju("CLIENT_REDIRECT", n7, n8);
        int n10 = 5;
        zze = zzhju4 = new zzhju("SERVER_REDIRECT", n8, n10);
        int n14 = 6;
        zzf = zzhju3 = new zzhju("RECENT_NAVIGATION", n10, n14);
        int n15 = 7;
        zzg = zzhju2 = new zzhju("REFERRER", n14, n15);
        zzhju[] zzhjuArray = new zzhju[n15];
        zzhjuArray[0] = object;
        zzhjuArray[n3] = zzhju7;
        zzhjuArray[n4] = zzhju6;
        zzhjuArray[n7] = zzhju5;
        zzhjuArray[n8] = zzhju4;
        zzhjuArray[n10] = zzhju3;
        zzhjuArray[n14] = zzhju2;
        zzi = zzhjuArray;
        zzh = object = new zzhjs();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhju() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzhju[] values() {
        return (zzhju[])zzi.clone();
    }

    public static zzhju zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 7: {
                return zzg;
            }
            case 6: {
                return zzf;
            }
            case 5: {
                return zze;
            }
            case 4: {
                return zzd;
            }
            case 3: {
                return zzc;
            }
            case 2: {
                return zzb;
            }
            case 1: 
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzj);
    }

    public final int zza() {
        return this.zzj;
    }
}

