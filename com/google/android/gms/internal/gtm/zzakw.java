/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaku;
import com.google.android.gms.internal.gtm.zzakv;

public final class zzakw
extends zzacf
implements zzadm {
    private static final zzakw zza;
    private int zzd;
    private zzacn zze;
    private boolean zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;

    static {
        zzakw zzakw2;
        zza = zzakw2 = new zzakw();
        zzacf.zzao(zzakw.class, zzakw2);
    }

    private zzakw() {
        Object object = zzacf.zzai();
        this.zze = object;
        this.zzg = object = "";
        this.zzh = object;
        this.zzi = object;
        this.zzj = object;
        this.zzk = object;
        this.zzl = object;
    }

    public static /* bridge */ /* synthetic */ zzakw zzc() {
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
                    zzakv zzakv2 = new zzakv(null);
                    return zzakv2;
                }
                zzakw zzakw2 = new zzakw();
                return zzakw2;
            }
            Object[] objectArray = new Object[10];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = zzaku.class;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            objectArray[n4] = "zzh";
            objectArray[6] = "zzi";
            objectArray[7] = "zzj";
            objectArray[8] = "zzk";
            objectArray[9] = "zzl";
            return zzacf.zzal(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1008\u0003\u0006\u1008\u0004\u0007\u1008\u0005\b\u1008\u0006", objectArray);
        }
        return by2;
    }
}

