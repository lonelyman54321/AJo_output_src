/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhgk;

public final class zzhgm
extends Enum
implements zzhbs {
    public static final /* enum */ zzhgm zza;
    public static final /* enum */ zzhgm zzb;
    public static final /* enum */ zzhgm zzc;
    public static final /* enum */ zzhgm zzd;
    public static final /* enum */ zzhgm zze;
    public static final /* enum */ zzhgm zzf;
    public static final /* enum */ zzhgm zzg;
    public static final /* enum */ zzhgm zzh;
    public static final /* enum */ zzhgm zzi;
    public static final /* enum */ zzhgm zzj;
    public static final /* enum */ zzhgm zzk;
    public static final /* enum */ zzhgm zzl;
    public static final /* enum */ zzhgm zzm;
    private static final zzhbt zzn;
    private static final /* synthetic */ zzhgm[] zzo;
    private final int zzp;

    static {
        zzhgm zzhgm2;
        zzhgm zzhgm3;
        zzhgm zzhgm4;
        zzhgm zzhgm5;
        zzhgm zzhgm6;
        zzhgm zzhgm7;
        zzhgm zzhgm8;
        zzhgm zzhgm9;
        zzhgm zzhgm10;
        zzhgm zzhgm11;
        zzhgm zzhgm12;
        zzhgm zzhgm13;
        Object object = new zzhgm("SAFE", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhgm13 = new zzhgm("DANGEROUS", n3, n3);
        int n4 = 2;
        zzc = zzhgm12 = new zzhgm("UNCOMMON", n4, n4);
        int n7 = 3;
        zzd = zzhgm11 = new zzhgm("POTENTIALLY_UNWANTED", n7, n7);
        int n8 = 4;
        zze = zzhgm10 = new zzhgm("DANGEROUS_HOST", n8, n8);
        int n10 = 5;
        zzf = zzhgm9 = new zzhgm("UNKNOWN", n10, n10);
        int n14 = 6;
        zzg = zzhgm8 = new zzhgm("PLAY_POLICY_VIOLATION_SEVERE", n14, n14);
        n14 = 7;
        zzh = zzhgm7 = new zzhgm("PLAY_POLICY_VIOLATION_OTHER", n14, n14);
        n10 = 8;
        zzi = zzhgm6 = new zzhgm("DANGEROUS_ACCOUNT_COMPROMISE", n10, n10);
        n8 = 9;
        zzj = zzhgm5 = new zzhgm("PENDING", n8, n8);
        n7 = 10;
        zzk = zzhgm4 = new zzhgm("PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE", n7, n7);
        n4 = 11;
        zzl = zzhgm3 = new zzhgm("HIGH_RISK_BLOCK", n4, n4);
        n3 = 12;
        zzm = zzhgm2 = new zzhgm("HIGH_RISK_WARN", n3, n3);
        zzhgm[] zzhgmArray = new zzhgm[13];
        zzhgmArray[0] = object;
        zzhgmArray[1] = zzhgm13;
        zzhgmArray[2] = zzhgm12;
        zzhgmArray[3] = zzhgm11;
        zzhgmArray[4] = zzhgm10;
        zzhgmArray[5] = zzhgm9;
        zzhgmArray[6] = zzhgm8;
        zzhgmArray[7] = zzhgm7;
        zzhgmArray[8] = zzhgm6;
        zzhgmArray[9] = zzhgm5;
        zzhgmArray[10] = zzhgm4;
        zzhgmArray[11] = zzhgm3;
        zzhgmArray[n3] = zzhgm2;
        zzo = zzhgmArray;
        zzn = object = new zzhgk();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhgm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzp = var3_2;
    }

    public static zzhgm[] values() {
        return (zzhgm[])zzo.clone();
    }

    public static zzhgm zzb(int n3) {
        switch (n3) {
            default: {
                return null;
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
        return Integer.toString(this.zzp);
    }

    public final int zza() {
        return this.zzp;
    }
}

