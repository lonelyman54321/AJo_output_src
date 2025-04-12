/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.SmallSortedMap$1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class SmallSortedMap$DescendingEntryIterator
implements Iterator {
    private Iterator lazyOverflowIterator;
    private int pos;
    final /* synthetic */ SmallSortedMap this$0;

    private SmallSortedMap$DescendingEntryIterator(SmallSortedMap smallSortedMap) {
        int n3;
        this.this$0 = smallSortedMap;
        this.pos = n3 = SmallSortedMap.access$600(smallSortedMap).size();
    }

    public /* synthetic */ SmallSortedMap$DescendingEntryIterator(SmallSortedMap smallSortedMap, SmallSortedMap.1 var2_2) {
        this(smallSortedMap);
    }

    private Iterator getOverflowIterator() {
        Iterator iterator = this.lazyOverflowIterator;
        if (iterator == null) {
            this.lazyOverflowIterator = iterator = SmallSortedMap.access$900(this.this$0).entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    public boolean hasNext() {
        Iterator iterator;
        List list;
        int n3;
        int n4 = this.pos;
        if (n4 > 0 && n4 <= (n3 = (list = SmallSortedMap.access$600(this.this$0)).size()) || (n4 = (int)((iterator = this.getOverflowIterator()).hasNext() ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            iterator = null;
        }
        return n4 != 0;
    }

    public Map.Entry next() {
        int n3;
        Object object = this.getOverflowIterator();
        boolean bl2 = object.hasNext();
        if (bl2) {
            return (Map.Entry)this.getOverflowIterator().next();
        }
        object = SmallSortedMap.access$600(this.this$0);
        this.pos = n3 = this.pos + -1;
        return (Map.Entry)object.get(n3);
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

