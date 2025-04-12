/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.preferences.models;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApplicationLifetimePreferences {
    private final boolean trackingEnabled;

    public ApplicationLifetimePreferences() {
        this(false, 1, null);
    }

    public ApplicationLifetimePreferences(boolean bl2) {
        this.trackingEnabled = bl2;
    }

    public /* synthetic */ ApplicationLifetimePreferences(boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = true;
        }
        this(bl2);
    }

    public static /* synthetic */ ApplicationLifetimePreferences copy$default(ApplicationLifetimePreferences applicationLifetimePreferences, boolean bl2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            bl2 = applicationLifetimePreferences.trackingEnabled;
        }
        return applicationLifetimePreferences.copy(bl2);
    }

    public final boolean component1() {
        return this.trackingEnabled;
    }

    public final ApplicationLifetimePreferences copy(boolean bl2) {
        ApplicationLifetimePreferences applicationLifetimePreferences = new ApplicationLifetimePreferences(bl2);
        return applicationLifetimePreferences;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApplicationLifetimePreferences;
        if (!bl3) {
            return false;
        }
        object = (ApplicationLifetimePreferences)object;
        bl3 = this.trackingEnabled;
        boolean bl4 = ((ApplicationLifetimePreferences)object).trackingEnabled;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final boolean getTrackingEnabled() {
        return this.trackingEnabled;
    }

    public int hashCode() {
        int n3 = (int)(this.trackingEnabled ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        return n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplicationLifetimePreferences(trackingEnabled=");
        boolean bl2 = this.trackingEnabled;
        return AR.a(stringBuilder, bl2, ')');
    }
}

