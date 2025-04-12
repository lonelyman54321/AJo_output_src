/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzxu;
import com.google.android.gms.internal.gtm.zzye;

public final class zzxw
extends zzacf
implements zzadm {
    private static final zzxw zza;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private zzye zzh;

    static {
        zzxw zzxw2;
        zza = zzxw2 = new zzxw();
        zzacf.zzao(zzxw.class, zzxw2);
    }

    private zzxw() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzxw zza() {
        return zza;
    }

    public static zzxw zzc() {
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
                    zzxu zzxu2 = new zzxu(null);
                    return zzxu2;
                }
                zzxw zzxw2 = new zzxw();
                return zzxw2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            return zzacf.zzal(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003", objectArray);
        }
        return by2;
    }
}

