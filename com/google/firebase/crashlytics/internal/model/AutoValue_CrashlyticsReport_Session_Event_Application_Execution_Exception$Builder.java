/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder
extends CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder {
    private CrashlyticsReport$Session$Event$Application$Execution$Exception causedBy;
    private List frames;
    private int overflowCount;
    private String reason;
    private byte set$0;
    private String type;

    public CrashlyticsReport$Session$Event$Application$Execution$Exception build() {
        Object object;
        byte by2;
        List list;
        String string2;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (string2 = this.type) != null && (list = this.frames) != null) {
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
            String string3 = this.reason;
            CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception = this.causedBy;
            int n7 = this.overflowCount;
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception2 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
            autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(string2, string3, list, crashlyticsReport$Session$Event$Application$Execution$Exception, n7, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
        }
        CharSequence charSequence = new StringBuilder();
        Object object2 = this.type;
        if (object2 == null) {
            object2 = " type";
            charSequence.append((String)object2);
        }
        if ((object2 = this.frames) == null) {
            object2 = " frames";
            charSequence.append((String)object2);
        }
        if ((n4 &= (by2 = this.set$0)) == 0) {
            object = " overflowCount";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder setCausedBy(CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception) {
        this.causedBy = crashlyticsReport$Session$Event$Application$Execution$Exception;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder setFrames(List object) {
        if (object != null) {
            this.frames = object;
            return this;
        }
        object = new NullPointerException("Null frames");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder setOverflowCount(int n3) {
        this.overflowCount = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder setReason(String string2) {
        this.reason = string2;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder setType(String object) {
        if (object != null) {
            this.type = object;
            return this;
        }
        object = new NullPointerException("Null type");
        throw object;
    }
}

