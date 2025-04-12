/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal.predefined;

import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.internal.InternalEventName;
import com.affise.attribution.parameters.ProviderType;

public final class SessionStartInternalEvent
extends InternalEvent {
    private final long affiseSessionCount;
    private final long lifetimeSessionCount;

    public SessionStartInternalEvent(long l2, long l3) {
        this.affiseSessionCount = l2;
        this.lifetimeSessionCount = l3;
        String string2 = ProviderType.AFFISE_SESSION_COUNT.getProvider();
        Object object = l2;
        this.addPropertyRaw(string2, object);
        object = ProviderType.LIFETIME_SESSION_COUNT.getProvider();
        Long l4 = l3;
        this.addPropertyRaw((String)object, l4);
    }

    public InternalEventName getName() {
        return InternalEventName.SESSION_START;
    }
}

