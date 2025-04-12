/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalj;

public final class zzalk
extends zzacf
implements zzadm {
    private static final zzalk zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzalk zzalk2;
        zza = zzalk2 = new zzalk();
        zzacf.zzao(zzalk.class, zzalk2);
    }

    private zzalk() {
    }

    public static /* bridge */ /* synthetic */ zzalk zzc() {
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
                    zzalj zzalj2 = new zzalj(null);
                    return zzalj2;
                }
                zzalk zzalk2 = new zzalk();
                return zzalk2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            return zzacf.zzal(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", objectArray);
        }
        return by2;
    }
}

