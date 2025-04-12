/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets$4$1;
import com.google.common.collect.Multisets$4$2;
import com.google.common.collect.Multisets$ViewMultiset;
import java.util.Iterator;

class Multisets$4
extends Multisets$ViewMultiset {
    final /* synthetic */ Multiset val$multiset1;
    final /* synthetic */ Multiset val$multiset2;

    public Multisets$4(Multiset multiset, Multiset multiset2) {
        this.val$multiset1 = multiset;
        this.val$multiset2 = multiset2;
        super(null);
    }

    public void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int count(Object object) {
        Multiset multiset = this.val$multiset1;
        int n3 = multiset.count(object);
        int n4 = 0;
        if (n3 != 0) {
            Multiset multiset2 = this.val$multiset2;
            int n7 = multiset2.count(object);
            n4 = Math.max(0, n3 -= n7);
        }
        return n4;
    }

    public int distinctElements() {
        return Iterators.size(this.entryIterator());
    }

    public Iterator elementIterator() {
        Iterator iterator = this.val$multiset1.entrySet().iterator();
        Multisets$4$1 multisets$4$1 = new Multisets$4$1(this, iterator);
        return multisets$4$1;
    }

    public Iterator entryIterator() {
        Iterator iterator = this.val$multiset1.entrySet().iterator();
        Multisets$4$2 multisets$4$2 = new Multisets$4$2(this, iterator);
        return multisets$4$2;
    }
}

