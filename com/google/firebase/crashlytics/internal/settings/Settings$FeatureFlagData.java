/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.settings;

public class Settings$FeatureFlagData {
    public final boolean collectAnrs;
    public final boolean collectBuildIds;
    public final boolean collectReports;

    public Settings$FeatureFlagData(boolean bl2, boolean bl3, boolean bl4) {
        this.collectReports = bl2;
        this.collectAnrs = bl3;
        this.collectBuildIds = bl4;
    }
}

