/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.preferences;

import com.affise.attribution.preferences.models.ApplicationLifecyclePreferences;

public interface ApplicationLifecyclePreferencesRepository {
    public ApplicationLifecyclePreferences getPreferences();

    public void setPreferences(ApplicationLifecyclePreferences var1);
}

