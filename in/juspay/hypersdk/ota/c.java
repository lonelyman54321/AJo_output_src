/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask;
import java.util.concurrent.Callable;

public final class c
implements Callable {
    public final /* synthetic */ UpdateTask$ResourceUpdateTask a;

    public /* synthetic */ c(UpdateTask$ResourceUpdateTask updateTask$ResourceUpdateTask) {
        this.a = updateTask$ResourceUpdateTask;
    }

    public final Object call() {
        return UpdateTask$ResourceUpdateTask.c(this.a);
    }
}

