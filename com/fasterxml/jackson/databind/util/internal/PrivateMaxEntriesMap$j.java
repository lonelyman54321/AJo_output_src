/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import java.util.Iterator;

public final class PrivateMaxEntriesMap$j
implements Iterator {
    public final Iterator a;
    public PrivateMaxEntriesMap$h b;
    public final /* synthetic */ PrivateMaxEntriesMap c;

    public PrivateMaxEntriesMap$j(PrivateMaxEntriesMap object) {
        this.c = object;
        this.a = object = ((PrivateMaxEntriesMap)object).a.values().iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        PrivateMaxEntriesMap$h privateMaxEntriesMap$h;
        this.b = privateMaxEntriesMap$h = (PrivateMaxEntriesMap$h)this.a.next();
        return privateMaxEntriesMap$h.d();
    }

    public final void remove() {
        Object object = this.b;
        boolean bl2 = object != null;
        if (bl2) {
            object = ((PrivateMaxEntriesMap$h)object).a;
            this.c.remove(object);
            this.b = null;
            return;
        }
        object = new IllegalStateException();
        throw object;
    }
}

