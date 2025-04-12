/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzxx;

public final class zzxz
extends zzacf
implements zzadm {
    private static final zzxz zza;
    private int zzd;
    private String zze;
    private boolean zzf;
    private String zzg;

    static {
        zzxz zzxz2;
        zza = zzxz2 = new zzxz();
        zzacf.zzao(zzxz.class, zzxz2);
    }

    private zzxz() {
        String string2;
        this.zze = string2 = "";
        this.zzf = true;
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzxz zza() {
        return zza;
    }

    public static zzxz zzc() {
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
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzxx zzxx2 = new zzxx(null);
                    return zzxx2;
                }
                zzxz zzxz2 = new zzxz();
                return zzxz2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1008\u0002", objectArray);
        }
        return by2;
    }
}

