/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzej;
import com.google.android.gms.internal.clearcut.zzel;
import com.google.android.gms.internal.clearcut.zzem;
import com.google.android.gms.internal.clearcut.zzep;
import com.google.android.gms.internal.clearcut.zzer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzei
extends AbstractMap {
    private boolean zzgu;
    private final int zzol;
    private List zzom;
    private Map zzon;
    private volatile zzer zzoo;
    private Map zzop;
    private volatile zzel zzoq;

    private zzei(int n3) {
        this.zzol = n3;
        Map map2 = Collections.emptyList();
        this.zzom = map2;
        map2 = Collections.emptyMap();
        this.zzon = map2;
        this.zzop = map2 = Collections.emptyMap();
    }

    public /* synthetic */ zzei(int n3, zzej zzej2) {
        this(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int zza(Comparable comparable) {
        int n3;
        List list = this.zzom;
        int n4 = list.size();
        int n7 = n4 + -1;
        if (n7 >= 0) {
            Comparable comparable2 = (Comparable)((zzep)this.zzom.get(n7)).getKey();
            n3 = comparable.compareTo(comparable2);
            if (n3 > 0) {
                ++n4;
                return -n4;
            }
            if (n3 == 0) {
                return n7;
            }
        }
        n4 = 0;
        list = null;
        while (n4 <= n7) {
            n3 = (n4 + n7) / 2;
            Comparable comparable3 = (Comparable)((zzep)this.zzom.get(n3)).getKey();
            int n8 = comparable.compareTo(comparable3);
            if (n8 < 0) {
                n7 = n3 + -1;
                continue;
            }
            if (n8 <= 0) return n3;
            n4 = n3 + 1;
        }
        ++n4;
        return -n4;
    }

    public static /* synthetic */ Object zza(zzei zzei2, int n3) {
        return zzei2.zzal(n3);
    }

    public static /* synthetic */ void zza(zzei zzei2) {
        zzei2.zzdu();
    }

    public static zzei zzaj(int n3) {
        zzej zzej2 = new zzej(n3);
        return zzej2;
    }

    private final Object zzal(int n3) {
        this.zzdu();
        Object object = ((zzep)this.zzom.remove(n3)).getValue();
        Object object2 = this.zzon;
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = this.zzdv().entrySet().iterator();
            List list = this.zzom;
            Map.Entry entry = (Map.Entry)object2.next();
            zzep zzep2 = new zzep(this, entry);
            list.add(zzep2);
            object2.remove();
        }
        return object;
    }

    public static /* synthetic */ List zzb(zzei zzei2) {
        return zzei2.zzom;
    }

    public static /* synthetic */ Map zzc(zzei zzei2) {
        return zzei2.zzon;
    }

    public static /* synthetic */ Map zzd(zzei zzei2) {
        return zzei2.zzop;
    }

    private final void zzdu() {
        boolean bl2 = this.zzgu;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    private final SortedMap zzdv() {
        this.zzdu();
        NavigableMap navigableMap = this.zzon;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.zzon) instanceof TreeMap)) {
            this.zzon = navigableMap = new NavigableMap();
            this.zzop = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.zzon;
    }

    public void clear() {
        this.zzdu();
        Object object = this.zzom;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            object = this.zzom;
            object.clear();
        }
        if (!(bl2 = (object = this.zzon).isEmpty())) {
            object = this.zzon;
            object.clear();
        }
    }

    public boolean containsKey(Object object) {
        Map map2;
        boolean bl2;
        int n3 = this.zza((Comparable)(object = (Comparable)object));
        return n3 >= 0 || (bl2 = (map2 = this.zzon).containsKey(object));
        {
        }
    }

    public Set entrySet() {
        zzer zzer2 = this.zzoo;
        if (zzer2 == null) {
            this.zzoo = zzer2 = new zzer(this, null);
        }
        return this.zzoo;
    }

    public boolean equals(Object object) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof zzei;
        if (n7 == 0) {
            return super.equals(object);
        }
        object = (zzei)object;
        n7 = this.size();
        if (n7 != (n4 = ((zzei)object).size())) {
            return false;
        }
        n4 = this.zzdr();
        if (n4 != (n3 = ((zzei)object).zzdr())) {
            Set set = this.entrySet();
            object = ((zzei)object).entrySet();
            return set.equals(object);
        }
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry;
            Map.Entry entry2 = this.zzak(n3);
            boolean bl3 = entry2.equals(entry = ((zzei)object).zzak(n3));
            if (bl3) continue;
            return false;
        }
        if (n4 != n7) {
            Map map2 = this.zzon;
            object = ((zzei)object).zzon;
            return map2.equals(object);
        }
        return bl2;
    }

    public Object get(Object object) {
        int n3 = this.zza((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((zzep)this.zzom.get(n3)).getValue();
        }
        return this.zzon.get(object);
    }

    public int hashCode() {
        int n3 = this.zzdr();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzep zzep2 = (zzep)this.zzom.get(i3);
            int n7 = zzep2.hashCode();
            n4 += n7;
        }
        Map map2 = this.zzon;
        n3 = map2.size();
        if (n3 > 0) {
            map2 = this.zzon;
            n3 = map2.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        object = (Comparable)object;
        return this.zza((Comparable)object, object2);
    }

    public Object remove(Object object) {
        this.zzdu();
        object = (Comparable)object;
        int n3 = this.zza((Comparable)object);
        if (n3 >= 0) {
            return this.zzal(n3);
        }
        Map map2 = this.zzon;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.zzon.remove(object);
    }

    public int size() {
        int n3 = this.zzom.size();
        return this.zzon.size() + n3;
    }

    public final Object zza(Comparable comparable, Object object) {
        Object object2;
        int n3;
        this.zzdu();
        int n4 = this.zza(comparable);
        if (n4 >= 0) {
            return ((zzep)this.zzom.get(n4)).setValue(object);
        }
        this.zzdu();
        Object object3 = this.zzom;
        int n7 = object3.isEmpty();
        if (n7 != 0 && (n7 = (object3 = this.zzom) instanceof ArrayList) == 0) {
            n3 = this.zzol;
            object3 = new ArrayList(n3);
            this.zzom = object3;
        }
        if ((n4 = -(n4 + 1)) >= (n7 = this.zzol)) {
            return this.zzdv().put(comparable, object);
        }
        object3 = this.zzom;
        n7 = object3.size();
        if (n7 == (n3 = this.zzol)) {
            object3 = this.zzom;
            object3 = (zzep)object3.remove(n3 += -1);
            object2 = this.zzdv();
            Comparable comparable2 = (Comparable)((zzep)object3).getKey();
            object3 = ((zzep)object3).getValue();
            object2.put(comparable2, object3);
        }
        object3 = this.zzom;
        object2 = new zzep(this, comparable, object);
        object3.add(n4, object2);
        return null;
    }

    public final Map.Entry zzak(int n3) {
        return (Map.Entry)this.zzom.get(n3);
    }

    public final int zzdr() {
        return this.zzom.size();
    }

    public final Iterable zzds() {
        Map map2 = this.zzon;
        boolean bl2 = map2.isEmpty();
        if (bl2) {
            return zzem.zzdx();
        }
        return this.zzon.entrySet();
    }

    public final Set zzdt() {
        zzel zzel2 = this.zzoq;
        if (zzel2 == null) {
            this.zzoq = zzel2 = new zzel(this, null);
        }
        return this.zzoq;
    }

    public void zzv() {
        boolean bl2 = this.zzgu;
        if (!bl2) {
            Map map2 = this.zzon;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzon);
            this.zzon = map2;
            map2 = this.zzop;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzop);
            this.zzop = map2;
            this.zzgu = bl2 = true;
        }
    }
}

