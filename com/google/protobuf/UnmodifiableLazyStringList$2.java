/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.Iterator;

class UnmodifiableLazyStringList$2
implements Iterator {
    Iterator iter;
    final /* synthetic */ UnmodifiableLazyStringList this$0;

    public UnmodifiableLazyStringList$2(UnmodifiableLazyStringList object) {
        this.this$0 = object;
        this.iter = object = UnmodifiableLazyStringList.access$000((UnmodifiableLazyStringList)object).iterator();
    }

    public boolean hasNext() {
        return this.iter.hasNext();
    }

    public String next() {
        return (String)this.iter.next();
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

