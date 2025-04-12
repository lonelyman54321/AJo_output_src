/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcr;
import java.util.Iterator;
import java.util.Map;

final class zzcu
implements Iterator {
    private Iterator zzlm;

    public zzcu(Iterator iterator) {
        this.zzlm = iterator;
    }

    public final boolean hasNext() {
        return this.zzlm.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry)this.zzlm.next();
        Object object = entry.getValue();
        boolean bl2 = object instanceof zzcr;
        if (bl2) {
            object = new Object(entry, null);
            return object;
        }
        return entry;
    }

    public final void remove() {
        this.zzlm.remove();
    }
}

