/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder
extends CrashlyticsReport$Session$Event$RolloutAssignment$Builder {
    private String parameterKey;
    private String parameterValue;
    private CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant rolloutVariant;
    private byte set$0;
    private long templateVersion;

    public CrashlyticsReport$Session$Event$RolloutAssignment build() {
        Object object;
        byte by2;
        String string2;
        String string3;
        CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant = this.rolloutVariant) != null && (string3 = this.parameterKey) != null && (string2 = this.parameterValue) != null) {
            AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment autoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
            long l2 = this.templateVersion;
            AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment autoValue_CrashlyticsReport_Session_Event_RolloutAssignment2 = autoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
            autoValue_CrashlyticsReport_Session_Event_RolloutAssignment = new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant, string3, string2, l2, null);
            return autoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
        }
        CharSequence charSequence = new StringBuilder();
        Object object2 = this.rolloutVariant;
        if (object2 == null) {
            object2 = " rolloutVariant";
            charSequence.append((String)object2);
        }
        if ((object2 = this.parameterKey) == null) {
            object2 = " parameterKey";
            charSequence.append((String)object2);
        }
        if ((object2 = this.parameterValue) == null) {
            object2 = " parameterValue";
            charSequence.append((String)object2);
        }
        if ((n4 &= (by2 = this.set$0)) == 0) {
            object = " templateVersion";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$Builder setParameterKey(String object) {
        if (object != null) {
            this.parameterKey = object;
            return this;
        }
        object = new NullPointerException("Null parameterKey");
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$Builder setParameterValue(String object) {
        if (object != null) {
            this.parameterValue = object;
            return this;
        }
        object = new NullPointerException("Null parameterValue");
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$Builder setRolloutVariant(CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant object) {
        if (object != null) {
            this.rolloutVariant = object;
            return this;
        }
        object = new NullPointerException("Null rolloutVariant");
        throw object;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$Builder setTemplateVersion(long l2) {
        byte by2;
        this.templateVersion = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }
}

