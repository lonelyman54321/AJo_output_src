/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzan;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzap
implements zzak,
zzaq {
    private final Map zza;

    public zzap() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzap;
        if (!bl2) {
            return false;
        }
        object = (zzap)object;
        Map map2 = this.zza;
        object = ((zzap)object).zza;
        return ((Object)map2).equals(object);
    }

    public int hashCode() {
        return ((Object)this.zza).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        Object object = this.zza;
        int n3 = object.isEmpty();
        if (n3 == 0) {
            int n4;
            object = this.zza.keySet().iterator();
            while ((n4 = object.hasNext()) != 0) {
                String string2 = (String)object.next();
                Object v4 = this.zza.get(string2);
                int n7 = 2;
                Object[] objectArray = new Object[n7];
                objectArray[0] = string2;
                n4 = 1;
                objectArray[n4] = v4;
                string2 = String.format("%s: %s,", objectArray);
                stringBuilder.append(string2);
            }
            object = ",";
            n3 = stringBuilder.lastIndexOf((String)object);
            stringBuilder.deleteCharAt(n3);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final zzaq zza(String string2) {
        Map map2 = this.zza;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return (zzaq)this.zza.get(string2);
        }
        return zzaq.zzc;
    }

    public zzaq zza(String object, zzh object2, List list) {
        Object object3 = "toString";
        boolean bl2 = ((String)object3).equals(object);
        if (bl2) {
            object2 = this.toString();
            object = new zzas((String)object2);
            return object;
        }
        object3 = new zzas((String)object);
        return zzan.zza(this, (zzaq)object3, (zzh)object2, list);
    }

    public final List zza() {
        Set set = this.zza.keySet();
        ArrayList arrayList = new ArrayList(set);
        return arrayList;
    }

    public final void zza(String string2, zzaq zzaq2) {
        if (zzaq2 == null) {
            this.zza.remove(string2);
            return;
        }
        this.zza.put(string2, zzaq2);
    }

    public final zzaq zzc() {
        boolean bl2;
        zzap zzap2 = new zzap();
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            Map.Entry entry = iterator.next();
            Object object = entry.getValue();
            boolean bl3 = object instanceof zzak;
            if (bl3) {
                object = zzap2.zza;
                string2 = (String)entry.getKey();
                entry = (zzaq)entry.getValue();
                object.put((String)string2, (Object)entry);
                continue;
            }
            object = zzap2.zza;
            string2 = (String)entry.getKey();
            entry = ((zzaq)entry.getValue()).zzc();
            object.put(string2, entry);
        }
        return zzap2;
    }

    public final boolean zzc(String string2) {
        return this.zza.containsKey(string2);
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Double zze() {
        return 0.0 / 0.0;
    }

    public final String zzf() {
        return "[object Object]";
    }

    public final Iterator zzh() {
        return zzan.zza(this.zza);
    }
}

