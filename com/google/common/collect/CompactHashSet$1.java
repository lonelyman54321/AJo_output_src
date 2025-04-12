/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.CompactHashSet;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class CompactHashSet$1
implements Iterator {
    int currentIndex;
    int expectedMetadata;
    int indexToRemove;
    final /* synthetic */ CompactHashSet this$0;

    public CompactHashSet$1(CompactHashSet compactHashSet) {
        int n3;
        int n4;
        this.this$0 = compactHashSet;
        this.expectedMetadata = n4 = CompactHashSet.access$000(compactHashSet);
        this.currentIndex = n3 = compactHashSet.firstEntryIndex();
        this.indexToRemove = -1;
    }

    private void checkForConcurrentModification() {
        int n3;
        Serializable serializable = this.this$0;
        int n4 = CompactHashSet.access$000(serializable);
        if (n4 == (n3 = this.expectedMetadata)) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public boolean hasNext() {
        int n3 = this.currentIndex;
        n3 = n3 >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public void incrementExpectedModCount() {
        int n3;
        this.expectedMetadata = n3 = this.expectedMetadata + 32;
    }

    public Object next() {
        this.checkForConcurrentModification();
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            this.indexToRemove = n3 = this.currentIndex;
            Object object = CompactHashSet.access$100(this.this$0, n3);
            CompactHashSet compactHashSet = this.this$0;
            int n7 = this.currentIndex;
            this.currentIndex = n4 = compactHashSet.getSuccessor(n7);
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        CompactHashSet compactHashSet;
        this.checkForConcurrentModification();
        int n3 = this.indexToRemove;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            compactHashSet = null;
        }
        CollectPreconditions.checkRemove(n3 != 0);
        this.incrementExpectedModCount();
        compactHashSet = this.this$0;
        int n4 = this.indexToRemove;
        Object object = CompactHashSet.access$100(compactHashSet, n4);
        compactHashSet.remove(object);
        compactHashSet = this.this$0;
        n4 = this.currentIndex;
        int n7 = this.indexToRemove;
        this.currentIndex = n3 = compactHashSet.adjustAfterRemove(n4, n7);
        this.indexToRemove = -1;
    }
}

