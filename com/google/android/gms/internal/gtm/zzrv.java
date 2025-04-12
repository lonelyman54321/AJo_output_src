/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzrr;
import com.google.android.gms.internal.gtm.zzrs;
import com.google.android.gms.internal.gtm.zzrt;
import com.google.android.gms.internal.gtm.zzru;

public final class zzrv
extends zzacf
implements zzadm {
    private static final zzrv zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzrv zzrv2;
        zza = zzrv2 = new zzrv();
        zzacf.zzao(zzrv.class, zzrv2);
    }

    private zzrv() {
    }

    public static /* bridge */ /* synthetic */ zzrv zza() {
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
                    zzrr zzrr2 = new zzrr(null);
                    return zzrr2;
                }
                zzrv zzrv2 = new zzrv();
                return zzrv2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzrt.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = object = zzrs.zza;
            objectArray[n4] = "zzg";
            objectArray[6] = object = zzru.zza;
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002", objectArray);
        }
        return by2;
    }
}

