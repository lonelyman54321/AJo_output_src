/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdc;
import com.google.android.gms.internal.icing.zzdd;
import com.google.android.gms.internal.icing.zzdf;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzfx;
import com.google.android.gms.internal.icing.zzga;

public final class zzfy
extends zzda
implements zzef {
    private static final zzfy zzl;
    private int zzb;
    private String zze = "";
    private zzdc zzf;
    private zzdf zzg;
    private zzdg zzh;
    private zzdg zzi;
    private zzcf zzj;
    private zzdd zzk;

    static {
        zzfy zzfy2;
        zzl = zzfy2 = new zzfy();
        zzda.zzq(zzfy.class, zzfy2);
    }

    private zzfy() {
        Iterable iterable;
        this.zzf = iterable = zzda.zzv();
        iterable = zzda.zzt();
        this.zzg = iterable;
        iterable = zzda.zzw();
        this.zzh = iterable;
        iterable = zzda.zzw();
        this.zzi = iterable;
        iterable = zzcf.zzb;
        this.zzj = iterable;
        iterable = zzda.zzu();
        this.zzk = iterable;
    }

    public static /* synthetic */ zzfy zza() {
        return zzl;
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
                        return zzl;
                    }
                    zzfx zzfx2 = new zzfx(null);
                    return zzfx2;
                }
                zzfy zzfy2 = new zzfy();
                return zzfy2;
            }
            Object[] objectArray = new Object[9];
            objectArray[0] = "zzb";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            objectArray[6] = zzga.class;
            objectArray[7] = "zzj";
            objectArray[8] = "zzk";
            return zzda.zzr(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0005\u0000\u0001\u1008\u0000\u0002\u0019\u0003\u0014\u0004\u001a\u0005\u001b\u0006\u100a\u0001\u0007\u0012", objectArray);
        }
        return by2;
    }
}

