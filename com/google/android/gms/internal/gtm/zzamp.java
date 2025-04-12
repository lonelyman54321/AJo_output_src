/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzamo;

public final class zzamp
extends zzacf
implements zzadm {
    private static final zzamp zza;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;

    static {
        zzamp zzamp2;
        zza = zzamp2 = new zzamp();
        zzacf.zzao(zzamp.class, zzamp2);
    }

    private zzamp() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
        this.zzj = string2;
        this.zzk = string2;
        this.zzl = string2;
        this.zzm = string2;
        this.zzn = string2;
    }

    public static /* bridge */ /* synthetic */ zzamp zzc() {
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
                    zzamo zzamo2 = new zzamo(null);
                    return zzamo2;
                }
                zzamp zzamp2 = new zzamp();
                return zzamp2;
            }
            Object[] objectArray = new Object[11];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            objectArray[6] = "zzj";
            objectArray[7] = "zzk";
            objectArray[8] = "zzl";
            objectArray[9] = "zzm";
            objectArray[10] = "zzn";
            return zzacf.zzal(zza, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u1008\t", objectArray);
        }
        return by2;
    }
}

