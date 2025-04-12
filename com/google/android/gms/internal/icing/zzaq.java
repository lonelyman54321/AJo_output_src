/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzan;
import com.google.android.gms.internal.icing.zzap;
import com.google.android.gms.internal.icing.zzbs;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzef;
import java.util.List;

public final class zzaq
extends zzda
implements zzef {
    private static final zzaq zze;
    private zzdg zzb;

    static {
        zzaq zzaq2;
        zze = zzaq2 = new zzaq();
        zzda.zzq(zzaq.class, zzaq2);
    }

    private zzaq() {
        zzdg zzdg2;
        this.zzb = zzdg2 = zzda.zzw();
    }

    public static zzan zza() {
        return (zzan)zze.zzl();
    }

    public static /* synthetic */ zzaq zzb() {
        return zze;
    }

    public static /* synthetic */ void zzc(zzaq object, Iterable iterable) {
        zzdg zzdg2 = ((zzaq)object).zzb;
        boolean bl2 = zzdg2.zza();
        if (!bl2) {
            ((zzaq)object).zzb = zzdg2 = zzda.zzx(zzdg2);
        }
        object = ((zzaq)object).zzb;
        zzbs.zzk(iterable, (List)object);
    }

    public final Object zzf(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    n7 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            return null;
                        }
                        return zze;
                    }
                    zzan zzan2 = new zzan(null);
                    return zzan2;
                }
                zzaq zzaq2 = new zzaq();
                return zzaq2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzb";
            objectArray[n4] = zzap.class;
            return zzda.zzr(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objectArray);
        }
        return (byte)n4;
    }
}

