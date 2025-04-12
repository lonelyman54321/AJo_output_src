/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafq;
import com.google.android.gms.internal.gtm.zzaft;

public final class zzafu
extends zzacf
implements zzadm {
    private static final zzafu zza;
    private int zzd;
    private zzafq zze;

    static {
        zzafu zzafu2;
        zza = zzafu2 = new zzafu();
        zzacf.zzao(zzafu.class, zzafu2);
    }

    private zzafu() {
    }

    public static /* bridge */ /* synthetic */ zzafu zzc() {
        return zza;
    }

    public static zzafu zze() {
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
                    zzaft zzaft2 = new zzaft(null);
                    return zzaft2;
                }
                zzafu zzafu2 = new zzafu();
                return zzafu2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objectArray);
        }
        return (byte)n4;
    }
}

