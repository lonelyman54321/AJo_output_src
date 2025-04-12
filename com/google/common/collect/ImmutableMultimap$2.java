/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;

class ImmutableMultimap$2
extends UnmodifiableIterator {
    final /* synthetic */ ImmutableMultimap this$0;
    Iterator valueCollectionItr;
    Iterator valueItr;

    public ImmutableMultimap$2(ImmutableMultimap object) {
        this.this$0 = object;
        this.valueCollectionItr = object = ((ImmutableMultimap)object).map.values().iterator();
        this.valueItr = object = Iterators.emptyIterator();
    }

    public boolean hasNext() {
        Iterator iterator = this.valueItr;
        boolean bl2 = iterator.hasNext();
        if (!bl2 && !(bl2 = (iterator = this.valueCollectionItr).hasNext())) {
            bl2 = false;
            iterator = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Object next() {
        Iterator iterator = this.valueItr;
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            this.valueItr = iterator = ((ImmutableCollection)this.valueCollectionItr.next()).iterator();
        }
        return this.valueItr.next();
    }
}

