/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.NullnessCasts;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

abstract class AbstractMapBasedMultimap$Itr
implements Iterator {
    Collection collection;
    Object key;
    final Iterator keyIterator;
    final /* synthetic */ AbstractMapBasedMultimap this$0;
    Iterator valueIterator;

    public AbstractMapBasedMultimap$Itr(AbstractMapBasedMultimap object) {
        this.this$0 = object;
        this.keyIterator = object = AbstractMapBasedMultimap.access$000((AbstractMapBasedMultimap)object).entrySet().iterator();
        this.key = null;
        this.collection = null;
        this.valueIterator = object = Iterators.emptyModifiableIterator();
    }

    public boolean hasNext() {
        Iterator iterator = this.keyIterator;
        boolean bl2 = iterator.hasNext();
        if (!bl2 && !(bl2 = (iterator = this.valueIterator).hasNext())) {
            bl2 = false;
            iterator = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Object next() {
        Object object;
        Iterator iterator = this.valueIterator;
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            iterator = (Map.Entry)this.keyIterator.next();
            object = iterator.getKey();
            this.key = object;
            iterator = (Collection)iterator.getValue();
            this.collection = iterator;
            this.valueIterator = iterator = iterator.iterator();
        }
        iterator = NullnessCasts.uncheckedCastNullableTToT(this.key);
        object = this.valueIterator.next();
        return this.output(iterator, object);
    }

    public abstract Object output(Object var1, Object var2);

    public void remove() {
        this.valueIterator.remove();
        Object object = this.collection;
        Objects.requireNonNull(object);
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = this.keyIterator;
            object.remove();
        }
        AbstractMapBasedMultimap.access$210(this.this$0);
    }
}

