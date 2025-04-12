/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ObjectCountHashMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractMapBasedMultiset$Itr
implements Iterator {
    int entryIndex;
    int expectedModCount;
    final /* synthetic */ AbstractMapBasedMultiset this$0;
    int toRemove;

    public AbstractMapBasedMultiset$Itr(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        int n3;
        int n4;
        this.this$0 = abstractMapBasedMultiset;
        this.entryIndex = n4 = abstractMapBasedMultiset.backingMap.firstIndex();
        this.toRemove = -1;
        this.expectedModCount = n3 = abstractMapBasedMultiset.backingMap.modCount;
    }

    private void checkForConcurrentModification() {
        Object object = this.this$0.backingMap;
        int n3 = ((ObjectCountHashMap)object).modCount;
        int n4 = this.expectedModCount;
        if (n3 == n4) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasNext() {
        void var1_4;
        this.checkForConcurrentModification();
        int bl2 = this.entryIndex;
        if (bl2 >= 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_4;
    }

    public Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            n3 = this.entryIndex;
            Object object = this.result(n3);
            this.toRemove = n4 = this.entryIndex;
            this.entryIndex = n4 = this.this$0.backingMap.nextIndex(n4);
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        Object object;
        this.checkForConcurrentModification();
        int n3 = this.toRemove;
        int n4 = -1;
        if (n3 != n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        CollectPreconditions.checkRemove(n3 != 0);
        object = this.this$0;
        long l2 = ((AbstractMapBasedMultiset)object).size;
        ObjectCountHashMap objectCountHashMap = ((AbstractMapBasedMultiset)object).backingMap;
        int n7 = this.toRemove;
        long l3 = objectCountHashMap.removeEntry(n7);
        ((AbstractMapBasedMultiset)object).size = l2 -= l3;
        object = this.this$0.backingMap;
        int n8 = this.entryIndex;
        int n10 = this.toRemove;
        this.entryIndex = n3 = ((ObjectCountHashMap)object).nextIndexAfterRemove(n8, n10);
        this.toRemove = n4;
        this.expectedModCount = n3 = this.this$0.backingMap.modCount;
    }

    public abstract Object result(int var1);
}

