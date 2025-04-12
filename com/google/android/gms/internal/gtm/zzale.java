/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalc;
import com.google.android.gms.internal.gtm.zzald;

public final class zzale
extends zzacf
implements zzadm {
    private static final zzale zza;
    private int zzd;
    private int zze;

    static {
        zzale zzale2;
        zza = zzale2 = new zzale();
        zzacf.zzao(zzale.class, zzale2);
    }

    private zzale() {
    }

    public static /* bridge */ /* synthetic */ zzale zzc() {
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
                    zzalc zzalc2 = new zzalc(null);
                    return zzalc2;
                }
                zzale zzale2 = new zzale();
                return zzale2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = object = zzald.zza;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", objectArray);
        }
        return (byte)n4;
    }
}

