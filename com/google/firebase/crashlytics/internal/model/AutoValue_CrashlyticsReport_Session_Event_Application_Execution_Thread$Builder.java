/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder
extends CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder {
    private List frames;
    private int importance;
    private String name;
    private byte set$0;

    public CrashlyticsReport$Session$Event$Application$Execution$Thread build() {
        Object object;
        byte by2;
        Object object2;
        CharSequence charSequence;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (charSequence = this.name) != null && (object2 = this.frames) != null) {
            int n7 = this.importance;
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread((String)charSequence, n7, (List)object2, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
        }
        charSequence = new StringBuilder();
        object2 = this.name;
        if (object2 == null) {
            object2 = " name";
            ((StringBuilder)charSequence).append((String)object2);
        }
        if ((n4 &= (by2 = this.set$0)) == 0) {
            object = " importance";
            ((StringBuilder)charSequence).append((String)object);
        }
        if ((object = this.frames) == null) {
            object = " frames";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", (StringBuilder)charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder setFrames(List object) {
        if (object != null) {
            this.frames = object;
            return this;
        }
        object = new NullPointerException("Null frames");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder setImportance(int n3) {
        this.importance = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder setName(String object) {
        if (object != null) {
            this.name = object;
            return this;
        }
        object = new NullPointerException("Null name");
        throw object;
    }
}

