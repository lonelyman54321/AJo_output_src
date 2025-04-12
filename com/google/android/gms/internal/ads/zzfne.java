/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfnd;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfne
extends Enum
implements zzhbs {
    public static final /* enum */ zzfne zza;
    public static final /* enum */ zzfne zzb;
    private static final zzhbt zzc;
    private static final /* synthetic */ zzfne[] zzd;
    private final int zze;

    static {
        zzfne zzfne2;
        Object object = new zzfne("TAG_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfne2 = new zzfne("UNRECOGNIZED", n3, -1);
        zzfne[] zzfneArray = new zzfne[2];
        zzfneArray[0] = object;
        zzfneArray[n3] = zzfne2;
        zzd = zzfneArray;
        zzc = object = new zzfnd();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfne() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfne[] values() {
        return (zzfne[])zzd.clone();
    }

    public static zzfne zzb(int n3) {
        if (n3 != 0) {
            return null;
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzb;
        if (this != object) {
            return this.zze;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

