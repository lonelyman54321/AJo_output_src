/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzgn;
import com.google.android.gms.internal.auth.zzgo;
import com.google.android.gms.internal.auth.zzgs;
import com.google.android.gms.internal.auth.zzgt;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzgu
extends AbstractMap {
    private final int zza;
    private List zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzgs zze;
    private Map zzf;

    public /* synthetic */ zzgu(int n3, zzgt zzgt2) {
        this.zza = n3;
        Map map2 = Collections.emptyList();
        this.zzb = map2;
        map2 = Collections.emptyMap();
        this.zzc = map2;
        this.zzf = map2 = Collections.emptyMap();
    }

    public static /* bridge */ /* synthetic */ Object zzd(zzgu zzgu2, int n3) {
        return zzgu2.zzl(n3);
    }

    public static /* bridge */ /* synthetic */ List zzf(zzgu zzgu2) {
        return zzgu2.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzgu zzgu2) {
        return zzgu2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzgu zzgu2) {
        zzgu2.zzn();
    }

    private final int zzk(Comparable comparable) {
        int n3;
        Comparable comparable2;
        List list = this.zzb;
        int n4 = list.size();
        int n7 = n4 + -1;
        int n8 = 0;
        if (n7 >= 0) {
            comparable2 = ((zzgo)this.zzb.get(n7)).zza();
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
            comparable2 = ((zzgo)this.zzb.get(n4)).zza();
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

    private final Object zzl(int n3) {
        this.zzn();
        Object object = ((zzgo)this.zzb.remove(n3)).getValue();
        Object object2 = this.zzc;
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = this.zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry)object2.next();
            Comparable comparable = (Comparable)entry.getKey();
            entry = entry.getValue();
            zzgo zzgo2 = new zzgo(this, comparable, entry);
            list.add(zzgo2);
            object2.remove();
        }
        return object;
    }

    private final SortedMap zzm() {
        this.zzn();
        NavigableMap navigableMap = this.zzc;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.zzc) instanceof TreeMap)) {
            this.zzc = navigableMap = new NavigableMap();
            this.zzf = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    private final void zzn() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void clear() {
        this.zzn();
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
        int n3 = this.zzk((Comparable)(object = (Comparable)object));
        return n3 >= 0 || (bl2 = (map2 = this.zzc).containsKey(object));
        {
        }
    }

    public final Set entrySet() {
        zzgs zzgs2 = this.zze;
        if (zzgs2 == null) {
            this.zze = zzgs2 = new zzgs(this, null);
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
        int n7 = object instanceof zzgu;
        if (n7 == 0) {
            return super.equals(object);
        }
        object = (zzgu)object;
        n7 = this.size();
        if (n7 != (n4 = ((zzgu)object).size())) {
            return false;
        }
        n4 = this.zzb();
        if (n4 == (n3 = ((zzgu)object).zzb())) {
            for (n3 = 0; n3 < n4; ++n3) {
                Map.Entry entry;
                Map.Entry entry2 = this.zzg(n3);
                boolean bl3 = ((Object)entry2).equals(entry = ((zzgu)object).zzg(n3));
                if (bl3) continue;
                return false;
            }
            if (n4 != n7) {
                Map map2 = this.zzc;
                object = ((zzgu)object).zzc;
                return ((Object)map2).equals(object);
            }
            return bl2;
        }
        Set set = this.entrySet();
        object = ((zzgu)object).entrySet();
        return ((Object)set).equals(object);
    }

    public final Object get(Object object) {
        int n3 = this.zzk((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((zzgo)this.zzb.get(n3)).getValue();
        }
        return this.zzc.get(object);
    }

    public final int hashCode() {
        int n3 = this.zzb();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzgo zzgo2 = (zzgo)this.zzb.get(i3);
            int n7 = zzgo2.hashCode();
            n4 += n7;
        }
        Map map2 = this.zzc;
        n3 = map2.size();
        if (n3 > 0) {
            return ((Object)this.zzc).hashCode() + n4;
        }
        return n4;
    }

    public final Object remove(Object object) {
        this.zzn();
        object = (Comparable)object;
        int n3 = this.zzk((Comparable)object);
        if (n3 >= 0) {
            return this.zzl(n3);
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

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        Object object = this.zzc;
        boolean bl2 = object.isEmpty();
        object = bl2 ? zzgn.zza() : this.zzc.entrySet();
        return object;
    }

    public final Object zze(Comparable comparable, Object object) {
        Object object2;
        int n3;
        this.zzn();
        int n4 = this.zzk(comparable);
        if (n4 >= 0) {
            return ((zzgo)this.zzb.get(n4)).setValue(object);
        }
        this.zzn();
        Object object3 = this.zzb;
        int n7 = object3.isEmpty();
        if (n7 != 0 && (n7 = (object3 = this.zzb) instanceof ArrayList) == 0) {
            n3 = this.zza;
            object3 = new ArrayList(n3);
            this.zzb = object3;
        }
        if ((n4 = -(n4 + 1)) >= (n7 = this.zza)) {
            return this.zzm().put(comparable, object);
        }
        object3 = this.zzb;
        n7 = object3.size();
        if (n7 == (n3 = this.zza)) {
            object3 = this.zzb;
            object3 = (zzgo)object3.remove(n3 += -1);
            object2 = this.zzm();
            Comparable comparable2 = ((zzgo)object3).zza();
            object3 = ((zzgo)object3).getValue();
            object2.put(comparable2, object3);
        }
        object3 = this.zzb;
        object2 = new zzgo(this, comparable, object);
        object3.add(n4, object2);
        return null;
    }

    public final Map.Entry zzg(int n3) {
        return (Map.Entry)this.zzb.get(n3);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}

