/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;
import java.util.Map;

public final class zzk
extends zzal {
    private final zzac zzk;

    public zzk(zzac zzac2) {
        super("internal.eventLogger");
        this.zzk = zzac2;
    }

    public final zzaq zza(zzh map2, List object) {
        zzg.zza(this.zza, 3, (List)object);
        Object object2 = (zzaq)object.get(0);
        object2 = ((zzh)((Object)map2)).zza((zzaq)object2).zzf();
        int n3 = 1;
        Object object3 = (zzaq)object.get(n3);
        object3 = ((zzh)((Object)map2)).zza((zzaq)object3).zze();
        double d2 = zzg.zza((Double)object3);
        long l2 = (long)d2;
        int n4 = 2;
        object = (zzaq)object.get(n4);
        map2 = ((zzh)((Object)map2)).zza((zzaq)object);
        boolean bl2 = map2 instanceof zzap;
        map2 = bl2 ? zzg.zza((zzap)((Object)map2)) : new Map();
        this.zzk.zza((String)object2, l2, map2);
        return zzaq.zzc;
    }
}

