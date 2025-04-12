/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.NoSuchElementException;

abstract class AbstractIndexedListIterator
extends UnmodifiableListIterator {
    private int position;
    private final int size;

    public AbstractIndexedListIterator(int n3) {
        this(n3, 0);
    }

    public AbstractIndexedListIterator(int n3, int n4) {
        Preconditions.checkPositionIndex(n4, n3);
        this.size = n3;
        this.position = n4;
    }

    public abstract Object get(int var1);

    public final boolean hasNext() {
        int n3 = this.position;
        int n4 = this.size;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean hasPrevious() {
        int n3 = this.position;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            n3 = this.position;
            this.position = n4 = n3 + 1;
            return this.get(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int nextIndex() {
        return this.position;
    }

    public final Object previous() {
        int n3 = this.hasPrevious();
        if (n3 != 0) {
            this.position = n3 = this.position + -1;
            return this.get(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final int previousIndex() {
        return this.position + -1;
    }
}

