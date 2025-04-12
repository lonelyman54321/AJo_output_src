/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.UpdateTask;
import java.util.concurrent.Callable;

public final class Mw3
implements Callable {
    public final /* synthetic */ UpdateTask a;

    public /* synthetic */ Mw3(UpdateTask updateTask) {
        this.a = updateTask;
    }

    public final Object call() {
        return UpdateTask.c(this.a);
    }
}

