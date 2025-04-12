/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdg;
import java.util.ListIterator;

abstract class zzgdh
extends zzgdg
implements ListIterator {
    public zzgdh(ListIterator listIterator) {
        super(listIterator);
    }

    public final void add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean hasPrevious() {
        return ((ListIterator)this.zzb).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator)this.zzb).nextIndex();
    }

    public final Object previous() {
        Object e2 = ((ListIterator)this.zzb).previous();
        return this.zza(e2);
    }

    public final int previousIndex() {
        return ((ListIterator)this.zzb).previousIndex();
    }

    public final void set(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

