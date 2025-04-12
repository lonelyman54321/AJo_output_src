/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjj$zza;

public final class zzjl
extends Enum {
    public static final /* enum */ zzjl zza;
    public static final /* enum */ zzjl zzb;
    private static final /* synthetic */ zzjl[] zzc;
    private final zzjj$zza[] zzd;

    static {
        zzjj$zza zzjj$zza;
        zzjl zzjl2;
        int n3 = 2;
        Object object = new zzjj$zza[n3];
        zzjj$zza[] zzjj$zzaArray = zzjj$zza.zza;
        object[0] = zzjj$zzaArray;
        zzjj$zzaArray = zzjj$zza.zzb;
        int n4 = 1;
        object[n4] = zzjj$zzaArray;
        zza = zzjl2 = new zzjl("STORAGE", 0, object);
        zzjj$zzaArray = new zzjj$zza[n4];
        zzjj$zzaArray[0] = zzjj$zza = zzjj$zza.zzc;
        zzb = object = new zzjl("DMA", n4, zzjj$zzaArray);
        zzjl[] zzjlArray = new zzjl[n3];
        zzjlArray[0] = zzjl2;
        zzjlArray[n4] = object;
        zzc = zzjlArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzjl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzd = var3_2;
    }

    public static zzjl[] values() {
        return (zzjl[])zzc.clone();
    }

    public static /* bridge */ /* synthetic */ zzjj$zza[] zza(zzjl zzjl2) {
        return zzjl2.zzd;
    }

    public final zzjj$zza[] zza() {
        return this.zzd;
    }
}

