/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.preferences.ApplicationLifecyclePreferencesRepositoryImpl;
import com.affise.attribution.preferences.ApplicationLifetimePreferencesRepositoryImpl;
import com.affise.attribution.preferences.models.ApplicationLifecyclePreferences;
import com.affise.attribution.preferences.models.ApplicationLifetimePreferences;
import com.affise.attribution.usecase.PreferencesUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class PreferencesUseCaseImpl
implements PreferencesUseCase {
    private final ApplicationLifetimePreferencesRepositoryImpl lifetimeRepository;
    private final ApplicationLifecyclePreferencesRepositoryImpl repository;

    public PreferencesUseCaseImpl(ApplicationLifecyclePreferencesRepositoryImpl applicationLifecyclePreferencesRepositoryImpl, ApplicationLifetimePreferencesRepositoryImpl applicationLifetimePreferencesRepositoryImpl) {
        Intrinsics.checkNotNullParameter(applicationLifecyclePreferencesRepositoryImpl, "repository");
        Intrinsics.checkNotNullParameter(applicationLifetimePreferencesRepositoryImpl, "lifetimeRepository");
        this.repository = applicationLifecyclePreferencesRepositoryImpl;
        this.lifetimeRepository = applicationLifetimePreferencesRepositoryImpl;
    }

    public boolean isBackgroundTrackingEnabled() {
        return this.repository.getPreferences().getBackgroundTracking();
    }

    public boolean isOfflineModeEnabled() {
        return this.repository.getPreferences().getOfflineMode();
    }

    public boolean isTrackingEnabled() {
        return this.lifetimeRepository.getPreferences().getTrackingEnabled();
    }

    public void setBackgroundTrackingEnabled(boolean bl2) {
        ApplicationLifecyclePreferencesRepositoryImpl applicationLifecyclePreferencesRepositoryImpl = this.repository;
        ApplicationLifecyclePreferences applicationLifecyclePreferences = ApplicationLifecyclePreferences.copy$default(applicationLifecyclePreferencesRepositoryImpl.getPreferences(), false, bl2, 1, null);
        applicationLifecyclePreferencesRepositoryImpl.setPreferences(applicationLifecyclePreferences);
    }

    public void setOfflineModeEnabled(boolean bl2) {
        ApplicationLifecyclePreferencesRepositoryImpl applicationLifecyclePreferencesRepositoryImpl = this.repository;
        ApplicationLifecyclePreferences applicationLifecyclePreferences = ApplicationLifecyclePreferences.copy$default(applicationLifecyclePreferencesRepositoryImpl.getPreferences(), bl2, false, 2, null);
        applicationLifecyclePreferencesRepositoryImpl.setPreferences(applicationLifecyclePreferences);
    }

    public void setTrackingEnabled(boolean bl2) {
        ApplicationLifetimePreferencesRepositoryImpl applicationLifetimePreferencesRepositoryImpl = this.lifetimeRepository;
        ApplicationLifetimePreferences applicationLifetimePreferences = applicationLifetimePreferencesRepositoryImpl.getPreferences().copy(bl2);
        applicationLifetimePreferencesRepositoryImpl.setPreferences(applicationLifetimePreferences);
    }
}

