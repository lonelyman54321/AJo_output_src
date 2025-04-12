/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafz;
import com.google.android.gms.internal.gtm.zzage;

public final class zzaga
extends zzacf
implements zzadm {
    private static final zzaga zza;
    private zzack zzd;

    static {
        zzaga zzaga2;
        zza = zzaga2 = new zzaga();
        zzacf.zzao(zzaga.class, zzaga2);
    }

    private zzaga() {
        zzack zzack2;
        this.zzd = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzaga zzc() {
        return zza;
    }

    public static zzaga zze() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    n7 = 0;
                    object2 = null;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzafz zzafz2 = new zzafz(null);
                    return zzafz2;
                }
                zzaga zzaga2 = new zzaga();
                return zzaga2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = object2 = zzage.zza;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u081e", objectArray);
        }
        return (byte)n4;
    }
}

