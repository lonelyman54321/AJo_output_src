/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder;

final class AutoValue_CrashlyticsReport_Session_User$Builder
extends CrashlyticsReport$Session$User$Builder {
    private String identifier;

    public CrashlyticsReport$Session$User build() {
        Object object = this.identifier;
        if (object != null) {
            AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = new AutoValue_CrashlyticsReport_Session_User((String)object, null);
            return autoValue_CrashlyticsReport_Session_User;
        }
        object = new IllegalStateException("Missing required properties: identifier");
        throw object;
    }

    public CrashlyticsReport$Session$User$Builder setIdentifier(String object) {
        if (object != null) {
            this.identifier = object;
            return this;
        }
        object = new NullPointerException("Null identifier");
        throw object;
    }
}

