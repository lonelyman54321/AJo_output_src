/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfom
extends Enum {
    public static final /* enum */ zzfom zza;
    public static final /* enum */ zzfom zzb;
    public static final /* enum */ zzfom zzc;
    private static final /* synthetic */ zzfom[] zzd;
    private final String zze;

    static {
        zzfom zzfom2;
        zzfom zzfom3;
        zzfom zzfom4;
        zza = zzfom4 = new zzfom("HTML", 0, "html");
        int n3 = 1;
        zzb = zzfom3 = new zzfom("NATIVE", n3, "native");
        int n4 = 2;
        zzc = zzfom2 = new zzfom("JAVASCRIPT", n4, "javascript");
        zzfom[] zzfomArray = new zzfom[3];
        zzfomArray[0] = zzfom4;
        zzfomArray[n3] = zzfom3;
        zzfomArray[n4] = zzfom2;
        zzd = zzfomArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfom() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfom[] values() {
        return (zzfom[])zzd.clone();
    }

    public final String toString() {
        return this.zze;
    }
}

