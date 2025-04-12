/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig$Resource;
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public final /* synthetic */ UpdateTask$ResourceUpdateTask a;
    public final /* synthetic */ ReleaseConfig$Resource b;
    public final /* synthetic */ UpdateTask c;

    public /* synthetic */ a(UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask, ReleaseConfig$Resource releaseConfig$Resource, UpdateTask updateTask) {
        this.a = updateTask$ResourceUpdateTask;
        this.b = releaseConfig$Resource;
        this.c = updateTask;
    }

    public final Object call() {
        ReleaseConfig$Resource releaseConfig$Resource = this.b;
        UpdateTask updateTask = this.c;
        return UpdateTask$ResourceUpdateTask.d(this.a, releaseConfig$Resource, updateTask);
    }
}

