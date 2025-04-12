/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask;

public final class d
implements Runnable {
    public final /* synthetic */ UpdateTask a;

    public /* synthetic */ d(UpdateTask updateTask) {
        this.a = updateTask;
    }

    public final void run() {
        UpdateTask$ResourceUpdateTask.b(this.a);
    }
}

