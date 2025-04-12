/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;

public abstract class CrashlyticsReport$Session$Event$RolloutAssignment$Builder {
    public abstract CrashlyticsReport$Session$Event$RolloutAssignment build();

    public abstract CrashlyticsReport$Session$Event$RolloutAssignment$Builder setParameterKey(String var1);

    public abstract CrashlyticsReport$Session$Event$RolloutAssignment$Builder setParameterValue(String var1);

    public abstract CrashlyticsReport$Session$Event$RolloutAssignment$Builder setRolloutVariant(CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant var1);

    public abstract CrashlyticsReport$Session$Event$RolloutAssignment$Builder setTemplateVersion(long var1);
}

