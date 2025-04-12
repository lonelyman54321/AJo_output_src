/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;

class Range$LowerBoundFn
implements Function {
    static final Range$LowerBoundFn INSTANCE;

    static {
        Range$LowerBoundFn range$LowerBoundFn;
        INSTANCE = range$LowerBoundFn = new Range$LowerBoundFn();
    }

    public Cut apply(Range range) {
        return range.lowerBound;
    }
}

