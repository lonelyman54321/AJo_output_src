/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;
import java.util.Map;

public final class u40
implements Continuation {
    public final /* synthetic */ ConfigFetchHandler a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Map c;

    public /* synthetic */ u40(ConfigFetchHandler configFetchHandler, long l2, HashMap hashMap) {
        this.a = configFetchHandler;
        this.b = l2;
        this.c = hashMap;
    }

    public final Object then(Task task2) {
        ConfigFetchHandler configFetchHandler = this.a;
        HashMap hashMap = (HashMap)this.c;
        long l2 = this.b;
        return ConfigFetchHandler.e(configFetchHandler, l2, hashMap, task2);
    }
}

