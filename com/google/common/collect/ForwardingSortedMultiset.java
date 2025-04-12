/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.BoundType;
import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

public abstract class ForwardingSortedMultiset
extends ForwardingMultiset
implements SortedMultiset {
    public Comparator comparator() {
        return this.delegate().comparator();
    }

    public abstract SortedMultiset delegate();

    public SortedMultiset descendingMultiset() {
        return this.delegate().descendingMultiset();
    }

    public NavigableSet elementSet() {
        return this.delegate().elementSet();
    }

    public Multiset$Entry firstEntry() {
        return this.delegate().firstEntry();
    }

    public SortedMultiset headMultiset(Object object, BoundType boundType) {
        return this.delegate().headMultiset(object, boundType);
    }

    public Multiset$Entry lastEntry() {
        return this.delegate().lastEntry();
    }

    public Multiset$Entry pollFirstEntry() {
        return this.delegate().pollFirstEntry();
    }

    public Multiset$Entry pollLastEntry() {
        return this.delegate().pollLastEntry();
    }

    public Multiset$Entry standardFirstEntry() {
        Iterator iterator = this.entrySet().iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return null;
        }
        iterator = (Multiset$Entry)iterator.next();
        Object object = iterator.getElement();
        int n3 = iterator.getCount();
        return Multisets.immutableEntry(object, n3);
    }

    public Multiset$Entry standardLastEntry() {
        Iterator iterator = this.descendingMultiset().entrySet().iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return null;
        }
        iterator = (Multiset$Entry)iterator.next();
        Object object = iterator.getElement();
        int n3 = iterator.getCount();
        return Multisets.immutableEntry(object, n3);
    }

    public Multiset$Entry standardPollFirstEntry() {
        Iterator iterator = this.entrySet().iterator();
        int n3 = iterator.hasNext();
        if (n3 == 0) {
            return null;
        }
        Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
        Object object = multiset$Entry.getElement();
        n3 = multiset$Entry.getCount();
        multiset$Entry = Multisets.immutableEntry(object, n3);
        iterator.remove();
        return multiset$Entry;
    }

    public Multiset$Entry standardPollLastEntry() {
        Iterator iterator = this.descendingMultiset().entrySet().iterator();
        int n3 = iterator.hasNext();
        if (n3 == 0) {
            return null;
        }
        Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
        Object object = multiset$Entry.getElement();
        n3 = multiset$Entry.getCount();
        multiset$Entry = Multisets.immutableEntry(object, n3);
        iterator.remove();
        return multiset$Entry;
    }

    public SortedMultiset standardSubMultiset(Object object, BoundType boundType, Object object2, BoundType boundType2) {
        return this.tailMultiset(object, boundType).headMultiset(object2, boundType2);
    }

    public SortedMultiset subMultiset(Object object, BoundType boundType, Object object2, BoundType boundType2) {
        return this.delegate().subMultiset(object, boundType, object2, boundType2);
    }

    public SortedMultiset tailMultiset(Object object, BoundType boundType) {
        return this.delegate().tailMultiset(object, boundType);
    }
}

