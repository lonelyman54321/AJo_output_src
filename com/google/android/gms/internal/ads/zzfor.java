/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfor
extends Enum {
    public static final /* enum */ zzfor zza;
    public static final /* enum */ zzfor zzb;
    public static final /* enum */ zzfor zzc;
    public static final /* enum */ zzfor zzd;
    public static final /* enum */ zzfor zze;
    public static final /* enum */ zzfor zzf;
    public static final /* enum */ zzfor zzg;
    public static final /* enum */ zzfor zzh;
    private static final /* synthetic */ zzfor[] zzi;
    private final String zzj;

    static {
        zzfor zzfor2;
        zzfor zzfor3;
        zzfor zzfor4;
        zzfor zzfor5;
        zzfor zzfor6;
        zzfor zzfor7;
        zzfor zzfor8;
        zzfor zzfor9;
        zza = zzfor9 = new zzfor("DEFINED_BY_JAVASCRIPT", 0, "definedByJavaScript");
        int n3 = 1;
        zzb = zzfor8 = new zzfor("UNSPECIFIED", n3, "unspecified");
        int n4 = 2;
        zzc = zzfor7 = new zzfor("LOADED", n4, "loaded");
        int n7 = 3;
        zzd = zzfor6 = new zzfor("BEGIN_TO_RENDER", n7, "beginToRender");
        int n8 = 4;
        zze = zzfor5 = new zzfor("ONE_PIXEL", n8, "onePixel");
        zzf = zzfor4 = new zzfor("VIEWABLE", 5, "viewable");
        zzg = zzfor3 = new zzfor("AUDIBLE", 6, "audible");
        int n10 = 7;
        zzh = zzfor2 = new zzfor("OTHER", n10, "other");
        zzfor[] zzforArray = new zzfor[8];
        zzforArray[0] = zzfor9;
        zzforArray[n3] = zzfor8;
        zzforArray[n4] = zzfor7;
        zzforArray[n7] = zzfor6;
        zzforArray[n8] = zzfor5;
        zzforArray[5] = zzfor4;
        zzforArray[6] = zzfor3;
        zzforArray[n10] = zzfor2;
        zzi = zzforArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfor() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzfor[] values() {
        return (zzfor[])zzi.clone();
    }

    public final String toString() {
        return this.zzj;
    }
}

