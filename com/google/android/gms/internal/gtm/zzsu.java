/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzss;
import com.google.android.gms.internal.gtm.zzst;

public final class zzsu
extends zzacf
implements zzadm {
    private static final zzsu zza;
    private zzacn zzd;

    static {
        zzsu zzsu2;
        zza = zzsu2 = new zzsu();
        zzacf.zzao(zzsu.class, zzsu2);
    }

    private zzsu() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzsu zza() {
        return zza;
    }

    public static zzsu zzc() {
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
                    zzst zzst2 = new zzst(null);
                    return zzst2;
                }
                zzsu zzsu2 = new zzsu();
                return zzsu2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = zzss.class;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objectArray);
        }
        return (byte)n4;
    }
}

