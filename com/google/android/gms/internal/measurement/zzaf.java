/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzan;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzbe;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class zzaf
implements zzak,
zzaq,
Iterable {
    private final SortedMap zza;
    private final Map zzb;

    public zzaf() {
        TreeMap treeMap;
        this.zza = treeMap = new TreeMap();
        this.zzb = treeMap = new TreeMap();
    }

    public zzaf(List list) {
        this();
        if (list != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
                zzaq zzaq2 = (zzaq)list.get(i3);
                this.zzb(i3, zzaq2);
            }
        }
    }

    public zzaf(zzaq ... object) {
        object = Arrays.asList(object);
        this((List)object);
    }

    public final boolean equals(Object object) {
        Object object2;
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof zzaf;
        if (n4 == 0) {
            return false;
        }
        object = (zzaf)object;
        n4 = this.zzb();
        if (n4 != (n3 = ((zzaf)object).zzb())) {
            return false;
        }
        Object object3 = this.zza;
        n4 = (int)(object3.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            return ((zzaf)object).zza.isEmpty();
        }
        object3 = (Integer)this.zza.firstKey();
        for (n4 = ((Integer)object3).intValue(); n4 <= (n3 = ((Integer)(object2 = (Integer)this.zza.lastKey())).intValue()); ++n4) {
            zzaq zzaq2;
            object2 = this.zza(n4);
            n3 = (int)(object2.equals(zzaq2 = ((zzaf)object).zza(n4)) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    public final Iterator iterator() {
        zzah zzah2 = new zzah(this);
        return zzah2;
    }

    public final String toString() {
        return this.zzb(",");
    }

    public final int zza() {
        return this.zza.size();
    }

    public final zzaq zza(int n3) {
        int n4 = this.zzb();
        if (n3 < n4) {
            n4 = (int)(this.zzc(n3) ? 1 : 0);
            if (n4 != 0) {
                SortedMap sortedMap = this.zza;
                Object object = n3;
                if ((object = (zzaq)sortedMap.get(object)) != null) {
                    return object;
                }
            }
            return zzaq.zzc;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Attempting to get element outside of current array");
        throw indexOutOfBoundsException;
    }

    public final zzaq zza(String object) {
        Object object2 = "length";
        boolean bl2 = ((String)object2).equals(object);
        if (bl2) {
            object2 = (double)this.zzb();
            object = new zzai((Double)object2);
            return object;
        }
        bl2 = this.zzc((String)object);
        if (bl2 && (object = (zzaq)(object2 = this.zzb).get(object)) != null) {
            return object;
        }
        return zzaq.zzc;
    }

    public final zzaq zza(String string2, zzh zzh2, List list) {
        Object object = "concat";
        boolean bl2 = ((String)object).equals(string2);
        if (!(bl2 || (bl2 = ((String)(object = "every")).equals(string2)) || (bl2 = ((String)(object = "filter")).equals(string2)) || (bl2 = ((String)(object = "forEach")).equals(string2)) || (bl2 = ((String)(object = "indexOf")).equals(string2)) || (bl2 = ((String)(object = "join")).equals(string2)) || (bl2 = ((String)(object = "lastIndexOf")).equals(string2)) || (bl2 = ((String)(object = "map")).equals(string2)) || (bl2 = ((String)(object = "pop")).equals(string2)) || (bl2 = ((String)(object = "push")).equals(string2)) || (bl2 = ((String)(object = "reduce")).equals(string2)) || (bl2 = ((String)(object = "reduceRight")).equals(string2)) || (bl2 = ((String)(object = "reverse")).equals(string2)) || (bl2 = ((String)(object = "shift")).equals(string2)) || (bl2 = ((String)(object = "slice")).equals(string2)) || (bl2 = ((String)(object = "some")).equals(string2)) || (bl2 = ((String)(object = "sort")).equals(string2)) || (bl2 = ((String)(object = "splice")).equals(string2)) || (bl2 = ((String)(object = "toString")).equals(string2)) || (bl2 = ((String)(object = "unshift")).equals(string2)))) {
            object = new zzas(string2);
            return zzan.zza(this, (zzaq)object, zzh2, list);
        }
        return zzbe.zza(string2, this, zzh2, list);
    }

    public final void zza(int n3, zzaq object) {
        if (n3 >= 0) {
            int n4 = this.zzb();
            if (n3 >= n4) {
                this.zzb(n3, (zzaq)object);
                return;
            }
            Integer n7 = (Integer)this.zza.lastKey();
            for (n4 = n7.intValue(); n4 >= n3; n4 += -1) {
                Object object2 = this.zza;
                Integer n8 = n4;
                if ((object2 = (zzaq)object2.get(n8)) == null) continue;
                int n10 = n4 + 1;
                this.zzb(n10, (zzaq)object2);
                object2 = this.zza;
                n8 = n4;
                object2.remove(n8);
            }
            this.zzb(n3, (zzaq)object);
            return;
        }
        String string2 = hj0_0.a(n3, "Invalid value index: ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void zza(zzaq zzaq2) {
        int n3 = this.zzb();
        this.zzb(n3, zzaq2);
    }

    public final void zza(String string2, zzaq zzaq2) {
        if (zzaq2 == null) {
            this.zzb.remove(string2);
            return;
        }
        this.zzb.put(string2, zzaq2);
    }

    public final int zzb() {
        SortedMap sortedMap = this.zza;
        boolean bl2 = sortedMap.isEmpty();
        if (bl2) {
            return 0;
        }
        return (Integer)this.zza.lastKey() + 1;
    }

    public final String zzb(String string2) {
        if (string2 == null) {
            string2 = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        SortedMap sortedMap = this.zza;
        boolean bl2 = sortedMap.isEmpty();
        if (!bl2) {
            int n3;
            bl2 = false;
            sortedMap = null;
            for (int i3 = 0; i3 < (n3 = this.zzb()); ++i3) {
                Object object = this.zza(i3);
                stringBuilder.append(string2);
                boolean bl3 = object instanceof zzax;
                if (bl3 || (bl3 = object instanceof zzao)) continue;
                object = object.zzf();
                stringBuilder.append((String)object);
            }
            int n4 = string2.length();
            stringBuilder.delete(0, n4);
        }
        return stringBuilder.toString();
    }

    public final void zzb(int n3) {
        Object object = (Integer)this.zza.lastKey();
        int n4 = (Integer)object;
        if (n3 <= n4 && n3 >= 0) {
            Object object2 = this.zza;
            Integer n7 = n3;
            object2.remove(n7);
            if (n3 == n4) {
                object = this.zza;
                object2 = n3 += -1;
                n4 = (int)(object.containsKey(object2) ? 1 : 0);
                if (n4 == 0 && n3 >= 0) {
                    object = this.zza;
                    Integer n8 = n3;
                    object2 = zzaq.zzc;
                    object.put(n8, object2);
                }
                return;
            }
            while (++n3 <= (n4 = ((Integer)(object = (Integer)this.zza.lastKey())).intValue())) {
                object = this.zza;
                object2 = n3;
                if ((object = (zzaq)object.get(object2)) == null) continue;
                object2 = this.zza;
                int n10 = n3 + -1;
                n7 = n10;
                object2.put(n7, object);
                object = this.zza;
                object2 = n3;
                object.remove(object2);
            }
        }
    }

    public final void zzb(int n3, zzaq object) {
        int n4 = 32468;
        if (n3 <= n4) {
            if (n3 >= 0) {
                if (object == null) {
                    object = this.zza;
                    Integer n7 = n3;
                    object.remove(n7);
                    return;
                }
                SortedMap sortedMap = this.zza;
                Integer n8 = n3;
                sortedMap.put(n8, object);
                return;
            }
            String string2 = hj0_0.a(n3, "Out of bounds index: ");
            object = new IndexOutOfBoundsException(string2);
            throw object;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Array too large");
        throw illegalStateException;
    }

    public final zzaq zzc() {
        boolean bl2;
        zzaf zzaf2 = new zzaf();
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Integer n3;
            Map.Entry entry = iterator.next();
            Object object = entry.getValue();
            boolean bl3 = object instanceof zzak;
            if (bl3) {
                object = zzaf2.zza;
                n3 = (Integer)entry.getKey();
                entry = (zzaq)entry.getValue();
                object.put((Integer)n3, (Object)entry);
                continue;
            }
            object = zzaf2.zza;
            n3 = (Integer)entry.getKey();
            entry = ((zzaq)entry.getValue()).zzc();
            object.put(n3, entry);
        }
        return zzaf2;
    }

    public final boolean zzc(int n3) {
        Object object;
        int n4;
        if (n3 >= 0 && n3 <= (n4 = ((Integer)(object = (Integer)this.zza.lastKey())).intValue())) {
            object = this.zza;
            Integer n7 = n3;
            return object.containsKey(n7);
        }
        String string2 = hj0_0.a(n3, "Out of bounds index: ");
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean zzc(String string2) {
        boolean bl2;
        Object object = "length";
        boolean bl3 = ((String)object).equals(string2);
        return bl3 || (bl2 = (object = this.zzb).containsKey(string2));
        {
        }
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Double zze() {
        int n3;
        SortedMap sortedMap = this.zza;
        int n4 = sortedMap.size();
        if (n4 == (n3 = 1)) {
            return this.zza(0).zze();
        }
        sortedMap = this.zza;
        n4 = sortedMap.size();
        if (n4 <= 0) {
            return 0.0;
        }
        return 0.0 / 0.0;
    }

    public final String zzf() {
        return this.toString();
    }

    public final Iterator zzg() {
        return this.zza.keySet().iterator();
    }

    public final Iterator zzh() {
        Iterator iterator = this.zza.keySet().iterator();
        Iterator iterator2 = this.zzb.keySet().iterator();
        zzae zzae2 = new zzae(this, iterator, iterator2);
        return zzae2;
    }

    public final List zzi() {
        int n3;
        int n4 = this.zzb();
        ArrayList<zzaq> arrayList = new ArrayList<zzaq>(n4);
        for (n4 = 0; n4 < (n3 = this.zzb()); ++n4) {
            zzaq zzaq2 = this.zza(n4);
            arrayList.add(zzaq2);
        }
        return arrayList;
    }

    public final void zzj() {
        this.zza.clear();
    }
}

