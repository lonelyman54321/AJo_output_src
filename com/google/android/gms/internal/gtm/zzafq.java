/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafp;
import com.google.android.gms.internal.gtm.zzagc;
import com.google.android.gms.internal.gtm.zzage;

public final class zzafq
extends zzacf
implements zzadm {
    private static final zzafq zza;
    private int zzd;
    private zzack zze;
    private zzagc zzf;

    static {
        zzafq zzafq2;
        zza = zzafq2 = new zzafq();
        zzacf.zzao(zzafq.class, zzafq2);
    }

    private zzafq() {
        zzack zzack2;
        this.zze = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzafq zzc() {
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
                    zzafp zzafp2 = new zzafp(null);
                    return zzafp2;
                }
                zzafq zzafq2 = new zzafq();
                return zzafq2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = object = zzage.zza;
            objectArray[n7] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u082c\u0002\u1009\u0000", objectArray);
        }
        return by2;
    }
}

