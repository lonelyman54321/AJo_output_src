/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$MapAdapter;
import com.google.protobuf.Internal$MapAdapter$IteratorAdapter;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

class Internal$MapAdapter$SetAdapter
extends AbstractSet {
    private final Set realSet;
    final /* synthetic */ Internal$MapAdapter this$0;

    public Internal$MapAdapter$SetAdapter(Internal$MapAdapter internal$MapAdapter, Set set) {
        this.this$0 = internal$MapAdapter;
        this.realSet = set;
    }

    public Iterator iterator() {
        Internal$MapAdapter internal$MapAdapter = this.this$0;
        Iterator iterator = this.realSet.iterator();
        Internal$MapAdapter$IteratorAdapter internal$MapAdapter$IteratorAdapter = new Internal$MapAdapter$IteratorAdapter(internal$MapAdapter, iterator);
        return internal$MapAdapter$IteratorAdapter;
    }

    public int size() {
        return this.realSet.size();
    }
}

