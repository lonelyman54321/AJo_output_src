/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgbq;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzgbr
extends AbstractSequentialList
implements Serializable {
    final List zza;
    final zzfxu zzb;

    public zzgbr(List list, zzfxu zzfxu2) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfxu2;
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final ListIterator listIterator(int n3) {
        List list = this.zza;
        ListIterator listIterator = list.listIterator(n3);
        zzgbq zzgbq2 = new zzgbq(this, listIterator);
        return zzgbq2;
    }

    public final void removeRange(int n3, int n4) {
        this.zza.subList(n3, n4).clear();
    }

    public final int size() {
        return this.zza.size();
    }
}

