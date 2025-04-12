/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaeb;
import com.google.android.gms.internal.gtm.zzaed;
import com.google.android.gms.internal.gtm.zzaee;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzaef
extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzaed zze;
    private Map zzf;

    private zzaef() {
        Map map2;
        this.zzc = map2 = Collections.emptyMap();
        this.zzf = map2 = Collections.emptyMap();
    }

    public /* synthetic */ zzaef(zzaee map2) {
        map2 = Collections.emptyMap();
        this.zzc = map2;
        this.zzf = map2 = Collections.emptyMap();
    }

    public static /* bridge */ /* synthetic */ int zzb(zzaef zzaef2) {
        return zzaef2.zzb;
    }

    public static /* bridge */ /* synthetic */ Object zze(zzaef zzaef2, int n3) {
        return zzaef2.zzm(n3);
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzaef zzaef2) {
        return zzaef2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzaef zzaef2) {
        zzaef2.zzo();
    }

    public static /* bridge */ /* synthetic */ Object[] zzk(zzaef zzaef2) {
        return zzaef2.zza;
    }

    private final int zzl(Comparable comparable) {
        int n3;
        Comparable comparable2;
        int n4 = this.zzb;
        int n7 = n4 + -1;
        int n8 = 0;
        if (n7 >= 0) {
            comparable2 = ((zzaeb)this.zza[n7]).zza();
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
            comparable2 = ((zzaeb)this.zza[n4]).zza();
            n3 = comparable.compareTo(comparable2);
            if (n3 < 0) {
                n7 = n4 + -1;
                continue;
            }
            if (n3 > 0) {
                n8 = n4 + 1;
                continue;
            }
            return n4;
        }
        return -(n8 + 1);
    }

    private final Object zzm(int n3) {
        this.zzo();
        Object object = ((zzaeb)this.zza[n3]).getValue();
        Object[] objectArray = this.zza;
        int n4 = this.zzb - n3 + -1;
        int n7 = n3 + 1;
        System.arraycopy(objectArray, n7, objectArray, n3, n4);
        this.zzb = n3 = this.zzb + -1;
        Object object2 = this.zzc;
        n3 = (int)(object2.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            int n8;
            object2 = this.zzn().entrySet().iterator();
            objectArray = this.zza;
            n4 = this.zzb;
            Map.Entry entry = (Map.Entry)object2.next();
            Comparable comparable = (Comparable)entry.getKey();
            entry = entry.getValue();
            zzaeb zzaeb2 = new zzaeb(this, comparable, entry);
            objectArray[n4] = zzaeb2;
            this.zzb = n8 = this.zzb + 1;
            object2.remove();
        }
        return object;
    }

    private final SortedMap zzn() {
        this.zzo();
        NavigableMap navigableMap = this.zzc;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.zzc) instanceof TreeMap)) {
            this.zzc = navigableMap = new NavigableMap();
            this.zzf = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    private final void zzo() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void clear() {
        Map map2;
        this.zzo();
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

    public final boolean containsKey(Object object) {
        Map map2;
        boolean bl2;
        int n3 = this.zzl((Comparable)(object = (Comparable)object));
        return n3 >= 0 || (bl2 = (map2 = this.zzc).containsKey(object));
        {
        }
    }

    public final Set entrySet() {
        zzaed zzaed2 = this.zze;
        if (zzaed2 == null) {
            this.zze = zzaed2 = new zzaed(this, null);
        }
        return this.zze;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof zzaef;
        if (n4 == 0) {
            return super.equals(object);
        }
        object = (zzaef)object;
        n4 = this.size();
        if (n4 == (n3 = ((zzaef)object).size())) {
            n3 = this.zzb;
            int n7 = ((zzaef)object).zzb;
            if (n3 == n7) {
                for (n7 = 0; n7 < n3; ++n7) {
                    Map.Entry entry;
                    Map.Entry entry2 = this.zzg(n7);
                    boolean bl3 = ((Object)entry2).equals(entry = ((zzaef)object).zzg(n7));
                    if (bl3) continue;
                    return false;
                }
                if (n3 != n4) {
                    Map map2 = this.zzc;
                    object = ((zzaef)object).zzc;
                    return ((Object)map2).equals(object);
                }
                return bl2;
            }
            Set set = this.entrySet();
            object = ((zzaef)object).entrySet();
            return ((Object)set).equals(object);
        }
        return false;
    }

    public final Object get(Object object) {
        int n3 = this.zzl((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((zzaeb)this.zza[n3]).getValue();
        }
        return this.zzc.get(object);
    }

    public final int hashCode() {
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
            return ((Object)this.zzc).hashCode() + n4;
        }
        return n4;
    }

    public final Object remove(Object object) {
        this.zzo();
        object = (Comparable)object;
        int n3 = this.zzl((Comparable)object);
        if (n3 >= 0) {
            return this.zzm(n3);
        }
        Map map2 = this.zzc;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.zzc.remove(object);
    }

    public final int size() {
        int n3 = this.zzb;
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

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        Object object = this.zzc;
        boolean bl2 = object.isEmpty();
        object = bl2 ? Collections.emptySet() : this.zzc.entrySet();
        return object;
    }

    public final Object zzf(Comparable comparable, Object object) {
        int n3;
        Object object2;
        this.zzo();
        int n4 = this.zzl(comparable);
        if (n4 >= 0) {
            return ((zzaeb)this.zza[n4]).setValue(object);
        }
        this.zzo();
        Object object3 = this.zza;
        int n7 = 16;
        if (object3 == null) {
            object3 = new Object[n7];
            this.zza = object3;
        }
        if ((n4 = -(n4 + 1)) >= n7) {
            return this.zzn().put(comparable, object);
        }
        int n8 = this.zzb;
        if (n8 == n7) {
            object3 = this.zza;
            n7 = 15;
            object3 = (zzaeb)object3[n7];
            this.zzb = n7;
            object2 = this.zzn();
            Comparable comparable2 = ((zzaeb)object3).zza();
            object3 = ((zzaeb)object3).getValue();
            object2.put(comparable2, object3);
        }
        object3 = this.zza;
        n7 = n4 + 1;
        int n10 = ((Object[])object3).length;
        n10 = 15 - n4;
        System.arraycopy(object3, n4, object3, n7, n10);
        object3 = this.zza;
        object3[n4] = object2 = new zzaeb(this, comparable, object);
        this.zzb = n3 = this.zzb + 1;
        return null;
    }

    public final Map.Entry zzg(int n3) {
        int n4 = this.zzb;
        if (n3 < n4) {
            return (zzaeb)this.zza[n3];
        }
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(n3);
        throw arrayIndexOutOfBoundsException;
    }

    public final boolean zzj() {
        return this.zzd;
    }
}

