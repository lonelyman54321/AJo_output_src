/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Collection;
import java.util.Iterator;

abstract class Multisets$ElementSet
extends Sets$ImprovedAbstractSet {
    public void clear() {
        this.multiset().clear();
    }

    public boolean contains(Object object) {
        return this.multiset().contains(object);
    }

    public boolean containsAll(Collection collection) {
        return this.multiset().containsAll(collection);
    }

    public boolean isEmpty() {
        return this.multiset().isEmpty();
    }

    public abstract Iterator iterator();

    public abstract Multiset multiset();

    public boolean remove(Object object) {
        int n3;
        Multiset multiset = this.multiset();
        int n4 = multiset.remove(object, n3 = -1 >>> 1);
        if (n4 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public int size() {
        return this.multiset().entrySet().size();
    }
}

