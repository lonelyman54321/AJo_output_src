/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjp;
import java.util.Iterator;
import java.util.Map;

final class zzjq
implements Iterator {
    private Iterator zza;

    public zzjq(Iterator iterator) {
        this.zza = iterator;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry)this.zza.next();
        Object object = entry.getValue();
        boolean bl2 = object instanceof zzjp;
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

