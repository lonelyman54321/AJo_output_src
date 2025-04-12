/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaiv;
import com.google.android.gms.internal.gtm.zzaiw;

public final class zzaix
extends zzacf
implements zzadm {
    private static final zzaix zza;
    private int zzd;
    private long zze;
    private int zzf;

    static {
        zzaix zzaix2;
        zza = zzaix2 = new zzaix();
        zzacf.zzao(zzaix.class, zzaix2);
    }

    private zzaix() {
    }

    public static /* bridge */ /* synthetic */ zzaix zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 4;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    by2 = 0;
                    object = null;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaiv zzaiv2 = new zzaiv(null);
                    return zzaiv2;
                }
                zzaix zzaix2 = new zzaix();
                return zzaix2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = object = zzaiw.zza;
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u180c\u0001", objectArray);
        }
        return by2;
    }
}

