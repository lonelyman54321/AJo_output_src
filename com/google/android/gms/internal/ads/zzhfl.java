/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfk;

public final class zzhfl
extends Enum
implements zzhbs {
    public static final /* enum */ zzhfl zza;
    public static final /* enum */ zzhfl zzb;
    public static final /* enum */ zzhfl zzc;
    public static final /* enum */ zzhfl zzd;
    public static final /* enum */ zzhfl zze;
    public static final /* enum */ zzhfl zzf;
    public static final /* enum */ zzhfl zzg;
    public static final /* enum */ zzhfl zzh;
    public static final /* enum */ zzhfl zzi;
    public static final /* enum */ zzhfl zzj;
    public static final /* enum */ zzhfl zzk;
    public static final /* enum */ zzhfl zzl;
    public static final /* enum */ zzhfl zzm;
    public static final /* enum */ zzhfl zzn;
    public static final /* enum */ zzhfl zzo;
    private static final zzhbt zzp;
    private static final /* synthetic */ zzhfl[] zzq;
    private final int zzr;

    static {
        zzhfl zzhfl2;
        zzhfl zzhfl3;
        zzhfl zzhfl4;
        zzhfl zzhfl5;
        zzhfl zzhfl6;
        zzhfl zzhfl7;
        zzhfl zzhfl8;
        zzhfl zzhfl9;
        zzhfl zzhfl10;
        zzhfl zzhfl11;
        zzhfl zzhfl12;
        zzhfl zzhfl13;
        Object object = new zzhfl("USER_POPULATION_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhfl13 = new zzhfl("CARTER_SB_CHROME_INTERSTITIAL", n3, n3);
        int n4 = 2;
        zzc = zzhfl12 = new zzhfl("GMAIL_PHISHY_JOURNEY", n4, n4);
        zzd = zzhfl11 = new zzhfl("DOWNLOAD_RELATED_POPULATION_MIN", 3, 1000);
        zze = zzhfl10 = new zzhfl("RISKY_DOWNLOADER", 4, 1001);
        zzf = zzhfl9 = new zzhfl("INFREQUENT_DOWNLOADER", 5, 1002);
        zzg = zzhfl8 = new zzhfl("REGULAR_DOWNLOADER", 6, 1003);
        zzh = zzhfl7 = new zzhfl("BOTLIKE_DOWNLOADER", 7, 1004);
        zzi = zzhfl6 = new zzhfl("DOCUMENT_DOWNLOADER", 8, 1005);
        zzj = zzhfl5 = new zzhfl("HIGHLY_TECHNICAL_DOWNLOADER", 9, 1006);
        zzk = zzhfl4 = new zzhfl("LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE", 10, 1007);
        zzl = zzhfl3 = new zzhfl("HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE", 11, 1008);
        zzm = zzhfl2 = new zzhfl("SPAM_PING_SENDER", 12, 1009);
        zzhfl zzhfl14 = zzhfl2;
        zzhfl[] zzhflArray = new zzhfl("RFA_TRUSTED", 13, 1010);
        zzn = zzhflArray;
        int n7 = 14;
        zzhfl[] zzhflArray2 = zzhflArray;
        zzo = zzhfl2 = new zzhfl("DOWNLOAD_RELATED_POPULATION_MAX", n7, 1999);
        zzhflArray = new zzhfl[15];
        zzhflArray[0] = object;
        zzhflArray[1] = zzhfl13;
        zzhflArray[2] = zzhfl12;
        zzhflArray[3] = zzhfl11;
        zzhflArray[4] = zzhfl10;
        zzhflArray[5] = zzhfl9;
        zzhflArray[6] = zzhfl8;
        zzhflArray[7] = zzhfl7;
        zzhflArray[8] = zzhfl6;
        zzhflArray[9] = zzhfl5;
        zzhflArray[10] = zzhfl4;
        zzhflArray[11] = zzhfl3;
        zzhflArray[12] = zzhfl14;
        zzhflArray[13] = zzhflArray2;
        zzhflArray[n7] = zzhfl2;
        zzq = zzhflArray;
        zzp = object = new zzhfj();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhfl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzr = var3_2;
    }

    public static zzhfl[] values() {
        return (zzhfl[])zzq.clone();
    }

    public static zzhbu zzb() {
        return zzhfk.zza;
    }

    public static zzhfl zzc(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 1999;
                    if (n3 != n4) {
                        switch (n3) {
                            default: {
                                return null;
                            }
                            case 1010: {
                                return zzn;
                            }
                            case 1009: {
                                return zzm;
                            }
                            case 1008: {
                                return zzl;
                            }
                            case 1007: {
                                return zzk;
                            }
                            case 1006: {
                                return zzj;
                            }
                            case 1005: {
                                return zzi;
                            }
                            case 1004: {
                                return zzh;
                            }
                            case 1003: {
                                return zzg;
                            }
                            case 1002: {
                                return zzf;
                            }
                            case 1001: {
                                return zze;
                            }
                            case 1000: 
                        }
                        return zzd;
                    }
                    return zzo;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzr);
    }

    public final int zza() {
        return this.zzr;
    }
}

