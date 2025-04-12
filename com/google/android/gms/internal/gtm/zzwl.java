/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzwj;
import com.google.android.gms.internal.gtm.zzwk;

public final class zzwl
extends zzacf
implements zzadm {
    private static final zzwl zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzwl zzwl2;
        zza = zzwl2 = new zzwl();
        zzacf.zzao(zzwl.class, zzwl2);
    }

    private zzwl() {
    }

    public static /* bridge */ /* synthetic */ zzwl zza() {
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
                    zzwj zzwj2 = new zzwj(null);
                    return zzwj2;
                }
                zzwl zzwl2 = new zzwl();
                return zzwl2;
            }
            Object[] objectArray = new Object[15];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzwk.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = object;
            objectArray[n4] = "zzg";
            objectArray[6] = object;
            objectArray[7] = "zzh";
            objectArray[8] = object;
            objectArray[9] = "zzi";
            objectArray[10] = object;
            objectArray[11] = "zzj";
            objectArray[12] = object;
            objectArray[13] = "zzk";
            objectArray[14] = object;
            return zzacf.zzal(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005\u0007\u180c\u0006", objectArray);
        }
        return by2;
    }
}

