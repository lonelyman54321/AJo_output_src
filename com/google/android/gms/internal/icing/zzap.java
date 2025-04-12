/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzao;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;

public final class zzap
extends zzda
implements zzef {
    private static final zzap zzh;
    private int zzb;
    private String zze;
    private String zzf;
    private int zzg;

    static {
        zzap zzap2;
        zzh = zzap2 = new zzap();
        zzda.zzq(zzap.class, zzap2);
    }

    private zzap() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
    }

    public static zzao zza() {
        return (zzao)zzh.zzl();
    }

    public static /* synthetic */ zzap zzb() {
        return zzh;
    }

    public static /* synthetic */ void zzc(zzap zzap2, String string2) {
        int n3;
        string2.getClass();
        zzap2.zzb = n3 = zzap2.zzb | 1;
        zzap2.zze = string2;
    }

    public static /* synthetic */ void zzd(zzap zzap2, String string2) {
        int n3;
        string2.getClass();
        zzap2.zzb = n3 = zzap2.zzb | 2;
        zzap2.zzf = string2;
    }

    public static /* synthetic */ void zze(zzap zzap2, int n3) {
        int n4;
        zzap2.zzb = n4 = zzap2.zzb | 4;
        zzap2.zzg = n3;
    }

    public final Object zzf(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 4;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    by2 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            return null;
                        }
                        return zzh;
                    }
                    zzao zzao2 = new zzao(null);
                    return zzao2;
                }
                zzap zzap2 = new zzap();
                return zzap2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzb";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            return zzda.zzr(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002", objectArray);
        }
        return by2;
    }
}

