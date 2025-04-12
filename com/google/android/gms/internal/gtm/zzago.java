/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzagn;

public final class zzago
extends Enum
implements zzach {
    public static final /* enum */ zzago zza;
    public static final /* enum */ zzago zzb;
    public static final /* enum */ zzago zzc;
    public static final /* enum */ zzago zzd;
    private static final zzaci zze;
    private static final /* synthetic */ zzago[] zzf;
    private final int zzg;

    static {
        zzago zzago2;
        zzago zzago3;
        zzago zzago4;
        Object object = new zzago("UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzago4 = new zzago("SUCCESS", n3, n3);
        int n4 = 2;
        zzc = zzago3 = new zzago("FAILURE", n4, n4);
        int n7 = 3;
        zzd = zzago2 = new zzago("CANCEL", n7, n7);
        zzago[] zzagoArray = new zzago[4];
        zzagoArray[0] = object;
        zzagoArray[n3] = zzago4;
        zzagoArray[n4] = zzago3;
        zzagoArray[n7] = zzago2;
        zzf = zzagoArray;
        zze = object = new zzagn();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzago() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzago[] values() {
        return (zzago[])zzf.clone();
    }

    public static zzaci zzb() {
        return zze;
    }

    public final String toString() {
        return Integer.toString(this.zzg);
    }

    public final int zza() {
        return this.zzg;
    }
}

