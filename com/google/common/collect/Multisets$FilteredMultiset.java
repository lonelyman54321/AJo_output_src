/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets$FilteredMultiset$1;
import com.google.common.collect.Multisets$ViewMultiset;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Set;

final class Multisets$FilteredMultiset
extends Multisets$ViewMultiset {
    final Predicate predicate;
    final Multiset unfiltered;

    public Multisets$FilteredMultiset(Multiset object, Predicate predicate) {
        super(null);
        object = (Multiset)Preconditions.checkNotNull(object);
        this.unfiltered = object;
        this.predicate = object = (Predicate)Preconditions.checkNotNull(predicate);
    }

    public int add(Object object, int n3) {
        boolean bl2 = this.predicate.apply(object);
        Predicate predicate = this.predicate;
        Preconditions.checkArgument(bl2, "Element %s does not match predicate %s", object, (Object)predicate);
        return this.unfiltered.add(object, n3);
    }

    public int count(Object object) {
        Multiset multiset = this.unfiltered;
        int n3 = multiset.count(object);
        if (n3 > 0) {
            Predicate predicate = this.predicate;
            boolean bl2 = predicate.apply(object);
            if (!bl2) {
                n3 = 0;
                multiset = null;
            }
            return n3;
        }
        return 0;
    }

    public Set createElementSet() {
        Set set = this.unfiltered.elementSet();
        Predicate predicate = this.predicate;
        return Sets.filter(set, predicate);
    }

    public Set createEntrySet() {
        Set set = this.unfiltered.entrySet();
        Multisets$FilteredMultiset$1 multisets$FilteredMultiset$1 = new Multisets$FilteredMultiset$1(this);
        return Sets.filter(set, (Predicate)multisets$FilteredMultiset$1);
    }

    public Iterator elementIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public Iterator entryIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public UnmodifiableIterator iterator() {
        Iterator iterator = this.unfiltered.iterator();
        Predicate predicate = this.predicate;
        return Iterators.filter(iterator, predicate);
    }

    public int remove(Object object, int n3) {
        int n4;
        Object object2 = "occurrences";
        CollectPreconditions.checkNonnegative(n3, (String)object2);
        if (n3 == 0) {
            return this.count(object);
        }
        boolean bl2 = this.contains(object);
        if (bl2) {
            object2 = this.unfiltered;
            n4 = object2.remove(object, n3);
        } else {
            n4 = 0;
            object = null;
        }
        return n4;
    }
}

