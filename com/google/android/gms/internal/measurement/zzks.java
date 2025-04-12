/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkq;
import java.util.Iterator;
import java.util.Map;

final class zzks
implements Iterator {
    private Iterator zza;

    public zzks(Iterator iterator) {
        this.zza = iterator;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry)this.zza.next();
        Object object = entry.getValue();
        boolean bl2 = object instanceof zzkq;
        if (bl2) {
            object = new Object(entry, null);
            return object;
        }
        return entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}

