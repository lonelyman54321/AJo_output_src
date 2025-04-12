/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzbdo
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdo zzA;
    public static final /* enum */ zzbdo zzB;
    public static final /* enum */ zzbdo zzC;
    public static final /* enum */ zzbdo zzD;
    public static final /* enum */ zzbdo zzE;
    public static final /* enum */ zzbdo zzF;
    public static final /* enum */ zzbdo zzG;
    public static final /* enum */ zzbdo zzH;
    public static final /* enum */ zzbdo zzI;
    public static final /* enum */ zzbdo zzJ;
    public static final /* enum */ zzbdo zzK;
    public static final /* enum */ zzbdo zzL;
    public static final /* enum */ zzbdo zzM;
    public static final /* enum */ zzbdo zzN;
    public static final /* enum */ zzbdo zzO;
    public static final /* enum */ zzbdo zzP;
    public static final /* enum */ zzbdo zzQ;
    public static final /* enum */ zzbdo zzR;
    public static final /* enum */ zzbdo zzS;
    public static final /* enum */ zzbdo zzT;
    public static final /* enum */ zzbdo zzU;
    public static final /* enum */ zzbdo zzV;
    private static final zzhbt zzW;
    private static final /* synthetic */ zzbdo[] zzX;
    public static final /* enum */ zzbdo zza;
    public static final /* enum */ zzbdo zzb;
    public static final /* enum */ zzbdo zzc;
    public static final /* enum */ zzbdo zzd;
    public static final /* enum */ zzbdo zze;
    public static final /* enum */ zzbdo zzf;
    public static final /* enum */ zzbdo zzg;
    public static final /* enum */ zzbdo zzh;
    public static final /* enum */ zzbdo zzi;
    public static final /* enum */ zzbdo zzj;
    public static final /* enum */ zzbdo zzk;
    public static final /* enum */ zzbdo zzl;
    public static final /* enum */ zzbdo zzm;
    public static final /* enum */ zzbdo zzn;
    public static final /* enum */ zzbdo zzo;
    public static final /* enum */ zzbdo zzp;
    public static final /* enum */ zzbdo zzq;
    public static final /* enum */ zzbdo zzr;
    public static final /* enum */ zzbdo zzs;
    public static final /* enum */ zzbdo zzt;
    public static final /* enum */ zzbdo zzu;
    public static final /* enum */ zzbdo zzv;
    public static final /* enum */ zzbdo zzw;
    public static final /* enum */ zzbdo zzx;
    public static final /* enum */ zzbdo zzy;
    public static final /* enum */ zzbdo zzz;
    private final int zzY;

    static {
        zzbdo zzbdo2;
        zzbdo zzbdo3;
        zzbdo zzbdo4;
        zzbdo zzbdo5;
        zzbdo zzbdo6;
        zzbdo zzbdo7;
        zzbdo zzbdo8;
        zzbdo zzbdo9;
        zzbdo zzbdo10;
        zzbdo zzbdo11;
        zzbdo zzbdo12;
        zzbdo zzbdo13;
        Object object = new zzbdo("UNKNOWN_EVENT_TYPE", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzbdo13 = new zzbdo("AD_REQUEST", n3, n3);
        int n4 = 2;
        zzc = zzbdo12 = new zzbdo("AD_LOADED", n4, n4);
        int n7 = 5;
        zzd = zzbdo11 = new zzbdo("AD_IMPRESSION", 3, n7);
        int n8 = 6;
        zze = zzbdo10 = new zzbdo("AD_FIRST_CLICK", 4, n8);
        int n10 = 7;
        zzf = zzbdo9 = new zzbdo("AD_SUBSEQUENT_CLICK", n7, n10);
        n7 = 8;
        zzg = zzbdo8 = new zzbdo("REQUEST_WILL_START", n8, n7);
        n4 = 9;
        zzh = zzbdo7 = new zzbdo("REQUEST_DID_END", n10, n4);
        n3 = 10;
        zzi = zzbdo6 = new zzbdo("REQUEST_WILL_UPDATE_SIGNALS", n7, n3);
        int n14 = 11;
        zzj = zzbdo5 = new zzbdo("REQUEST_DID_UPDATE_SIGNALS", n4, n14);
        int n15 = 12;
        zzk = zzbdo4 = new zzbdo("REQUEST_WILL_BUILD_URL", n3, n15);
        zzl = zzbdo3 = new zzbdo("REQUEST_DID_BUILD_URL", n14, 13);
        zzbdo[] zzbdoArray = new zzbdo("REQUEST_WILL_MAKE_NETWORK_REQUEST", n15, 14);
        zzm = zzbdoArray;
        zzbdo[] zzbdoArray2 = zzbdoArray;
        zzn = zzbdo2 = new zzbdo("REQUEST_DID_RECEIVE_NETWORK_RESPONSE", 13, 15);
        zzbdo zzbdo14 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_WILL_PROCESS_RESPONSE", 14, 16);
        zzo = zzbdoArray;
        zzbdo[] zzbdoArray3 = zzbdoArray;
        zzp = zzbdo2 = new zzbdo("REQUEST_DID_PROCESS_RESPONSE", 15, 17);
        zzbdo zzbdo15 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_WILL_RENDER", 16, 18);
        zzq = zzbdoArray;
        zzbdo[] zzbdoArray4 = zzbdoArray;
        zzr = zzbdo2 = new zzbdo("REQUEST_DID_RENDER", 17, 19);
        zzbdo zzbdo16 = zzbdo2;
        zzbdoArray = new zzbdo("AD_FAILED_TO_LOAD", 18, 3);
        zzs = zzbdoArray;
        zzbdo[] zzbdoArray5 = zzbdoArray;
        zzt = zzbdo2 = new zzbdo("AD_FAILED_TO_LOAD_NO_FILL", 19, 4);
        zzbdo zzbdo17 = zzbdo2;
        zzbdoArray = new zzbdo("AD_FAILED_TO_LOAD_INVALID_REQUEST", 20, 100);
        zzu = zzbdoArray;
        zzbdo[] zzbdoArray6 = zzbdoArray;
        zzv = zzbdo2 = new zzbdo("AD_FAILED_TO_LOAD_NETWORK_ERROR", 21, 101);
        zzbdo zzbdo18 = zzbdo2;
        zzbdoArray = new zzbdo("AD_FAILED_TO_LOAD_TIMEOUT", 22, 102);
        zzw = zzbdoArray;
        zzbdo[] zzbdoArray7 = zzbdoArray;
        zzx = zzbdo2 = new zzbdo("AD_FAILED_TO_LOAD_CANCELLED", 23, 103);
        zzbdo zzbdo19 = zzbdo2;
        zzbdoArray = new zzbdo("AD_FAILED_TO_LOAD_NO_ERROR", 24, 104);
        zzy = zzbdoArray;
        zzbdo[] zzbdoArray8 = zzbdoArray;
        zzz = zzbdo2 = new zzbdo("AD_FAILED_TO_LOAD_NOT_FOUND", 25, 105);
        zzbdo zzbdo20 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_WILL_UPDATE_GMS_SIGNALS", 26, 1000);
        zzA = zzbdoArray;
        zzbdo[] zzbdoArray9 = zzbdoArray;
        zzB = zzbdo2 = new zzbdo("REQUEST_DID_UPDATE_GMS_SIGNALS", 27, 1001);
        zzbdo zzbdo21 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS", 28, 1002);
        zzC = zzbdoArray;
        zzbdo[] zzbdoArray10 = zzbdoArray;
        zzD = zzbdo2 = new zzbdo("REQUEST_FAILED_TO_BUILD_URL", 29, 1003);
        zzbdo zzbdo22 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST", 30, 1004);
        zzE = zzbdoArray;
        zzbdo[] zzbdoArray11 = zzbdoArray;
        zzF = zzbdo2 = new zzbdo("REQUEST_FAILED_TO_PROCESS_RESPONSE", 31, 1005);
        zzbdo zzbdo23 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_FAILED_TO_UPDATE_SIGNALS", 32, 1006);
        zzG = zzbdoArray;
        zzbdo[] zzbdoArray12 = zzbdoArray;
        zzH = zzbdo2 = new zzbdo("REQUEST_FAILED_TO_RENDER", 33, 1007);
        zzbdo zzbdo24 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_IS_PREFETCH", 34, 1100);
        zzI = zzbdoArray;
        zzbdo[] zzbdoArray13 = zzbdoArray;
        zzJ = zzbdo2 = new zzbdo("REQUEST_SAVED_TO_CACHE", 35, 1101);
        zzbdo zzbdo25 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_LOADED_FROM_CACHE", 36, 1102);
        zzK = zzbdoArray;
        zzbdo[] zzbdoArray14 = zzbdoArray;
        zzL = zzbdo2 = new zzbdo("REQUEST_PREFETCH_INTERCEPTED", 37, 1103);
        zzbdo zzbdo26 = zzbdo2;
        zzbdoArray = new zzbdo("REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED", 38, 1104);
        zzM = zzbdoArray;
        zzbdo[] zzbdoArray15 = zzbdoArray;
        zzN = zzbdo2 = new zzbdo("REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED", 39, 1105);
        zzbdo zzbdo27 = zzbdo2;
        zzbdoArray = new zzbdo("NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED", 40, 1106);
        zzO = zzbdoArray;
        zzbdo[] zzbdoArray16 = zzbdoArray;
        zzP = zzbdo2 = new zzbdo("NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED", 41, 1107);
        zzbdo zzbdo28 = zzbdo2;
        zzbdoArray = new zzbdo("REQUEST_FAILED_TO_LOAD_FROM_CACHE", 42, 1108);
        zzQ = zzbdoArray;
        zzbdo[] zzbdoArray17 = zzbdoArray;
        zzR = zzbdo2 = new zzbdo("BANNER_SIZE_INVALID", 43, 10000);
        zzbdo zzbdo29 = zzbdo2;
        zzbdoArray = new zzbdo("BANNER_SIZE_VALID", 44, 10001);
        zzS = zzbdoArray;
        zzbdo[] zzbdoArray18 = zzbdoArray;
        zzT = zzbdo2 = new zzbdo("ANDROID_WEBVIEW_CRASH", 45, 10002);
        zzbdo zzbdo30 = zzbdo2;
        zzbdoArray = new zzbdo("OFFLINE_UPLOAD", 46, 10003);
        zzU = zzbdoArray;
        zzbdo[] zzbdoArray19 = zzbdoArray;
        zzV = zzbdo2 = new zzbdo("DELAY_PAGE_LOAD_CANCELLED_AD", 47, 10004);
        zzbdoArray = new zzbdo[]{object, zzbdo13, zzbdo12, zzbdo11, zzbdo10, zzbdo9, zzbdo8, zzbdo7, zzbdo6, zzbdo5, zzbdo4, zzbdo3, zzbdoArray2, zzbdo14, zzbdoArray3, zzbdo15, zzbdoArray4, zzbdo16, zzbdoArray5, zzbdo17, zzbdoArray6, zzbdo18, zzbdoArray7, zzbdo19, zzbdoArray8, zzbdo20, zzbdoArray9, zzbdo21, zzbdoArray10, zzbdo22, zzbdoArray11, zzbdo23, zzbdoArray12, zzbdo24, zzbdoArray13, zzbdo25, zzbdoArray14, zzbdo26, zzbdoArray15, zzbdo27, zzbdoArray16, zzbdo28, zzbdoArray17, zzbdo29, zzbdoArray18, zzbdo30, zzbdoArray19, zzbdo2};
        zzX = zzbdoArray;
        zzW = object = new zzbdn();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdo() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzY = var3_2;
    }

    public static zzbdo[] values() {
        return (zzbdo[])zzX.clone();
    }

    public final String toString() {
        return Integer.toString(this.zzY);
    }

    public final int zza() {
        return this.zzY;
    }
}

