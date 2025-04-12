/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaaj;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzk;

public final class zzaak
extends zzacf
implements zzadm {
    private static final zzaak zza;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;

    static {
        zzaak zzaak2;
        zza = zzaak2 = new zzaak();
        zzacf.zzao(zzaak.class, zzaak2);
    }

    private zzaak() {
    }

    public static /* bridge */ /* synthetic */ zzaak zzc() {
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
                    zzaaj zzaaj2 = new zzaaj(null);
                    return zzaaj2;
                }
                zzaak zzaak2 = new zzaak();
                return zzaak2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzzk.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = object;
            objectArray[n4] = "zzg";
            objectArray[6] = "zzh";
            objectArray[7] = object;
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u1008\u0002\u0004\u180c\u0003", objectArray);
            return object2;
        }
        return by2;
    }
}

