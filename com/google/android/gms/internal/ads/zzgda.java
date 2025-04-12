/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzgcz;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

final class zzgda
extends zzgcz
implements SortedSet {
    public zzgda(SortedSet sortedSet, zzfyh zzfyh2) {
        super(sortedSet, zzfyh2);
    }

    public final Comparator comparator() {
        return ((SortedSet)this.zza).comparator();
    }

    public final Object first() {
        boolean bl2;
        Object object = this.zza.iterator();
        object.getClass();
        zzfyh zzfyh2 = this.zzb;
        zzfyh2.getClass();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            boolean bl3 = zzfyh2.zza(e2);
            if (!bl3) continue;
            return e2;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public final SortedSet headSet(Object sortedSet) {
        Object object = this.zza;
        sortedSet = ((SortedSet)object).headSet(sortedSet);
        object = this.zzb;
        zzgda zzgda2 = new zzgda(sortedSet, (zzfyh)object);
        return zzgda2;
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet)this.zza;
        Object e2;
        zzfyh zzfyh2;
        boolean bl2;
        while (!(bl2 = (zzfyh2 = this.zzb).zza(e2 = sortedSet.last()))) {
            sortedSet = sortedSet.headSet(e2);
        }
        return e2;
    }

    public final SortedSet subSet(Object sortedSet, Object object) {
        Collection collection = this.zza;
        sortedSet = ((SortedSet)collection).subSet(sortedSet, object);
        object = this.zzb;
        zzgda zzgda2 = new zzgda(sortedSet, (zzfyh)object);
        return zzgda2;
    }

    public final SortedSet tailSet(Object sortedSet) {
        Object object = this.zza;
        sortedSet = ((SortedSet)object).tailSet(sortedSet);
        object = this.zzb;
        zzgda zzgda2 = new zzgda(sortedSet, (zzfyh)object);
        return zzgda2;
    }
}

