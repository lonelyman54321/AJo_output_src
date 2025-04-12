/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzehc
extends Enum {
    public static final /* enum */ zzehc zza;
    public static final /* enum */ zzehc zzb;
    public static final /* enum */ zzehc zzc;
    private static final /* synthetic */ zzehc[] zzd;
    private final String zze;

    static {
        zzehc zzehc2;
        zzehc zzehc3;
        zzehc zzehc4;
        zza = zzehc4 = new zzehc("HTML_DISPLAY", 0, "htmlDisplay");
        int n3 = 1;
        zzb = zzehc3 = new zzehc("NATIVE_DISPLAY", n3, "nativeDisplay");
        int n4 = 2;
        zzc = zzehc2 = new zzehc("VIDEO", n4, "video");
        zzehc[] zzehcArray = new zzehc[3];
        zzehcArray[0] = zzehc4;
        zzehcArray[n3] = zzehc3;
        zzehcArray[n4] = zzehc2;
        zzd = zzehcArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzehc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzehc[] values() {
        return (zzehc[])zzd.clone();
    }

    public final String toString() {
        return this.zze;
    }
}

