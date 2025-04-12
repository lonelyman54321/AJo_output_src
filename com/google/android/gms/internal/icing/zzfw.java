/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzfv;
import com.google.android.gms.internal.icing.zzfy;

public final class zzfw
extends zzda
implements zzef {
    private static final zzfw zzj;
    private int zzb;
    private boolean zze;
    private int zzf;
    private String zzg = "";
    private zzdg zzh;
    private zzdg zzi;

    static {
        zzfw zzfw2;
        zzj = zzfw2 = new zzfw();
        zzda.zzq(zzfw.class, zzfw2);
    }

    private zzfw() {
        zzdg zzdg2;
        this.zzh = zzdg2 = zzda.zzw();
        this.zzi = zzdg2 = zzda.zzw();
    }

    public static zzfw zzd() {
        return zzj;
    }

    public static /* synthetic */ zzfw zze() {
        return zzj;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final Object zzf(int n3, Object clazz, Object object) {
        byte by2 = 1;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    by2 = 0;
                    clazz = null;
                    if (n3 != n7) {
                        if (n3 != n4) {
                            return null;
                        }
                        return zzj;
                    }
                    zzfv zzfv2 = new zzfv(null);
                    return zzfv2;
                }
                zzfw zzfw2 = new zzfw();
                return zzfw2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zzb";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = clazz = zzfy.class;
            objectArray[6] = "zzi";
            objectArray[7] = clazz;
            return zzda.zzr(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u001b\u0005\u001b", objectArray);
        }
        return by2;
    }
}

