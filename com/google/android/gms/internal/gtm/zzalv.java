/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalt;
import com.google.android.gms.internal.gtm.zzalu;

public final class zzalv
extends zzacf
implements zzadm {
    private static final zzalv zza;
    private int zzd;
    private String zze;
    private int zzf;
    private String zzg;
    private String zzh;
    private String zzi;

    static {
        zzalv zzalv2;
        zza = zzalv2 = new zzalv();
        zzacf.zzao(zzalv.class, zzalv2);
    }

    private zzalv() {
        String string2;
        this.zze = string2 = "";
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
    }

    public static /* bridge */ /* synthetic */ zzalv zzc() {
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
                    zzalt zzalt2 = new zzalt(null);
                    return zzalt2;
                }
                zzalv zzalv2 = new zzalv();
                return zzalv2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = object = zzalu.zza;
            objectArray[n7] = "zzg";
            objectArray[n4] = "zzh";
            objectArray[6] = "zzi";
            return zzacf.zzal(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", objectArray);
        }
        return by2;
    }
}

