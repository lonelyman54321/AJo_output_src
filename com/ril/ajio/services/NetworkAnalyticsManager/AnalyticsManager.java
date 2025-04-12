/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.NetworkAnalyticsManager;

import android.content.Context;
import com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager$Companion;
import com.ril.ajio.services.NetworkAnalyticsManager.GoogleAnalyticsEvents;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AnalyticsManager {
    public static final AnalyticsManager$Companion Companion;
    private static AnalyticsManager analyticsManager;
    private final GoogleAnalyticsEvents ga;

    static {
        AnalyticsManager$Companion analyticsManager$Companion;
        Companion = analyticsManager$Companion = new AnalyticsManager$Companion(null);
    }

    private AnalyticsManager(Context context) {
        GoogleAnalyticsEvents googleAnalyticsEvents;
        this.ga = googleAnalyticsEvents = new GoogleAnalyticsEvents(context);
    }

    public /* synthetic */ AnalyticsManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ AnalyticsManager access$getAnalyticsManager$cp() {
        return analyticsManager;
    }

    public static final /* synthetic */ void access$setAnalyticsManager$cp(AnalyticsManager analyticsManager) {
        AnalyticsManager.analyticsManager = analyticsManager;
    }

    public static final AnalyticsManager getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final GoogleAnalyticsEvents getGa() {
        return this.ga;
    }
}

