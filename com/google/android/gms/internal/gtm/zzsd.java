/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzsb;

public final class zzsd
extends zzacf
implements zzadm {
    private static final zzsd zza;
    private zzacn zzd;

    static {
        zzsd zzsd2;
        zza = zzsd2 = new zzsd();
        zzacf.zzao(zzsd.class, zzsd2);
    }

    private zzsd() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzsd zza() {
        return zza;
    }

    public static zzsd zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        if ((n3 += -1) != 0) {
            int n7 = 2;
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
                    zzsb zzsb2 = new zzsb(null);
                    return zzsb2;
                }
                zzsd zzsd2 = new zzsd();
                return zzsd2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            return zzacf.zzal(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a", objectArray);
        }
        return (byte)n4;
    }
}

