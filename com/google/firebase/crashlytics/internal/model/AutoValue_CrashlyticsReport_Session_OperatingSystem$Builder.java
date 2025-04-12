/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder;

final class AutoValue_CrashlyticsReport_Session_OperatingSystem$Builder
extends CrashlyticsReport$Session$OperatingSystem$Builder {
    private String buildVersion;
    private boolean jailbroken;
    private int platform;
    private byte set$0;
    private String version;

    public CrashlyticsReport$Session$OperatingSystem build() {
        Object object;
        String string2;
        String string3;
        int n3 = this.set$0;
        int n4 = 3;
        if (n3 == n4 && (string3 = this.version) != null && (string2 = this.buildVersion) != null) {
            int n7 = this.platform;
            boolean bl2 = this.jailbroken;
            AutoValue_CrashlyticsReport_Session_OperatingSystem autoValue_CrashlyticsReport_Session_OperatingSystem = new AutoValue_CrashlyticsReport_Session_OperatingSystem(n7, string3, string2, bl2, null);
            return autoValue_CrashlyticsReport_Session_OperatingSystem;
        }
        CharSequence charSequence = new StringBuilder();
        n4 = this.set$0 & 1;
        if (n4 == 0) {
            object = " platform";
            charSequence.append((String)object);
        }
        if ((object = this.version) == null) {
            object = " version";
            charSequence.append((String)object);
        }
        if ((object = this.buildVersion) == null) {
            object = " buildVersion";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 2) == 0) {
            object = " jailbroken";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$OperatingSystem$Builder setBuildVersion(String object) {
        if (object != null) {
            this.buildVersion = object;
            return this;
        }
        object = new NullPointerException("Null buildVersion");
        throw object;
    }

    public CrashlyticsReport$Session$OperatingSystem$Builder setJailbroken(boolean bl2) {
        byte by2;
        this.jailbroken = bl2;
        this.set$0 = by2 = (byte)(this.set$0 | 2);
        return this;
    }

    public CrashlyticsReport$Session$OperatingSystem$Builder setPlatform(int n3) {
        this.platform = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$OperatingSystem$Builder setVersion(String object) {
        if (object != null) {
            this.version = object;
            return this;
        }
        object = new NullPointerException("Null version");
        throw object;
    }
}

