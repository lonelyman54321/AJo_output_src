/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$4$1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

class CrashlyticsController$4
implements SuccessContinuation {
    final /* synthetic */ CrashlyticsController this$0;
    final /* synthetic */ Task val$settingsDataTask;

    public CrashlyticsController$4(CrashlyticsController crashlyticsController, Task task2) {
        this.this$0 = crashlyticsController;
        this.val$settingsDataTask = task2;
    }

    public Task then(Boolean object) {
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            Logger.getLogger().v("Deleting cached crash reports...");
            CrashlyticsController.access$900(this.this$0.listAppExceptionMarkerFiles());
            CrashlyticsController.access$300(this.this$0).removeAllReports();
            this.this$0.unsentReportsHandled.trySetResult(null);
            return Tasks.forResult(null);
        }
        Logger.getLogger().d("Sending cached crash reports...");
        boolean bl3 = (Boolean)object;
        CrashlyticsController.access$600(this.this$0).grantDataCollectionPermission(bl3);
        object = this.val$settingsDataTask;
        CrashlyticsWorker crashlyticsWorker = CrashlyticsController.access$700((CrashlyticsController)this.this$0).common;
        CrashlyticsController$4$1 crashlyticsController$4$1 = new CrashlyticsController$4$1(this);
        return ((Task)object).onSuccessTask(crashlyticsWorker, crashlyticsController$4$1);
    }
}

