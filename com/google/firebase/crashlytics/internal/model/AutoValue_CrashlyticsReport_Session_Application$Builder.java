/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization;

final class AutoValue_CrashlyticsReport_Session_Application$Builder
extends CrashlyticsReport$Session$Application$Builder {
    private String developmentPlatform;
    private String developmentPlatformVersion;
    private String displayVersion;
    private String identifier;
    private String installationUuid;
    private CrashlyticsReport$Session$Application$Organization organization;
    private String version;

    public AutoValue_CrashlyticsReport_Session_Application$Builder() {
    }

    private AutoValue_CrashlyticsReport_Session_Application$Builder(CrashlyticsReport$Session$Application object) {
        Object object2 = ((CrashlyticsReport$Session$Application)object).getIdentifier();
        this.identifier = object2;
        object2 = ((CrashlyticsReport$Session$Application)object).getVersion();
        this.version = object2;
        object2 = ((CrashlyticsReport$Session$Application)object).getDisplayVersion();
        this.displayVersion = object2;
        this.organization = object2 = ((CrashlyticsReport$Session$Application)object).getOrganization();
        this.installationUuid = object2 = ((CrashlyticsReport$Session$Application)object).getInstallationUuid();
        this.developmentPlatform = object2 = ((CrashlyticsReport$Session$Application)object).getDevelopmentPlatform();
        this.developmentPlatformVersion = object = ((CrashlyticsReport$Session$Application)object).getDevelopmentPlatformVersion();
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Application$Builder(CrashlyticsReport$Session$Application crashlyticsReport$Session$Application, AutoValue_CrashlyticsReport_Session_Application$1 autoValue_CrashlyticsReport_Session_Application$1) {
        this(crashlyticsReport$Session$Application);
    }

    public CrashlyticsReport$Session$Application build() {
        String string2;
        Object object = this.identifier;
        if (object != null && (string2 = this.version) != null) {
            AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application;
            String string3 = this.displayVersion;
            CrashlyticsReport$Session$Application$Organization crashlyticsReport$Session$Application$Organization = this.organization;
            String string4 = this.installationUuid;
            String string5 = this.developmentPlatform;
            String string6 = this.developmentPlatformVersion;
            AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application2 = autoValue_CrashlyticsReport_Session_Application;
            autoValue_CrashlyticsReport_Session_Application = new AutoValue_CrashlyticsReport_Session_Application((String)object, string2, string3, crashlyticsReport$Session$Application$Organization, string4, string5, string6, null);
            return autoValue_CrashlyticsReport_Session_Application;
        }
        CharSequence charSequence = new StringBuilder();
        object = this.identifier;
        if (object == null) {
            object = " identifier";
            charSequence.append((String)object);
        }
        if ((object = this.version) == null) {
            object = " version";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Application$Builder setDevelopmentPlatform(String string2) {
        this.developmentPlatform = string2;
        return this;
    }

    public CrashlyticsReport$Session$Application$Builder setDevelopmentPlatformVersion(String string2) {
        this.developmentPlatformVersion = string2;
        return this;
    }

    public CrashlyticsReport$Session$Application$Builder setDisplayVersion(String string2) {
        this.displayVersion = string2;
        return this;
    }

    public CrashlyticsReport$Session$Application$Builder setIdentifier(String object) {
        if (object != null) {
            this.identifier = object;
            return this;
        }
        object = new NullPointerException("Null identifier");
        throw object;
    }

    public CrashlyticsReport$Session$Application$Builder setInstallationUuid(String string2) {
        this.installationUuid = string2;
        return this;
    }

    public CrashlyticsReport$Session$Application$Builder setOrganization(CrashlyticsReport$Session$Application$Organization crashlyticsReport$Session$Application$Organization) {
        this.organization = crashlyticsReport$Session$Application$Organization;
        return this;
    }

    public CrashlyticsReport$Session$Application$Builder setVersion(String object) {
        if (object != null) {
            this.version = object;
            return this;
        }
        object = new NullPointerException("Null version");
        throw object;
    }
}

