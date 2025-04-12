/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

import com.ril.ajio.analytics.events.FirebaseEvents;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseEvents$Companion {
    private FirebaseEvents$Companion() {
    }

    public /* synthetic */ FirebaseEvents$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final FirebaseEvents getInstance() {
        FirebaseEvents firebaseEvents = FirebaseEvents.access$getFirebaseEvents$cp();
        if (firebaseEvents == null) {
            firebaseEvents = new FirebaseEvents();
            FirebaseEvents.access$setFirebaseEvents$cp(firebaseEvents);
        }
        firebaseEvents = FirebaseEvents.access$getFirebaseEvents$cp();
        Intrinsics.checkNotNull(firebaseEvents, "null cannot be cast to non-null type com.ril.ajio.analytics.events.FirebaseEvents");
        return firebaseEvents;
    }
}

