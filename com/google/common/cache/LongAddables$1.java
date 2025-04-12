/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Supplier;
import com.google.common.cache.LongAddable;
import com.google.common.cache.LongAdder;

class LongAddables$1
implements Supplier {
    public LongAddable get() {
        LongAdder longAdder = new LongAdder();
        return longAdder;
    }
}

