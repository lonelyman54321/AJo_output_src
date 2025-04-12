/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzaua
extends Enum
implements zzhbs {
    public static final /* enum */ zzaua zza;
    public static final /* enum */ zzaua zzb;
    public static final /* enum */ zzaua zzc;
    public static final /* enum */ zzaua zzd;
    public static final /* enum */ zzaua zze;
    private static final zzhbt zzf;
    private static final /* synthetic */ zzaua[] zzg;
    private final int zzh;

    static {
        zzaua zzaua2;
        zzaua zzaua3;
        zzaua zzaua4;
        zzaua zzaua5;
        Object object = new zzaua("FUNCTION_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzaua5 = new zzaua("FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS", n3, n3);
        int n4 = 2;
        zzc = zzaua4 = new zzaua("FUNCTION_METHOD_SETIMPLEMENTATIONS", n4, n4);
        int n7 = 3;
        zzd = zzaua3 = new zzaua("FUNCTION_CLASS_ADDMETHOD", n7, n7);
        int n8 = 4;
        zze = zzaua2 = new zzaua("FUNCTION_CLASS_REPLACEMETHOD", n8, n8);
        zzaua[] zzauaArray = new zzaua[5];
        zzauaArray[0] = object;
        zzauaArray[n3] = zzaua5;
        zzauaArray[n4] = zzaua4;
        zzauaArray[n7] = zzaua3;
        zzauaArray[n8] = zzaua2;
        zzg = zzauaArray;
        zzf = object = new zzaty();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzaua() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzaua[] values() {
        return (zzaua[])zzg.clone();
    }

    public static zzaua zzb(int n3) {
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

