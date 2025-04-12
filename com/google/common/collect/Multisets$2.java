/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets$2$1;
import com.google.common.collect.Multisets$ViewMultiset;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;

class Multisets$2
extends Multisets$ViewMultiset {
    final /* synthetic */ Multiset val$multiset1;
    final /* synthetic */ Multiset val$multiset2;

    public Multisets$2(Multiset multiset, Multiset multiset2) {
        this.val$multiset1 = multiset;
        this.val$multiset2 = multiset2;
        super(null);
    }

    public int count(Object object) {
        int n3;
        Multiset multiset = this.val$multiset1;
        int n4 = multiset.count(object);
        if (n4 == 0) {
            n3 = 0;
            object = null;
        } else {
            Multiset multiset2 = this.val$multiset2;
            n3 = multiset2.count(object);
            n3 = Math.min(n4, n3);
        }
        return n3;
    }

    public Set createElementSet() {
        Set set = this.val$multiset1.elementSet();
        Set set2 = this.val$multiset2.elementSet();
        return Sets.intersection(set, set2);
    }

    public Iterator elementIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public Iterator entryIterator() {
        Iterator iterator = this.val$multiset1.entrySet().iterator();
        Multisets$2$1 multisets$2$1 = new Multisets$2$1(this, iterator);
        return multisets$2$1;
    }
}

