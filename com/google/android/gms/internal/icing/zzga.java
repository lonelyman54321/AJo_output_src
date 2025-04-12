/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzfw;
import com.google.android.gms.internal.icing.zzfy;
import com.google.android.gms.internal.icing.zzfz;

public final class zzga
extends zzda
implements zzef {
    private static final zzga zzi;
    private int zzb;
    private String zze;
    private String zzf;
    private zzdg zzg;
    private zzfw zzh;

    static {
        zzga zzga2;
        zzi = zzga2 = new zzga();
        zzda.zzq(zzga.class, zzga2);
    }

    private zzga() {
        Object object = "";
        this.zze = object;
        this.zzf = object;
        this.zzg = object = zzda.zzw();
    }

    public static /* synthetic */ zzga zza() {
        return zzi;
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
                        return zzi;
                    }
                    zzfz zzfz2 = new zzfz(null);
                    return zzfz2;
                }
                zzga zzga2 = new zzga();
                return zzga2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzb";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = zzfy.class;
            objectArray[n4] = "zzh";
            return zzda.zzr(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1009\u0002", objectArray);
        }
        return by2;
    }
}

