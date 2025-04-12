/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.concurrent.Callable;

/*
 * Renamed from k40
 */
public final class k40_0
implements Callable {
    public final /* synthetic */ ConfigCacheClient a;
    public final /* synthetic */ ConfigContainer b;

    public /* synthetic */ k40_0(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        this.a = configCacheClient;
        this.b = configContainer;
    }

    public final Object call() {
        ConfigCacheClient configCacheClient = this.a;
        ConfigContainer configContainer = this.b;
        return ConfigCacheClient.b(configCacheClient, configContainer);
    }
}

