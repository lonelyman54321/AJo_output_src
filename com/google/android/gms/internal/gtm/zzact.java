/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import java.util.Iterator;

final class zzact
implements Iterator {
    private final Iterator zza;

    public zzact(Iterator iterator) {
        this.zza = iterator;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        this.zza.remove();
    }
}

