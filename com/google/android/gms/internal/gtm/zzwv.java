/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzwt;
import com.google.android.gms.internal.gtm.zzwu;

public final class zzwv
extends zzacf
implements zzadm {
    private static final zzwv zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;

    static {
        zzwv zzwv2;
        zza = zzwv2 = new zzwv();
        zzacf.zzao(zzwv.class, zzwv2);
    }

    private zzwv() {
    }

    public static /* bridge */ /* synthetic */ zzwv zza() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    by2 = 0;
                    object = null;
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzwt zzwt2 = new zzwt(null);
                    return zzwt2;
                }
                zzwv zzwv2 = new zzwv();
                return zzwv2;
            }
            Object[] objectArray = new Object[21];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            objectArray[6] = "zzj";
            objectArray[7] = "zzk";
            objectArray[8] = "zzl";
            objectArray[9] = "zzm";
            objectArray[10] = "zzn";
            objectArray[11] = "zzo";
            objectArray[12] = "zzp";
            objectArray[13] = "zzq";
            objectArray[14] = "zzr";
            objectArray[15] = "zzs";
            objectArray[16] = "zzt";
            objectArray[17] = "zzu";
            objectArray[18] = "zzv";
            objectArray[19] = "zzw";
            objectArray[20] = object = zzwu.zza;
            return zzacf.zzal(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1007\n\f\u1007\u000b\r\u1007\f\u000e\u1007\r\u000f\u1007\u000e\u0010\u1007\u000f\u0011\u1007\u0010\u0012\u1007\u0011\u0013\u180c\u0012", objectArray);
        }
        return by2;
    }
}

