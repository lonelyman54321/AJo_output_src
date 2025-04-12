/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzes;
import com.google.android.gms.internal.icing.zzev;
import com.google.android.gms.internal.icing.zzew;
import com.google.android.gms.internal.icing.zzey;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzez
extends AbstractMap {
    private final int zza;
    private List zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzey zze;
    private Map zzf;

    public /* synthetic */ zzez(int n3, zzes zzes2) {
        this.zza = n3;
        Map map2 = Collections.emptyList();
        this.zzb = map2;
        map2 = Collections.emptyMap();
        this.zzc = map2;
        this.zzf = map2 = Collections.emptyMap();
    }

    public static /* synthetic */ void zzg(zzez zzez2) {
        zzez2.zzm();
    }

    public static /* synthetic */ List zzh(zzez zzez2) {
        return zzez2.zzb;
    }

    public static /* synthetic */ Map zzi(zzez zzez2) {
        return zzez2.zzc;
    }

    public static /* synthetic */ Object zzj(zzez zzez2, int n3) {
        return zzez2.zzk(n3);
    }

    private final Object zzk(int n3) {
        this.zzm();
        Object object = ((zzew)this.zzb.remove(n3)).getValue();
        Object object2 = this.zzc;
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = this.zzn().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry)object2.next();
            Comparable comparable = (Comparable)entry.getKey();
            entry = entry.getValue();
            zzew zzew2 = new zzew(this, comparable, entry);
            list.add(zzew2);
            object2.remove();
        }
        return object;
    }

    private final int zzl(Comparable comparable) {
        int n3;
        Comparable comparable2;
        List list = this.zzb;
        int n4 = list.size();
        int n7 = n4 + -1;
        int n8 = 0;
        if (n7 >= 0) {
            comparable2 = ((zzew)this.zzb.get(n7)).zza();
            n3 = comparable.compareTo(comparable2);
            if (n3 > 0) {
                return -(n4 + 1);
            }
            if (n3 == 0) {
                return n7;
            }
        }
        while (n8 <= n7) {
            n4 = (n8 + n7) / 2;
            comparable2 = ((zzew)this.zzb.get(n4)).zza();
            n3 = comparable.compareTo(comparable2);
            if (n3 < 0) {
                n7 = n4 += -1;
                continue;
            }
            if (n3 > 0) {
                n8 = ++n4;
                continue;
            }
            return n4;
        }
        return -(n8 + 1);
    }

    private final void zzm() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    private final SortedMap zzn() {
        this.zzm();
        NavigableMap navigableMap = this.zzc;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.zzc) instanceof TreeMap)) {
            this.zzc = navigableMap = new NavigableMap();
            this.zzf = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    public final void clear() {
        this.zzm();
        Object object = this.zzb;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            object = this.zzb;
            object.clear();
        }
        if (!(bl2 = (object = this.zzc).isEmpty())) {
            object = this.zzc;
            object.clear();
        }
    }

    public final boolean containsKey(Object object) {
        Map map2;
        boolean bl2;
        int n3 = this.zzl((Comparable)(object = (Comparable)object));
        return n3 >= 0 || (bl2 = (map2 = this.zzc).containsKey(object));
        {
        }
    }

    public final Set entrySet() {
        zzey zzey2 = this.zze;
        if (zzey2 == null) {
            this.zze = zzey2 = new zzey(this, null);
        }
        return this.zze;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof zzez;
        if (n7 == 0) {
            return super.equals(object);
        }
        object = (zzez)object;
        n7 = this.size();
        if (n7 != (n4 = ((zzez)object).size())) {
            return false;
        }
        n4 = this.zzc();
        if (n4 == (n3 = ((zzez)object).zzc())) {
            for (n3 = 0; n3 < n4; ++n3) {
                Map.Entry entry;
                Map.Entry entry2 = this.zzd(n3);
                boolean bl3 = entry2.equals(entry = ((zzez)object).zzd(n3));
                if (bl3) continue;
                return false;
            }
            if (n4 != n7) {
                Map map2 = this.zzc;
                object = ((zzez)object).zzc;
                return map2.equals(object);
            }
            return bl2;
        }
        Set set = this.entrySet();
        object = ((zzez)object).entrySet();
        return set.equals(object);
    }

    public final Object get(Object object) {
        int n3 = this.zzl((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((zzew)this.zzb.get(n3)).getValue();
        }
        return this.zzc.get(object);
    }

    public final int hashCode() {
        int n3 = this.zzc();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzew zzew2 = (zzew)this.zzb.get(i3);
            int n7 = zzew2.hashCode();
            n4 += n7;
        }
        Map map2 = this.zzc;
        n3 = map2.size();
        if (n3 > 0) {
            return this.zzc.hashCode() + n4;
        }
        return n4;
    }

    public final Object remove(Object object) {
        this.zzm();
        object = (Comparable)object;
        int n3 = this.zzl((Comparable)object);
        if (n3 >= 0) {
            return this.zzk(n3);
        }
        Map map2 = this.zzc;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.zzc.remove(object);
    }

    public final int size() {
        int n3 = this.zzb.size();
        return this.zzc.size() + n3;
    }

    public void zza() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            Map map2 = this.zzc;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
            this.zzc = map2;
            map2 = this.zzf;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
            this.zzf = map2;
            this.zzd = bl2 = true;
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Map.Entry zzd(int n3) {
        return (Map.Entry)this.zzb.get(n3);
    }

    public final Iterable zze() {
        Object object = this.zzc;
        boolean bl2 = object.isEmpty();
        object = bl2 ? zzev.zza() : this.zzc.entrySet();
        return object;
    }

    public final Object zzf(Comparable comparable, Object object) {
        Object object2;
        int n3;
        this.zzm();
        int n4 = this.zzl(comparable);
        if (n4 >= 0) {
            return ((zzew)this.zzb.get(n4)).setValue(object);
        }
        this.zzm();
        Object object3 = this.zzb;
        int n7 = object3.isEmpty();
        if (n7 != 0 && (n7 = (object3 = this.zzb) instanceof ArrayList) == 0) {
            n3 = this.zza;
            object3 = new ArrayList(n3);
            this.zzb = object3;
        }
        if ((n4 = -(n4 + 1)) >= (n7 = this.zza)) {
            return this.zzn().put(comparable, object);
        }
        object3 = this.zzb;
        n7 = object3.size();
        if (n7 == (n3 = this.zza)) {
            object3 = this.zzb;
            object3 = (zzew)object3.remove(n3 += -1);
            object2 = this.zzn();
            Comparable comparable2 = ((zzew)object3).zza();
            object3 = ((zzew)object3).getValue();
            object2.put(comparable2, object3);
        }
        object3 = this.zzb;
        object2 = new zzew(this, comparable, object);
        object3.add(n4, object2);
        return null;
    }
}

