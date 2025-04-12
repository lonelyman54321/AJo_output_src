/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashBiMap$View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class HashBiMap$View$1
implements Iterator {
    private int expectedModCount;
    private int index;
    private int indexToRemove;
    private int remaining;
    final /* synthetic */ HashBiMap$View this$0;

    public HashBiMap$View$1(HashBiMap$View object) {
        int n3;
        int n4;
        this.this$0 = object;
        this.index = n4 = HashBiMap.access$000(((HashBiMap$View)object).biMap);
        this.indexToRemove = -1;
        object = ((HashBiMap$View)object).biMap;
        this.expectedModCount = n4 = ((HashBiMap)object).modCount;
        this.remaining = n3 = ((HashBiMap)object).size;
    }

    private void checkForComodification() {
        Serializable serializable = this.this$0.biMap;
        int n3 = serializable.modCount;
        int n4 = this.expectedModCount;
        if (n3 == n4) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public boolean hasNext() {
        this.checkForComodification();
        int n3 = this.index;
        int n4 = -2;
        n3 = n3 != n4 && (n3 = this.remaining) > 0 ? 1 : 0;
        return n3 != 0;
    }

    public Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            Object object = this.this$0;
            int n3 = this.index;
            object = ((HashBiMap$View)object).forEntry(n3);
            this.indexToRemove = n3 = this.index;
            int[] nArray = HashBiMap.access$100(this.this$0.biMap);
            int n4 = this.index;
            this.index = n3 = nArray[n4];
            this.remaining = n3 = this.remaining + -1;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        HashBiMap hashBiMap;
        this.checkForComodification();
        int n3 = this.indexToRemove;
        int n4 = -1;
        if (n3 != n4) {
            n3 = 1;
        } else {
            n3 = 0;
            hashBiMap = null;
        }
        CollectPreconditions.checkRemove(n3 != 0);
        hashBiMap = this.this$0.biMap;
        int n7 = this.indexToRemove;
        hashBiMap.removeEntry(n7);
        n3 = this.index;
        HashBiMap hashBiMap2 = this.this$0.biMap;
        int n8 = hashBiMap2.size;
        if (n3 == n8) {
            this.index = n3 = this.indexToRemove;
        }
        this.indexToRemove = n4;
        this.expectedModCount = n3 = hashBiMap2.modCount;
    }
}

