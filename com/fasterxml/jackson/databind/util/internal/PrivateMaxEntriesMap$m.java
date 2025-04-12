/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import java.util.AbstractMap;

public final class PrivateMaxEntriesMap$m
extends AbstractMap.SimpleEntry {
    static final long serialVersionUID = 1L;
    public final /* synthetic */ PrivateMaxEntriesMap a;

    public PrivateMaxEntriesMap$m(PrivateMaxEntriesMap object, PrivateMaxEntriesMap$h object2) {
        this.a = object;
        object = ((PrivateMaxEntriesMap$h)object2).a;
        object2 = ((PrivateMaxEntriesMap$h)object2).d();
        super(object, object2);
    }

    public final Object setValue(Object object) {
        Object k2 = this.getKey();
        this.a.h(k2, object, false);
        return super.setValue(object);
    }

    public Object writeReplace() {
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(this);
        return simpleEntry;
    }
}

