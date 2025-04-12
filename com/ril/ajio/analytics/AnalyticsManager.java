/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FacebookEvents;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AnalyticsManager {
    public static final int $stable;
    public static final AnalyticsManager$Companion Companion;
    private static AnalyticsManager analyticsManager;
    private final CleverTapEvents ct;
    private final FacebookEvents fb;
    private final FirebaseEvents firebaseEvents;
    private final GoogleAnalyticsEvents ga;
    private final GTMEvents gtmEvents;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;

    static {
        AnalyticsManager$Companion analyticsManager$Companion;
        Companion = analyticsManager$Companion = new AnalyticsManager$Companion(null);
        $stable = 8;
    }

    private AnalyticsManager() {
        Object object = new GoogleAnalyticsEvents();
        this.ga = object;
        this.ct = object = new CleverTapEvents();
        this.fb = object = new FacebookEvents();
        this.gtmEvents = object = new GTMEvents();
        this.firebaseEvents = object = FirebaseEvents.Companion.getInstance();
        this.newEEcommerceEventsRevamp = object = new NewEEcommerceEventsRevamp();
        this.newCustomEventsRevamp = object = new NewCustomEventsRevamp();
    }

    public /* synthetic */ AnalyticsManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ AnalyticsManager access$getAnalyticsManager$cp() {
        return analyticsManager;
    }

    public static final /* synthetic */ void access$setAnalyticsManager$cp(AnalyticsManager analyticsManager) {
        AnalyticsManager.analyticsManager = analyticsManager;
    }

    public static final AnalyticsManager getInstance() {
        return Companion.getInstance();
    }

    public final CleverTapEvents getCt() {
        return this.ct;
    }

    public final FacebookEvents getFb() {
        return this.fb;
    }

    public final FirebaseEvents getFirebaseEvents() {
        return this.firebaseEvents;
    }

    public final GoogleAnalyticsEvents getGa() {
        return this.ga;
    }

    public final GTMEvents getGtmEvents() {
        return this.gtmEvents;
    }

    public final NewCustomEventsRevamp getNewCustomEventsRevamp() {
        return this.newCustomEventsRevamp;
    }

    public final NewEEcommerceEventsRevamp getNewEEcommerceEventsRevamp() {
        return this.newEEcommerceEventsRevamp;
    }
}

