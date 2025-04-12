/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization$Builder;

final class AutoValue_CrashlyticsReport_Session_Application_Organization$Builder
extends CrashlyticsReport$Session$Application$Organization$Builder {
    private String clsId;

    public AutoValue_CrashlyticsReport_Session_Application_Organization$Builder() {
    }

    private AutoValue_CrashlyticsReport_Session_Application_Organization$Builder(CrashlyticsReport$Session$Application$Organization object) {
        this.clsId = object = ((CrashlyticsReport$Session$Application$Organization)object).getClsId();
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Application_Organization$Builder(CrashlyticsReport$Session$Application$Organization crashlyticsReport$Session$Application$Organization, AutoValue_CrashlyticsReport_Session_Application_Organization$1 autoValue_CrashlyticsReport_Session_Application_Organization$1) {
        this(crashlyticsReport$Session$Application$Organization);
    }

    public CrashlyticsReport$Session$Application$Organization build() {
        Object object = this.clsId;
        if (object != null) {
            AutoValue_CrashlyticsReport_Session_Application_Organization autoValue_CrashlyticsReport_Session_Application_Organization = new AutoValue_CrashlyticsReport_Session_Application_Organization((String)object, null);
            return autoValue_CrashlyticsReport_Session_Application_Organization;
        }
        object = new IllegalStateException("Missing required properties: clsId");
        throw object;
    }

    public CrashlyticsReport$Session$Application$Organization$Builder setClsId(String object) {
        if (object != null) {
            this.clsId = object;
            return this;
        }
        object = new NullPointerException("Null clsId");
        throw object;
    }
}

