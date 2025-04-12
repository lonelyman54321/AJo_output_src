/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;

public interface ClientHealthMetricsStore {
    public ClientMetrics loadClientMetrics();

    public void recordLogEventDropped(long var1, LogEventDropped$Reason var3, String var4);

    public void resetClientMetrics();
}

