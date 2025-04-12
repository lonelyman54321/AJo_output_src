/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;

class Range$UpperBoundFn
implements Function {
    static final Range$UpperBoundFn INSTANCE;

    static {
        Range$UpperBoundFn range$UpperBoundFn;
        INSTANCE = range$UpperBoundFn = new Range$UpperBoundFn();
    }

    public Cut apply(Range range) {
        return range.upperBound;
    }
}

