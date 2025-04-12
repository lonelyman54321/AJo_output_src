/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.UpdateTask;
import java.util.concurrent.Callable;

/*
 * Renamed from Jw3
 */
public final class jw3_0
implements Callable {
    public final /* synthetic */ UpdateTask a;
    public final /* synthetic */ ReleaseConfig b;

    public /* synthetic */ jw3_0(UpdateTask updateTask, ReleaseConfig releaseConfig) {
        this.a = updateTask;
        this.b = releaseConfig;
    }

    public final Object call() {
        UpdateTask updateTask = this.a;
        ReleaseConfig releaseConfig = this.b;
        return UpdateTask.d(updateTask, releaseConfig);
    }
}

