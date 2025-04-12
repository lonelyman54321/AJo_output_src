/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.preferences;

import com.affise.attribution.preferences.models.ApplicationLifetimePreferences;

public interface ApplicationLifetimePreferencesRepository {
    public ApplicationLifetimePreferences getPreferences();

    public void setPreferences(ApplicationLifetimePreferences var1);
}

