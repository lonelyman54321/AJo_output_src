/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfoq
extends Enum {
    public static final /* enum */ zzfoq zza;
    public static final /* enum */ zzfoq zzb;
    public static final /* enum */ zzfoq zzc;
    public static final /* enum */ zzfoq zzd;
    private static final /* synthetic */ zzfoq[] zze;

    static {
        zzfoq zzfoq2;
        zzfoq zzfoq3;
        zzfoq zzfoq4;
        zzfoq zzfoq5;
        zza = zzfoq5 = new zzfoq("VIDEO_CONTROLS", 0);
        int n3 = 1;
        zzb = zzfoq4 = new zzfoq("CLOSE_AD", n3);
        int n4 = 2;
        zzc = zzfoq3 = new zzfoq("NOT_VISIBLE", n4);
        int n7 = 3;
        zzd = zzfoq2 = new zzfoq("OTHER", n7);
        zzfoq[] zzfoqArray = new zzfoq[4];
        zzfoqArray[0] = zzfoq5;
        zzfoqArray[n3] = zzfoq4;
        zzfoqArray[n4] = zzfoq3;
        zzfoqArray[n7] = zzfoq2;
        zze = zzfoqArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfoq() {
        void var2_-1;
        void var1_-1;
    }

    public static zzfoq[] values() {
        return (zzfoq[])zze.clone();
    }
}

