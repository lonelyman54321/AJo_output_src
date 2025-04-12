/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzajp;
import com.google.android.gms.internal.gtm.zzajq;

public final class zzajr
extends zzacf
implements zzadm {
    private static final zzajr zza;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;

    static {
        zzajr zzajr2;
        zza = zzajr2 = new zzajr();
        zzacf.zzao(zzajr.class, zzajr2);
    }

    private zzajr() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzajr zzc() {
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
                    zzajp zzajp2 = new zzajp(null);
                    return zzajp2;
                }
                zzajr zzajr2 = new zzajr();
                return zzajr2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzajq.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002", objectArray);
        }
        return by2;
    }
}

