/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogPusher$LogPushTimerTask;

public final class a
implements Runnable {
    public final /* synthetic */ LogPusher$LogPushTimerTask a;

    public /* synthetic */ a(LogPusher$LogPushTimerTask logPusher$LogPushTimerTask) {
        this.a = logPusher$LogPushTimerTask;
    }

    public final void run() {
        LogPusher$LogPushTimerTask.a(this.a);
    }
}

