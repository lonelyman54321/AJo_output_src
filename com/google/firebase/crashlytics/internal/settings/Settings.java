/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData;
import com.google.firebase.crashlytics.internal.settings.Settings$SessionData;

public class Settings {
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final Settings$FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final Settings$SessionData sessionData;
    public final int settingsVersion;

    public Settings(long l2, Settings$SessionData settings$SessionData, Settings$FeatureFlagData settings$FeatureFlagData, int n3, int n4, double d2, double d5, int n7) {
        this.expiresAtMillis = l2;
        this.sessionData = settings$SessionData;
        this.featureFlagData = settings$FeatureFlagData;
        this.settingsVersion = n3;
        this.cacheDuration = n4;
        this.onDemandUploadRatePerMinute = d2;
        this.onDemandBackoffBase = d5;
        this.onDemandBackoffStepDurationSeconds = n7;
    }

    public boolean isExpired(long l2) {
        long l3 = this.expiresAtMillis;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object < 0;
        return bl2;
    }
}

