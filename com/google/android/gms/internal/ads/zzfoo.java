/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfoo
extends Enum {
    public static final /* enum */ zzfoo zza;
    public static final /* enum */ zzfoo zzb;
    public static final /* enum */ zzfoo zzc;
    public static final /* enum */ zzfoo zzd;
    public static final /* enum */ zzfoo zze;
    private static final /* synthetic */ zzfoo[] zzf;
    private final String zzg;

    static {
        zzfoo zzfoo2;
        zzfoo zzfoo3;
        zzfoo zzfoo4;
        zzfoo zzfoo5;
        zzfoo zzfoo6;
        zza = zzfoo6 = new zzfoo("DEFINED_BY_JAVASCRIPT", 0, "definedByJavaScript");
        int n3 = 1;
        zzb = zzfoo5 = new zzfoo("HTML_DISPLAY", n3, "htmlDisplay");
        int n4 = 2;
        zzc = zzfoo4 = new zzfoo("NATIVE_DISPLAY", n4, "nativeDisplay");
        int n7 = 3;
        zzd = zzfoo3 = new zzfoo("VIDEO", n7, "video");
        int n8 = 4;
        zze = zzfoo2 = new zzfoo("AUDIO", n8, "audio");
        zzfoo[] zzfooArray = new zzfoo[5];
        zzfooArray[0] = zzfoo6;
        zzfooArray[n3] = zzfoo5;
        zzfooArray[n4] = zzfoo4;
        zzfooArray[n7] = zzfoo3;
        zzfooArray[n8] = zzfoo2;
        zzf = zzfooArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfoo() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzfoo[] values() {
        return (zzfoo[])zzf.clone();
    }

    public final String toString() {
        return this.zzg;
    }
}

