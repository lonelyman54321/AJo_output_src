/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import java.util.Iterator;

class FluentIterable$2
extends FluentIterable {
    final /* synthetic */ Iterable val$inputs;

    public FluentIterable$2(Iterable iterable) {
        this.val$inputs = iterable;
    }

    public Iterator iterator() {
        Iterator iterator = this.val$inputs.iterator();
        ft0_0 ft0_02 = new Object();
        return Iterators.concat(Iterators.transform(iterator, ft0_02));
    }
}

