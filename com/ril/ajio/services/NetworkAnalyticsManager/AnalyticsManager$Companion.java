/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.NetworkAnalyticsManager;

import android.content.Context;
import com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsManager$Companion {
    private AnalyticsManager$Companion() {
    }

    public /* synthetic */ AnalyticsManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AnalyticsManager getInstance(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        AnalyticsManager analyticsManager = AnalyticsManager.access$getAnalyticsManager$cp();
        if (analyticsManager == null) {
            analyticsManager = new AnalyticsManager((Context)object, null);
            AnalyticsManager.access$setAnalyticsManager$cp(analyticsManager);
        }
        object = AnalyticsManager.access$getAnalyticsManager$cp();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager");
        return object;
    }
}

