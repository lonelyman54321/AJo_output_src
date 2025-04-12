/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hypersdk.analytics.LogSessioniserExp$1;
import in.juspay.hypersdk.analytics.LogUtils;
import in.juspay.hypersdk.analytics.d;
import java.util.TimerTask;

class LogSessioniserExp$LogSessioniserTimerTask
extends TimerTask {
    final /* synthetic */ LogSessioniserExp this$0;

    private LogSessioniserExp$LogSessioniserTimerTask(LogSessioniserExp logSessioniserExp) {
        this.this$0 = logSessioniserExp;
    }

    public /* synthetic */ LogSessioniserExp$LogSessioniserTimerTask(LogSessioniserExp logSessioniserExp, LogSessioniserExp$1 logSessioniserExp$1) {
        this(logSessioniserExp);
    }

    public static /* synthetic */ void a(LogSessioniserExp logSessioniserExp) {
        LogSessioniserExp$LogSessioniserTimerTask.lambda$run$0(logSessioniserExp);
    }

    private static /* synthetic */ void lambda$run$0(LogSessioniserExp logSessioniserExp) {
        LogSessioniserExp.access$200(logSessioniserExp);
    }

    public void run() {
        Object object = LogSessioniserExp.access$100(this.this$0);
        boolean bl2 = ((LogConfig)object).shouldPush;
        if (bl2 && (bl2 = ((Boolean)(object = LogUtils.isMinMemoryAvailable(LogSessioniserExp.access$100(this.this$0)))).booleanValue())) {
            object = this.this$0;
            d d2 = new d((LogSessioniserExp)object);
            ExecutorManager.runOnLogSessioniserThread(d2);
        }
    }
}

