/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.FirebaseExperiments;
import com.ril.ajio.analytics.MyRewardsOption;

public final class AnalyticsUtil {
    public static final int $stable;
    public static final AnalyticsUtil$Companion Companion;

    static {
        AnalyticsUtil$Companion analyticsUtil$Companion;
        Companion = analyticsUtil$Companion = new AnalyticsUtil$Companion(null);
    }

    public static final FirebaseExperiments mapperToFirebaseExperiments(String string2) {
        return Companion.mapperToFirebaseExperiments(string2);
    }

    public static final MyRewardsOption mapperToMyRewardsOption(String string2) {
        return Companion.mapperToMyRewardsOption(string2);
    }
}

