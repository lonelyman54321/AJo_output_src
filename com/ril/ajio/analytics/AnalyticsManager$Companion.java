/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsManager$Companion {
    private AnalyticsManager$Companion() {
    }

    public /* synthetic */ AnalyticsManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getInstance$annotations() {
    }

    public final AnalyticsManager getInstance() {
        AnalyticsManager analyticsManager = AnalyticsManager.access$getAnalyticsManager$cp();
        if (analyticsManager == null) {
            analyticsManager = new AnalyticsManager(null);
            AnalyticsManager.access$setAnalyticsManager$cp(analyticsManager);
        }
        analyticsManager = AnalyticsManager.access$getAnalyticsManager$cp();
        Intrinsics.checkNotNull(analyticsManager, "null cannot be cast to non-null type com.ril.ajio.analytics.AnalyticsManager");
        return analyticsManager;
    }
}

