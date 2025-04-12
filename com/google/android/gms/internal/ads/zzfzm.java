/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzn;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgay;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class zzfzm
extends zzfzp
implements NavigableMap {
    final /* synthetic */ zzfzv zzc;

    public zzfzm(zzfzv zzfzv2, NavigableMap navigableMap) {
        this.zzc = zzfzv2;
        super(zzfzv2, navigableMap);
    }

    public final Map.Entry ceilingEntry(Object entry) {
        NavigableMap navigableMap = (NavigableMap)((SortedMap)this.zza);
        if ((entry = navigableMap.ceilingEntry(entry)) == null) {
            return null;
        }
        return this.zza(entry);
    }

    public final Object ceilingKey(Object object) {
        return ((NavigableMap)((SortedMap)this.zza)).ceilingKey(object);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet)((zzfzp)((Object)this.descendingMap())).zzh();
    }

    public final NavigableMap descendingMap() {
        NavigableMap navigableMap = this.zza;
        navigableMap = ((NavigableMap)((SortedMap)navigableMap)).descendingMap();
        zzfzv zzfzv2 = this.zzc;
        zzfzm zzfzm2 = new zzfzm(zzfzv2, navigableMap);
        return zzfzm2;
    }

    public final Map.Entry firstEntry() {
        Map.Entry entry = ((NavigableMap)((SortedMap)this.zza)).firstEntry();
        if (entry == null) {
            return null;
        }
        return this.zza(entry);
    }

    public final Map.Entry floorEntry(Object entry) {
        NavigableMap navigableMap = (NavigableMap)((SortedMap)this.zza);
        if ((entry = navigableMap.floorEntry(entry)) == null) {
            return null;
        }
        return this.zza(entry);
    }

    public final Object floorKey(Object object) {
        return ((NavigableMap)((SortedMap)this.zza)).floorKey(object);
    }

    public final NavigableMap headMap(Object navigableMap, boolean bl2) {
        Map map2 = this.zza;
        navigableMap = ((NavigableMap)((SortedMap)map2)).headMap(navigableMap, bl2);
        zzfzv zzfzv2 = this.zzc;
        zzfzm zzfzm2 = new zzfzm(zzfzv2, navigableMap);
        return zzfzm2;
    }

    public final /* synthetic */ SortedMap headMap(Object object) {
        return this.headMap(object, false);
    }

    public final Map.Entry higherEntry(Object entry) {
        NavigableMap navigableMap = (NavigableMap)((SortedMap)this.zza);
        if ((entry = navigableMap.higherEntry(entry)) == null) {
            return null;
        }
        return this.zza(entry);
    }

    public final Object higherKey(Object object) {
        return ((NavigableMap)((SortedMap)this.zza)).higherKey(object);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet)super.zzh();
    }

    public final Map.Entry lastEntry() {
        Map.Entry entry = ((NavigableMap)((SortedMap)this.zza)).lastEntry();
        if (entry == null) {
            return null;
        }
        return this.zza(entry);
    }

    public final Map.Entry lowerEntry(Object entry) {
        NavigableMap navigableMap = (NavigableMap)((SortedMap)this.zza);
        if ((entry = navigableMap.lowerEntry(entry)) == null) {
            return null;
        }
        return this.zza(entry);
    }

    public final Object lowerKey(Object object) {
        return ((NavigableMap)((SortedMap)this.zza)).lowerKey(object);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet)super.zzh();
    }

    public final Map.Entry pollFirstEntry() {
        Iterator iterator = this.entrySet().iterator();
        return this.zzc(iterator);
    }

    public final Map.Entry pollLastEntry() {
        Iterator iterator = this.descendingMap().entrySet().iterator();
        return this.zzc(iterator);
    }

    public final NavigableMap subMap(Object navigableMap, boolean bl2, Object object, boolean bl3) {
        Map map2 = this.zza;
        navigableMap = ((NavigableMap)((SortedMap)map2)).subMap(navigableMap, bl2, object, bl3);
        zzfzv zzfzv2 = this.zzc;
        zzfzm zzfzm2 = new zzfzm(zzfzv2, navigableMap);
        return zzfzm2;
    }

    public final NavigableMap tailMap(Object navigableMap, boolean bl2) {
        Map map2 = this.zza;
        navigableMap = ((NavigableMap)((SortedMap)map2)).tailMap(navigableMap, bl2);
        zzfzv zzfzv2 = this.zzc;
        zzfzm zzfzm2 = new zzfzm(zzfzv2, navigableMap);
        return zzfzm2;
    }

    public final /* synthetic */ SortedMap tailMap(Object object) {
        return this.tailMap(object, true);
    }

    public final Map.Entry zzc(Iterator iterator) {
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return null;
        }
        Object object = (Map.Entry)iterator.next();
        Object object2 = this.zzc.zza();
        Collection collection = (Collection)object.getValue();
        object2.addAll(collection);
        iterator.remove();
        iterator = object.getKey();
        object = this.zzc.zzb((Collection)object2);
        object2 = new zzgay(iterator, object);
        return object2;
    }

    public final NavigableSet zzd() {
        Map map2 = this.zza;
        map2 = (NavigableMap)((SortedMap)map2);
        zzfzv zzfzv2 = this.zzc;
        zzfzn zzfzn2 = new zzfzn(zzfzv2, (NavigableMap)map2);
        return zzfzn2;
    }

    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap)((SortedMap)this.zza);
    }

    public final /* synthetic */ SortedSet zzh() {
        return (NavigableSet)super.zzh();
    }
}

