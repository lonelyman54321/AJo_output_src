/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent$Builder;

public final class DaggerFirebasePerformanceComponent {
    private DaggerFirebasePerformanceComponent() {
    }

    public static DaggerFirebasePerformanceComponent$Builder builder() {
        DaggerFirebasePerformanceComponent$Builder daggerFirebasePerformanceComponent$Builder = new DaggerFirebasePerformanceComponent$Builder(null);
        return daggerFirebasePerformanceComponent$Builder;
    }
}

