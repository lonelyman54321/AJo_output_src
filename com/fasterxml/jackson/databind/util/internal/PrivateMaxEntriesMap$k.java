/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$j;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class PrivateMaxEntriesMap$k
extends AbstractCollection {
    public final /* synthetic */ PrivateMaxEntriesMap a;

    public PrivateMaxEntriesMap$k(PrivateMaxEntriesMap privateMaxEntriesMap) {
        this.a = privateMaxEntriesMap;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    public final Iterator iterator() {
        PrivateMaxEntriesMap privateMaxEntriesMap = this.a;
        PrivateMaxEntriesMap$j privateMaxEntriesMap$j = new PrivateMaxEntriesMap$j(privateMaxEntriesMap);
        return privateMaxEntriesMap$j;
    }

    public final int size() {
        return this.a.size();
    }
}

