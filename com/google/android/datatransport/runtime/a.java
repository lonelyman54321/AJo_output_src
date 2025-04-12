/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.TransportImpl;

public final class a
implements TransportScheduleCallback {
    public final void onSchedule(Exception exception) {
        TransportImpl.a(exception);
    }
}

