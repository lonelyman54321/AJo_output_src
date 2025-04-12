/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzats
extends Enum
implements zzhbs {
    public static final /* enum */ zzats zza;
    public static final /* enum */ zzats zzb;
    public static final /* enum */ zzats zzc;
    public static final /* enum */ zzats zzd;
    public static final /* enum */ zzats zze;
    public static final /* enum */ zzats zzf;
    public static final /* enum */ zzats zzg;
    private static final zzhbt zzh;
    private static final /* synthetic */ zzats[] zzi;
    private final int zzj;

    static {
        zzats zzats2;
        zzats zzats3;
        zzats zzats4;
        zzats zzats5;
        zzats zzats6;
        zzats zzats7;
        Object object = new zzats("DEBUGGER_STATE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzats7 = new zzats("DEBUGGER_STATE_NOT_INSTALLED", n3, n3);
        int n4 = 2;
        zzc = zzats6 = new zzats("DEBUGGER_STATE_INSTALLED", n4, n4);
        int n7 = 3;
        zzd = zzats5 = new zzats("DEBUGGER_STATE_ACTIVE", n7, n7);
        int n8 = 4;
        zze = zzats4 = new zzats("DEBUGGER_STATE_ENVVAR", n8, n8);
        int n10 = 5;
        zzf = zzats3 = new zzats("DEBUGGER_STATE_MACHPORT", n10, n10);
        int n14 = 6;
        zzg = zzats2 = new zzats("DEBUGGER_STATE_ENVVAR_MACHPORT", n14, n14);
        zzats[] zzatsArray = new zzats[7];
        zzatsArray[0] = object;
        zzatsArray[n3] = zzats7;
        zzatsArray[n4] = zzats6;
        zzatsArray[n7] = zzats5;
        zzatsArray[n8] = zzats4;
        zzatsArray[n10] = zzats3;
        zzatsArray[n14] = zzats2;
        zzi = zzatsArray;
        zzh = object = new zzatq();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzats() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzats[] values() {
        return (zzats[])zzi.clone();
    }

    public static zzats zzb(int n3) {
        switch (n3) {
            default: {
                return null;
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
        return Integer.toString(this.zzj);
    }

    public final int zza() {
        return this.zzj;
    }
}

