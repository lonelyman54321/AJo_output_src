/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzhbn
extends Enum {
    public static final /* enum */ zzhbn zza;
    public static final /* enum */ zzhbn zzb;
    public static final /* enum */ zzhbn zzc;
    public static final /* enum */ zzhbn zzd;
    public static final /* enum */ zzhbn zze;
    public static final /* enum */ zzhbn zzf;
    public static final /* enum */ zzhbn zzg;
    private static final /* synthetic */ zzhbn[] zzh;

    static {
        zzhbn zzhbn2;
        zzhbn zzhbn3;
        zzhbn zzhbn4;
        zzhbn zzhbn5;
        zzhbn zzhbn6;
        zzhbn zzhbn7;
        zzhbn zzhbn8;
        zza = zzhbn8 = new zzhbn("GET_MEMOIZED_IS_INITIALIZED", 0);
        int n3 = 1;
        zzb = zzhbn7 = new zzhbn("SET_MEMOIZED_IS_INITIALIZED", n3);
        int n4 = 2;
        zzc = zzhbn6 = new zzhbn("BUILD_MESSAGE_INFO", n4);
        int n7 = 3;
        zzd = zzhbn5 = new zzhbn("NEW_MUTABLE_INSTANCE", n7);
        int n8 = 4;
        zze = zzhbn4 = new zzhbn("NEW_BUILDER", n8);
        int n10 = 5;
        zzf = zzhbn3 = new zzhbn("GET_DEFAULT_INSTANCE", n10);
        int n14 = 6;
        zzg = zzhbn2 = new zzhbn("GET_PARSER", n14);
        zzhbn[] zzhbnArray = new zzhbn[7];
        zzhbnArray[0] = zzhbn8;
        zzhbnArray[n3] = zzhbn7;
        zzhbnArray[n4] = zzhbn6;
        zzhbnArray[n7] = zzhbn5;
        zzhbnArray[n8] = zzhbn4;
        zzhbnArray[n10] = zzhbn3;
        zzhbnArray[n14] = zzhbn2;
        zzh = zzhbnArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhbn() {
        void var2_-1;
        void var1_-1;
    }

    public static zzhbn[] values() {
        return (zzhbn[])zzh.clone();
    }
}

