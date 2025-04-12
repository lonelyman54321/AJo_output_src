/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.affise.attribution.preferences;

import android.content.SharedPreferences;
import com.affise.attribution.preferences.ApplicationLifetimePreferencesRepository;
import com.affise.attribution.preferences.ApplicationLifetimePreferencesRepositoryImpl$Companion;
import com.affise.attribution.preferences.models.ApplicationLifetimePreferences;
import kotlin.jvm.internal.Intrinsics;

public final class ApplicationLifetimePreferencesRepositoryImpl
implements ApplicationLifetimePreferencesRepository {
    public static final ApplicationLifetimePreferencesRepositoryImpl$Companion Companion;
    private static final String PREFERENCE_TRACKING = "com.affise.attribution.preferences.PREFERENCE_TRACKING";
    private final SharedPreferences sharedPreferences;

    static {
        ApplicationLifetimePreferencesRepositoryImpl$Companion applicationLifetimePreferencesRepositoryImpl$Companion;
        Companion = applicationLifetimePreferencesRepositoryImpl$Companion = new ApplicationLifetimePreferencesRepositoryImpl$Companion(null);
    }

    public ApplicationLifetimePreferencesRepositoryImpl(SharedPreferences sharedPreferences2) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "sharedPreferences");
        this.sharedPreferences = sharedPreferences2;
    }

    public ApplicationLifetimePreferences getPreferences() {
        boolean bl2 = this.sharedPreferences.getBoolean(PREFERENCE_TRACKING, true);
        ApplicationLifetimePreferences applicationLifetimePreferences = new ApplicationLifetimePreferences(bl2);
        return applicationLifetimePreferences;
    }

    public void setPreferences(ApplicationLifetimePreferences applicationLifetimePreferences) {
        Intrinsics.checkNotNullParameter(applicationLifetimePreferences, "value");
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        boolean bl2 = applicationLifetimePreferences.getTrackingEnabled();
        editor.putBoolean(PREFERENCE_TRACKING, bl2);
        editor.apply();
    }
}

