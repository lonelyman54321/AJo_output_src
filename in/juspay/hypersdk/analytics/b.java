/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogPusher$LogPushTimerTask;

public final class b
implements Runnable {
    public final /* synthetic */ LogPusher$LogPushTimerTask a;

    public /* synthetic */ b(LogPusher$LogPushTimerTask logPusher$LogPushTimerTask) {
        this.a = logPusher$LogPushTimerTask;
    }

    public final void run() {
        LogPusher$LogPushTimerTask.b(this.a);
    }
}

