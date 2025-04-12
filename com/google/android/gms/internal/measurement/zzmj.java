/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zzmo;
import com.google.android.gms.internal.measurement.zzmp;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzmj
extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzmp zze;
    private Map zzf;

    private zzmj() {
        Map map2;
        this.zzc = map2 = Collections.emptyMap();
        this.zzf = map2 = Collections.emptyMap();
    }

    public /* synthetic */ zzmj(zzmo zzmo2) {
        this();
    }

    public static /* bridge */ /* synthetic */ int zza(zzmj zzmj2) {
        return zzmj2.zzb;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int zza(Comparable comparable) {
        int n3;
        int n4 = this.zzb;
        int n7 = n4 + -1;
        if (n7 >= 0) {
            Comparable comparable2 = (Comparable)((zzmn)this.zza[n7]).getKey();
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
        while (n4 <= n7) {
            n3 = (n4 + n7) / 2;
            Comparable comparable3 = (Comparable)((zzmn)this.zza[n3]).getKey();
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

    public static /* synthetic */ Object zza(zzmj zzmj2, int n3) {
        return zzmj2.zzb(n3);
    }

    private final Object zzb(int n3) {
        this.zzg();
        Object object = ((zzmn)this.zza[n3]).getValue();
        Object[] objectArray = this.zza;
        int n4 = n3 + 1;
        int n7 = this.zzb - n3 + -1;
        System.arraycopy(objectArray, n4, objectArray, n3, n7);
        this.zzb = n3 = this.zzb + -1;
        Object object2 = this.zzc;
        n3 = (int)(object2.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            int n8;
            object2 = this.zzf().entrySet().iterator();
            objectArray = this.zza;
            n4 = this.zzb;
            Map.Entry entry = (Map.Entry)object2.next();
            zzmn zzmn2 = new zzmn(this, entry);
            objectArray[n4] = zzmn2;
            this.zzb = n8 = this.zzb + 1;
            object2.remove();
        }
        return object;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzmj zzmj2) {
        return zzmj2.zzc;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzmj zzmj2) {
        return zzmj2.zzf;
    }

    public static /* synthetic */ void zzd(zzmj zzmj2) {
        zzmj2.zzg();
    }

    public static /* bridge */ /* synthetic */ Object[] zze(zzmj zzmj2) {
        return zzmj2.zza;
    }

    private final SortedMap zzf() {
        this.zzg();
        NavigableMap navigableMap = this.zzc;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.zzc) instanceof TreeMap)) {
            this.zzc = navigableMap = new NavigableMap();
            this.zzf = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    private final void zzg() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void clear() {
        Map map2;
        this.zzg();
        int n3 = this.zzb;
        if (n3 != 0) {
            this.zza = null;
            n3 = 0;
            map2 = null;
            this.zzb = 0;
        }
        if ((n3 = (int)((map2 = this.zzc).isEmpty() ? 1 : 0)) == 0) {
            map2 = this.zzc;
            map2.clear();
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
        zzmp zzmp2 = this.zze;
        if (zzmp2 == null) {
            this.zze = zzmp2 = new zzmp(this, null);
        }
        return this.zze;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof zzmj;
        if (n4 == 0) {
            return super.equals(object);
        }
        object = (zzmj)object;
        n4 = this.size();
        if (n4 != (n3 = ((zzmj)object).size())) {
            return false;
        }
        n3 = this.zzb;
        int n7 = ((zzmj)object).zzb;
        if (n3 != n7) {
            Set set = this.entrySet();
            object = ((zzmj)object).entrySet();
            return ((Object)set).equals(object);
        }
        for (n7 = 0; n7 < n3; ++n7) {
            Map.Entry entry;
            Map.Entry entry2 = this.zza(n7);
            boolean bl3 = ((Object)entry2).equals(entry = ((zzmj)object).zza(n7));
            if (bl3) continue;
            return false;
        }
        if (n3 != n4) {
            Map map2 = this.zzc;
            object = ((zzmj)object).zzc;
            return ((Object)map2).equals(object);
        }
        return bl2;
    }

    public Object get(Object object) {
        int n3 = this.zza((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((zzmn)this.zza[n3]).getValue();
        }
        return this.zzc.get(object);
    }

    public int hashCode() {
        int n3 = this.zzb;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.zza[i3];
            int n7 = object.hashCode();
            n4 += n7;
        }
        Map map2 = this.zzc;
        n3 = map2.size();
        if (n3 > 0) {
            map2 = this.zzc;
            n3 = ((Object)map2).hashCode();
            n4 += n3;
        }
        return n4;
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        object = (Comparable)object;
        return this.zza((Comparable)object, object2);
    }

    public Object remove(Object object) {
        this.zzg();
        object = (Comparable)object;
        int n3 = this.zza((Comparable)object);
        if (n3 >= 0) {
            return this.zzb(n3);
        }
        Map map2 = this.zzc;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.zzc.remove(object);
    }

    public int size() {
        int n3 = this.zzb;
        return this.zzc.size() + n3;
    }

    public final Object zza(Comparable comparable, Object object) {
        int n3;
        int n4;
        Object object2;
        this.zzg();
        int n7 = this.zza(comparable);
        if (n7 >= 0) {
            return ((zzmn)this.zza[n7]).setValue(object);
        }
        this.zzg();
        Object object3 = this.zza;
        int n8 = 16;
        if (object3 == null) {
            object3 = new Object[n8];
            this.zza = object3;
        }
        if ((n7 = -(n7 + 1)) >= n8) {
            return this.zzf().put(comparable, object);
        }
        int n10 = this.zzb;
        if (n10 == n8) {
            object2 = this.zza;
            n4 = 15;
            object2 = (zzmn)object2[n4];
            this.zzb = n10 += -1;
            object3 = this.zzf();
            Comparable comparable2 = (Comparable)((zzmn)object2).getKey();
            object2 = ((zzmn)object2).getValue();
            object3.put(comparable2, object2);
        }
        object3 = this.zza;
        n8 = n7 + 1;
        n4 = ((Object[])object3).length - n7 + -1;
        System.arraycopy(object3, n7, object3, n8, n4);
        object3 = this.zza;
        object3[n7] = object2 = new zzmn(this, comparable, object);
        this.zzb = n3 = this.zzb + 1;
        return null;
    }

    public final Map.Entry zza(int n3) {
        int n4 = this.zzb;
        if (n3 < n4) {
            return (zzmn)this.zza[n3];
        }
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(n3);
        throw arrayIndexOutOfBoundsException;
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
        return this.zzb;
    }

    public final Iterable zzc() {
        Map map2 = this.zzc;
        boolean bl2 = map2.isEmpty();
        if (bl2) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    public final Set zzd() {
        zzmk zzmk2 = new zzmk(this, null);
        return zzmk2;
    }

    public final boolean zze() {
        return this.zzd;
    }
}

