/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.ReleaseConfig$Split;
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import java.util.concurrent.Callable;

/*
 * Renamed from Iw3
 */
public final class iw3_0
implements Callable {
    public final /* synthetic */ UpdateTask a;
    public final /* synthetic */ FileProviderService.TempWriter b;
    public final /* synthetic */ ReleaseConfig.Split c;

    public /* synthetic */ iw3_0(UpdateTask updateTask, FileProviderService.TempWriter tempWriter, ReleaseConfig.Split split) {
        this.a = updateTask;
        this.b = tempWriter;
        this.c = split;
    }

    public final Object call() {
        FileProviderService.TempWriter tempWriter = this.b;
        ReleaseConfig.Split split = this.c;
        return UpdateTask.a(this.a, tempWriter, split);
    }
}

