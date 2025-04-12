/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzxf;

public final class zzxg
extends zzacf
implements zzadm {
    private static final zzxg zza;
    private int zzd;
    private zzack zze;
    private int zzf;

    static {
        zzxg zzxg2;
        zza = zzxg2 = new zzxg();
        zzacf.zzao(zzxg.class, zzxg2);
    }

    private zzxg() {
        zzack zzack2;
        this.zze = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzxg zza() {
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
                    zzxf zzxf2 = new zzxf(null);
                    return zzxf2;
                }
                zzxg zzxg2 = new zzxg();
                return zzxg2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0016\u0002\u1004\u0000", objectArray);
        }
        return (byte)n4;
    }
}

