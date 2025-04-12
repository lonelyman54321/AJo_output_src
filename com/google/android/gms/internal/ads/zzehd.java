/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzehd
extends Enum {
    public static final /* enum */ zzehd zza;
    public static final /* enum */ zzehd zzb;
    public static final /* enum */ zzehd zzc;
    public static final /* enum */ zzehd zzd;
    private static final /* synthetic */ zzehd[] zze;
    private final String zzf;

    static {
        zzehd zzehd2;
        zzehd zzehd3;
        zzehd zzehd4;
        zzehd zzehd5;
        zza = zzehd5 = new zzehd("BEGIN_TO_RENDER", 0, "beginToRender");
        int n3 = 1;
        zzb = zzehd4 = new zzehd("DEFINED_BY_JAVASCRIPT", n3, "definedByJavascript");
        int n4 = 2;
        zzc = zzehd3 = new zzehd("ONE_PIXEL", n4, "onePixel");
        int n7 = 3;
        zzd = zzehd2 = new zzehd("UNSPECIFIED", n7, "unspecified");
        zzehd[] zzehdArray = new zzehd[4];
        zzehdArray[0] = zzehd5;
        zzehdArray[n3] = zzehd4;
        zzehdArray[n4] = zzehd3;
        zzehdArray[n7] = zzehd2;
        zze = zzehdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzehd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzehd[] values() {
        return (zzehd[])zze.clone();
    }

    public final String toString() {
        return this.zzf;
    }
}

