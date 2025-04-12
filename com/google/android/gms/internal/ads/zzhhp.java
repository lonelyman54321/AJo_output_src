/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhhn;

public final class zzhhp
extends Enum
implements zzhbs {
    public static final /* enum */ zzhhp zza;
    public static final /* enum */ zzhhp zzb;
    public static final /* enum */ zzhhp zzc;
    public static final /* enum */ zzhhp zzd;
    public static final /* enum */ zzhhp zze;
    private static final zzhbt zzf;
    private static final /* synthetic */ zzhhp[] zzg;
    private final int zzh;

    static {
        zzhhp zzhhp2;
        zzhhp zzhhp3;
        zzhhp zzhhp4;
        zzhhp zzhhp5;
        Object object = new zzhhp("SAFE_OR_OTHER", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhhp5 = new zzhhp("MALWARE", n3, n3);
        int n4 = 2;
        zzc = zzhhp4 = new zzhhp("PHISHING", n4, n4);
        int n7 = 3;
        zzd = zzhhp3 = new zzhhp("UNWANTED", n7, n7);
        int n8 = 4;
        zze = zzhhp2 = new zzhhp("BILLING", n8, n8);
        zzhhp[] zzhhpArray = new zzhhp[5];
        zzhhpArray[0] = object;
        zzhhpArray[n3] = zzhhp5;
        zzhhpArray[n4] = zzhhp4;
        zzhhpArray[n7] = zzhhp3;
        zzhhpArray[n8] = zzhhp2;
        zzg = zzhhpArray;
        zzf = object = new zzhhn();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhhp() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzhhp[] values() {
        return (zzhhp[])zzg.clone();
    }

    public static zzhhp zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
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
        return Integer.toString(this.zzh);
    }

    public final int zza() {
        return this.zzh;
    }
}

