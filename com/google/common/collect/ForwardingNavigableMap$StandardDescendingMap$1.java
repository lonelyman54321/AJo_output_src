/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class ForwardingNavigableMap$StandardDescendingMap$1
implements Iterator {
    private Map.Entry nextOrNull;
    final /* synthetic */ ForwardingNavigableMap$StandardDescendingMap this$1;
    private Map.Entry toRemove = null;

    public ForwardingNavigableMap$StandardDescendingMap$1(ForwardingNavigableMap$StandardDescendingMap object) {
        this.this$1 = object;
        this.nextOrNull = object = ((ForwardingNavigableMap$StandardDescendingMap)object).forward().lastEntry();
    }

    public boolean hasNext() {
        boolean bl2;
        Map.Entry entry = this.nextOrNull;
        if (entry != null) {
            bl2 = true;
        } else {
            bl2 = false;
            entry = null;
        }
        return bl2;
    }

    public Map.Entry next() {
        Object object = this.nextOrNull;
        if (object != null) {
            this.toRemove = object;
            Object object2 = this.this$1.forward();
            Object k2 = this.nextOrNull.getKey();
            this.nextOrNull = object2 = object2.lowerEntry(k2);
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public void remove() {
        Object object = this.toRemove;
        if (object != null) {
            object = this.this$1.forward();
            Object k2 = this.toRemove.getKey();
            object.remove(k2);
            this.toRemove = null;
            return;
        }
        object = new IllegalStateException("no calls to next() since the last call to remove()");
        throw object;
    }
}

