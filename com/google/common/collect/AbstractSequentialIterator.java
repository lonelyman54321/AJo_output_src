/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.NoSuchElementException;

public abstract class AbstractSequentialIterator
extends UnmodifiableIterator {
    private Object nextOrNull;

    public AbstractSequentialIterator(Object object) {
        this.nextOrNull = object;
    }

    public abstract Object computeNext(Object var1);

    public final boolean hasNext() {
        boolean bl2;
        Object object = this.nextOrNull;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Object next() {
        Object object = this.nextOrNull;
        if (object != null) {
            Object object2;
            this.nextOrNull = object2 = this.computeNext(object);
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }
}

