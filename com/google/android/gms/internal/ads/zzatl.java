/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzatl
extends Enum
implements zzhbs {
    public static final /* enum */ zzatl zza;
    public static final /* enum */ zzatl zzb;
    public static final /* enum */ zzatl zzc;
    public static final /* enum */ zzatl zzd;
    public static final /* enum */ zzatl zze;
    private static final zzhbt zzf;
    private static final /* synthetic */ zzatl[] zzg;
    private final int zzh;

    static {
        zzatl zzatl2;
        zzatl zzatl3;
        zzatl zzatl4;
        zzatl zzatl5;
        Object object = new zzatl("ENUM_SIGNAL_SOURCE_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzatl5 = new zzatl("ENUM_SIGNAL_SOURCE_DISABLE", n3, n3);
        int n4 = 2;
        zzc = zzatl4 = new zzatl("ENUM_SIGNAL_SOURCE_ADSHIELD", n4, n4);
        int n7 = 3;
        zzd = zzatl3 = new zzatl("ENUM_SIGNAL_SOURCE_GASS", n7, n7);
        int n8 = 4;
        zze = zzatl2 = new zzatl("ENUM_SIGNAL_SOURCE_CALLER_PROVIDED", n8, n8);
        zzatl[] zzatlArray = new zzatl[5];
        zzatlArray[0] = object;
        zzatlArray[n3] = zzatl5;
        zzatlArray[n4] = zzatl4;
        zzatlArray[n7] = zzatl3;
        zzatlArray[n8] = zzatl2;
        zzg = zzatlArray;
        zzf = object = new zzatj();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzatl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzatl[] values() {
        return (zzatl[])zzg.clone();
    }

    public static zzatl zzb(int n3) {
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

