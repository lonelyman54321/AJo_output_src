/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaah;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzk;

public final class zzaai
extends zzacf
implements zzadm {
    private static final zzaai zza;
    private int zzd;
    private int zze;
    private String zzf;
    private int zzg;
    private String zzh;

    static {
        zzaai zzaai2;
        zza = zzaai2 = new zzaai();
        zzacf.zzao(zzaai.class, zzaai2);
    }

    private zzaai() {
        String string2;
        this.zzf = string2 = "";
        this.zzh = string2;
    }

    public static /* bridge */ /* synthetic */ zzaai zzc() {
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
                    zzaah zzaah2 = new zzaah(null);
                    return zzaah2;
                }
                zzaai zzaai2 = new zzaai();
                return zzaai2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zzd";
            objectArray[by2] = "zzh";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zze";
            objectArray[n7] = object = zzzk.zza;
            objectArray[n4] = "zzg";
            objectArray[6] = object;
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0003\u0002\u1008\u0001\u0003\u180c\u0000\u0004\u180c\u0002", objectArray);
            return object2;
        }
        return by2;
    }
}

