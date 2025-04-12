/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

public final class zzs
extends Enum {
    public static final /* enum */ zzs zza;
    public static final /* enum */ zzs zzb;
    public static final /* enum */ zzs zzc;
    public static final /* enum */ zzs zzd;
    public static final /* enum */ zzs zze;
    private static final /* synthetic */ zzs[] zzf;

    static {
        zzs zzs2;
        zzs zzs3;
        zzs zzs4;
        zzs zzs5;
        zzs zzs6;
        int n3 = 3;
        zza = zzs6 = new zzs("DEBUG", 0, n3);
        int n4 = 1;
        zzb = zzs5 = new zzs("ERROR", n4, 6);
        int n7 = 2;
        int n8 = 4;
        zzc = zzs4 = new zzs("INFO", n7, n8);
        zzd = zzs3 = new zzs("VERBOSE", n3, n7);
        int n10 = 5;
        zze = zzs2 = new zzs("WARN", n8, n10);
        zzs[] zzsArray = new zzs[n10];
        zzsArray[0] = zzs6;
        zzsArray[n4] = zzs5;
        zzsArray[n7] = zzs4;
        zzsArray[n3] = zzs3;
        zzsArray[n8] = zzs2;
        zzf = zzsArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzs() {
        void var2_1;
        void var1_-1;
    }

    public static zzs[] values() {
        return (zzs[])zzf.clone();
    }

    public static zzs zza(int n3) {
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    n4 = 6;
                    if (n3 != n4) {
                        return zzc;
                    }
                    return zzb;
                }
                return zze;
            }
            return zza;
        }
        return zzd;
    }
}

