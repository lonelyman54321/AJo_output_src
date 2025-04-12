/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlg;
import com.google.android.gms.internal.vision.zzli;
import com.google.android.gms.internal.vision.zzll;
import com.google.android.gms.internal.vision.zzlm;
import com.google.android.gms.internal.vision.zzlo;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzlh
extends AbstractMap {
    private final int zza;
    private List zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzlo zze;
    private Map zzf;
    private volatile zzli zzg;

    private zzlh(int n3) {
        this.zza = n3;
        Map map2 = Collections.emptyList();
        this.zzb = map2;
        map2 = Collections.emptyMap();
        this.zzc = map2;
        this.zzf = map2 = Collections.emptyMap();
    }

    public /* synthetic */ zzlh(int n3, zzlg zzlg2) {
        this(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int zza(Comparable comparable) {
        int n3;
        List list = this.zzb;
        int n4 = list.size();
        int n7 = n4 + -1;
        if (n7 >= 0) {
            Comparable comparable2 = (Comparable)((zzlm)this.zzb.get(n7)).getKey();
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
            Comparable comparable3 = (Comparable)((zzlm)this.zzb.get(n3)).getKey();
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

    public static zzlh zza(int n3) {
        zzlg zzlg2 = new zzlg(n3);
        return zzlg2;
    }

    public static /* synthetic */ Object zza(zzlh zzlh2, int n3) {
        return zzlh2.zzc(n3);
    }

    public static /* synthetic */ void zza(zzlh zzlh2) {
        zzlh2.zzf();
    }

    public static /* synthetic */ List zzb(zzlh zzlh2) {
        return zzlh2.zzb;
    }

    private final Object zzc(int n3) {
        this.zzf();
        Object object = ((zzlm)this.zzb.remove(n3)).getValue();
        Object object2 = this.zzc;
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = this.zzg().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry)object2.next();
            zzlm zzlm2 = new zzlm(this, entry);
            list.add(zzlm2);
            object2.remove();
        }
        return object;
    }

    public static /* synthetic */ Map zzc(zzlh zzlh2) {
        return zzlh2.zzc;
    }

    public static /* synthetic */ Map zzd(zzlh zzlh2) {
        return zzlh2.zzf;
    }

    private final void zzf() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    private final SortedMap zzg() {
        this.zzf();
        NavigableMap navigableMap = this.zzc;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.zzc) instanceof TreeMap)) {
            this.zzc = navigableMap = new NavigableMap();
            this.zzf = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    public void clear() {
        this.zzf();
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

    public boolean containsKey(Object object) {
        Map map2;
        boolean bl2;
        int n3 = this.zza((Comparable)(object = (Comparable)object));
        return n3 >= 0 || (bl2 = (map2 = this.zzc).containsKey(object));
        {
        }
    }

    public Set entrySet() {
        zzlo zzlo2 = this.zze;
        if (zzlo2 == null) {
            this.zze = zzlo2 = new zzlo(this, null);
        }
        return this.zze;
    }

    public boolean equals(Object object) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof zzlh;
        if (n7 == 0) {
            return super.equals(object);
        }
        object = (zzlh)object;
        n7 = this.size();
        if (n7 != (n4 = ((zzlh)object).size())) {
            return false;
        }
        n4 = this.zzc();
        if (n4 != (n3 = ((zzlh)object).zzc())) {
            Set set = this.entrySet();
            object = ((zzlh)object).entrySet();
            return set.equals(object);
        }
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry;
            Map.Entry entry2 = this.zzb(n3);
            boolean bl3 = entry2.equals(entry = ((zzlh)object).zzb(n3));
            if (bl3) continue;
            return false;
        }
        if (n4 != n7) {
            Map map2 = this.zzc;
            object = ((zzlh)object).zzc;
            return map2.equals(object);
        }
        return bl2;
    }

    public Object get(Object object) {
        int n3 = this.zza((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((zzlm)this.zzb.get(n3)).getValue();
        }
        return this.zzc.get(object);
    }

    public int hashCode() {
        int n3 = this.zzc();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzlm zzlm2 = (zzlm)this.zzb.get(i3);
            int n7 = zzlm2.hashCode();
            n4 += n7;
        }
        Map map2 = this.zzc;
        n3 = map2.size();
        if (n3 > 0) {
            map2 = this.zzc;
            n3 = map2.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        object = (Comparable)object;
        return this.zza((Comparable)object, object2);
    }

    public Object remove(Object object) {
        this.zzf();
        object = (Comparable)object;
        int n3 = this.zza((Comparable)object);
        if (n3 >= 0) {
            return this.zzc(n3);
        }
        Map map2 = this.zzc;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.zzc.remove(object);
    }

    public int size() {
        int n3 = this.zzb.size();
        return this.zzc.size() + n3;
    }

    public final Object zza(Comparable comparable, Object object) {
        Object object2;
        int n3;
        this.zzf();
        int n4 = this.zza(comparable);
        if (n4 >= 0) {
            return ((zzlm)this.zzb.get(n4)).setValue(object);
        }
        this.zzf();
        Object object3 = this.zzb;
        int n7 = object3.isEmpty();
        if (n7 != 0 && (n7 = (object3 = this.zzb) instanceof ArrayList) == 0) {
            n3 = this.zza;
            object3 = new ArrayList(n3);
            this.zzb = object3;
        }
        if ((n4 = -(n4 + 1)) >= (n7 = this.zza)) {
            return this.zzg().put(comparable, object);
        }
        object3 = this.zzb;
        n7 = object3.size();
        if (n7 == (n3 = this.zza)) {
            object3 = this.zzb;
            object3 = (zzlm)object3.remove(n3 += -1);
            object2 = this.zzg();
            Comparable comparable2 = (Comparable)((zzlm)object3).getKey();
            object3 = ((zzlm)object3).getValue();
            object2.put(comparable2, object3);
        }
        object3 = this.zzb;
        object2 = new zzlm(this, comparable, object);
        object3.add(n4, object2);
        return null;
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

    public final Map.Entry zzb(int n3) {
        return (Map.Entry)this.zzb.get(n3);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Iterable zzd() {
        Map map2 = this.zzc;
        boolean bl2 = map2.isEmpty();
        if (bl2) {
            return zzll.zza();
        }
        return this.zzc.entrySet();
    }

    public final Set zze() {
        zzli zzli2 = this.zzg;
        if (zzli2 == null) {
            this.zzg = zzli2 = new zzli(this, null);
        }
        return this.zzg;
    }
}

