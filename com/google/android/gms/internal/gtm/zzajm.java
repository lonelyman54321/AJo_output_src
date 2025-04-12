/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzajl;

public final class zzajm
extends zzacf
implements zzadm {
    private static final zzajm zza;
    private int zzd;
    private boolean zze;

    static {
        zzajm zzajm2;
        zza = zzajm2 = new zzajm();
        zzacf.zzao(zzajm.class, zzajm2);
    }

    private zzajm() {
    }

    public static /* bridge */ /* synthetic */ zzajm zzc() {
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
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzajl zzajl2 = new zzajl(null);
                    return zzajl2;
                }
                zzajm zzajm2 = new zzajm();
                return zzajm2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", objectArray);
        }
        return (byte)n4;
    }
}

