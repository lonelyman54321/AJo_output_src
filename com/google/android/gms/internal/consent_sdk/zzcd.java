/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

public final class zzcd
extends Enum {
    public static final /* enum */ zzcd zza;
    public static final /* enum */ zzcd zzb;
    public static final /* enum */ zzcd zzc;
    public static final /* enum */ zzcd zzd;
    public static final /* enum */ zzcd zze;
    private static final /* synthetic */ zzcd[] zzf;

    static {
        zzcd zzcd2;
        zzcd zzcd3;
        zzcd zzcd4;
        zzcd zzcd5;
        zzcd zzcd6;
        zza = zzcd6 = new zzcd("DEBUG_PARAM_UNKNOWN", 0);
        int n3 = 1;
        zzb = zzcd5 = new zzcd("ALWAYS_SHOW", n3);
        int n4 = 2;
        zzc = zzcd4 = new zzcd("GEO_OVERRIDE_EEA", n4);
        int n7 = 3;
        zzd = zzcd3 = new zzcd("GEO_OVERRIDE_NON_EEA", n7);
        int n8 = 4;
        zze = zzcd2 = new zzcd("PREVIEWING_DEBUG_MESSAGES", n8);
        zzcd[] zzcdArray = new zzcd[5];
        zzcdArray[0] = zzcd6;
        zzcdArray[n3] = zzcd5;
        zzcdArray[n4] = zzcd4;
        zzcdArray[n7] = zzcd3;
        zzcdArray[n8] = zzcd2;
        zzf = zzcdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzcd() {
        void var2_-1;
        void var1_-1;
    }

    public static zzcd[] values() {
        return (zzcd[])zzf.clone();
    }
}

