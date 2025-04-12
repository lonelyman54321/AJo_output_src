/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.util.concurrent.AtomicLongMap;
import java.util.concurrent.atomic.AtomicLong;

class AtomicLongMap$1
implements Function {
    public AtomicLongMap$1(AtomicLongMap atomicLongMap) {
    }

    public Long apply(AtomicLong atomicLong) {
        return atomicLong.get();
    }
}

