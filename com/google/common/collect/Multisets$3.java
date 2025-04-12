/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets$3$1;
import com.google.common.collect.Multisets$ViewMultiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import java.util.Iterator;
import java.util.Set;

class Multisets$3
extends Multisets$ViewMultiset {
    final /* synthetic */ Multiset val$multiset1;
    final /* synthetic */ Multiset val$multiset2;

    public Multisets$3(Multiset multiset, Multiset multiset2) {
        this.val$multiset1 = multiset;
        this.val$multiset2 = multiset2;
        super(null);
    }

    public boolean contains(Object object) {
        boolean bl2;
        Multiset multiset = this.val$multiset1;
        boolean bl3 = multiset.contains(object);
        if (!bl3 && !(bl2 = (multiset = this.val$multiset2).contains(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public int count(Object object) {
        int n3 = this.val$multiset1.count(object);
        return this.val$multiset2.count(object) + n3;
    }

    public Set createElementSet() {
        Set set = this.val$multiset1.elementSet();
        Set set2 = this.val$multiset2.elementSet();
        return Sets.union(set, set2);
    }

    public Iterator elementIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public Iterator entryIterator() {
        Iterator iterator = this.val$multiset1.entrySet().iterator();
        Iterator iterator2 = this.val$multiset2.entrySet().iterator();
        Multisets$3$1 multisets$3$1 = new Multisets$3$1(this, iterator, iterator2);
        return multisets$3$1;
    }

    public boolean isEmpty() {
        Multiset multiset = this.val$multiset1;
        boolean bl2 = multiset.isEmpty();
        if (bl2 && (bl2 = (multiset = this.val$multiset2).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            multiset = null;
        }
        return bl2;
    }

    public int size() {
        int n3 = this.val$multiset1.size();
        int n4 = this.val$multiset2.size();
        return IntMath.saturatedAdd(n3, n4);
    }
}

