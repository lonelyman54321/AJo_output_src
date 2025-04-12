/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzair;

public final class zzais
extends zzacf
implements zzadm {
    private static final zzais zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzais zzais2;
        zza = zzais2 = new zzais();
        zzacf.zzao(zzais.class, zzais2);
    }

    private zzais() {
    }

    public static /* bridge */ /* synthetic */ zzais zzc() {
        return zza;
    }

    public static zzais zze() {
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
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzair zzair2 = new zzair(null);
                    return zzair2;
                }
                zzais zzais2 = new zzais();
                return zzais2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002", objectArray);
        }
        return by2;
    }
}

