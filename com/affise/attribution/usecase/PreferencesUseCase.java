/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

public interface PreferencesUseCase {
    public boolean isBackgroundTrackingEnabled();

    public boolean isOfflineModeEnabled();

    public boolean isTrackingEnabled();

    public void setBackgroundTrackingEnabled(boolean var1);

    public void setOfflineModeEnabled(boolean var1);

    public void setTrackingEnabled(boolean var1);
}

