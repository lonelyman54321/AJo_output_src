/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$MapAdapter;
import com.google.protobuf.Internal$MapAdapter$EntryAdapter;
import java.util.Iterator;
import java.util.Map;

class Internal$MapAdapter$IteratorAdapter
implements Iterator {
    private final Iterator realIterator;
    final /* synthetic */ Internal$MapAdapter this$0;

    public Internal$MapAdapter$IteratorAdapter(Internal$MapAdapter internal$MapAdapter, Iterator iterator) {
        this.this$0 = internal$MapAdapter;
        this.realIterator = iterator;
    }

    public boolean hasNext() {
        return this.realIterator.hasNext();
    }

    public Map.Entry next() {
        Internal$MapAdapter internal$MapAdapter = this.this$0;
        Map.Entry entry = (Map.Entry)this.realIterator.next();
        Internal$MapAdapter$EntryAdapter internal$MapAdapter$EntryAdapter = new Internal$MapAdapter$EntryAdapter(internal$MapAdapter, entry);
        return internal$MapAdapter$EntryAdapter;
    }

    public void remove() {
        this.realIterator.remove();
    }
}

