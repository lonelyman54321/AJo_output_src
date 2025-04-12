/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

public final class zzmb
extends Enum {
    public static final /* enum */ zzmb zza;
    public static final /* enum */ zzmb zzb;
    public static final /* enum */ zzmb zzc;
    private static final /* synthetic */ zzmb[] zzd;

    static {
        zzmb zzmb2;
        zzmb zzmb3;
        zzmb zzmb4;
        zza = zzmb4 = new zzmb("PROTO2", 0);
        int n3 = 1;
        zzb = zzmb3 = new zzmb("PROTO3", n3);
        int n4 = 2;
        zzc = zzmb2 = new zzmb("EDITIONS", n4);
        zzmb[] zzmbArray = new zzmb[3];
        zzmbArray[0] = zzmb4;
        zzmbArray[n3] = zzmb3;
        zzmbArray[n4] = zzmb2;
        zzd = zzmbArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzmb() {
        void var2_-1;
        void var1_-1;
    }

    public static zzmb[] values() {
        return (zzmb[])zzd.clone();
    }
}

