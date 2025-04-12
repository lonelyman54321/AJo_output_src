/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Iterator;

abstract class zzgdg
implements Iterator {
    final Iterator zzb;

    public zzgdg(Iterator iterator) {
        iterator.getClass();
        this.zzb = iterator;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Object e2 = this.zzb.next();
        return this.zza(e2);
    }

    public final void remove() {
        this.zzb.remove();
    }

    public abstract Object zza(Object var1);
}

