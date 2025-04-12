/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgbo;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class zzgbp
extends AbstractList
implements RandomAccess,
Serializable {
    final List zza;
    final zzfxu zzb;

    public zzgbp(List list, zzfxu zzfxu2) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfxu2;
    }

    public final Object get(int n3) {
        List list = this.zza;
        zzfxu zzfxu2 = this.zzb;
        Object e2 = list.get(n3);
        return zzfxu2.apply(e2);
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final Iterator iterator() {
        return this.listIterator();
    }

    public final ListIterator listIterator(int n3) {
        List list = this.zza;
        ListIterator listIterator = list.listIterator(n3);
        zzgbo zzgbo2 = new zzgbo(this, listIterator);
        return zzgbo2;
    }

    public final Object remove(int n3) {
        List list = this.zza;
        zzfxu zzfxu2 = this.zzb;
        Object e2 = list.remove(n3);
        return zzfxu2.apply(e2);
    }

    public final void removeRange(int n3, int n4) {
        this.zza.subList(n3, n4).clear();
    }

    public final int size() {
        return this.zza.size();
    }
}

