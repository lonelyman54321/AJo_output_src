/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread;
import java.util.List;

public abstract class CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder {
    public abstract CrashlyticsReport$Session$Event$Application$Execution$Thread build();

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder setFrames(List var1);

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder setImportance(int var1);

    public abstract CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder setName(String var1);
}

