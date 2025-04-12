/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzt;

public final class zzzu
extends zzacf
implements zzadm {
    private static final zzzu zza;
    private int zzd;
    private String zze;
    private String zzf;
    private boolean zzg;
    private String zzh;

    static {
        zzzu zzzu2;
        zza = zzzu2 = new zzzu();
        zzacf.zzao(zzzu.class, zzzu2);
    }

    private zzzu() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzh = string2;
    }

    public static /* bridge */ /* synthetic */ zzzu zzc() {
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
                    zzzt zzzt2 = new zzzt(null);
                    return zzzt2;
                }
                zzzu zzzu2 = new zzzu();
                return zzzu2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1008\u0003", objectArray);
            return object2;
        }
        return by2;
    }
}

