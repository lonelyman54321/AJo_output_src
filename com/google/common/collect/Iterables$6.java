/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables$6$1;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;

class Iterables$6
extends FluentIterable {
    final /* synthetic */ Iterable val$iterable;
    final /* synthetic */ int val$numberToSkip;

    public Iterables$6(Iterable iterable, int n3) {
        this.val$iterable = iterable;
        this.val$numberToSkip = n3;
    }

    public Iterator iterator() {
        Object object = this.val$iterable;
        int n3 = object instanceof List;
        if (n3 != 0) {
            object = (List)object;
            n3 = object.size();
            int n4 = this.val$numberToSkip;
            n3 = Math.min(n3, n4);
            n4 = object.size();
            return object.subList(n3, n4).iterator();
        }
        object = object.iterator();
        n3 = this.val$numberToSkip;
        Iterators.advance((Iterator)object, n3);
        Iterables$6$1 iterables$6$1 = new Iterables$6$1(this, (Iterator)object);
        return iterables$6$1;
    }
}

