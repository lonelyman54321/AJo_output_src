/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;

public final class l40
implements SuccessContinuation {
    public final /* synthetic */ ConfigCacheClient a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ConfigContainer c;

    public /* synthetic */ l40(ConfigCacheClient configCacheClient, boolean bl2, ConfigContainer configContainer) {
        this.a = configCacheClient;
        this.b = bl2;
        this.c = configContainer;
    }

    public final Task then(Object object) {
        ConfigContainer configContainer = this.c;
        object = (Void)object;
        ConfigCacheClient configCacheClient = this.a;
        boolean bl2 = this.b;
        return ConfigCacheClient.a(configCacheClient, bl2, configContainer, (Void)object);
    }
}

