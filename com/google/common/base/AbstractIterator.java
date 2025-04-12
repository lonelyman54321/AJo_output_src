/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.AbstractIterator$1;
import com.google.common.base.AbstractIterator$State;
import com.google.common.base.NullnessCasts;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractIterator
implements Iterator {
    private Object next;
    private AbstractIterator$State state;

    public AbstractIterator() {
        AbstractIterator$State abstractIterator$State;
        this.state = abstractIterator$State = AbstractIterator$State.NOT_READY;
    }

    private boolean tryToComputeNext() {
        Object object;
        this.state = object = AbstractIterator$State.FAILED;
        object = this.computeNext();
        this.next = object;
        object = this.state;
        AbstractIterator$State abstractIterator$State = AbstractIterator$State.DONE;
        if (object != abstractIterator$State) {
            this.state = object = AbstractIterator$State.READY;
            return true;
        }
        return false;
    }

    public abstract Object computeNext();

    public final Object endOfData() {
        AbstractIterator$State abstractIterator$State;
        this.state = abstractIterator$State = AbstractIterator$State.DONE;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean hasNext() {
        void var4_6;
        Object object = this.state;
        AbstractIterator$State abstractIterator$State = AbstractIterator$State.FAILED;
        boolean n4 = true;
        if (object != abstractIterator$State) {
            boolean n3 = true;
        } else {
            boolean bl2 = false;
            object = null;
        }
        Preconditions.checkState((boolean)var4_6);
        object = AbstractIterator$1.$SwitchMap$com$google$common$base$AbstractIterator$State;
        abstractIterator$State = this.state;
        int n3 = abstractIterator$State.ordinal();
        AbstractIterator$State abstractIterator$State2 = object[n3];
        if (abstractIterator$State2 != n4) {
            n3 = 2;
            if (abstractIterator$State2 != n3) {
                return this.tryToComputeNext();
            }
            return n4;
        }
        return false;
    }

    public final Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            Object object;
            this.state = object = AbstractIterator$State.NOT_READY;
            object = NullnessCasts.uncheckedCastNullableTToT(this.next);
            this.next = null;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

