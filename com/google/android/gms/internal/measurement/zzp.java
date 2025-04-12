/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzo;
import java.util.List;

final class zzp
extends zzal {
    private final /* synthetic */ zzo zzk;

    public zzp(zzm zzm2, String string2, zzo zzo2) {
        this.zzk = zzo2;
        super(string2);
    }

    public final zzaq zza(zzh object, List object2) {
        zzg.zza("getValue", 2, (List)object2);
        Object object3 = (zzaq)object2.get(0);
        object3 = ((zzh)object).zza((zzaq)object3);
        int n3 = 1;
        object2 = (zzaq)object2.get(n3);
        object = ((zzh)object).zza((zzaq)object2);
        object2 = object3.zzf();
        object3 = this.zzk;
        object2 = object3.zza((String)object2);
        if (object2 != null) {
            object = new zzas((String)object2);
        }
        return object;
    }
}

