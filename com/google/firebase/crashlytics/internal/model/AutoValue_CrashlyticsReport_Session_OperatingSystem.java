/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem;

final class AutoValue_CrashlyticsReport_Session_OperatingSystem
extends CrashlyticsReport$Session$OperatingSystem {
    private final String buildVersion;
    private final boolean jailbroken;
    private final int platform;
    private final String version;

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int n3, String string2, String string3, boolean bl2) {
        this.platform = n3;
        this.version = string2;
        this.buildVersion = string3;
        this.jailbroken = bl2;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_OperatingSystem(int n3, String string2, String string3, boolean bl2, AutoValue_CrashlyticsReport_Session_OperatingSystem$1 autoValue_CrashlyticsReport_Session_OperatingSystem$1) {
        this(n3, string2, string3, bl2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof CrashlyticsReport$Session$OperatingSystem;
        if (n3 != 0) {
            int n4;
            String string2;
            String string3;
            n3 = this.platform;
            int n7 = ((CrashlyticsReport$Session$OperatingSystem)(object = (CrashlyticsReport$Session$OperatingSystem)object)).getPlatform();
            if (n3 != n7 || (n3 = (int)((string3 = this.version).equals(string2 = ((CrashlyticsReport$Session$OperatingSystem)object).getVersion()) ? 1 : 0)) == 0 || (n3 = (int)((string3 = this.buildVersion).equals(string2 = ((CrashlyticsReport$Session$OperatingSystem)object).getBuildVersion()) ? 1 : 0)) == 0 || (n3 = (int)(this.jailbroken ? 1 : 0)) != (n4 = ((CrashlyticsReport$Session$OperatingSystem)object).isJailbroken())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int n3 = this.platform;
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.version.hashCode();
        n3 = (n3 ^ n7) * n4;
        String string2 = this.buildVersion;
        n7 = string2.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = (int)(this.jailbroken ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 ^ n4;
    }

    public boolean isJailbroken() {
        return this.jailbroken;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("OperatingSystem{platform=");
        int bl2 = this.platform;
        stringBuilder.append(bl2);
        stringBuilder.append(", version=");
        String string2 = this.version;
        stringBuilder.append(string2);
        stringBuilder.append(", buildVersion=");
        string2 = this.buildVersion;
        stringBuilder.append(string2);
        stringBuilder.append(", jailbroken=");
        boolean bl3 = this.jailbroken;
        return Vm.a("}", bl3, stringBuilder);
    }
}

