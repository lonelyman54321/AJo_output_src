/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzgxn
extends Enum
implements zzhbs {
    public static final /* enum */ zzgxn zza;
    public static final /* enum */ zzgxn zzb;
    public static final /* enum */ zzgxn zzc;
    public static final /* enum */ zzgxn zzd;
    public static final /* enum */ zzgxn zze;
    public static final /* enum */ zzgxn zzf;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzgxn[] zzh;
    private final int zzi;

    static {
        zzgxn zzgxn2;
        zzgxn zzgxn3;
        zzgxn zzgxn4;
        zzgxn zzgxn5;
        zzgxn zzgxn6;
        Object object = new zzgxn("UNKNOWN_PREFIX", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzgxn6 = new zzgxn("TINK", n3, n3);
        int n4 = 2;
        zzc = zzgxn5 = new zzgxn("LEGACY", n4, n4);
        int n7 = 3;
        zzd = zzgxn4 = new zzgxn("RAW", n7, n7);
        int n8 = 4;
        zze = zzgxn3 = new zzgxn("CRUNCHY", n8, n8);
        int n10 = 5;
        zzf = zzgxn2 = new zzgxn("UNRECOGNIZED", n10, -1);
        zzgxn[] zzgxnArray = new zzgxn[6];
        zzgxnArray[0] = object;
        zzgxnArray[n3] = zzgxn6;
        zzgxnArray[n4] = zzgxn5;
        zzgxnArray[n7] = zzgxn4;
        zzgxnArray[n8] = zzgxn3;
        zzgxnArray[n10] = zzgxn2;
        zzh = zzgxnArray;
        zzg = object = new zzgxm();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgxn() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzgxn[] values() {
        return (zzgxn[])zzh.clone();
    }

    public static zzgxn zzb(int n3) {
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
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzf;
        if (this != object) {
            return this.zzi;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

