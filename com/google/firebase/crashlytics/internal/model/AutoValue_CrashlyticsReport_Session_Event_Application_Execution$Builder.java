/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder
extends CrashlyticsReport$Session$Event$Application$Execution$Builder {
    private CrashlyticsReport$ApplicationExitInfo appExitInfo;
    private List binaries;
    private CrashlyticsReport$Session$Event$Application$Execution$Exception exception;
    private CrashlyticsReport$Session$Event$Application$Execution$Signal signal;
    private List threads;

    public CrashlyticsReport$Session$Event$Application$Execution build() {
        List list;
        CrashlyticsReport$Session$Event$Application$Execution$Signal crashlyticsReport$Session$Event$Application$Execution$Signal = this.signal;
        if (crashlyticsReport$Session$Event$Application$Execution$Signal != null && (list = this.binaries) != null) {
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution autoValue_CrashlyticsReport_Session_Event_Application_Execution;
            List list2 = this.threads;
            CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception = this.exception;
            CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo = this.appExitInfo;
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution autoValue_CrashlyticsReport_Session_Event_Application_Execution2 = autoValue_CrashlyticsReport_Session_Event_Application_Execution;
            autoValue_CrashlyticsReport_Session_Event_Application_Execution = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(list2, crashlyticsReport$Session$Event$Application$Execution$Exception, crashlyticsReport$ApplicationExitInfo, crashlyticsReport$Session$Event$Application$Execution$Signal, list, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_Execution;
        }
        CharSequence charSequence = new StringBuilder();
        Object object = this.signal;
        if (object == null) {
            object = " signal";
            charSequence.append((String)object);
        }
        if ((object = this.binaries) == null) {
            object = " binaries";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Builder setAppExitInfo(CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        this.appExitInfo = crashlyticsReport$ApplicationExitInfo;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Builder setBinaries(List object) {
        if (object != null) {
            this.binaries = object;
            return this;
        }
        object = new NullPointerException("Null binaries");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Builder setException(CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception) {
        this.exception = crashlyticsReport$Session$Event$Application$Execution$Exception;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Builder setSignal(CrashlyticsReport$Session$Event$Application$Execution$Signal object) {
        if (object != null) {
            this.signal = object;
            return this;
        }
        object = new NullPointerException("Null signal");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Builder setThreads(List list) {
        this.threads = list;
        return this;
    }
}

