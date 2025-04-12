/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzakn;
import com.google.android.gms.internal.gtm.zzako;
import com.google.android.gms.internal.gtm.zzakr;
import com.google.android.gms.internal.gtm.zzaks;
import com.google.android.gms.internal.gtm.zzakw;

public final class zzakx
extends zzacf
implements zzadm {
    private static final zzakx zza;
    private int zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private String zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private zzakw zzm;
    private zzakr zzn;

    static {
        zzakx zzakx2;
        zza = zzakx2 = new zzakx();
        zzacf.zzao(zzakx.class, zzakx2);
    }

    private zzakx() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzh = string2;
        this.zzi = string2;
        this.zzk = string2;
        this.zzl = string2;
    }

    public static /* bridge */ /* synthetic */ zzakx zzc() {
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
                    zzakn zzakn2 = new zzakn(null);
                    return zzakn2;
                }
                zzakx zzakx2 = new zzakx();
                return zzakx2;
            }
            Object[] objectArray = new Object[13];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = object = zzako.zza;
            objectArray[n4] = "zzh";
            objectArray[6] = "zzi";
            objectArray[7] = "zzj";
            objectArray[8] = object = zzaks.zza;
            objectArray[9] = "zzk";
            objectArray[10] = "zzl";
            objectArray[11] = "zzm";
            objectArray[12] = "zzn";
            return zzacf.zzal(zza, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u180c\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u180c\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1009\b\n\u1009\t", objectArray);
        }
        return by2;
    }
}

