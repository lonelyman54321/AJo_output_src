/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

final class zzam
implements Iterator {
    private final /* synthetic */ Iterator zza;

    public zzam(Iterator iterator) {
        this.zza = iterator;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        String string2 = (String)this.zza.next();
        zzas zzas2 = new zzas(string2);
        return zzas2;
    }
}

