/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaui;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzauj
extends Enum
implements zzhbs {
    private static final zzhbt zzA;
    private static final /* synthetic */ zzauj[] zzB;
    public static final /* enum */ zzauj zza;
    public static final /* enum */ zzauj zzb;
    public static final /* enum */ zzauj zzc;
    public static final /* enum */ zzauj zzd;
    public static final /* enum */ zzauj zze;
    public static final /* enum */ zzauj zzf;
    public static final /* enum */ zzauj zzg;
    public static final /* enum */ zzauj zzh;
    public static final /* enum */ zzauj zzi;
    public static final /* enum */ zzauj zzj;
    public static final /* enum */ zzauj zzk;
    public static final /* enum */ zzauj zzl;
    public static final /* enum */ zzauj zzm;
    public static final /* enum */ zzauj zzn;
    public static final /* enum */ zzauj zzo;
    public static final /* enum */ zzauj zzp;
    public static final /* enum */ zzauj zzq;
    public static final /* enum */ zzauj zzr;
    public static final /* enum */ zzauj zzs;
    public static final /* enum */ zzauj zzt;
    public static final /* enum */ zzauj zzu;
    public static final /* enum */ zzauj zzv;
    public static final /* enum */ zzauj zzw;
    public static final /* enum */ zzauj zzx;
    public static final /* enum */ zzauj zzy;
    public static final /* enum */ zzauj zzz;
    private final int zzC;

    static {
        zzauj zzauj2;
        zzauj zzauj3;
        zzauj zzauj4;
        zzauj zzauj5;
        zzauj zzauj6;
        zzauj zzauj7;
        zzauj zzauj8;
        zzauj zzauj9;
        zzauj zzauj10;
        zzauj zzauj11;
        zzauj zzauj12;
        zzauj zzauj13;
        zzauj zzauj14;
        zzauj zzauj15;
        int n3 = 1;
        Object object = new zzauj("ERROR_ENCODE_SIZE_FAIL", 0, n3);
        zza = object;
        int n4 = 3;
        zzb = zzauj15 = new zzauj("ERROR_UNKNOWN", n3, n4);
        int n7 = 2;
        int n8 = 5;
        zzc = zzauj14 = new zzauj("ERROR_NO_SIGNALS", n7, n8);
        int n10 = 7;
        zzd = zzauj13 = new zzauj("ERROR_ENCRYPTION", n4, n10);
        int n14 = 4;
        int n15 = 9;
        zze = zzauj12 = new zzauj("ERROR_MEMORY", n14, n15);
        int n16 = 11;
        zzf = zzauj11 = new zzauj("ERROR_SIMULATOR", n8, n16);
        zzg = zzauj10 = new zzauj("ERROR_SERVICE", 6, 13);
        zzh = zzauj9 = new zzauj("ERROR_THREAD", n10, 15);
        int n17 = 8;
        zzi = zzauj8 = new zzauj("ERROR_COLLECTION_TIMEOUT", n17, 17);
        zzj = zzauj7 = new zzauj("PSN_WEB64_FAIL", n15, n7);
        zzk = zzauj6 = new zzauj("PSN_DECRYPT_SIZE_FAIL", 10, n14);
        zzl = zzauj5 = new zzauj("PSN_MD5_CHECK_FAIL", n16, n17);
        zzm = zzauj4 = new zzauj("PSN_MD5_SIZE_FAIL", 12, 16);
        zzauj zzauj16 = zzauj4;
        zzn = zzauj3 = new zzauj("PSN_MD5_FAIL", 13, 32);
        zzauj[] zzaujArray = new zzauj("PSN_DECODE_FAIL", 14, 64);
        zzo = zzaujArray;
        zzauj[] zzaujArray2 = zzaujArray;
        zzp = zzauj2 = new zzauj("PSN_SALT_FAIL", 15, 128);
        zzaujArray = new zzauj("PSN_BITSLICER_FAIL", 16, 256);
        zzq = zzaujArray;
        zzauj[] zzaujArray3 = zzaujArray;
        zzr = zzauj4 = new zzauj("PSN_REQUEST_TYPE_FAIL", 17, 512);
        zzauj zzauj17 = zzauj4;
        zzaujArray = new zzauj("PSN_INVALID_ERROR_CODE", 18, 1024);
        zzs = zzaujArray;
        zzauj[] zzaujArray4 = zzaujArray;
        zzt = zzauj4 = new zzauj("PSN_TIMESTAMP_EXPIRED", 19, 2048);
        zzauj zzauj18 = zzauj4;
        zzaujArray = new zzauj("PSN_ENCODE_SIZE_FAIL", 20, 4096);
        zzu = zzaujArray;
        zzauj[] zzaujArray5 = zzaujArray;
        zzv = zzauj4 = new zzauj("PSN_BLANK_VALUE", 21, 8192);
        zzauj zzauj19 = zzauj4;
        zzaujArray = new zzauj("PSN_INITIALIZATION_FAIL", 22, 16384);
        zzw = zzaujArray;
        zzauj[] zzaujArray6 = zzaujArray;
        zzx = zzauj4 = new zzauj("PSN_GASS_CLIENT_FAIL", 23, 32768);
        zzauj zzauj20 = zzauj4;
        zzaujArray = new zzauj("PSN_SIGNALS_TIMEOUT", 24, 65536);
        zzy = zzaujArray;
        zzauj[] zzaujArray7 = zzaujArray;
        zzz = zzauj4 = new zzauj("PSN_TINK_FAIL", 25, 131072);
        zzaujArray = new zzauj[]{object, zzauj15, zzauj14, zzauj13, zzauj12, zzauj11, zzauj10, zzauj9, zzauj8, zzauj7, zzauj6, zzauj5, zzauj16, zzauj3, zzaujArray2, zzauj2, zzaujArray3, zzauj17, zzaujArray4, zzauj18, zzaujArray5, zzauj19, zzaujArray6, zzauj20, zzaujArray7, zzauj4};
        zzB = zzaujArray;
        zzA = object = new zzaui();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzauj() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzC = var3_2;
    }

    public static zzauj[] values() {
        return (zzauj[])zzB.clone();
    }

    public final String toString() {
        return Integer.toString(this.zzC);
    }

    public final int zza() {
        return this.zzC;
    }
}

