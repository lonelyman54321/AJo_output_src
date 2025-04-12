/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class CrashlyticsWorkers$Companion$checkBackgroundThread$2
extends Lambda
implements Function0 {
    public static final CrashlyticsWorkers$Companion$checkBackgroundThread$2 INSTANCE;

    static {
        CrashlyticsWorkers$Companion$checkBackgroundThread$2 crashlyticsWorkers$Companion$checkBackgroundThread$2;
        INSTANCE = crashlyticsWorkers$Companion$checkBackgroundThread$2 = new CrashlyticsWorkers$Companion$checkBackgroundThread$2();
    }

    public CrashlyticsWorkers$Companion$checkBackgroundThread$2() {
        super(0);
    }

    public final String invoke() {
        StringBuilder stringBuilder = new StringBuilder("Must be called on a background thread, was called on ");
        String string2 = CrashlyticsWorkers$Companion.access$getThreadName(CrashlyticsWorkers.Companion);
        stringBuilder.append(string2);
        stringBuilder.append('.');
        return stringBuilder.toString();
    }
}

