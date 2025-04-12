/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.ListIterator;

class UnmodifiableLazyStringList$1
implements ListIterator {
    ListIterator iter;
    final /* synthetic */ UnmodifiableLazyStringList this$0;
    final /* synthetic */ int val$index;

    public UnmodifiableLazyStringList$1(UnmodifiableLazyStringList object, int n3) {
        this.this$0 = object;
        this.val$index = n3;
        this.iter = object = UnmodifiableLazyStringList.access$000((UnmodifiableLazyStringList)object).listIterator(n3);
    }

    public void add(String object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public boolean hasNext() {
        return this.iter.hasNext();
    }

    public boolean hasPrevious() {
        return this.iter.hasPrevious();
    }

    public String next() {
        return (String)this.iter.next();
    }

    public int nextIndex() {
        return this.iter.nextIndex();
    }

    public String previous() {
        return (String)this.iter.previous();
    }

    public int previousIndex() {
        return this.iter.previousIndex();
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void set(String object) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

