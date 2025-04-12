/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferIterator;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

public class SingleRefDataBufferIterator
extends DataBufferIterator {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            this.zab = n3 = this.zab + 1;
            if (n3 == 0) {
                Object object = this.zaa;
                IllegalStateException illegalStateException = null;
                this.zac = object = Preconditions.checkNotNull(object.get(0));
                boolean bl2 = object instanceof DataBufferRef;
                if (!bl2) {
                    object = String.valueOf(object.getClass());
                    object = cP.a("DataBuffer reference of type ", (String)object, " is not movable");
                    illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
            } else {
                DataBufferRef dataBufferRef = (DataBufferRef)Preconditions.checkNotNull(this.zac);
                int n4 = this.zab;
                dataBufferRef.zaa(n4);
            }
            return this.zac;
        }
        String string2 = hj0_0.a(this.zab, "Cannot advance the iterator beyond ");
        NoSuchElementException noSuchElementException = new NoSuchElementException(string2);
        throw noSuchElementException;
    }
}

