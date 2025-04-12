/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzama;
import com.google.android.gms.internal.gtm.zzamb;

public final class zzamc
extends zzacf
implements zzadm {
    private static final zzamc zza;
    private int zzd;
    private int zze;

    static {
        zzamc zzamc2;
        zza = zzamc2 = new zzamc();
        zzacf.zzao(zzamc.class, zzamc2);
    }

    private zzamc() {
    }

    public static /* bridge */ /* synthetic */ zzamc zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    n4 = 4;
                    n7 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzama zzama2 = new zzama(null);
                    return zzama2;
                }
                zzamc zzamc2 = new zzamc();
                return zzamc2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = object = zzamb.zza;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", objectArray);
        }
        return (byte)n4;
    }
}

