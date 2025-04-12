/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import com.ril.ajio.analytics.AnalyticsEventReporterImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsEventReporterImpl$Companion {
    private AnalyticsEventReporterImpl$Companion() {
    }

    public /* synthetic */ AnalyticsEventReporterImpl$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getInstance$annotations() {
    }

    public final xe getInstance() {
        xe xe2 = AnalyticsEventReporterImpl.access$getReporter$cp();
        if (xe2 == null) {
            xe2 = new AnalyticsEventReporterImpl();
            AnalyticsEventReporterImpl.access$setReporter$cp(xe2);
        }
        xe2 = AnalyticsEventReporterImpl.access$getReporter$cp();
        Intrinsics.checkNotNull(xe2, "null cannot be cast to non-null type com.ajio.ril.core.analytics.AnalyticsReporter");
        return xe2;
    }
}

