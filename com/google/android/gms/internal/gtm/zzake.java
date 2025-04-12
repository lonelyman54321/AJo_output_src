/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzakc;
import com.google.android.gms.internal.gtm.zzakd;

public final class zzake
extends zzacf
implements zzadm {
    private static final zzake zza;
    private int zzd;
    private String zze = "";
    private int zzf;

    static {
        zzake zzake2;
        zza = zzake2 = new zzake();
        zzacf.zzao(zzake.class, zzake2);
    }

    private zzake() {
    }

    public static /* bridge */ /* synthetic */ zzake zzc() {
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
                    zzakc zzakc2 = new zzakc(null);
                    return zzakc2;
                }
                zzake zzake2 = new zzake();
                return zzake2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = object = zzakd.zza;
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001", objectArray);
        }
        return by2;
    }
}

