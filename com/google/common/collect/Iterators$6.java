/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.TransformedIterator;
import java.util.Iterator;

class Iterators$6
extends TransformedIterator {
    final /* synthetic */ Function val$function;

    public Iterators$6(Iterator iterator, Function function) {
        this.val$function = function;
        super(iterator);
    }

    public Object transform(Object object) {
        return this.val$function.apply(object);
    }
}

