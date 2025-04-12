/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$2;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.settings.Settings;

class CrashlyticsController$2$1
implements SuccessContinuation {
    final /* synthetic */ CrashlyticsController$2 this$1;
    final /* synthetic */ String val$currentSessionId;

    public CrashlyticsController$2$1(CrashlyticsController$2 crashlyticsController$2, String string2) {
        this.this$1 = crashlyticsController$2;
        this.val$currentSessionId = string2;
    }

    public Task then(Settings object) {
        Object object2 = null;
        if (object == null) {
            Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
            return Tasks.forResult(null);
        }
        object = CrashlyticsController.access$800(this.this$1.this$0);
        Task[] taskArray = CrashlyticsController.access$300(this.this$1.this$0);
        CrashlyticsWorker crashlyticsWorker = CrashlyticsController.access$700((CrashlyticsController)this.this$1.this$0).common;
        CrashlyticsController$2 crashlyticsController$2 = this.this$1;
        boolean bl2 = crashlyticsController$2.val$isOnDemand;
        if (bl2) {
            object2 = this.val$currentSessionId;
        }
        object2 = taskArray.sendReports(crashlyticsWorker, (String)object2);
        taskArray = new Task[]{object, object2};
        return Tasks.whenAll(taskArray);
    }
}

