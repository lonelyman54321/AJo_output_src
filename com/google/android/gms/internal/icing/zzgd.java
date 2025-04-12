/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzgc;
import com.google.android.gms.internal.icing.zzgh;

public final class zzgd
extends zzda
implements zzef {
    private static final zzgd zzg;
    private int zzb;
    private String zze = "";
    private zzgh zzf;

    static {
        zzgd zzgd2;
        zzg = zzgd2 = new zzgd();
        zzda.zzq(zzgd.class, zzgd2);
    }

    private zzgd() {
    }

    public static zzgc zza() {
        return (zzgc)zzg.zzl();
    }

    public static /* synthetic */ zzgd zzb() {
        return zzg;
    }

    public static /* synthetic */ void zzc(zzgd zzgd2, String string2) {
        int n3;
        string2.getClass();
        zzgd2.zzb = n3 = zzgd2.zzb | 1;
        zzgd2.zze = string2;
    }

    public static /* synthetic */ void zzd(zzgd zzgd2, zzgh zzgh2) {
        int n3;
        zzgh2.getClass();
        zzgd2.zzf = zzgh2;
        zzgd2.zzb = n3 = zzgd2.zzb | 2;
    }

    public final Object zzf(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    n4 = 4;
                    n7 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            return null;
                        }
                        return zzg;
                    }
                    zzgc zzgc2 = new zzgc(null);
                    return zzgc2;
                }
                zzgd zzgd2 = new zzgd();
                return zzgd2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzb";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzda.zzr(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", objectArray);
        }
        return (byte)n4;
    }
}

