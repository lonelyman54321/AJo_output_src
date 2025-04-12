/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhik;

public final class zzhim
extends Enum
implements zzhbs {
    public static final /* enum */ zzhim zzA;
    private static final zzhbt zzB;
    private static final /* synthetic */ zzhim[] zzC;
    public static final /* enum */ zzhim zza;
    public static final /* enum */ zzhim zzb;
    public static final /* enum */ zzhim zzc;
    public static final /* enum */ zzhim zzd;
    public static final /* enum */ zzhim zze;
    public static final /* enum */ zzhim zzf;
    public static final /* enum */ zzhim zzg;
    public static final /* enum */ zzhim zzh;
    public static final /* enum */ zzhim zzi;
    public static final /* enum */ zzhim zzj;
    public static final /* enum */ zzhim zzk;
    public static final /* enum */ zzhim zzl;
    public static final /* enum */ zzhim zzm;
    public static final /* enum */ zzhim zzn;
    public static final /* enum */ zzhim zzo;
    public static final /* enum */ zzhim zzp;
    public static final /* enum */ zzhim zzq;
    public static final /* enum */ zzhim zzr;
    public static final /* enum */ zzhim zzs;
    public static final /* enum */ zzhim zzt;
    public static final /* enum */ zzhim zzu;
    public static final /* enum */ zzhim zzv;
    public static final /* enum */ zzhim zzw;
    public static final /* enum */ zzhim zzx;
    public static final /* enum */ zzhim zzy;
    public static final /* enum */ zzhim zzz;
    private final int zzD;

    static {
        zzhim zzhim2;
        zzhim zzhim3;
        zzhim zzhim4;
        zzhim zzhim5;
        zzhim zzhim6;
        zzhim zzhim7;
        zzhim zzhim8;
        zzhim zzhim9;
        zzhim zzhim10;
        zzhim zzhim11;
        zzhim zzhim12;
        zzhim zzhim13;
        zzhim zzhim14;
        zzhim zzhim15;
        Object object = new zzhim("UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhim15 = new zzhim("URL_PHISHING", n3, n3);
        int n4 = 2;
        zzc = zzhim14 = new zzhim("URL_MALWARE", n4, n4);
        int n7 = 3;
        zzd = zzhim13 = new zzhim("URL_UNWANTED", n7, n7);
        int n8 = 4;
        zze = zzhim12 = new zzhim("CLIENT_SIDE_PHISHING_URL", n8, n8);
        int n10 = 5;
        zzf = zzhim11 = new zzhim("CLIENT_SIDE_MALWARE_URL", n10, n10);
        int n14 = 6;
        zzg = zzhim10 = new zzhim("DANGEROUS_DOWNLOAD_RECOVERY", n14, n14);
        n14 = 7;
        zzh = zzhim9 = new zzhim("DANGEROUS_DOWNLOAD_WARNING", n14, n14);
        n10 = 8;
        zzi = zzhim8 = new zzhim("OCTAGON_AD", n10, n10);
        n8 = 9;
        zzj = zzhim7 = new zzhim("OCTAGON_AD_SB_MATCH", n8, n8);
        n7 = 10;
        zzk = zzhim6 = new zzhim("DANGEROUS_DOWNLOAD_BY_API", n7, n7);
        n4 = 11;
        zzl = zzhim5 = new zzhim("OCTAGON_IOS_AD", n4, n4);
        n3 = 12;
        zzm = zzhim4 = new zzhim("PASSWORD_PROTECTION_PHISHING_URL", n3, n3);
        int n15 = 13;
        zzn = zzhim3 = new zzhim("DANGEROUS_DOWNLOAD_OPENED", n15, n15);
        zzhim zzhim16 = zzhim3;
        n4 = 14;
        zzo = zzhim2 = new zzhim("AD_SAMPLE", n4, n4);
        zzhim zzhim17 = zzhim2;
        n3 = 15;
        zzhim[] zzhimArray = new zzhim("URL_SUSPICIOUS", n3, n3);
        zzp = zzhimArray;
        zzhim[] zzhimArray2 = zzhimArray;
        n15 = 16;
        zzq = zzhim3 = new zzhim("BILLING", n15, n15);
        zzhim zzhim18 = zzhim3;
        n4 = 17;
        zzr = zzhim2 = new zzhim("APK_DOWNLOAD", n4, n4);
        zzhim zzhim19 = zzhim2;
        n3 = 18;
        zzhimArray = new zzhim("BLOCKED_AD_DRIVE_BY_DOWNLOAD", n3, n3);
        zzs = zzhimArray;
        zzhim[] zzhimArray3 = zzhimArray;
        n15 = 19;
        zzt = zzhim3 = new zzhim("BLOCKED_AD_REDIRECT", n15, n15);
        zzhim zzhim20 = zzhim3;
        n4 = 20;
        zzu = zzhim2 = new zzhim("BLOCKED_AD_POPUP", n4, n4);
        zzhim zzhim21 = zzhim2;
        n3 = 21;
        zzhimArray = new zzhim("HASH_PREFIX_REAL_TIME_EXPERIMENT", n3, n3);
        zzv = zzhimArray;
        zzhim[] zzhimArray4 = zzhimArray;
        n15 = 22;
        zzw = zzhim3 = new zzhim("PHISHY_SITE_INTERACTIONS", n15, n15);
        n4 = 23;
        zzhimArray = new zzhim("WARNING_SHOWN", n4, n4);
        zzx = zzhimArray;
        zzhim[] zzhimArray5 = zzhimArray;
        n15 = 24;
        zzy = zzhim2 = new zzhim("NOTIFICATION_PERMISSION_ACCEPTED", n15, n15);
        zzhim zzhim22 = zzhim2;
        n3 = 25;
        zzhimArray = new zzhim("DANGEROUS_DOWNLOAD_AUTO_DELETED", n3, n3);
        zzz = zzhimArray;
        zzhim[] zzhimArray6 = zzhimArray;
        n15 = 26;
        zzA = zzhim2 = new zzhim("DANGEROUS_DOWNLOAD_PROFILE_CLOSED", n15, n15);
        zzhimArray = new zzhim[]{object, zzhim15, zzhim14, zzhim13, zzhim12, zzhim11, zzhim10, zzhim9, zzhim8, zzhim7, zzhim6, zzhim5, zzhim4, zzhim16, zzhim17, zzhimArray2, zzhim18, zzhim19, zzhimArray3, zzhim20, zzhim21, zzhimArray4, zzhim3, zzhimArray5, zzhim22, zzhimArray6, zzhim2};
        zzC = zzhimArray;
        zzB = object = new zzhik();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhim() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzD = var3_2;
    }

    public static zzhim[] values() {
        return (zzhim[])zzC.clone();
    }

    public static zzhim zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 26: {
                return zzA;
            }
            case 25: {
                return zzz;
            }
            case 24: {
                return zzy;
            }
            case 23: {
                return zzx;
            }
            case 22: {
                return zzw;
            }
            case 21: {
                return zzv;
            }
            case 20: {
                return zzu;
            }
            case 19: {
                return zzt;
            }
            case 18: {
                return zzs;
            }
            case 17: {
                return zzr;
            }
            case 16: {
                return zzq;
            }
            case 15: {
                return zzp;
            }
            case 14: {
                return zzo;
            }
            case 13: {
                return zzn;
            }
            case 12: {
                return zzm;
            }
            case 11: {
                return zzl;
            }
            case 10: {
                return zzk;
            }
            case 9: {
                return zzj;
            }
            case 8: {
                return zzi;
            }
            case 7: {
                return zzh;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzD);
    }

    public final int zza() {
        return this.zzD;
    }
}

