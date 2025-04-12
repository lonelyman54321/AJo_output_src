/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

import com.ril.ajio.analytics.events.PlpListViewEvents;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpListViewEvents$Companion {
    private PlpListViewEvents$Companion() {
    }

    public /* synthetic */ PlpListViewEvents$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getInstance$annotations() {
    }

    public final PlpListViewEvents getInstance() {
        PlpListViewEvents plpListViewEvents = PlpListViewEvents.access$getPlpListViewEvents$cp();
        if (plpListViewEvents == null) {
            plpListViewEvents = new PlpListViewEvents(null);
            PlpListViewEvents.access$setPlpListViewEvents$cp(plpListViewEvents);
        }
        plpListViewEvents = PlpListViewEvents.access$getPlpListViewEvents$cp();
        Intrinsics.checkNotNull(plpListViewEvents, "null cannot be cast to non-null type com.ril.ajio.analytics.events.PlpListViewEvents");
        return plpListViewEvents;
    }
}

