/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzamd;
import com.google.android.gms.internal.gtm.zzame;

public final class zzamf
extends zzacf
implements zzadm {
    private static final zzamf zza;
    private int zzd;
    private int zze;
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
        zzamf zzamf2;
        zza = zzamf2 = new zzamf();
        zzacf.zzao(zzamf.class, zzamf2);
    }

    private zzamf() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
        this.zzj = string2;
        this.zzk = string2;
        this.zzl = string2;
        this.zzm = string2;
        this.zzn = string2;
    }

    public static /* bridge */ /* synthetic */ zzamf zzc() {
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
                    zzamd zzamd2 = new zzamd(null);
                    return zzamd2;
                }
                zzamf zzamf2 = new zzamf();
                return zzamf2;
            }
            Object[] objectArray = new Object[12];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzame.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            objectArray[n4] = "zzh";
            objectArray[6] = "zzi";
            objectArray[7] = "zzj";
            objectArray[8] = "zzk";
            objectArray[9] = "zzl";
            objectArray[10] = "zzm";
            objectArray[11] = "zzn";
            return zzacf.zzal(zza, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u1008\t", objectArray);
        }
        return by2;
    }
}

