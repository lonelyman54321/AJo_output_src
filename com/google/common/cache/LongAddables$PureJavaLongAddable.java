/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LongAddable;
import com.google.common.cache.LongAddables$1;
import java.util.concurrent.atomic.AtomicLong;

final class LongAddables$PureJavaLongAddable
extends AtomicLong
implements LongAddable {
    private LongAddables$PureJavaLongAddable() {
    }

    public /* synthetic */ LongAddables$PureJavaLongAddable(LongAddables$1 longAddables$1) {
        this();
    }

    public void add(long l2) {
        this.getAndAdd(l2);
    }

    public void increment() {
        this.getAndIncrement();
    }

    public long sum() {
        return this.get();
    }
}

