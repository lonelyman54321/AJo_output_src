/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhjd;

public final class zzhjf
extends Enum
implements zzhbs {
    public static final /* enum */ zzhjf zza;
    public static final /* enum */ zzhjf zzb;
    public static final /* enum */ zzhjf zzc;
    public static final /* enum */ zzhjf zzd;
    public static final /* enum */ zzhjf zze;
    public static final /* enum */ zzhjf zzf;
    public static final /* enum */ zzhjf zzg;
    private static final zzhbt zzh;
    private static final /* synthetic */ zzhjf[] zzi;
    private final int zzj;

    static {
        zzhjf zzhjf2;
        zzhjf zzhjf3;
        zzhjf zzhjf4;
        zzhjf zzhjf5;
        zzhjf zzhjf6;
        zzhjf zzhjf7;
        Object object = new zzhjf("UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhjf7 = new zzhjf("PHISHING_INTERSTITIAL", n3, n3);
        int n4 = 2;
        zzc = zzhjf6 = new zzhjf("CLIENT_SIDE_PHISHING_INTERSTITIAL", n4, n4);
        int n7 = 3;
        zzd = zzhjf5 = new zzhjf("MALWARE_INTERSTITIAL", n7, n7);
        int n8 = 4;
        zze = zzhjf4 = new zzhjf("UWS_INTERSTITIAL", n8, n8);
        int n10 = 5;
        zzf = zzhjf3 = new zzhjf("BILLING_INTERSTITIAL", n10, n10);
        int n14 = 6;
        zzg = zzhjf2 = new zzhjf("BINARY_MALWARE_DOWNLOAD_WARNING", n14, n14);
        zzhjf[] zzhjfArray = new zzhjf[7];
        zzhjfArray[0] = object;
        zzhjfArray[n3] = zzhjf7;
        zzhjfArray[n4] = zzhjf6;
        zzhjfArray[n7] = zzhjf5;
        zzhjfArray[n8] = zzhjf4;
        zzhjfArray[n10] = zzhjf3;
        zzhjfArray[n14] = zzhjf2;
        zzi = zzhjfArray;
        zzh = object = new zzhjd();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhjf() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzhjf[] values() {
        return (zzhjf[])zzi.clone();
    }

    public static zzhjf zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
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

