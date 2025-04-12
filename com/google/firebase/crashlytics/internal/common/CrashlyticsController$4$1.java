/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$4;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.settings.Settings;

class CrashlyticsController$4$1
implements SuccessContinuation {
    final /* synthetic */ CrashlyticsController$4 this$1;

    public CrashlyticsController$4$1(CrashlyticsController$4 crashlyticsController$4) {
        this.this$1 = crashlyticsController$4;
    }

    public Task then(Settings object) {
        if (object == null) {
            Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
            return Tasks.forResult(null);
        }
        CrashlyticsController.access$800(this.this$1.this$0);
        object = CrashlyticsController.access$300(this.this$1.this$0);
        CrashlyticsWorker crashlyticsWorker = CrashlyticsController.access$700((CrashlyticsController)this.this$1.this$0).common;
        ((SessionReportingCoordinator)object).sendReports(crashlyticsWorker);
        this.this$1.this$0.unsentReportsHandled.trySetResult(null);
        return Tasks.forResult(null);
    }
}

