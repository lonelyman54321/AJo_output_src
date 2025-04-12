/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.util.Iterator;

public final class PrivateMaxEntriesMap$f
implements Iterator {
    public final Iterator a;
    public Object b;
    public final /* synthetic */ PrivateMaxEntriesMap c;

    public PrivateMaxEntriesMap$f(PrivateMaxEntriesMap object) {
        this.c = object;
        this.a = object = ((PrivateMaxEntriesMap)object).a.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Object e2 = this.a.next();
        this.b = e2;
        return e2;
    }

    public final void remove() {
        Object object = this.b;
        boolean bl2 = object != null;
        if (bl2) {
            this.c.remove(object);
            this.b = null;
            return;
        }
        object = new IllegalStateException();
        throw object;
    }
}

