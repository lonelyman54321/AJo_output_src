/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.LazyField;
import java.util.Iterator;
import java.util.Map;

class LazyField$LazyIterator
implements Iterator {
    private Iterator iterator;

    public LazyField$LazyIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    public Map.Entry next() {
        Map.Entry entry = (Map.Entry)this.iterator.next();
        Object object = entry.getValue();
        boolean bl2 = object instanceof LazyField;
        if (bl2) {
            object = new Object(entry, null);
            return object;
        }
        return entry;
    }

    public void remove() {
        this.iterator.remove();
    }
}

