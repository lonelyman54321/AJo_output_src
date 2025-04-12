/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhgd;

public final class zzhgf
extends Enum
implements zzhbs {
    public static final /* enum */ zzhgf zza;
    public static final /* enum */ zzhgf zzb;
    public static final /* enum */ zzhgf zzc;
    public static final /* enum */ zzhgf zzd;
    public static final /* enum */ zzhgf zze;
    public static final /* enum */ zzhgf zzf;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzhgf[] zzh;
    private final int zzi;

    static {
        zzhgf zzhgf2;
        zzhgf zzhgf3;
        zzhgf zzhgf4;
        zzhgf zzhgf5;
        zzhgf zzhgf6;
        Object object = new zzhgf("UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhgf6 = new zzhgf("TAILORED_WARNING_CT_BASE", n3, n3);
        int n4 = 2;
        zzc = zzhgf5 = new zzhgf("TAILORED_WARNING_CT", n4, n4);
        int n7 = 3;
        zzd = zzhgf4 = new zzhgf("TAILORED_WARNING_CT_ACCOUNT_INFO", n7, n7);
        int n8 = 4;
        zze = zzhgf3 = new zzhgf("TAILORED_WARNING_SUSPICIOUS_BASE", n8, n8);
        int n10 = 5;
        zzf = zzhgf2 = new zzhgf("TAILORED_WARNING_SUSPICIOUS", n10, n10);
        zzhgf[] zzhgfArray = new zzhgf[6];
        zzhgfArray[0] = object;
        zzhgfArray[n3] = zzhgf6;
        zzhgfArray[n4] = zzhgf5;
        zzhgfArray[n7] = zzhgf4;
        zzhgfArray[n8] = zzhgf3;
        zzhgfArray[n10] = zzhgf2;
        zzh = zzhgfArray;
        zzg = object = new zzhgd();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhgf() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzhgf[] values() {
        return (zzhgf[])zzh.clone();
    }

    public static zzhgf zzb(int n3) {
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

