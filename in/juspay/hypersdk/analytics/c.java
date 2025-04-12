/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogSessioniser$LogSessioniserTimerTask;

public final class c
implements Runnable {
    public final /* synthetic */ LogSessioniser$LogSessioniserTimerTask a;

    public /* synthetic */ c(LogSessioniser$LogSessioniserTimerTask logSessioniser$LogSessioniserTimerTask) {
        this.a = logSessioniser$LogSessioniserTimerTask;
    }

    public final void run() {
        LogSessioniser$LogSessioniserTimerTask.a(this.a);
    }
}

