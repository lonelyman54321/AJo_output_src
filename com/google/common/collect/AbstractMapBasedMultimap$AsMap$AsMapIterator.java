/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$AsMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class AbstractMapBasedMultimap$AsMap$AsMapIterator
implements Iterator {
    Collection collection;
    final Iterator delegateIterator;
    final /* synthetic */ AbstractMapBasedMultimap$AsMap this$1;

    public AbstractMapBasedMultimap$AsMap$AsMapIterator(AbstractMapBasedMultimap$AsMap object) {
        this.this$1 = object;
        this.delegateIterator = object = ((AbstractMapBasedMultimap$AsMap)object).submap.entrySet().iterator();
    }

    public boolean hasNext() {
        return this.delegateIterator.hasNext();
    }

    public Map.Entry next() {
        Collection collection;
        Map.Entry entry = (Map.Entry)this.delegateIterator.next();
        this.collection = collection = (Collection)entry.getValue();
        return this.this$1.wrapEntry(entry);
    }

    public void remove() {
        boolean bl2;
        Object object = this.collection;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
        this.delegateIterator.remove();
        object = this.this$1.this$0;
        int n3 = this.collection.size();
        AbstractMapBasedMultimap.access$220((AbstractMapBasedMultimap)object, n3);
        this.collection.clear();
        this.collection = null;
    }
}

