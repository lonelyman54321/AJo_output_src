/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.preferences.models;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApplicationLifecyclePreferences {
    private final boolean backgroundTracking;
    private final boolean offlineMode;

    public ApplicationLifecyclePreferences() {
        this(false, false, 3, null);
    }

    public ApplicationLifecyclePreferences(boolean bl2, boolean bl3) {
        this.offlineMode = bl2;
        this.backgroundTracking = bl3;
    }

    public /* synthetic */ ApplicationLifecyclePreferences(boolean bl2, boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n3 &= 2) != 0) {
            bl3 = true;
        }
        this(bl2, bl3);
    }

    public static /* synthetic */ ApplicationLifecyclePreferences copy$default(ApplicationLifecyclePreferences applicationLifecyclePreferences, boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = applicationLifecyclePreferences.offlineMode;
        }
        if ((n3 &= 2) != 0) {
            bl3 = applicationLifecyclePreferences.backgroundTracking;
        }
        return applicationLifecyclePreferences.copy(bl2, bl3);
    }

    public final boolean component1() {
        return this.offlineMode;
    }

    public final boolean component2() {
        return this.backgroundTracking;
    }

    public final ApplicationLifecyclePreferences copy(boolean bl2, boolean bl3) {
        ApplicationLifecyclePreferences applicationLifecyclePreferences = new ApplicationLifecyclePreferences(bl2, bl3);
        return applicationLifecyclePreferences;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApplicationLifecyclePreferences;
        if (!bl3) {
            return false;
        }
        object = (ApplicationLifecyclePreferences)object;
        bl3 = this.offlineMode;
        boolean bl4 = ((ApplicationLifecyclePreferences)object).offlineMode;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.backgroundTracking;
        boolean bl5 = ((ApplicationLifecyclePreferences)object).backgroundTracking;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final boolean getBackgroundTracking() {
        return this.backgroundTracking;
    }

    public final boolean getOfflineMode() {
        return this.offlineMode;
    }

    public int hashCode() {
        boolean bl2;
        boolean n3 = this.offlineMode;
        boolean bl3 = true;
        if (n3) {
            bl2 = true;
        }
        void var1_3 = bl2 * 31;
        boolean bl4 = this.backgroundTracking;
        if (!bl4) {
            bl3 = bl4;
        }
        return (int)(var1_3 + bl3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplicationLifecyclePreferences(offlineMode=");
        boolean bl2 = this.offlineMode;
        stringBuilder.append(bl2);
        stringBuilder.append(", backgroundTracking=");
        bl2 = this.backgroundTracking;
        return AR.a(stringBuilder, bl2, ')');
    }
}

