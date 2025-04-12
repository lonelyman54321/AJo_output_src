/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashMap$1;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class CompactHashMap$Itr
implements Iterator {
    int currentIndex;
    int expectedMetadata;
    int indexToRemove;
    final /* synthetic */ CompactHashMap this$0;

    private CompactHashMap$Itr(CompactHashMap compactHashMap) {
        int n3;
        int n4;
        this.this$0 = compactHashMap;
        this.expectedMetadata = n4 = CompactHashMap.access$000(compactHashMap);
        this.currentIndex = n3 = compactHashMap.firstEntryIndex();
        this.indexToRemove = -1;
    }

    public /* synthetic */ CompactHashMap$Itr(CompactHashMap compactHashMap, CompactHashMap.1 var2_2) {
        this(compactHashMap);
    }

    private void checkForConcurrentModification() {
        int n3;
        Serializable serializable = this.this$0;
        int n4 = CompactHashMap.access$000(serializable);
        if (n4 == (n3 = this.expectedMetadata)) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public abstract Object getOutput(int var1);

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
            Object object = this.getOutput(n3);
            CompactHashMap compactHashMap = this.this$0;
            int n7 = this.currentIndex;
            this.currentIndex = n4 = compactHashMap.getSuccessor(n7);
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        CompactHashMap compactHashMap;
        this.checkForConcurrentModification();
        int n3 = this.indexToRemove;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            compactHashMap = null;
        }
        CollectPreconditions.checkRemove(n3 != 0);
        this.incrementExpectedModCount();
        compactHashMap = this.this$0;
        int n4 = this.indexToRemove;
        Object object = CompactHashMap.access$100(compactHashMap, n4);
        compactHashMap.remove(object);
        compactHashMap = this.this$0;
        n4 = this.currentIndex;
        int n7 = this.indexToRemove;
        this.currentIndex = n3 = compactHashMap.adjustAfterRemove(n4, n7);
        this.indexToRemove = -1;
    }
}

