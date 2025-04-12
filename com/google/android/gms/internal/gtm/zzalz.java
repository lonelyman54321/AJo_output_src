/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzajo;
import com.google.android.gms.internal.gtm.zzakb;
import com.google.android.gms.internal.gtm.zzake;
import com.google.android.gms.internal.gtm.zzakh;
import com.google.android.gms.internal.gtm.zzale;
import com.google.android.gms.internal.gtm.zzaly;
import com.google.android.gms.internal.gtm.zzamn;

public final class zzalz
extends zzacf
implements zzadm {
    private static final zzalz zza;
    private int zzd = 0;
    private Object zze;

    static {
        zzalz zzalz2;
        zza = zzalz2 = new zzalz();
        zzacf.zzao(zzalz.class, zzalz2);
    }

    private zzalz() {
    }

    public static /* bridge */ /* synthetic */ zzalz zzc() {
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
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaly zzaly2 = new zzaly(null);
                    return zzaly2;
                }
                zzalz zzalz2 = new zzalz();
                return zzalz2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zze";
            objectArray[by2] = "zzd";
            objectArray[n10] = zzajo.class;
            objectArray[n8] = zzake.class;
            objectArray[n7] = zzakh.class;
            objectArray[n4] = zzale.class;
            objectArray[6] = zzamn.class;
            objectArray[7] = zzakb.class;
            return zzacf.zzal(zza, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", objectArray);
        }
        return by2;
    }
}

