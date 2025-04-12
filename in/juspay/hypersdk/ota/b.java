/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig$Resource;
import in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import java.util.concurrent.Callable;

public final class b
implements Callable {
    public final /* synthetic */ FileProviderService$TempWriter a;
    public final /* synthetic */ ReleaseConfig$Resource b;

    public /* synthetic */ b(FileProviderService$TempWriter fileProviderService$TempWriter, ReleaseConfig$Resource releaseConfig$Resource) {
        this.a = fileProviderService$TempWriter;
        this.b = releaseConfig$Resource;
    }

    public final Object call() {
        FileProviderService$TempWriter fileProviderService$TempWriter = this.a;
        ReleaseConfig$Resource releaseConfig$Resource = this.b;
        return UpdateTask$ResourceUpdateTask.a(fileProviderService$TempWriter, releaseConfig$Resource);
    }
}

