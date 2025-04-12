/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

final class CrashlyticsWorkers$Companion$checkNotMainThread$1
extends FunctionReferenceImpl
implements Function0 {
    public CrashlyticsWorkers$Companion$checkNotMainThread$1(Object object) {
        super(0, object, CrashlyticsWorkers$Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
    }

    public final Boolean invoke() {
        return CrashlyticsWorkers$Companion.access$isNotMainThread((CrashlyticsWorkers$Companion)this.receiver);
    }
}

