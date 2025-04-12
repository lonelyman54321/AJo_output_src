/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.SmallSortedMap$1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class SmallSortedMap$EntryIterator
implements Iterator {
    private Iterator lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos = -1;
    final /* synthetic */ SmallSortedMap this$0;

    private SmallSortedMap$EntryIterator(SmallSortedMap smallSortedMap) {
        this.this$0 = smallSortedMap;
    }

    public /* synthetic */ SmallSortedMap$EntryIterator(SmallSortedMap smallSortedMap, SmallSortedMap$1 smallSortedMap$1) {
        this(smallSortedMap);
    }

    private Iterator getOverflowIterator() {
        Iterator iterator = this.lazyOverflowIterator;
        if (iterator == null) {
            this.lazyOverflowIterator = iterator = SmallSortedMap.access$700(this.this$0).entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    public boolean hasNext() {
        Object object;
        int n3 = this.pos;
        int n4 = 1;
        List list = SmallSortedMap.access$600(this.this$0);
        int n7 = list.size();
        if ((n3 += n4) >= n7 && ((n3 = (int)((object = SmallSortedMap.access$700(this.this$0)).isEmpty() ? 1 : 0)) != 0 || (n3 = (int)((object = this.getOverflowIterator()).hasNext() ? 1 : 0)) == 0)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public Map.Entry next() {
        int n3;
        int n4 = 1;
        this.nextCalledBeforeRemove = n4;
        this.pos = n3 = this.pos + n4;
        List list = SmallSortedMap.access$600(this.this$0);
        n4 = list.size();
        if (n3 < n4) {
            list = SmallSortedMap.access$600(this.this$0);
            n3 = this.pos;
            return (Map.Entry)list.get(n3);
        }
        return (Map.Entry)this.getOverflowIterator().next();
    }

    public void remove() {
        int n3 = this.nextCalledBeforeRemove;
        if (n3 != 0) {
            this.nextCalledBeforeRemove = false;
            Object object = this.this$0;
            SmallSortedMap.access$300((SmallSortedMap)object);
            n3 = this.pos;
            List list = SmallSortedMap.access$600(this.this$0);
            int n4 = list.size();
            if (n3 < n4) {
                int n7;
                object = this.this$0;
                n4 = this.pos;
                this.pos = n7 = n4 + -1;
                SmallSortedMap.access$800((SmallSortedMap)object, n4);
            } else {
                object = this.getOverflowIterator();
                object.remove();
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

