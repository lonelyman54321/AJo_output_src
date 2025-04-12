/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import java.util.Enumeration;
import java.util.Iterator;

class Iterators$11
implements Enumeration {
    final /* synthetic */ Iterator val$iterator;

    public Iterators$11(Iterator iterator) {
        this.val$iterator = iterator;
    }

    public boolean hasMoreElements() {
        return this.val$iterator.hasNext();
    }

    public Object nextElement() {
        return this.val$iterator.next();
    }
}

