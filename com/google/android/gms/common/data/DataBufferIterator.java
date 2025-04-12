/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataBufferIterator
implements Iterator {
    protected final DataBuffer zaa;
    protected int zab;

    public DataBufferIterator(DataBuffer dataBuffer) {
        this.zaa = dataBuffer = (DataBuffer)Preconditions.checkNotNull(dataBuffer);
        this.zab = -1;
    }

    public final boolean hasNext() {
        int n3 = this.zab;
        DataBuffer dataBuffer = this.zaa;
        int n4 = dataBuffer.getCount() + -1;
        return n3 < n4;
    }

    public Object next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            int n3;
            DataBuffer dataBuffer = this.zaa;
            this.zab = n3 = this.zab + 1;
            return dataBuffer.get(n3);
        }
        String string2 = hj0_0.a(this.zab, "Cannot advance the iterator beyond ");
        NoSuchElementException noSuchElementException = new NoSuchElementException(string2);
        throw noSuchElementException;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        throw unsupportedOperationException;
    }
}

