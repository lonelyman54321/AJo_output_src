/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.ForwardingIterator;
import com.google.common.collect.Multiset$Entry;
import java.util.Iterator;

class ConcurrentHashMultiset$3
extends ForwardingIterator {
    private Multiset$Entry last;
    final /* synthetic */ ConcurrentHashMultiset this$0;
    final /* synthetic */ Iterator val$readOnlyIterator;

    public ConcurrentHashMultiset$3(ConcurrentHashMultiset concurrentHashMultiset, Iterator iterator) {
        this.this$0 = concurrentHashMultiset;
        this.val$readOnlyIterator = iterator;
    }

    public Iterator delegate() {
        return this.val$readOnlyIterator;
    }

    public Multiset$Entry next() {
        Multiset$Entry multiset$Entry;
        this.last = multiset$Entry = (Multiset$Entry)super.next();
        return multiset$Entry;
    }

    public void remove() {
        boolean bl2;
        Object object = this.last;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
        object = this.this$0;
        Object object2 = this.last.getElement();
        ((ConcurrentHashMultiset)object).setCount(object2, 0);
        this.last = null;
    }
}

