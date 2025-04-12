/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzhci
implements Iterator {
    private final Iterator zza;

    public zzhci(Iterator iterator) {
        this.zza = iterator;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        this.zza.remove();
    }
}

