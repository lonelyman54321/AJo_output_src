/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    public static void parkNanos(Object object, long l2) {
        l2 = Math.min(l2, 2147483647999999999L);
        LockSupport.parkNanos(object, l2);
    }
}

