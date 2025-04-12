/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

public final class zzjj$zza
extends Enum {
    public static final /* enum */ zzjj$zza zza;
    public static final /* enum */ zzjj$zza zzb;
    public static final /* enum */ zzjj$zza zzc;
    public static final /* enum */ zzjj$zza zzd;
    private static final /* synthetic */ zzjj$zza[] zzf;
    public final String zze;

    static {
        zzjj$zza zzjj$zza;
        zzjj$zza zzjj$zza2;
        zzjj$zza zzjj$zza3;
        zzjj$zza zzjj$zza4;
        zza = zzjj$zza4 = new zzjj$zza("AD_STORAGE", 0, "ad_storage");
        int n3 = 1;
        zzb = zzjj$zza3 = new zzjj$zza("ANALYTICS_STORAGE", n3, "analytics_storage");
        int n4 = 2;
        zzc = zzjj$zza2 = new zzjj$zza("AD_USER_DATA", n4, "ad_user_data");
        int n7 = 3;
        zzd = zzjj$zza = new zzjj$zza("AD_PERSONALIZATION", n7, "ad_personalization");
        zzjj$zza[] zzjj$zzaArray = new zzjj$zza[4];
        zzjj$zzaArray[0] = zzjj$zza4;
        zzjj$zzaArray[n3] = zzjj$zza3;
        zzjj$zzaArray[n4] = zzjj$zza2;
        zzjj$zzaArray[n7] = zzjj$zza;
        zzf = zzjj$zzaArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzjj$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzjj$zza[] values() {
        return (zzjj$zza[])zzf.clone();
    }
}

