/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConfig;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogUtils;
import java.util.TimerTask;

public class LogPusherExp$LogPushTimerTask
extends TimerTask {
    private static final String TAG = "LogPushTimerTask";
    final /* synthetic */ LogPusherExp this$0;

    public LogPusherExp$LogPushTimerTask(LogPusherExp logPusherExp) {
        this.this$0 = logPusherExp;
    }

    public static /* synthetic */ void a(LogPusherExp$LogPushTimerTask logPusherExp$LogPushTimerTask) {
        logPusherExp$LogPushTimerTask.lambda$run$0();
    }

    private /* synthetic */ void lambda$run$0() {
        Object object = LogPusherExp.access$000(this.this$0);
        boolean bl2 = ((LogConfig)object).shouldPush;
        if (bl2 && (bl2 = ((Boolean)(object = LogUtils.isMinMemoryAvailable(LogPusherExp.access$000(this.this$0)))).booleanValue())) {
            LogPusherExp.access$100(this.this$0);
            object = this.this$0;
            ((LogPusherExp)object).pushAllLogs();
        }
    }

    public void run() {
        yw1_1 yw1_12 = new yw1_1(this);
        ExecutorManager.runOnLogPusherThread(yw1_12);
    }
}

