/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfjg
extends Enum {
    public static final /* enum */ zzfjg zza;
    public static final /* enum */ zzfjg zzb;
    public static final /* enum */ zzfjg zzc;
    private static final /* synthetic */ zzfjg[] zzd;

    static {
        zzfjg zzfjg2;
        zzfjg zzfjg3;
        zzfjg zzfjg4;
        zza = zzfjg4 = new zzfjg("Rewarded", 0);
        int n3 = 1;
        zzb = zzfjg3 = new zzfjg("Interstitial", n3);
        int n4 = 2;
        zzc = zzfjg2 = new zzfjg("AppOpen", n4);
        zzfjg[] zzfjgArray = new zzfjg[3];
        zzfjgArray[0] = zzfjg4;
        zzfjgArray[n3] = zzfjg3;
        zzfjgArray[n4] = zzfjg2;
        zzd = zzfjgArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfjg() {
        void var2_-1;
        void var1_-1;
    }

    public static zzfjg[] values() {
        return (zzfjg[])zzd.clone();
    }
}

