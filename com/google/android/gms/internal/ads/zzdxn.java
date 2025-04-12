/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzdxn
extends Enum {
    public static final /* enum */ zzdxn zza;
    public static final /* enum */ zzdxn zzb;
    public static final /* enum */ zzdxn zzc;
    private static final /* synthetic */ zzdxn[] zzd;

    static {
        zzdxn zzdxn2;
        zzdxn zzdxn3;
        zzdxn zzdxn4;
        zza = zzdxn4 = new zzdxn("AD_REQUESTED", 0);
        int n3 = 1;
        zzb = zzdxn3 = new zzdxn("AD_LOADED", n3);
        int n4 = 2;
        zzc = zzdxn2 = new zzdxn("AD_LOAD_FAILED", n4);
        zzdxn[] zzdxnArray = new zzdxn[3];
        zzdxnArray[0] = zzdxn4;
        zzdxnArray[n3] = zzdxn3;
        zzdxnArray[n4] = zzdxn2;
        zzd = zzdxnArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzdxn() {
        void var2_-1;
        void var1_-1;
    }

    public static zzdxn[] values() {
        return (zzdxn[])zzd.clone();
    }
}

