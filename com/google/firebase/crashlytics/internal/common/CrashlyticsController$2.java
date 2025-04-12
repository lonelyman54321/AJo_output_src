/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CLSUUID;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$2$1;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class CrashlyticsController$2
implements Callable {
    final /* synthetic */ CrashlyticsController this$0;
    final /* synthetic */ Throwable val$ex;
    final /* synthetic */ boolean val$isOnDemand;
    final /* synthetic */ SettingsProvider val$settingsProvider;
    final /* synthetic */ Thread val$thread;
    final /* synthetic */ long val$timestampMillis;

    public CrashlyticsController$2(CrashlyticsController crashlyticsController, long l2, Throwable throwable, Thread thread2, SettingsProvider settingsProvider, boolean bl2) {
        this.this$0 = crashlyticsController;
        this.val$timestampMillis = l2;
        this.val$ex = throwable;
        this.val$thread = thread2;
        this.val$settingsProvider = settingsProvider;
        this.val$isOnDemand = bl2;
    }

    public Task call() {
        long l2 = this.val$timestampMillis;
        long l3 = CrashlyticsController.access$000(l2);
        String string2 = CrashlyticsController.access$100(this.this$0);
        Task task2 = null;
        if (string2 == null) {
            Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
            return Tasks.forResult(null);
        }
        CrashlyticsController.access$200(this.this$0).create();
        Object object = CrashlyticsController.access$300(this.this$0);
        Object object2 = this.val$ex;
        Object object3 = this.val$thread;
        ((SessionReportingCoordinator)object).persistFatalEvent((Throwable)object2, (Thread)object3, string2, l3);
        object = this.this$0;
        long l4 = this.val$timestampMillis;
        CrashlyticsController.access$400((CrashlyticsController)object, l4);
        object = this.this$0;
        object2 = this.val$settingsProvider;
        ((CrashlyticsController)object).doCloseSessions((SettingsProvider)object2);
        object = this.this$0;
        object2 = new CLSUUID();
        object2 = ((CLSUUID)object2).getSessionId();
        boolean bl2 = this.val$isOnDemand;
        object3 = bl2;
        CrashlyticsController.access$500((CrashlyticsController)object, (String)object2, (Boolean)object3);
        object = CrashlyticsController.access$600(this.this$0);
        boolean bl3 = ((DataCollectionArbiter)object).isAutomaticDataCollectionEnabled();
        if (!bl3) {
            return Tasks.forResult(null);
        }
        task2 = this.val$settingsProvider.getSettingsAsync();
        object = CrashlyticsController.access$700((CrashlyticsController)this.this$0).common;
        object2 = new CrashlyticsController$2$1(this, string2);
        return task2.onSuccessTask((Executor)object, (SuccessContinuation)object2);
    }
}

