/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzdul
extends Enum {
    public static final /* enum */ zzdul zza;
    public static final /* enum */ zzdul zzb;
    public static final /* enum */ zzdul zzc;
    public static final /* enum */ zzdul zzd;
    public static final /* enum */ zzdul zze;
    public static final /* enum */ zzdul zzf;
    public static final /* enum */ zzdul zzg;
    public static final /* enum */ zzdul zzh;
    public static final /* enum */ zzdul zzi;
    public static final /* enum */ zzdul zzj;
    public static final /* enum */ zzdul zzk;
    public static final /* enum */ zzdul zzl;
    public static final /* enum */ zzdul zzm;
    public static final /* enum */ zzdul zzn;
    private static final /* synthetic */ zzdul[] zzo;
    private final String zzp;

    static {
        zzdul zzdul2;
        zzdul zzdul3;
        zzdul zzdul4;
        zzdul zzdul5;
        zzdul zzdul6;
        zzdul zzdul7;
        zzdul zzdul8;
        zzdul zzdul9;
        zzdul zzdul10;
        zzdul zzdul11;
        zzdul zzdul12;
        zzdul zzdul13;
        zzdul zzdul14;
        zza = zzdul14 = new zzdul("PUBLIC_API_CALL", 0, "api-call");
        zzb = zzdul13 = new zzdul("DYNAMITE_ENTER", 1, "dynamite-enter");
        zzc = zzdul12 = new zzdul("CLIENT_SIGNALS_START", 2, "client-signals-start");
        zzd = zzdul11 = new zzdul("CLIENT_SIGNALS_END", 3, "client-signals-end");
        zze = zzdul10 = new zzdul("SERVICE_CONNECTED", 4, "service-connected");
        zzf = zzdul9 = new zzdul("GMS_SIGNALS_START", 5, "gms-signals-start");
        zzg = zzdul8 = new zzdul("GMS_SIGNALS_END", 6, "gms-signals-end");
        zzh = zzdul7 = new zzdul("GET_SIGNALS_SDKCORE_START", 7, "get-signals-sdkcore-start");
        zzi = zzdul6 = new zzdul("GET_SIGNALS_SDKCORE_END", 8, "get-signals-sdkcore-end");
        zzj = zzdul5 = new zzdul("GET_AD_DICTIONARY_SDKCORE_START", 9, "get-ad-dictionary-sdkcore-start");
        zzk = zzdul4 = new zzdul("GET_AD_DICTIONARY_SDKCORE_END", 10, "get-ad-dictionary-sdkcore-end");
        zzl = zzdul3 = new zzdul("HTTP_RESPONSE_READY", 11, "http-response-ready");
        zzdul[] zzdulArray = new zzdul("SERVER_RESPONSE_PARSE_START", 12, "server-response-parse-start");
        zzm = zzdulArray;
        int n3 = 13;
        zzdul[] zzdulArray2 = zzdulArray;
        zzn = zzdul2 = new zzdul("PUBLIC_API_CALLBACK", n3, "public-api-callback");
        zzdulArray = new zzdul[14];
        zzdulArray[0] = zzdul14;
        zzdulArray[1] = zzdul13;
        zzdulArray[2] = zzdul12;
        zzdulArray[3] = zzdul11;
        zzdulArray[4] = zzdul10;
        zzdulArray[5] = zzdul9;
        zzdulArray[6] = zzdul8;
        zzdulArray[7] = zzdul7;
        zzdulArray[8] = zzdul6;
        zzdulArray[9] = zzdul5;
        zzdulArray[10] = zzdul4;
        zzdulArray[11] = zzdul3;
        zzdulArray[12] = zzdulArray2;
        zzdulArray[n3] = zzdul2;
        zzo = zzdulArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzdul() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzp = var3_2;
    }

    public static zzdul[] values() {
        return (zzdul[])zzo.clone();
    }

    public final String zza() {
        return this.zzp;
    }
}

