/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzajz;
import com.google.android.gms.internal.gtm.zzaka;

public final class zzakb
extends zzacf
implements zzadm {
    private static final zzakb zza;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;

    static {
        zzakb zzakb2;
        zza = zzakb2 = new zzakb();
        zzacf.zzao(zzakb.class, zzakb2);
    }

    private zzakb() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
    }

    public static /* bridge */ /* synthetic */ zzakb zzc() {
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
                    zzajz zzajz2 = new zzajz(null);
                    return zzajz2;
                }
                zzakb zzakb2 = new zzakb();
                return zzakb2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzaka.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            objectArray[n4] = "zzh";
            return zzacf.zzal(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003", objectArray);
        }
        return by2;
    }
}

