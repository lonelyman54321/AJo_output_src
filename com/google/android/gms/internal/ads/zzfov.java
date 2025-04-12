/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfov
extends Enum {
    public static final /* enum */ zzfov zza;
    public static final /* enum */ zzfov zzb;
    public static final /* enum */ zzfov zzc;
    private static final /* synthetic */ zzfov[] zzd;
    private final String zze;

    static {
        zzfov zzfov2;
        zzfov zzfov3;
        zzfov zzfov4;
        zza = zzfov4 = new zzfov("NATIVE", 0, "native");
        int n3 = 1;
        zzb = zzfov3 = new zzfov("JAVASCRIPT", n3, "javascript");
        int n4 = 2;
        zzc = zzfov2 = new zzfov("NONE", n4, "none");
        zzfov[] zzfovArray = new zzfov[3];
        zzfovArray[0] = zzfov4;
        zzfovArray[n3] = zzfov3;
        zzfovArray[n4] = zzfov2;
        zzd = zzfovArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfov() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfov[] values() {
        return (zzfov[])zzd.clone();
    }

    public final String toString() {
        return this.zze;
    }
}

