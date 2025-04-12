/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application$Builder
extends CrashlyticsReport$Session$Event$Application$Builder {
    private List appProcessDetails;
    private Boolean background;
    private CrashlyticsReport$Session$Event$Application$ProcessDetails currentProcessDetails;
    private List customAttributes;
    private CrashlyticsReport$Session$Event$Application$Execution execution;
    private List internalKeys;
    private byte set$0;
    private int uiOrientation;

    public AutoValue_CrashlyticsReport_Session_Event_Application$Builder() {
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application$Builder(CrashlyticsReport$Session$Event$Application crashlyticsReport$Session$Event$Application) {
        int n3;
        Object object = crashlyticsReport$Session$Event$Application.getExecution();
        this.execution = object;
        this.customAttributes = object = crashlyticsReport$Session$Event$Application.getCustomAttributes();
        this.internalKeys = object = crashlyticsReport$Session$Event$Application.getInternalKeys();
        this.background = object = crashlyticsReport$Session$Event$Application.getBackground();
        this.currentProcessDetails = object = crashlyticsReport$Session$Event$Application.getCurrentProcessDetails();
        this.appProcessDetails = object = crashlyticsReport$Session$Event$Application.getAppProcessDetails();
        this.uiOrientation = n3 = crashlyticsReport$Session$Event$Application.getUiOrientation();
        this.set$0 = 1;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application$Builder(CrashlyticsReport$Session$Event$Application crashlyticsReport$Session$Event$Application, AutoValue_CrashlyticsReport_Session_Event_Application$1 autoValue_CrashlyticsReport_Session_Event_Application$1) {
        this(crashlyticsReport$Session$Event$Application);
    }

    public CrashlyticsReport$Session$Event$Application build() {
        Object object;
        byte by2;
        CrashlyticsReport$Session$Event$Application$Execution crashlyticsReport$Session$Event$Application$Execution;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (crashlyticsReport$Session$Event$Application$Execution = this.execution) != null) {
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application;
            List list = this.customAttributes;
            List list2 = this.internalKeys;
            Boolean bl2 = this.background;
            CrashlyticsReport$Session$Event$Application$ProcessDetails crashlyticsReport$Session$Event$Application$ProcessDetails = this.currentProcessDetails;
            List list3 = this.appProcessDetails;
            int n7 = this.uiOrientation;
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application2 = autoValue_CrashlyticsReport_Session_Event_Application;
            autoValue_CrashlyticsReport_Session_Event_Application = new AutoValue_CrashlyticsReport_Session_Event_Application(crashlyticsReport$Session$Event$Application$Execution, list, list2, bl2, crashlyticsReport$Session$Event$Application$ProcessDetails, list3, n7, null);
            return autoValue_CrashlyticsReport_Session_Event_Application;
        }
        CharSequence charSequence = new StringBuilder();
        Object object2 = this.execution;
        if (object2 == null) {
            object2 = " execution";
            charSequence.append((String)object2);
        }
        if ((n4 &= (by2 = this.set$0)) == 0) {
            object = " uiOrientation";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setAppProcessDetails(List list) {
        this.appProcessDetails = list;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setBackground(Boolean bl2) {
        this.background = bl2;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setCurrentProcessDetails(CrashlyticsReport$Session$Event$Application$ProcessDetails crashlyticsReport$Session$Event$Application$ProcessDetails) {
        this.currentProcessDetails = crashlyticsReport$Session$Event$Application$ProcessDetails;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setCustomAttributes(List list) {
        this.customAttributes = list;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setExecution(CrashlyticsReport$Session$Event$Application$Execution object) {
        if (object != null) {
            this.execution = object;
            return this;
        }
        object = new NullPointerException("Null execution");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setInternalKeys(List list) {
        this.internalKeys = list;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Builder setUiOrientation(int n3) {
        this.uiOrientation = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }
}

