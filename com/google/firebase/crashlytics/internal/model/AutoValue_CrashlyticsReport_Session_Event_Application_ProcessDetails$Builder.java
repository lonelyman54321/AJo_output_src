/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder
extends CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder {
    private boolean defaultProcess;
    private int importance;
    private int pid;
    private String processName;
    private byte set$0;

    public CrashlyticsReport$Session$Event$Application$ProcessDetails build() {
        String string2;
        int n3 = this.set$0;
        int n4 = 7;
        if (n3 == n4 && (string2 = this.processName) != null) {
            int n7 = this.pid;
            int n8 = this.importance;
            boolean bl2 = this.defaultProcess;
            AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails autoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails = new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(string2, n7, n8, bl2, null);
            return autoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails;
        }
        CharSequence charSequence = new StringBuilder();
        Object object = this.processName;
        if (object == null) {
            object = " processName";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 1) == 0) {
            object = " pid";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 2) == 0) {
            object = " importance";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 4) == 0) {
            object = " defaultProcess";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setDefaultProcess(boolean bl2) {
        byte by2;
        this.defaultProcess = bl2;
        this.set$0 = by2 = (byte)(this.set$0 | 4);
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setImportance(int n3) {
        this.importance = n3;
        n3 = (byte)(this.set$0 | 2);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setPid(int n3) {
        this.pid = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder setProcessName(String object) {
        if (object != null) {
            this.processName = object;
            return this;
        }
        object = new NullPointerException("Null processName");
        throw object;
    }
}

