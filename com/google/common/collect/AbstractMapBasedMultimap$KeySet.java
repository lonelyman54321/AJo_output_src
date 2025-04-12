/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$KeySet$1;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps$KeySet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class AbstractMapBasedMultimap$KeySet
extends Maps$KeySet {
    final /* synthetic */ AbstractMapBasedMultimap this$0;

    public AbstractMapBasedMultimap$KeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map2) {
        this.this$0 = abstractMapBasedMultimap;
        super(map2);
    }

    public void clear() {
        Iterators.clear(this.iterator());
    }

    public boolean containsAll(Collection collection) {
        return this.map().keySet().containsAll(collection);
    }

    public boolean equals(Object object) {
        Set set;
        boolean bl2;
        if (this != object && !(bl2 = (set = this.map().keySet()).equals(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        return this.map().keySet().hashCode();
    }

    public Iterator iterator() {
        Iterator iterator = this.map().entrySet().iterator();
        AbstractMapBasedMultimap$KeySet$1 abstractMapBasedMultimap$KeySet$1 = new AbstractMapBasedMultimap$KeySet$1(this, iterator);
        return abstractMapBasedMultimap$KeySet$1;
    }

    public boolean remove(Object object) {
        int n3;
        object = (Collection)this.map().remove(object);
        boolean bl2 = false;
        if (object != null) {
            n3 = object.size();
            object.clear();
            object = this.this$0;
            AbstractMapBasedMultimap.access$220((AbstractMapBasedMultimap)object, n3);
        } else {
            n3 = 0;
        }
        if (n3 > 0) {
            bl2 = true;
        }
        return bl2;
    }
}

