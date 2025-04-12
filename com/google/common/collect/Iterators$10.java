/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Enumeration;

class Iterators$10
extends UnmodifiableIterator {
    final /* synthetic */ Enumeration val$enumeration;

    public Iterators$10(Enumeration enumeration) {
        this.val$enumeration = enumeration;
    }

    public boolean hasNext() {
        return this.val$enumeration.hasMoreElements();
    }

    public Object next() {
        return this.val$enumeration.nextElement();
    }
}

