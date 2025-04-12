/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.atomic.AtomicLong;

public class TestClock
implements Clock {
    private final AtomicLong timestamp;

    public TestClock(long l2) {
        AtomicLong atomicLong;
        this.timestamp = atomicLong = new AtomicLong(l2);
    }

    public void advance(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            this.timestamp.addAndGet(l2);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cannot advance time backwards.");
        throw illegalArgumentException;
    }

    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        this.advance(1L);
    }
}

