/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzagt;
import com.google.android.gms.internal.gtm.zzagu;

public final class zzagv
extends zzacf
implements zzadm {
    private static final zzagv zza;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private zzack zzi;
    private String zzj;

    static {
        zzagv zzagv2;
        zza = zzagv2 = new zzagv();
        zzacf.zzao(zzagv.class, zzagv2);
    }

    private zzagv() {
        zzack zzack2;
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = zzack2 = zzacf.zzah();
        this.zzj = string2;
    }

    public static /* bridge */ /* synthetic */ zzagv zzc() {
        return zza;
    }

    public static zzagv zze() {
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
                    zzagt zzagt2 = new zzagt(null);
                    return zzagt2;
                }
                zzagv zzagv2 = new zzagv();
                return zzagv2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            objectArray[6] = object = zzagu.zza;
            objectArray[7] = "zzj";
            return zzacf.zzal(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u081e\u0006\u1008\u0004", objectArray);
        }
        return by2;
    }
}

