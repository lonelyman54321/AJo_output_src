/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Synchronized;
import com.google.common.collect.Synchronized$SynchronizedAsMapValues;
import com.google.common.collect.TransformedIterator;
import java.util.Collection;
import java.util.Iterator;

class Synchronized$SynchronizedAsMapValues$1
extends TransformedIterator {
    final /* synthetic */ Synchronized$SynchronizedAsMapValues this$0;

    public Synchronized$SynchronizedAsMapValues$1(Synchronized$SynchronizedAsMapValues synchronizedAsMapValues, Iterator iterator) {
        this.this$0 = synchronizedAsMapValues;
        super(iterator);
    }

    public Collection transform(Collection collection) {
        Object object = this.this$0.mutex;
        return Synchronized.access$400(collection, object);
    }
}

