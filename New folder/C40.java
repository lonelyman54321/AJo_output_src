/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;

public final class C40
implements Continuation {
    public final /* synthetic */ ConfigRealtimeHttpClient a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;

    public /* synthetic */ C40(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task2, Task task3) {
        this.a = configRealtimeHttpClient;
        this.b = task2;
        this.c = task3;
    }

    public final Object then(Task task2) {
        Task task3 = this.b;
        Task task4 = this.c;
        return ConfigRealtimeHttpClient.b(this.a, task3, task4, task2);
    }
}

