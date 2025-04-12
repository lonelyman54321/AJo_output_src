/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaja;

public final class zzajb
extends zzacf
implements zzadm {
    private static final zzajb zza;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzajb zzajb2;
        zza = zzajb2 = new zzajb();
        zzacf.zzao(zzajb.class, zzajb2);
    }

    private zzajb() {
    }

    public static /* bridge */ /* synthetic */ zzajb zzc() {
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
                    zzaja zzaja2 = new zzaja(null);
                    return zzaja2;
                }
                zzajb zzajb2 = new zzajb();
                return zzajb2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", objectArray);
        }
        return (byte)n4;
    }
}

