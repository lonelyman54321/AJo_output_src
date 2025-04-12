/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment
extends CrashlyticsReport$Session$Event$RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant rolloutVariant;
    private final long templateVersion;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant, String string2, String string3, long l2) {
        this.rolloutVariant = crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
        this.parameterKey = string2;
        this.parameterValue = string3;
        this.templateVersion = l2;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant, String string2, String string3, long l2, AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$1 autoValue_CrashlyticsReport_Session_Event_RolloutAssignment$1) {
        this(crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant, string2, string3, l2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof CrashlyticsReport$Session$Event$RolloutAssignment;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            Object object2 = this.rolloutVariant;
            Object object3 = ((CrashlyticsReport$Session$Event$RolloutAssignment)(object = (CrashlyticsReport$Session$Event$RolloutAssignment)object)).getRolloutVariant();
            bl3 = object2.equals(object3);
            if (!(bl3 && (bl3 = ((String)(object2 = this.parameterKey)).equals(object3 = ((CrashlyticsReport$Session$Event$RolloutAssignment)object).getParameterKey())) && (bl3 = ((String)(object2 = this.parameterValue)).equals(object3 = ((CrashlyticsReport$Session$Event$RolloutAssignment)object).getParameterValue())) && (l7 = (l4 = (l3 = this.templateVersion) - (l2 = ((CrashlyticsReport$Session$Event$RolloutAssignment)object).getTemplateVersion())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getParameterKey() {
        return this.parameterKey;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant getRolloutVariant() {
        return this.rolloutVariant;
    }

    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public int hashCode() {
        int n3 = this.rolloutVariant.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.parameterKey.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.parameterValue.hashCode();
        n3 = (n3 ^ n7) * n4;
        long l2 = this.templateVersion;
        long l3 = l2 >>> 32;
        n7 = (int)(l2 ^ l3);
        return n3 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RolloutAssignment{rolloutVariant=");
        Object object = this.rolloutVariant;
        stringBuilder.append(object);
        stringBuilder.append(", parameterKey=");
        object = this.parameterKey;
        stringBuilder.append((String)object);
        stringBuilder.append(", parameterValue=");
        object = this.parameterValue;
        stringBuilder.append((String)object);
        stringBuilder.append(", templateVersion=");
        long l2 = this.templateVersion;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

