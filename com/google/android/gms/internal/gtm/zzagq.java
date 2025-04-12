/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzagp;

public final class zzagq
extends zzacf
implements zzadm {
    private static final zzagq zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzagq zzagq2;
        zza = zzagq2 = new zzagq();
        zzacf.zzao(zzagq.class, zzagq2);
    }

    private zzagq() {
    }

    public static /* bridge */ /* synthetic */ zzagq zzc() {
        return zza;
    }

    public static zzagq zze() {
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
                    zzagp zzagp2 = new zzagp(null);
                    return zzagp2;
                }
                zzagq zzagq2 = new zzagq();
                return zzagq2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", objectArray);
        }
        return (byte)n4;
    }
}

