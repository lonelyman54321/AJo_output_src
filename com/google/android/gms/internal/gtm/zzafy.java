/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafx;

public final class zzafy
extends zzacf
implements zzadm {
    private static final zzafy zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzafy zzafy2;
        zza = zzafy2 = new zzafy();
        zzacf.zzao(zzafy.class, zzafy2);
    }

    private zzafy() {
    }

    public static /* bridge */ /* synthetic */ zzafy zzc() {
        return zza;
    }

    public static zzafy zze() {
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
                    zzafx zzafx2 = new zzafx(null);
                    return zzafx2;
                }
                zzafy zzafy2 = new zzafy();
                return zzafy2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzh";
            objectArray[n8] = "zzi";
            objectArray[n7] = "zzf";
            objectArray[n4] = "zzg";
            return zzacf.zzal(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0003\u0003\u1007\u0004\u0004\u1007\u0001\u0005\u1007\u0002", objectArray);
        }
        return by2;
    }
}

