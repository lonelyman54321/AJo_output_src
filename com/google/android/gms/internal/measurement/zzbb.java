/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzba;
import com.google.android.gms.internal.measurement.zzbc;
import com.google.android.gms.internal.measurement.zzbg;
import com.google.android.gms.internal.measurement.zzbi;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzbb {
    private Map zza;
    private zzbq zzb;

    public zzbb() {
        Object object = new HashMap();
        this.zza = object;
        this.zzb = object = new zzbq();
        object = new zzaw();
        this.zza((zzay)object);
        object = new zzba();
        this.zza((zzay)object);
        object = new zzbc();
        this.zza((zzay)object);
        object = new zzbg();
        this.zza((zzay)object);
        object = new zzbi();
        this.zza((zzay)object);
        object = new zzbo();
        this.zza((zzay)object);
        object = new zzbt();
        this.zza((zzay)object);
    }

    private final void zza(zzay zzay2) {
        boolean bl2;
        Iterator iterator = zzay2.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = ((zzbv)((Object)iterator.next())).toString();
            Map map2 = this.zza;
            map2.put(string2, zzay2);
        }
    }

    public final zzaq zza(zzh zzh2, zzaq object) {
        zzg.zza(zzh2);
        boolean bl2 = object instanceof zzat;
        if (bl2) {
            object = (zzat)object;
            ArrayList arrayList = ((zzat)object).zzb();
            Object object2 = this.zza;
            boolean bl3 = object2.containsKey(object = ((zzat)object).zza());
            object2 = bl3 ? (zzay)this.zza.get(object) : this.zzb;
            return ((zzay)object2).zza((String)object, zzh2, arrayList);
        }
        return object;
    }
}

