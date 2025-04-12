/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics;

import android.os.Bundle;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsEventReporterImpl$Companion;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsEventReporterImpl
implements xe {
    public static final int $stable;
    public static final AnalyticsEventReporterImpl$Companion Companion;
    private static xe reporter;

    static {
        Object object = new AnalyticsEventReporterImpl$Companion(null);
        Companion = object;
        reporter = object = new AnalyticsEventReporterImpl();
    }

    public static final /* synthetic */ xe access$getReporter$cp() {
        return reporter;
    }

    public static final /* synthetic */ void access$setReporter$cp(xe xe2) {
        reporter = xe2;
    }

    public static final xe getInstance() {
        return Companion.getInstance();
    }

    public Trace getTrace(String object) {
        Intrinsics.checkNotNullParameter(object, "traceName");
        object = FirebasePerformance.getInstance().newTrace((String)object);
        Intrinsics.checkNotNullExpressionValue(object, "newTrace(...)");
        return object;
    }

    public void pushButtonTapEvent(String string2, String string3, String string4, int n3) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "name");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        tj2_0.e(AnalyticsManager.Companion, string2, string3, string4);
    }

    public void pushEvent(String string2, String string3, Object object, String string4, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        AnalyticsData analyticsData = ne_0.b(bundle);
        gTMEvents.pushEvent(string2, string3, object, string4, analyticsData);
    }

    public void pushServiceErrorEvent(String object, String string2, String string3, int n3, String string4, int n4, Bundle bundle) {
        Object object2 = "category";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "name");
        object = "screenName";
        Intrinsics.checkNotNullParameter(string4, (String)object);
        if (bundle == null) {
            bundle = new Bundle();
        }
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = new AnalyticsData$Builder();
        object2 = ((AnalyticsData$Builder)object2).bundle(bundle).build();
        ((GTMEvents)object).pushServiceErrorEvent(string2, string3, string4, (AnalyticsData)object2);
    }
}

