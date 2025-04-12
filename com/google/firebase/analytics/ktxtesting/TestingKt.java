/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.ktxtesting;

import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class TestingKt {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void withAnalyticsForTest(FirebaseAnalytics firebaseAnalytics, Function0 function0) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "analytics");
        Intrinsics.checkNotNullParameter(function0, "block");
        Object object = AnalyticsKt.getLOCK();
        synchronized (object) {
            FirebaseAnalytics firebaseAnalytics2;
            try {
                firebaseAnalytics2 = AnalyticsKt.getANALYTICS();
                AnalyticsKt.setANALYTICS(firebaseAnalytics);
            }
            catch (Throwable throwable) {}
            try {
                function0.invoke();
            }
            catch (Throwable throwable) {
                AnalyticsKt.setANALYTICS(firebaseAnalytics2);
                throw throwable;
            }
            AnalyticsKt.setANALYTICS(firebaseAnalytics2);
            return;
            throw throwable;
        }
    }
}

