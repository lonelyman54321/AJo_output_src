/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.ota.UpdateTask$Update$Package;
import java.util.concurrent.Callable;

/*
 * Renamed from Kw3
 */
public final class kw3_0
implements Callable {
    public final /* synthetic */ UpdateTask a;
    public final /* synthetic */ UpdateTask.Update.Package b;
    public final /* synthetic */ ReleaseConfig c;
    public final /* synthetic */ long d;

    public /* synthetic */ kw3_0(UpdateTask updateTask, UpdateTask.Update.Package package_, ReleaseConfig releaseConfig, long l2) {
        this.a = updateTask;
        this.b = package_;
        this.c = releaseConfig;
        this.d = l2;
    }

    public final Object call() {
        ReleaseConfig releaseConfig = this.c;
        long l2 = this.d;
        UpdateTask updateTask = this.a;
        UpdateTask.Update.Package package_ = this.b;
        return UpdateTask.e(updateTask, package_, releaseConfig, l2);
    }
}

