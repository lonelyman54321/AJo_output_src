/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzq;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgbm;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

final class zzfzn
extends zzfzq
implements NavigableSet {
    final /* synthetic */ zzfzv zzb;

    public zzfzn(zzfzv zzfzv2, NavigableMap navigableMap) {
        this.zzb = zzfzv2;
        super(zzfzv2, navigableMap);
    }

    public final Object ceiling(Object object) {
        return ((NavigableMap)((SortedMap)this.zzd)).ceilingKey(object);
    }

    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        NavigableMap navigableMap = ((NavigableMap)((SortedMap)this.zzd)).descendingMap();
        zzfzv zzfzv2 = this.zzb;
        zzfzn zzfzn2 = new zzfzn(zzfzv2, navigableMap);
        return zzfzn2;
    }

    public final Object floor(Object object) {
        return ((NavigableMap)((SortedMap)this.zzd)).floorKey(object);
    }

    public final NavigableSet headSet(Object navigableMap, boolean bl2) {
        navigableMap = ((NavigableMap)((SortedMap)this.zzd)).headMap(navigableMap, bl2);
        zzfzv zzfzv2 = this.zzb;
        zzfzn zzfzn2 = new zzfzn(zzfzv2, navigableMap);
        return zzfzn2;
    }

    public final /* synthetic */ SortedSet headSet(Object object) {
        return this.headSet(object, false);
    }

    public final Object higher(Object object) {
        return ((NavigableMap)((SortedMap)this.zzd)).higherKey(object);
    }

    public final Object lower(Object object) {
        return ((NavigableMap)((SortedMap)this.zzd)).lowerKey(object);
    }

    public final Object pollFirst() {
        return zzgbm.zza(this.iterator());
    }

    public final Object pollLast() {
        return zzgbm.zza(this.descendingIterator());
    }

    public final NavigableSet subSet(Object navigableMap, boolean bl2, Object object, boolean bl3) {
        navigableMap = ((NavigableMap)((SortedMap)this.zzd)).subMap(navigableMap, bl2, object, bl3);
        zzfzv zzfzv2 = this.zzb;
        zzfzn zzfzn2 = new zzfzn(zzfzv2, navigableMap);
        return zzfzn2;
    }

    public final NavigableSet tailSet(Object navigableMap, boolean bl2) {
        navigableMap = ((NavigableMap)((SortedMap)this.zzd)).tailMap(navigableMap, bl2);
        zzfzv zzfzv2 = this.zzb;
        zzfzn zzfzn2 = new zzfzn(zzfzv2, navigableMap);
        return zzfzn2;
    }

    public final /* synthetic */ SortedSet tailSet(Object object) {
        return this.tailSet(object, true);
    }

    public final /* synthetic */ SortedMap zza() {
        return (NavigableMap)((SortedMap)this.zzd);
    }
}

