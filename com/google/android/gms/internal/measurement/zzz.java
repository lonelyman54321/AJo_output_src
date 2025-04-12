/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzz
extends zzal {
    private final zzl zzk;
    private final Map zzl;

    public zzz(zzl zzl2) {
        super("require");
        HashMap hashMap;
        this.zzl = hashMap = new HashMap();
        this.zzk = zzl2;
    }

    public final zzaq zza(zzh object, List object2) {
        int n3 = 1;
        zzg.zza("require", n3, (List)object2);
        boolean bl2 = false;
        Map map2 = null;
        object2 = (zzaq)object2.get(0);
        object = ((zzh)object).zza((zzaq)object2).zzf();
        object2 = this.zzl;
        boolean bl3 = object2.containsKey(object);
        if (bl3) {
            return (zzaq)this.zzl.get(object);
        }
        object2 = this.zzk.zza((String)object);
        bl2 = object2 instanceof zzal;
        if (bl2) {
            map2 = this.zzl;
            Object object3 = object2;
            object3 = (zzal)object2;
            map2.put(object, object3);
        }
        return (zzaq)object2;
    }
}

