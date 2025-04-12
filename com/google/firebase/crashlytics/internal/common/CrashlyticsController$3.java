/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;

class CrashlyticsController$3
implements SuccessContinuation {
    final /* synthetic */ CrashlyticsController this$0;

    public CrashlyticsController$3(CrashlyticsController crashlyticsController) {
        this.this$0 = crashlyticsController;
    }

    public Task then(Void void_) {
        return Tasks.forResult(Boolean.TRUE);
    }
}

