/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzi;
import com.google.android.gms.internal.ads.zzfzq;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class zzfzp
extends zzfzi
implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfzv zze;

    public zzfzp(zzfzv zzfzv2, SortedMap sortedMap) {
        this.zze = zzfzv2;
        super(zzfzv2, sortedMap);
    }

    public final Comparator comparator() {
        return this.zzf().comparator();
    }

    public final Object firstKey() {
        return this.zzf().firstKey();
    }

    public SortedMap headMap(Object sortedMap) {
        sortedMap = this.zzf().headMap(sortedMap);
        zzfzv zzfzv2 = this.zze;
        zzfzp zzfzp2 = new zzfzp(zzfzv2, sortedMap);
        return zzfzp2;
    }

    public final Object lastKey() {
        return this.zzf().lastKey();
    }

    public SortedMap subMap(Object sortedMap, Object object) {
        sortedMap = this.zzf().subMap(sortedMap, object);
        object = this.zze;
        zzfzp zzfzp2 = new zzfzp((zzfzv)object, sortedMap);
        return zzfzp2;
    }

    public SortedMap tailMap(Object sortedMap) {
        sortedMap = this.zzf().tailMap(sortedMap);
        zzfzv zzfzv2 = this.zze;
        zzfzp zzfzp2 = new zzfzp(zzfzv2, sortedMap);
        return zzfzp2;
    }

    public SortedMap zzf() {
        return (SortedMap)this.zza;
    }

    public SortedSet zzg() {
        zzfzv zzfzv2 = this.zze;
        SortedMap sortedMap = this.zzf();
        zzfzq zzfzq2 = new zzfzq(zzfzv2, sortedMap);
        return zzfzq2;
    }

    public SortedSet zzh() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            this.zzd = sortedSet = this.zzg();
        }
        return sortedSet;
    }
}

