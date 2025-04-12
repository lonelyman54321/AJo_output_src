/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode;

interface CycleDetectingLockFactory$CycleDetectingLock {
    public CycleDetectingLockFactory.LockGraphNode getLockGraphNode();

    public boolean isAcquiredByCurrentThread();
}

