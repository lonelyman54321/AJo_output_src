/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzl;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class zzfzq
extends zzfzl
implements SortedSet {
    final /* synthetic */ zzfzv zzc;

    public zzfzq(zzfzv zzfzv2, SortedMap sortedMap) {
        this.zzc = zzfzv2;
        super(zzfzv2, sortedMap);
    }

    public final Comparator comparator() {
        return this.zza().comparator();
    }

    public final Object first() {
        return this.zza().firstKey();
    }

    public SortedSet headSet(Object sortedMap) {
        sortedMap = this.zza().headMap(sortedMap);
        zzfzv zzfzv2 = this.zzc;
        zzfzq zzfzq2 = new zzfzq(zzfzv2, sortedMap);
        return zzfzq2;
    }

    public final Object last() {
        return this.zza().lastKey();
    }

    public SortedSet subSet(Object sortedMap, Object object) {
        sortedMap = this.zza().subMap(sortedMap, object);
        object = this.zzc;
        zzfzq zzfzq2 = new zzfzq((zzfzv)object, sortedMap);
        return zzfzq2;
    }

    public SortedSet tailSet(Object sortedMap) {
        sortedMap = this.zza().tailMap(sortedMap);
        zzfzv zzfzv2 = this.zzc;
        zzfzq zzfzq2 = new zzfzq(zzfzv2, sortedMap);
        return zzfzq2;
    }

    public SortedMap zza() {
        return (SortedMap)this.zzd;
    }
}

