/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzgf;
import com.google.android.gms.internal.icing.zzgg;

public final class zzgh
extends zzda
implements zzef {
    private static final zzgh zzj;
    private int zzb;
    private boolean zze;
    private String zzf = "";
    private long zzg;
    private double zzh;
    private zzgf zzi;

    static {
        zzgh zzgh2;
        zzj = zzgh2 = new zzgh();
        zzda.zzq(zzgh.class, zzgh2);
    }

    private zzgh() {
    }

    public static zzgg zza() {
        return (zzgg)zzj.zzl();
    }

    public static /* synthetic */ zzgh zzb() {
        return zzj;
    }

    public static /* synthetic */ void zzc(zzgh zzgh2, boolean bl2) {
        int n3;
        zzgh2.zzb = n3 = zzgh2.zzb | 1;
        zzgh2.zze = bl2;
    }

    public static /* synthetic */ void zzd(zzgh zzgh2, String string2) {
        int n3;
        string2.getClass();
        zzgh2.zzb = n3 = zzgh2.zzb | 2;
        zzgh2.zzf = string2;
    }

    public static /* synthetic */ void zze(zzgh zzgh2, zzgf zzgf2) {
        int n3;
        zzgf2.getClass();
        zzgh2.zzi = zzgf2;
        zzgh2.zzb = n3 = zzgh2.zzb | 0x10;
    }

    public final Object zzf(int n3, Object object, Object object2) {
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
                        if (n3 != n4) {
                            return null;
                        }
                        return zzj;
                    }
                    zzgg zzgg2 = new zzgg(null);
                    return zzgg2;
                }
                zzgh zzgh2 = new zzgh();
                return zzgh2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzb";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            return zzda.zzr(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1000\u0003\u0005\u1009\u0004", objectArray);
        }
        return by2;
    }
}

