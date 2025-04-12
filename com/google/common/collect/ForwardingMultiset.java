/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class ForwardingMultiset
extends ForwardingCollection
implements Multiset {
    public int add(Object object, int n3) {
        return this.delegate().add(object, n3);
    }

    public int count(Object object) {
        return this.delegate().count(object);
    }

    public abstract Multiset delegate();

    public Set elementSet() {
        return this.delegate().elementSet();
    }

    public Set entrySet() {
        return this.delegate().entrySet();
    }

    public boolean equals(Object object) {
        Multiset multiset;
        boolean bl2;
        if (object != this && !(bl2 = (multiset = this.delegate()).equals(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        return this.delegate().hashCode();
    }

    public int remove(Object object, int n3) {
        return this.delegate().remove(object, n3);
    }

    public int setCount(Object object, int n3) {
        return this.delegate().setCount(object, n3);
    }

    public boolean setCount(Object object, int n3, int n4) {
        return this.delegate().setCount(object, n3, n4);
    }

    public boolean standardAdd(Object object) {
        boolean bl2 = true;
        this.add(object, (int)(bl2 ? 1 : 0));
        return bl2;
    }

    public boolean standardAddAll(Collection collection) {
        return Multisets.addAllImpl((Multiset)this, collection);
    }

    public void standardClear() {
        Iterators.clear(this.entrySet().iterator());
    }

    public boolean standardContains(Object object) {
        int n3 = this.count(object);
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public int standardCount(Object object) {
        boolean bl2;
        Iterator iterator = this.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
            Object object2 = multiset$Entry.getElement();
            boolean bl3 = Objects.equal(object2, object);
            if (!bl3) continue;
            return multiset$Entry.getCount();
        }
        return 0;
    }

    public boolean standardEquals(Object object) {
        return Multisets.equalsImpl(this, object);
    }

    public int standardHashCode() {
        return this.entrySet().hashCode();
    }

    public Iterator standardIterator() {
        return Multisets.iteratorImpl(this);
    }

    public boolean standardRemove(Object object) {
        boolean bl2 = true;
        int n3 = this.remove(object, (int)(bl2 ? 1 : 0));
        if (n3 <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public boolean standardRemoveAll(Collection collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    public boolean standardRetainAll(Collection collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    public int standardSetCount(Object object, int n3) {
        return Multisets.setCountImpl(this, object, n3);
    }

    public boolean standardSetCount(Object object, int n3, int n4) {
        return Multisets.setCountImpl(this, object, n3, n4);
    }

    public int standardSize() {
        return Multisets.linearTimeSizeImpl(this);
    }

    public String standardToString() {
        return this.entrySet().toString();
    }
}

