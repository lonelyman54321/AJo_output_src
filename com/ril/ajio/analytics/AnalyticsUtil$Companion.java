/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import com.ril.ajio.analytics.FirebaseExperiments;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

public final class AnalyticsUtil$Companion {
    private AnalyticsUtil$Companion() {
    }

    public /* synthetic */ AnalyticsUtil$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final FirebaseExperiments mapperToFirebaseExperiments(String string2) {
        String string3;
        int n3;
        if (string2 != null && (n3 = (string3 = ((Object)StringsKt.m0(string2)).toString()).length()) != 0) {
            return (FirebaseExperiments)JsonUtils.fromJson(string2, FirebaseExperiments.class);
        }
        return null;
    }

    public final MyRewardsOption mapperToMyRewardsOption(String string2) {
        String string3;
        int n3;
        if (string2 != null && (n3 = (string3 = ((Object)StringsKt.m0(string2)).toString()).length()) != 0) {
            return (MyRewardsOption)JsonUtils.fromJson(string2, MyRewardsOption.class);
        }
        return null;
    }
}

