/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzakp;
import com.google.android.gms.internal.gtm.zzakq;

public final class zzakr
extends zzacf
implements zzadm {
    private static final zzakr zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzakr zzakr2;
        zza = zzakr2 = new zzakr();
        zzacf.zzao(zzakr.class, zzakr2);
    }

    private zzakr() {
    }

    public static /* bridge */ /* synthetic */ zzakr zzc() {
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
                    zzakp zzakp2 = new zzakp(null);
                    return zzakp2;
                }
                zzakr zzakr2 = new zzakr();
                return zzakr2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzakq.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            objectArray[n4] = "zzh";
            objectArray[6] = "zzi";
            return zzacf.zzal(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", objectArray);
        }
        return by2;
    }
}

