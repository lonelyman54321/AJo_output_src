/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.EventName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EventName$Companion {
    private EventName$Companion() {
    }

    public /* synthetic */ EventName$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final EventName from(String string2) {
        EventName eventName = null;
        if (string2 != null) {
            for (EventName eventName2 : EventName.values()) {
                String string3 = eventName2.getEventName();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                eventName = eventName2;
                break;
            }
        }
        return eventName;
    }
}

