/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzdxw
extends Enum {
    public static final /* enum */ zzdxw zza;
    public static final /* enum */ zzdxw zzb;
    public static final /* enum */ zzdxw zzc;
    private static final /* synthetic */ zzdxw[] zzd;

    static {
        zzdxw zzdxw2;
        zzdxw zzdxw3;
        zzdxw zzdxw4;
        zza = zzdxw4 = new zzdxw("NONE", 0);
        int n3 = 1;
        zzb = zzdxw3 = new zzdxw("SHAKE", n3);
        int n4 = 2;
        zzc = zzdxw2 = new zzdxw("FLICK", n4);
        zzdxw[] zzdxwArray = new zzdxw[3];
        zzdxwArray[0] = zzdxw4;
        zzdxwArray[n3] = zzdxw3;
        zzdxwArray[n4] = zzdxw2;
        zzd = zzdxwArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzdxw() {
        void var2_-1;
        void var1_-1;
    }

    public static zzdxw[] values() {
        return (zzdxw[])zzd.clone();
    }
}

