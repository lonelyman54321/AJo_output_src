/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Converter;
import com.google.common.base.Converter$1;
import java.util.Iterator;

class Converter$1$1
implements Iterator {
    private final Iterator fromIterator;
    final /* synthetic */ Converter$1 this$1;

    public Converter$1$1(Converter$1 object) {
        this.this$1 = object;
        this.fromIterator = object = ((Converter$1)object).val$fromIterable.iterator();
    }

    public boolean hasNext() {
        return this.fromIterator.hasNext();
    }

    public Object next() {
        Converter converter = this.this$1.this$0;
        Object e2 = this.fromIterator.next();
        return converter.convert(e2);
    }

    public void remove() {
        this.fromIterator.remove();
    }
}

