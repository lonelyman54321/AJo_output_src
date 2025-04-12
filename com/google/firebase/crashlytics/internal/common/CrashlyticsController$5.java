/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.crashlytics.internal.common;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import java.util.concurrent.Callable;

class CrashlyticsController$5
implements Callable {
    final /* synthetic */ CrashlyticsController this$0;
    final /* synthetic */ long val$timestamp;

    public CrashlyticsController$5(CrashlyticsController crashlyticsController, long l2) {
        this.this$0 = crashlyticsController;
        this.val$timestamp = l2;
    }

    public Void call() {
        Bundle bundle = dk0.a(1, "fatal");
        long l2 = this.val$timestamp;
        bundle.putLong("timestamp", l2);
        CrashlyticsController.access$1000(this.this$0).logEvent("_ae", bundle);
        return null;
    }
}

