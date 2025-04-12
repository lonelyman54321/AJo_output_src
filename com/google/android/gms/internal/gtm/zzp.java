/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzn;
import com.google.android.gms.internal.gtm.zzo;

public final class zzp
extends zzacf
implements zzadm {
    private static final zzp zza;
    private int zzd;
    private int zze = 1;
    private int zzf;
    private int zzg;

    static {
        zzp zzp2;
        zza = zzp2 = new zzp();
        zzacf.zzao(zzp.class, zzp2);
    }

    private zzp() {
    }

    public static /* bridge */ /* synthetic */ zzp zza() {
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
                    zzn zzn2 = new zzn(null);
                    return zzn2;
                }
                zzp zzp2 = new zzp();
                return zzp2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzo.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1004\u0001\u0003\u1004\u0002", objectArray);
        }
        return by2;
    }
}

