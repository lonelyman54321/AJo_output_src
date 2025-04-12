/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.Iterators;
import com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$1;
import com.google.common.reflect.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class MutableTypeToInstanceMap$UnmodifiableEntry
extends ForwardingMapEntry {
    private final Map.Entry delegate;

    private MutableTypeToInstanceMap$UnmodifiableEntry(Map.Entry entry) {
        this.delegate = entry = (Map.Entry)Preconditions.checkNotNull(entry);
    }

    public static /* synthetic */ MutableTypeToInstanceMap$UnmodifiableEntry a(Map.Entry entry) {
        MutableTypeToInstanceMap$UnmodifiableEntry mutableTypeToInstanceMap$UnmodifiableEntry = new MutableTypeToInstanceMap$UnmodifiableEntry(entry);
        return mutableTypeToInstanceMap$UnmodifiableEntry;
    }

    public static /* synthetic */ Iterator access$000(Iterator iterator) {
        return MutableTypeToInstanceMap$UnmodifiableEntry.transformEntries(iterator);
    }

    private static Iterator transformEntries(Iterator iterator) {
        a a2 = new Object();
        return Iterators.transform(iterator, a2);
    }

    public static Set transformEntries(Set set) {
        MutableTypeToInstanceMap$UnmodifiableEntry$1 mutableTypeToInstanceMap$UnmodifiableEntry$1 = new MutableTypeToInstanceMap$UnmodifiableEntry$1(set);
        return mutableTypeToInstanceMap$UnmodifiableEntry$1;
    }

    public Map.Entry delegate() {
        return this.delegate;
    }

    public Object setValue(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

