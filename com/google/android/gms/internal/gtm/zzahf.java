/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzahe;

public final class zzahf
extends Enum
implements zzach {
    public static final /* enum */ zzahf zzA;
    public static final /* enum */ zzahf zzB;
    public static final /* enum */ zzahf zzC;
    public static final /* enum */ zzahf zzD;
    public static final /* enum */ zzahf zzE;
    public static final /* enum */ zzahf zzF;
    public static final /* enum */ zzahf zzG;
    public static final /* enum */ zzahf zzH;
    public static final /* enum */ zzahf zzI;
    public static final /* enum */ zzahf zzJ;
    public static final /* enum */ zzahf zzK;
    public static final /* enum */ zzahf zzL;
    public static final /* enum */ zzahf zzM;
    public static final /* enum */ zzahf zzN;
    public static final /* enum */ zzahf zzO;
    public static final /* enum */ zzahf zzP;
    public static final /* enum */ zzahf zzQ;
    public static final /* enum */ zzahf zzR;
    public static final /* enum */ zzahf zzS;
    private static final zzaci zzT;
    private static final /* synthetic */ zzahf[] zzU;
    public static final /* enum */ zzahf zza;
    public static final /* enum */ zzahf zzb;
    public static final /* enum */ zzahf zzc;
    public static final /* enum */ zzahf zzd;
    public static final /* enum */ zzahf zze;
    public static final /* enum */ zzahf zzf;
    public static final /* enum */ zzahf zzg;
    public static final /* enum */ zzahf zzh;
    public static final /* enum */ zzahf zzi;
    public static final /* enum */ zzahf zzj;
    public static final /* enum */ zzahf zzk;
    public static final /* enum */ zzahf zzl;
    public static final /* enum */ zzahf zzm;
    public static final /* enum */ zzahf zzn;
    public static final /* enum */ zzahf zzo;
    public static final /* enum */ zzahf zzp;
    public static final /* enum */ zzahf zzq;
    public static final /* enum */ zzahf zzr;
    public static final /* enum */ zzahf zzs;
    public static final /* enum */ zzahf zzt;
    public static final /* enum */ zzahf zzu;
    public static final /* enum */ zzahf zzv;
    public static final /* enum */ zzahf zzw;
    public static final /* enum */ zzahf zzx;
    public static final /* enum */ zzahf zzy;
    public static final /* enum */ zzahf zzz;
    private final int zzV;

    static {
        zzahf zzahf2;
        zzahf zzahf3;
        zzahf zzahf4;
        zzahf zzahf5;
        zzahf zzahf6;
        zzahf zzahf7;
        zzahf zzahf8;
        zzahf zzahf9;
        zzahf zzahf10;
        zzahf zzahf11;
        zzahf zzahf12;
        zzahf zzahf13;
        zzahf zzahf14;
        zzahf zzahf15;
        Object object = new zzahf("LOGSID_NONE", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzahf15 = new zzahf("LOGSID_IP_ADDRESS", n3, n3);
        int n4 = 2;
        zzc = zzahf14 = new zzahf("LOGSID_IP_ADDRESS_INTERNAL", n4, n4);
        int n7 = 3;
        zzd = zzahf13 = new zzahf("LOGSID_USER_AGENT", n7, n7);
        int n8 = 4;
        zze = zzahf12 = new zzahf("LOGSID_SENSITIVE_TIMESTAMP", n8, n8);
        int n10 = 5;
        zzf = zzahf11 = new zzahf("LOGSID_SENSITIVE_LOCATION", n10, n10);
        int n14 = 6;
        zzg = zzahf10 = new zzahf("LOGSID_APPROXIMATE_LOCATION", n14, 15);
        n8 = 7;
        zzh = zzahf9 = new zzahf("LOGSID_COARSE_LOCATION", n8, n14);
        n7 = 8;
        n4 = 9;
        zzi = zzahf8 = new zzahf("LOGSID_OTHER_LOCATION", n7, n4);
        zzj = zzahf7 = new zzahf("LOGSID_OTHER_VERSION_ID", n4, n8);
        n8 = 10;
        zzk = zzahf6 = new zzahf("LOGSID_REFERER", n8, n7);
        zzl = zzahf5 = new zzahf("LOGSID_THIRD_PARTY_PARAMETERS", 11, 16);
        zzm = zzahf4 = new zzahf("LOGSID_OTHER_PSEUDONYMOUS_ID", 12, n8);
        zzahf zzahf16 = zzahf4;
        zzn = zzahf3 = new zzahf("LOGSID_PREF", 13, 11);
        zzo = zzahf4 = new zzahf("LOGSID_ZWIEBACK", 14, 12);
        zzahf zzahf17 = zzahf4;
        zzp = zzahf2 = new zzahf("LOGSID_BISCOTTI", 15, 13);
        zzahf zzahf18 = zzahf2;
        zzahf[] zzahfArray = new zzahf("LOGSID_CUSTOM_SESSION_ID", 16, 14);
        zzq = zzahfArray;
        zzahf[] zzahfArray2 = zzahfArray;
        zzr = zzahf4 = new zzahf("LOGSID_OTHER_PERSONAL_ID", 17, 20);
        zzahf zzahf19 = zzahf4;
        zzs = zzahf2 = new zzahf("LOGSID_GAIA_ID", 18, 21);
        zzahfArray = new zzahf("LOGSID_EMAIL", 19, 22);
        zzt = zzahfArray;
        zzahf[] zzahfArray3 = zzahfArray;
        zzu = zzahf4 = new zzahf("LOGSID_USERNAME", 20, 23);
        zzahf zzahf20 = zzahf4;
        zzahfArray = new zzahf("LOGSID_PHONE_NUMBER", 21, 24);
        zzv = zzahfArray;
        zzahf[] zzahfArray4 = zzahfArray;
        zzw = zzahf4 = new zzahf("LOGSID_GAIA_ID_PUBLIC", 22, 207);
        zzahf zzahf21 = zzahf4;
        zzahfArray = new zzahf("LOGSID_OTHER_AUTHENTICATED_ID", 23, 30);
        zzx = zzahfArray;
        zzahf[] zzahfArray5 = zzahfArray;
        zzy = zzahf4 = new zzahf("LOGSID_OTHER_UNAUTHENTICATED_ID", 24, 31);
        zzahf zzahf22 = zzahf4;
        zzahfArray = new zzahf("LOGSID_PARTNER_OR_CUSTOMER_ID", 25, 32);
        zzz = zzahfArray;
        zzahf[] zzahfArray6 = zzahfArray;
        zzA = zzahf4 = new zzahf("LOGSID_PUBLISHER_ID", 26, 35);
        zzahf zzahf23 = zzahf4;
        zzahfArray = new zzahf("LOGSID_DASHER_ID", 27, 33);
        zzB = zzahfArray;
        zzahf[] zzahfArray7 = zzahfArray;
        zzC = zzahf4 = new zzahf("LOGSID_FOCUS_GROUP_ID", 28, 34);
        zzahf zzahf24 = zzahf4;
        zzahfArray = new zzahf("LOGSID_OTHER_MOBILE_DEVICE_ID", 29, 50);
        zzD = zzahfArray;
        zzahf[] zzahfArray8 = zzahfArray;
        zzE = zzahf4 = new zzahf("LOGSID_GSERVICES_ANDROID_ID", 30, 51);
        zzahf zzahf25 = zzahf4;
        zzahfArray = new zzahf("LOGSID_HARDWARE_ID", 31, 52);
        zzF = zzahfArray;
        zzahf[] zzahfArray9 = zzahfArray;
        zzG = zzahf4 = new zzahf("LOGSID_MSISDN_ID", 32, 53);
        zzahf zzahf26 = zzahf4;
        zzahfArray = new zzahf("LOGSID_BUILD_SERIAL_ID", 33, 54);
        zzH = zzahfArray;
        zzahf[] zzahfArray10 = zzahfArray;
        zzI = zzahf4 = new zzahf("LOGSID_UDID_ID", 34, 55);
        zzahf zzahf27 = zzahf4;
        zzahfArray = new zzahf("LOGSID_ANDROID_LOGGING_ID", 35, 56);
        zzJ = zzahfArray;
        zzahf[] zzahfArray11 = zzahfArray;
        zzK = zzahf4 = new zzahf("LOGSID_SECURE_SETTINGS_ANDROID_ID", 36, 57);
        zzahf zzahf28 = zzahf4;
        zzahfArray = new zzahf("LOGSID_OTHER_IDENTIFYING_USER_INFO", 37, 100);
        zzL = zzahfArray;
        zzahf[] zzahfArray12 = zzahfArray;
        zzM = zzahf4 = new zzahf("LOGSID_USER_INPUT", 38, 200);
        zzahf zzahf29 = zzahf4;
        zzahfArray = new zzahf("LOGSID_DEMOGRAPHIC_INFO", 39, 201);
        zzN = zzahfArray;
        zzahf[] zzahfArray13 = zzahfArray;
        zzO = zzahf4 = new zzahf("LOGSID_GENERIC_KEY", 40, 202);
        zzahf zzahf30 = zzahf4;
        zzahfArray = new zzahf("LOGSID_GENERIC_VALUE", 41, 203);
        zzP = zzahfArray;
        zzahf[] zzahfArray14 = zzahfArray;
        zzQ = zzahf4 = new zzahf("LOGSID_COOKIE", 42, 204);
        zzahf zzahf31 = zzahf4;
        zzahfArray = new zzahf("LOGSID_URL", 43, 205);
        zzR = zzahfArray;
        zzahf[] zzahfArray15 = zzahfArray;
        zzS = zzahf4 = new zzahf("LOGSID_HTTPHEADER", 44, 206);
        zzahfArray = new zzahf[]{object, zzahf15, zzahf14, zzahf13, zzahf12, zzahf11, zzahf10, zzahf9, zzahf8, zzahf7, zzahf6, zzahf5, zzahf16, zzahf3, zzahf17, zzahf18, zzahfArray2, zzahf19, zzahf2, zzahfArray3, zzahf20, zzahfArray4, zzahf21, zzahfArray5, zzahf22, zzahfArray6, zzahf23, zzahfArray7, zzahf24, zzahfArray8, zzahf25, zzahfArray9, zzahf26, zzahfArray10, zzahf27, zzahfArray11, zzahf28, zzahfArray12, zzahf29, zzahfArray13, zzahf30, zzahfArray14, zzahf31, zzahfArray15, zzahf4};
        zzU = zzahfArray;
        zzT = object = new zzahe();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzahf() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzV = var3_2;
    }

    public static zzahf[] values() {
        return (zzahf[])zzU.clone();
    }

    public static zzaci zzb() {
        return zzT;
    }

    public final String toString() {
        return Integer.toString(this.zzV);
    }

    public final int zza() {
        return this.zzV;
    }
}

