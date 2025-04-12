/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzr;

public final class zzzs
extends zzacf
implements zzadm {
    private static final zzzs zza;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzzs zzzs2;
        zza = zzzs2 = new zzzs();
        zzacf.zzao(zzzs.class, zzzs2);
    }

    private zzzs() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzzs zzc() {
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
                    zzzr zzzr2 = new zzzr(null);
                    return zzzr2;
                }
                zzzs zzzs2 = new zzzs();
                return zzzs2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1007\u0003\u0006\u1007\u0004", objectArray);
            return object2;
        }
        return by2;
    }
}

