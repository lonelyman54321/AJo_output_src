/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_Log$Builder
extends CrashlyticsReport$Session$Event$Log$Builder {
    private String content;

    public CrashlyticsReport$Session$Event$Log build() {
        Object object = this.content;
        if (object != null) {
            AutoValue_CrashlyticsReport_Session_Event_Log autoValue_CrashlyticsReport_Session_Event_Log = new AutoValue_CrashlyticsReport_Session_Event_Log((String)object, null);
            return autoValue_CrashlyticsReport_Session_Event_Log;
        }
        object = new IllegalStateException("Missing required properties: content");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Log$Builder setContent(String object) {
        if (object != null) {
            this.content = object;
            return this;
        }
        object = new NullPointerException("Null content");
        throw object;
    }
}

