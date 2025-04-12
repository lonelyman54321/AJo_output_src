/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

class FluentIterable$FromIterableFunction
implements Function {
    private FluentIterable$FromIterableFunction() {
    }

    public FluentIterable apply(Iterable iterable) {
        return FluentIterable.from(iterable);
    }
}

