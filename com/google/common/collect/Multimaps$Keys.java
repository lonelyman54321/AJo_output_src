/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps$Keys$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Multimaps$Keys
extends AbstractMultiset {
    final Multimap multimap;

    public Multimaps$Keys(Multimap multimap) {
        this.multimap = multimap;
    }

    public void clear() {
        this.multimap.clear();
    }

    public boolean contains(Object object) {
        return this.multimap.containsKey(object);
    }

    public int count(Object object) {
        int n3;
        Map map2 = this.multimap.asMap();
        object = (Collection)Maps.safeGet(map2, object);
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.size();
        }
        return n3;
    }

    public int distinctElements() {
        return this.multimap.asMap().size();
    }

    public Iterator elementIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public Set elementSet() {
        return this.multimap.keySet();
    }

    public Iterator entryIterator() {
        Iterator iterator = this.multimap.asMap().entrySet().iterator();
        Multimaps$Keys$1 multimaps$Keys$1 = new Multimaps$Keys$1(this, iterator);
        return multimaps$Keys$1;
    }

    public Iterator iterator() {
        return Maps.keyIterator(this.multimap.entries().iterator());
    }

    public int remove(Object iterator, int n3) {
        String string2 = "occurrences";
        CollectPreconditions.checkNonnegative(n3, string2);
        if (n3 == 0) {
            return this.count(iterator);
        }
        iterator = (Collection)Maps.safeGet(this.multimap.asMap(), iterator);
        string2 = null;
        if (iterator == null) {
            return 0;
        }
        int n4 = iterator.size();
        if (n3 >= n4) {
            iterator.clear();
        } else {
            iterator = iterator.iterator();
            for (int i3 = 0; i3 < n3; ++i3) {
                iterator.next();
                iterator.remove();
            }
        }
        return n4;
    }

    public int size() {
        return this.multimap.size();
    }
}

