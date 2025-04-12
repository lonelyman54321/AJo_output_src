/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzbb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzh {
    private final zzh zza;
    private zzbb zzb;
    private Map zzc;
    private Map zzd;

    public zzh(zzh zzh2, zzbb zzbb2) {
        HashMap hashMap;
        this.zzc = hashMap = new HashMap();
        this.zzd = hashMap = new HashMap();
        this.zza = zzh2;
        this.zzb = zzbb2;
    }

    public final zzaq zza(zzaf zzaf2) {
        boolean bl2;
        zzaq zzaq2 = zzaq.zzc;
        Iterator iterator = zzaf2.zzg();
        while (bl2 = iterator.hasNext()) {
            int n3 = (Integer)iterator.next();
            zzbb zzbb2 = this.zzb;
            zzaq2 = zzaf2.zza(n3);
            bl2 = (zzaq2 = zzbb2.zza(this, zzaq2)) instanceof zzaj;
            if (!bl2) continue;
        }
        return zzaq2;
    }

    public final zzaq zza(zzaq zzaq2) {
        return this.zzb.zza(this, zzaq2);
    }

    public final zzaq zza(String string2) {
        Object object = this;
        do {
            Map map2;
            boolean bl2;
            if (!(bl2 = (map2 = ((zzh)object).zzc).containsKey(string2))) continue;
            return (zzaq)((zzh)object).zzc.get(string2);
        } while ((object = ((zzh)object).zza) != null);
        string2 = Ft2.a(string2, " is not defined");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final zzh zza() {
        zzbb zzbb2 = this.zzb;
        zzh zzh2 = new zzh(this, zzbb2);
        return zzh2;
    }

    public final void zza(String string2, zzaq zzaq2) {
        Map map2 = this.zzd;
        boolean bl2 = map2.containsKey(string2);
        if (!bl2) {
            if (zzaq2 == null) {
                this.zzc.remove(string2);
                return;
            }
            map2 = this.zzc;
            map2.put(string2, zzaq2);
        }
    }

    public final void zzb(String string2, zzaq object) {
        this.zza(string2, (zzaq)object);
        object = this.zzd;
        Boolean bl2 = Boolean.TRUE;
        object.put(string2, bl2);
    }

    public final boolean zzb(String string2) {
        zzh zzh2 = this;
        do {
            Map map2;
            boolean bl2;
            if (!(bl2 = (map2 = zzh2.zzc).containsKey(string2))) continue;
            return true;
        } while ((zzh2 = zzh2.zza) != null);
        return false;
    }

    public final void zzc(String string2, zzaq zzaq2) {
        Object object;
        boolean bl2;
        Object object2 = this;
        while (!(bl2 = (object = ((zzh)object2).zzc).containsKey(string2)) && (object = ((zzh)object2).zza) != null && (bl2 = ((zzh)object).zzb(string2))) {
            object2 = ((zzh)object2).zza;
        }
        object = ((zzh)object2).zzd;
        bl2 = object.containsKey(string2);
        if (!bl2) {
            if (zzaq2 == null) {
                ((zzh)object2).zzc.remove(string2);
                return;
            }
            object2 = ((zzh)object2).zzc;
            object2.put(string2, zzaq2);
        }
    }
}

