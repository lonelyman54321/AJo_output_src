/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzac {
    private zzad zza;
    private zzad zzb;
    private List zzc;

    public zzac() {
        String string2 = "";
        long l2 = 0L;
        ArrayList arrayList = new ArrayList(string2, l2, null);
        this.zza = arrayList;
        arrayList = new ArrayList(string2, l2, null);
        this.zzb = arrayList;
        this.zzc = arrayList = new ArrayList();
    }

    private zzac(zzad arrayList) {
        this.zza = arrayList;
        arrayList = (zzad)((zzad)((Object)arrayList)).clone();
        this.zzb = arrayList;
        this.zzc = arrayList = new ArrayList();
    }

    public final /* synthetic */ Object clone() {
        boolean bl2;
        Object object = (zzad)this.zza.clone();
        zzac zzac2 = new zzac((zzad)object);
        object = this.zzc.iterator();
        while (bl2 = object.hasNext()) {
            zzad zzad2 = (zzad)object.next();
            List list = zzac2.zzc;
            zzad2 = (zzad)zzad2.clone();
            list.add(zzad2);
        }
        return zzac2;
    }

    public final zzad zza() {
        return this.zza;
    }

    public final void zza(zzad zzad2) {
        this.zza = zzad2;
        this.zzb = zzad2 = (zzad)zzad2.clone();
        this.zzc.clear();
    }

    public final void zza(String string2, long l2, Map object) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object2 = object.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            String string3 = (String)object2.next();
            Object object3 = this.zza.zza(string3);
            Object v4 = object.get(string3);
            object3 = zzad.zza(string3, object3, v4);
            hashMap.put(string3, object3);
        }
        object = this.zzc;
        object2 = new zzad(string2, l2, hashMap);
        object.add(object2);
    }

    public final zzad zzb() {
        return this.zzb;
    }

    public final void zzb(zzad zzad2) {
        this.zzb = zzad2;
    }

    public final List zzc() {
        return this.zzc;
    }
}

