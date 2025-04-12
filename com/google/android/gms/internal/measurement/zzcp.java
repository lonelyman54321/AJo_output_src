/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

public final class zzcp
extends Enum {
    public static final /* enum */ zzcp zza;
    private static final /* enum */ zzcp zzb;
    private static final /* enum */ zzcp zzc;
    private static final /* synthetic */ zzcp[] zzd;

    static {
        zzcp zzcp2;
        zzcp zzcp3;
        zzcp zzcp4;
        zza = zzcp4 = new zzcp("READ_AND_WRITE", 0);
        int n3 = 1;
        zzb = zzcp3 = new zzcp("READ_ONLY", n3);
        int n4 = 2;
        zzc = zzcp2 = new zzcp("WRITE_ONLY", n4);
        zzcp[] zzcpArray = new zzcp[3];
        zzcpArray[0] = zzcp4;
        zzcpArray[n3] = zzcp3;
        zzcpArray[n4] = zzcp2;
        zzd = zzcpArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzcp() {
        void var2_-1;
        void var1_-1;
    }

    public static zzcp[] values() {
        return (zzcp[])zzd.clone();
    }
}

