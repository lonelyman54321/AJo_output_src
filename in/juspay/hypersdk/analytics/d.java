/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hypersdk.analytics.LogSessioniserExp$LogSessioniserTimerTask;

public final class d
implements Runnable {
    public final /* synthetic */ LogSessioniserExp a;

    public /* synthetic */ d(LogSessioniserExp logSessioniserExp) {
        this.a = logSessioniserExp;
    }

    public final void run() {
        LogSessioniserExp$LogSessioniserTimerTask.a(this.a);
    }
}

