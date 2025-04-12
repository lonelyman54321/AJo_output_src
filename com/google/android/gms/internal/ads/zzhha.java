/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhgy;

public final class zzhha
extends Enum
implements zzhbs {
    public static final /* enum */ zzhha zza;
    public static final /* enum */ zzhha zzb;
    public static final /* enum */ zzhha zzc;
    public static final /* enum */ zzhha zzd;
    public static final /* enum */ zzhha zze;
    public static final /* enum */ zzhha zzf;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzhha[] zzh;
    private final int zzi;

    static {
        zzhha zzhha2;
        zzhha zzhha3;
        zzhha zzhha4;
        zzhha zzhha5;
        zzhha zzhha6;
        Object object = new zzhha("SURFACE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhha6 = new zzhha("BUBBLE_MAINPAGE", n3, n3);
        int n4 = 2;
        zzc = zzhha5 = new zzhha("BUBBLE_SUBPAGE", n4, n4);
        int n7 = 3;
        zzd = zzhha4 = new zzhha("DOWNLOADS_PAGE", n7, n7);
        int n8 = 4;
        zze = zzhha3 = new zzhha("DOWNLOAD_PROMPT", n8, n8);
        int n10 = 5;
        zzf = zzhha2 = new zzhha("DOWNLOAD_NOTIFICATION", n10, n10);
        zzhha[] zzhhaArray = new zzhha[6];
        zzhhaArray[0] = object;
        zzhhaArray[n3] = zzhha6;
        zzhhaArray[n4] = zzhha5;
        zzhhaArray[n7] = zzhha4;
        zzhhaArray[n8] = zzhha3;
        zzhhaArray[n10] = zzhha2;
        zzh = zzhhaArray;
        zzg = object = new zzhgy();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhha() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzhha[] values() {
        return (zzhha[])zzh.clone();
    }

    public static zzhha zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                return null;
                            }
                            return zzf;
                        }
                        return zze;
                    }
                    return zzd;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}

