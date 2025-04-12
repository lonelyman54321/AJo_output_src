/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;
import java.util.Map;

public final class x40
implements Continuation {
    public final /* synthetic */ ConfigFetchHandler a;
    public final /* synthetic */ Map b;

    public /* synthetic */ x40(ConfigFetchHandler configFetchHandler, HashMap hashMap) {
        this.a = configFetchHandler;
        this.b = hashMap;
    }

    public final Object then(Task task2) {
        HashMap hashMap = (HashMap)this.b;
        return ConfigFetchHandler.d(this.a, hashMap, task2);
    }
}

