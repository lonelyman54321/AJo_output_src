/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$KeySet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class AbstractMapBasedMultimap$KeySet$1
implements Iterator {
    Map.Entry entry;
    final /* synthetic */ AbstractMapBasedMultimap$KeySet this$1;
    final /* synthetic */ Iterator val$entryIterator;

    public AbstractMapBasedMultimap$KeySet$1(AbstractMapBasedMultimap$KeySet keySet, Iterator iterator) {
        this.this$1 = keySet;
        this.val$entryIterator = iterator;
    }

    public boolean hasNext() {
        return this.val$entryIterator.hasNext();
    }

    public Object next() {
        Map.Entry entry;
        this.entry = entry = (Map.Entry)this.val$entryIterator.next();
        return entry.getKey();
    }

    public void remove() {
        boolean bl2;
        Object object = this.entry;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
        object = (Collection)this.entry.getValue();
        this.val$entryIterator.remove();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$1.this$0;
        int n3 = object.size();
        AbstractMapBasedMultimap.access$220(abstractMapBasedMultimap, n3);
        object.clear();
        this.entry = null;
    }
}

