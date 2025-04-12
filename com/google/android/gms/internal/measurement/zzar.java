/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.List;

public final class zzar
extends zzal
implements zzak {
    private final List zzk;
    private final List zzl;
    private zzh zzm;

    private zzar(zzar object) {
        ArrayList arrayList = ((zzal)object).zza;
        super((String)((Object)arrayList));
        int n3 = ((zzar)object).zzk.size();
        this.zzk = arrayList = new ArrayList(n3);
        List list = ((zzar)object).zzk;
        arrayList.addAll(list);
        n3 = ((zzar)object).zzl.size();
        this.zzl = arrayList = new ArrayList(n3);
        list = ((zzar)object).zzl;
        arrayList.addAll(list);
        this.zzm = object = ((zzar)object).zzm;
    }

    public zzar(String arrayList, List object, List list, zzh object2) {
        super((String)((Object)arrayList));
        arrayList = new ArrayList();
        this.zzk = arrayList;
        this.zzm = object2;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            boolean bl3;
            arrayList = object.iterator();
            while (bl3 = arrayList.hasNext()) {
                object = (zzaq)arrayList.next();
                object2 = this.zzk;
                object = object.zzf();
                object2.add(object);
            }
        }
        this.zzl = arrayList = new ArrayList(list);
    }

    public final zzaq zza(zzh object, List object2) {
        boolean bl2;
        Object object3;
        int n3;
        zzh zzh2 = this.zzm.zza();
        zzaq zzaq2 = null;
        for (int i3 = 0; i3 < (n3 = (object3 = this.zzk).size()); ++i3) {
            zzaq zzaq3;
            n3 = object2.size();
            if (i3 < n3) {
                object3 = (String)this.zzk.get(i3);
                zzaq3 = (zzaq)object2.get(i3);
                zzaq3 = ((zzh)object).zza(zzaq3);
                zzh2.zza((String)object3, zzaq3);
                continue;
            }
            object3 = (String)this.zzk.get(i3);
            zzaq3 = zzaq.zzc;
            zzh2.zza((String)object3, zzaq3);
        }
        object = this.zzl.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzaq)object.next();
            zzaq2 = zzh2.zza((zzaq)object2);
            n3 = zzaq2 instanceof zzat;
            if (n3 != 0) {
                zzaq2 = zzh2.zza((zzaq)object2);
            }
            if (!(bl2 = zzaq2 instanceof zzaj)) continue;
            return ((zzaj)zzaq2).zza();
        }
        return zzaq.zzc;
    }

    public final zzaq zzc() {
        zzar zzar2 = new zzar(this);
        return zzar2;
    }
}

