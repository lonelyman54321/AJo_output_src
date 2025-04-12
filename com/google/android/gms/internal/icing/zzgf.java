/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzgd;
import com.google.android.gms.internal.icing.zzge;

public final class zzgf
extends zzda
implements zzef {
    private static final zzgf zzg;
    private int zzb;
    private String zze = "";
    private zzdg zzf;

    static {
        zzgf zzgf2;
        zzg = zzgf2 = new zzgf();
        zzda.zzq(zzgf.class, zzgf2);
    }

    private zzgf() {
        zzdg zzdg2;
        this.zzf = zzdg2 = zzda.zzw();
    }

    public static zzge zza() {
        return (zzge)zzg.zzl();
    }

    public static /* synthetic */ zzgf zzb() {
        return zzg;
    }

    public static /* synthetic */ void zzc(zzgf zzgf2, String string2) {
        int n3;
        zzgf2.zzb = n3 = zzgf2.zzb | 1;
        zzgf2.zze = string2;
    }

    public static /* synthetic */ void zzd(zzgf zzgf2, zzgd zzgd2) {
        zzgd2.getClass();
        zzdg zzdg2 = zzgf2.zzf;
        boolean bl2 = zzdg2.zza();
        if (!bl2) {
            zzgf2.zzf = zzdg2 = zzda.zzx(zzdg2);
        }
        zzgf2.zzf.add(zzgd2);
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
                        return zzg;
                    }
                    zzge zzge2 = new zzge(null);
                    return zzge2;
                }
                zzgf zzgf2 = new zzgf();
                return zzgf2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzb";
            objectArray[by2] = "zze";
            objectArray[n8] = "zzf";
            objectArray[n7] = zzgd.class;
            return zzda.zzr(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", objectArray);
        }
        return by2;
    }
}

