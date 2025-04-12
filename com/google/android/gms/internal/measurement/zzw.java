/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzw
extends zzal {
    private zzaa zzk;

    public zzw(zzaa zzaa2) {
        super("internal.registerCallback");
        this.zzk = zzaa2;
    }

    public final zzaq zza(zzh object, List object2) {
        zzg.zza(this.zza, 3, (List)object2);
        Object object3 = (zzaq)object2.get(0);
        object3 = ((zzh)object).zza((zzaq)object3).zzf();
        int n3 = 1;
        zzaq zzaq2 = (zzaq)object2.get(n3);
        zzaq2 = ((zzh)object).zza(zzaq2);
        int n4 = zzaq2 instanceof zzar;
        if (n4 != 0) {
            n4 = 2;
            boolean bl2 = (object = ((zzh)object).zza((zzaq)(object2 = (zzaq)object2.get(n4)))) instanceof zzap;
            if (bl2) {
                object2 = "type";
                n4 = (int)(((zzap)(object = (zzap)object)).zzc((String)object2) ? 1 : 0);
                if (n4 != 0) {
                    int n7;
                    object2 = ((zzap)object).zza((String)object2).zzf();
                    Object object4 = "priority";
                    boolean bl3 = ((zzap)object).zzc((String)object4);
                    if (bl3) {
                        object = ((zzap)object).zza((String)object4).zze();
                        double d2 = (Double)object;
                        n7 = zzg.zzb(d2);
                    } else {
                        n7 = 1000;
                    }
                    object4 = this.zzk;
                    zzaq2 = (zzar)zzaq2;
                    ((zzaa)object4).zza((String)object3, n7, (zzar)zzaq2, (String)object2);
                    return zzaq.zzc;
                }
                object = new IllegalArgumentException("Undefined rule type");
                throw object;
            }
            object = new IllegalArgumentException("Invalid callback params");
            throw object;
        }
        object = new IllegalArgumentException("Invalid callback type");
        throw object;
    }
}

