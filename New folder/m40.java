/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.concurrent.Callable;

public final class m40
implements Callable {
    public final /* synthetic */ ConfigStorageClient a;

    public /* synthetic */ m40(ConfigStorageClient configStorageClient) {
        this.a = configStorageClient;
    }

    public final Object call() {
        return this.a.read();
    }
}

