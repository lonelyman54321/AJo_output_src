/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalq;
import com.google.android.gms.internal.gtm.zzalr;

public final class zzals
extends zzacf
implements zzadm {
    private static final zzals zza;
    private int zzd;
    private String zze;
    private int zzf;
    private String zzg;

    static {
        zzals zzals2;
        zza = zzals2 = new zzals();
        zzacf.zzao(zzals.class, zzals2);
    }

    private zzals() {
        String string2;
        this.zze = string2 = "";
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzals zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    by2 = 0;
                    object = null;
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzalq zzalq2 = new zzalq(null);
                    return zzalq2;
                }
                zzals zzals2 = new zzals();
                return zzals2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = object = zzalr.zza;
            objectArray[n7] = "zzg";
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1008\u0002", objectArray);
        }
        return by2;
    }
}

