/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.synchronization;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

public interface SynchronizationGuard {
    public Object runCriticalSection(SynchronizationGuard$CriticalSection var1);
}

