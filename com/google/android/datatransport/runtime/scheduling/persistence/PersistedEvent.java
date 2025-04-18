/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;

public abstract class PersistedEvent {
    public static PersistedEvent create(long l2, TransportContext transportContext, EventInternal eventInternal) {
        AutoValue_PersistedEvent autoValue_PersistedEvent = new AutoValue_PersistedEvent(l2, transportContext, eventInternal);
        return autoValue_PersistedEvent;
    }

    public abstract EventInternal getEvent();

    public abstract long getId();

    public abstract TransportContext getTransportContext();
}

