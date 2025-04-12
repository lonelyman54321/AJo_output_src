/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhgu;

public final class zzhgw
extends Enum
implements zzhbs {
    public static final /* enum */ zzhgw zza;
    public static final /* enum */ zzhgw zzb;
    public static final /* enum */ zzhgw zzc;
    public static final /* enum */ zzhgw zzd;
    public static final /* enum */ zzhgw zze;
    public static final /* enum */ zzhgw zzf;
    public static final /* enum */ zzhgw zzg;
    public static final /* enum */ zzhgw zzh;
    public static final /* enum */ zzhgw zzi;
    public static final /* enum */ zzhgw zzj;
    public static final /* enum */ zzhgw zzk;
    private static final zzhbt zzl;
    private static final /* synthetic */ zzhgw[] zzm;
    private final int zzn;

    static {
        zzhgw zzhgw2;
        zzhgw zzhgw3;
        zzhgw zzhgw4;
        zzhgw zzhgw5;
        zzhgw zzhgw6;
        zzhgw zzhgw7;
        zzhgw zzhgw8;
        zzhgw zzhgw9;
        zzhgw zzhgw10;
        zzhgw zzhgw11;
        Object object = new zzhgw("ACTION_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhgw11 = new zzhgw("PROCEED", n3, n3);
        int n4 = 2;
        zzc = zzhgw10 = new zzhgw("DISCARD", n4, n4);
        int n7 = 3;
        zzd = zzhgw9 = new zzhgw("KEEP", n7, n7);
        int n8 = 4;
        zze = zzhgw8 = new zzhgw("CLOSE", n8, n8);
        int n10 = 5;
        zzf = zzhgw7 = new zzhgw("CANCEL", n10, n10);
        int n14 = 6;
        zzg = zzhgw6 = new zzhgw("DISMISS", n14, n14);
        n14 = 7;
        zzh = zzhgw5 = new zzhgw("BACK", n14, n14);
        n10 = 8;
        zzi = zzhgw4 = new zzhgw("OPEN_SUBPAGE", n10, n10);
        n8 = 9;
        zzj = zzhgw3 = new zzhgw("PROCEED_DEEP_SCAN", n8, n8);
        n7 = 10;
        zzk = zzhgw2 = new zzhgw("OPEN_LEARN_MORE_LINK", n7, n7);
        zzhgw[] zzhgwArray = new zzhgw[11];
        zzhgwArray[0] = object;
        zzhgwArray[n3] = zzhgw11;
        zzhgwArray[n4] = zzhgw10;
        zzhgwArray[3] = zzhgw9;
        zzhgwArray[4] = zzhgw8;
        zzhgwArray[5] = zzhgw7;
        zzhgwArray[6] = zzhgw6;
        zzhgwArray[7] = zzhgw5;
        zzhgwArray[8] = zzhgw4;
        zzhgwArray[9] = zzhgw3;
        zzhgwArray[n7] = zzhgw2;
        zzm = zzhgwArray;
        zzl = object = new zzhgu();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhgw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzn = var3_2;
    }

    public static zzhgw[] values() {
        return (zzhgw[])zzm.clone();
    }

    public static zzhgw zzb(int n3) {
        switch (n3) {
            default: {
                return null;
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
        return Integer.toString(this.zzn);
    }

    public final int zza() {
        return this.zzn;
    }
}

