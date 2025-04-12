/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

final class CrashlyticsWorkers$Companion$checkBlockingThread$1
extends FunctionReferenceImpl
implements Function0 {
    public CrashlyticsWorkers$Companion$checkBlockingThread$1(Object object) {
        super(0, object, CrashlyticsWorkers$Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
    }

    public final Boolean invoke() {
        return CrashlyticsWorkers$Companion.access$isBlockingThread((CrashlyticsWorkers$Companion)this.receiver);
    }
}

