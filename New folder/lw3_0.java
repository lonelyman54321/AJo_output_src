/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.services.FileProviderService$TempWriter;
import java.util.concurrent.Callable;

/*
 * Renamed from Lw3
 */
public final class lw3_0
implements Callable {
    public final /* synthetic */ FileProviderService$TempWriter a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ lw3_0(FileProviderService$TempWriter fileProviderService$TempWriter, String string2, String string3) {
        this.a = fileProviderService$TempWriter;
        this.b = string2;
        this.c = string3;
    }

    public final Object call() {
        String string2 = this.b;
        String string3 = this.c;
        return UpdateTask.b(this.a, string2, string3);
    }
}

