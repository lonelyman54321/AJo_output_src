/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzagi;

public final class zzagj
extends zzacf
implements zzadm {
    private static final zzagj zza;
    private int zzd;
    private zzacn zze;
    private String zzf;

    static {
        zzagj zzagj2;
        zza = zzagj2 = new zzagj();
        zzacf.zzao(zzagj.class, zzagj2);
    }

    private zzagj() {
        zzacn zzacn2;
        this.zze = zzacn2 = zzacf.zzai();
        this.zzf = "";
    }

    public static /* bridge */ /* synthetic */ zzagj zzc() {
        return zza;
    }

    public static zzagj zze() {
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
                    zzagi zzagi2 = new zzagi(null);
                    return zzagi2;
                }
                zzagj zzagj2 = new zzagj();
                return zzagj2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1008\u0000", objectArray);
        }
        return (byte)n4;
    }
}

