/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzajj;

public final class zzajk
extends zzacf
implements zzadm {
    private static final zzajk zza;
    private zzacn zzd;

    static {
        zzajk zzajk2;
        zza = zzajk2 = new zzajk();
        zzacf.zzao(zzajk.class, zzajk2);
    }

    private zzajk() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzajk zzc() {
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
                    zzajj zzajj2 = new zzajj(null);
                    return zzajj2;
                }
                zzajk zzajk2 = new zzajk();
                return zzajk2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objectArray);
        }
        return (byte)n4;
    }
}

