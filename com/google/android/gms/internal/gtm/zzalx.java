/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalw;

public final class zzalx
extends zzacf
implements zzadm {
    private static final zzalx zza;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;

    static {
        zzalx zzalx2;
        zza = zzalx2 = new zzalx();
        zzacf.zzao(zzalx.class, zzalx2);
    }

    private zzalx() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
        this.zzj = string2;
        this.zzk = string2;
    }

    public static /* bridge */ /* synthetic */ zzalx zzc() {
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
                    zzalw zzalw2 = new zzalw(null);
                    return zzalw2;
                }
                zzalx zzalx2 = new zzalx();
                return zzalx2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzg";
            objectArray[n8] = "zzh";
            objectArray[n7] = "zzi";
            objectArray[n4] = "zzj";
            objectArray[6] = "zzf";
            objectArray[7] = "zzk";
            return zzacf.zzal(zza, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0001\b\u1008\u0006", objectArray);
        }
        return by2;
    }
}

