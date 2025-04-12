/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafl;
import com.google.android.gms.internal.gtm.zzafn;

public final class zzafm
extends zzacf
implements zzadm {
    private static final zzafm zza;
    private int zzd;
    private int zze;
    private String zzf = "*";

    static {
        zzafm zzafm2;
        zza = zzafm2 = new zzafm();
        zzacf.zzao(zzafm.class, zzafm2);
    }

    private zzafm() {
    }

    public static /* bridge */ /* synthetic */ zzafm zzc() {
        return zza;
    }

    public static zzafm zze() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 4;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    by2 = 0;
                    object = null;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzafl zzafl2 = new zzafl(null);
                    return zzafl2;
                }
                zzafm zzafm2 = new zzafm();
                return zzafm2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = object = zzafn.zza;
            objectArray[n7] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001", objectArray);
        }
        return by2;
    }
}

