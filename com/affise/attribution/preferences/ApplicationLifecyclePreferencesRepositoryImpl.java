/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.preferences;

import com.affise.attribution.preferences.ApplicationLifecyclePreferencesRepository;
import com.affise.attribution.preferences.models.ApplicationLifecyclePreferences;
import kotlin.jvm.internal.Intrinsics;

public final class ApplicationLifecyclePreferencesRepositoryImpl
implements ApplicationLifecyclePreferencesRepository {
    private ApplicationLifecyclePreferences preferences;

    public ApplicationLifecyclePreferencesRepositoryImpl() {
        ApplicationLifecyclePreferences applicationLifecyclePreferences;
        this.preferences = applicationLifecyclePreferences = new ApplicationLifecyclePreferences(false, false, 3, null);
    }

    public ApplicationLifecyclePreferences getPreferences() {
        return this.preferences;
    }

    public void setPreferences(ApplicationLifecyclePreferences applicationLifecyclePreferences) {
        Intrinsics.checkNotNullParameter(applicationLifecyclePreferences, "<set-?>");
        this.preferences = applicationLifecyclePreferences;
    }
}

