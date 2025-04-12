/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;
import java.util.Iterator;

class Iterables$5
extends FluentIterable {
    final /* synthetic */ Iterable val$fromIterable;
    final /* synthetic */ Function val$function;

    public Iterables$5(Iterable iterable, Function function) {
        this.val$fromIterable = iterable;
        this.val$function = function;
    }

    public Iterator iterator() {
        Iterator iterator = this.val$fromIterable.iterator();
        Function function = this.val$function;
        return Iterators.transform(iterator, function);
    }
}

