/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;

public final class D40
implements Continuation {
    public final /* synthetic */ ConfigRealtimeHttpClient a;
    public final /* synthetic */ Task b;

    public /* synthetic */ D40(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task2) {
        this.a = configRealtimeHttpClient;
        this.b = task2;
    }

    public final Object then(Task task2) {
        ConfigRealtimeHttpClient configRealtimeHttpClient = this.a;
        Task task3 = this.b;
        return ConfigRealtimeHttpClient.a(configRealtimeHttpClient, task3, task2);
    }
}

