/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhhu;

public final class zzhhw
extends Enum
implements zzhbs {
    public static final /* enum */ zzhhw zza;
    public static final /* enum */ zzhhw zzb;
    public static final /* enum */ zzhhw zzc;
    public static final /* enum */ zzhhw zzd;
    public static final /* enum */ zzhhw zze;
    public static final /* enum */ zzhhw zzf;
    public static final /* enum */ zzhhw zzg;
    public static final /* enum */ zzhhw zzh;
    public static final /* enum */ zzhhw zzi;
    public static final /* enum */ zzhhw zzj;
    public static final /* enum */ zzhhw zzk;
    public static final /* enum */ zzhhw zzl;
    public static final /* enum */ zzhhw zzm;
    public static final /* enum */ zzhhw zzn;
    public static final /* enum */ zzhhw zzo;
    public static final /* enum */ zzhhw zzp;
    private static final zzhbt zzq;
    private static final /* synthetic */ zzhhw[] zzr;
    private final int zzs;

    static {
        zzhhw zzhhw2;
        zzhhw zzhhw3;
        zzhhw zzhhw4;
        zzhhw zzhhw5;
        zzhhw zzhhw6;
        zzhhw zzhhw7;
        zzhhw zzhhw8;
        zzhhw zzhhw9;
        zzhhw zzhhw10;
        zzhhw zzhhw11;
        zzhhw zzhhw12;
        zzhhw zzhhw13;
        zzhhw zzhhw14;
        zzhhw zzhhw15;
        Object object = new zzhhw("UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhhw15 = new zzhhw("CMD_DONT_PROCEED", n3, n3);
        int n4 = 2;
        zzc = zzhhw14 = new zzhhw("CMD_PROCEED", n4, n4);
        int n7 = 3;
        zzd = zzhhw13 = new zzhhw("CMD_SHOW_MORE_SECTION", n7, n7);
        int n8 = 4;
        zze = zzhhw12 = new zzhhw("CMD_OPEN_HELP_CENTER", n8, n8);
        int n10 = 5;
        zzf = zzhhw11 = new zzhhw("CMD_OPEN_DIAGNOSTIC", n10, n10);
        int n14 = 6;
        zzg = zzhhw10 = new zzhhw("CMD_RELOAD", n14, n14);
        n14 = 7;
        zzh = zzhhw9 = new zzhhw("CMD_OPEN_DATE_SETTINGS", n14, n14);
        n10 = 8;
        zzi = zzhhw8 = new zzhhw("CMD_OPEN_LOGIN", n10, n10);
        n8 = 9;
        zzj = zzhhw7 = new zzhhw("CMD_DO_REPORT", n8, n8);
        n7 = 10;
        zzk = zzhhw6 = new zzhhw("CMD_DONT_REPORT", n7, n7);
        n4 = 11;
        zzl = zzhhw5 = new zzhhw("CMD_OPEN_REPORTING_PRIVACY", n4, n4);
        n3 = 12;
        zzm = zzhhw4 = new zzhhw("CMD_OPEN_WHITEPAPER", n3, n3);
        int n15 = 13;
        zzhhw[] zzhhwArray = new zzhhw("CMD_REPORT_PHISHING_ERROR", n15, n15);
        zzn = zzhhwArray;
        zzhhw[] zzhhwArray2 = zzhhwArray;
        n4 = 14;
        zzo = zzhhw3 = new zzhhw("CMD_OPEN_ENHANCED_PROTECTION_SETTINGS", n4, n4);
        n3 = 15;
        zzp = zzhhw2 = new zzhhw("CMD_CLOSE_INTERSTITIAL_WITHOUT_UI", n3, n3);
        zzhhwArray = new zzhhw[16];
        zzhhwArray[0] = object;
        zzhhwArray[1] = zzhhw15;
        zzhhwArray[2] = zzhhw14;
        zzhhwArray[3] = zzhhw13;
        zzhhwArray[4] = zzhhw12;
        zzhhwArray[5] = zzhhw11;
        zzhhwArray[6] = zzhhw10;
        zzhhwArray[7] = zzhhw9;
        zzhhwArray[8] = zzhhw8;
        zzhhwArray[9] = zzhhw7;
        zzhhwArray[10] = zzhhw6;
        zzhhwArray[11] = zzhhw5;
        zzhhwArray[12] = zzhhw4;
        zzhhwArray[13] = zzhhwArray2;
        zzhhwArray[14] = zzhhw3;
        zzhhwArray[n3] = zzhhw2;
        zzr = zzhhwArray;
        zzq = object = new zzhhu();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhhw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzs = var3_2;
    }

    public static zzhhw[] values() {
        return (zzhhw[])zzr.clone();
    }

    public static zzhhw zzb(int n3) {
        switch (n3) {
            default: {
                return null;
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
        return Integer.toString(this.zzs);
    }

    public final int zza() {
        return this.zzs;
    }
}

