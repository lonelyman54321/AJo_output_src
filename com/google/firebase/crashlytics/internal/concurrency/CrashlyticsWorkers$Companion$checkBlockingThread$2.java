/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class CrashlyticsWorkers$Companion$checkBlockingThread$2
extends Lambda
implements Function0 {
    public static final CrashlyticsWorkers$Companion$checkBlockingThread$2 INSTANCE;

    static {
        CrashlyticsWorkers$Companion$checkBlockingThread$2 crashlyticsWorkers$Companion$checkBlockingThread$2;
        INSTANCE = crashlyticsWorkers$Companion$checkBlockingThread$2 = new CrashlyticsWorkers$Companion$checkBlockingThread$2();
    }

    public CrashlyticsWorkers$Companion$checkBlockingThread$2() {
        super(0);
    }

    public final String invoke() {
        StringBuilder stringBuilder = new StringBuilder("Must be called on a blocking thread, was called on ");
        String string2 = CrashlyticsWorkers$Companion.access$getThreadName(CrashlyticsWorkers.Companion);
        stringBuilder.append(string2);
        stringBuilder.append('.');
        return stringBuilder.toString();
    }
}

