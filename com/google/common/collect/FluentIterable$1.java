/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FluentIterable;
import java.util.Iterator;

class FluentIterable$1
extends FluentIterable {
    final /* synthetic */ Iterable val$iterable;

    public FluentIterable$1(Iterable iterable, Iterable iterable2) {
        this.val$iterable = iterable2;
        super(iterable);
    }

    public Iterator iterator() {
        return this.val$iterable.iterator();
    }
}

