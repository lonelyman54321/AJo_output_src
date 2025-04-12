/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzdxz
extends Enum {
    public static final /* enum */ zzdxz zza;
    public static final /* enum */ zzdxz zzb;
    public static final /* enum */ zzdxz zzc;
    public static final /* enum */ zzdxz zzd;
    private static final /* synthetic */ zzdxz[] zze;

    static {
        zzdxz zzdxz2;
        zzdxz zzdxz3;
        zzdxz zzdxz4;
        zzdxz zzdxz5;
        zza = zzdxz5 = new zzdxz("UNKNOWN", 0);
        int n3 = 1;
        zzb = zzdxz4 = new zzdxz("API", n3);
        int n4 = 2;
        zzc = zzdxz3 = new zzdxz("GESTURE", n4);
        int n7 = 3;
        zzd = zzdxz2 = new zzdxz("DEBUG_MENU", n7);
        zzdxz[] zzdxzArray = new zzdxz[4];
        zzdxzArray[0] = zzdxz5;
        zzdxzArray[n3] = zzdxz4;
        zzdxzArray[n4] = zzdxz3;
        zzdxzArray[n7] = zzdxz2;
        zze = zzdxzArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzdxz() {
        void var2_-1;
        void var1_-1;
    }

    public static zzdxz[] values() {
        return (zzdxz[])zze.clone();
    }
}

