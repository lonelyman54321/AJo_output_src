/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzakf;
import com.google.android.gms.internal.gtm.zzakg;

public final class zzakh
extends zzacf
implements zzadm {
    private static final zzakh zza;
    private int zzd;
    private String zze = "";
    private int zzf;

    static {
        zzakh zzakh2;
        zza = zzakh2 = new zzakh();
        zzacf.zzao(zzakh.class, zzakh2);
    }

    private zzakh() {
    }

    public static /* bridge */ /* synthetic */ zzakh zzc() {
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
                    zzakf zzakf2 = new zzakf(null);
                    return zzakf2;
                }
                zzakh zzakh2 = new zzakh();
                return zzakh2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = object = zzakg.zza;
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001", objectArray);
        }
        return by2;
    }
}

