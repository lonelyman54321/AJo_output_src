/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;

/*
 * Renamed from j40
 */
public final class j40_0
implements Continuation {
    public final /* synthetic */ ConfigAutoFetch a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ j40_0(ConfigAutoFetch configAutoFetch, Task task2, Task task3, long l2, int n3) {
        this.a = configAutoFetch;
        this.b = task2;
        this.c = task3;
        this.d = l2;
        this.e = n3;
    }

    public final Object then(Task task2) {
        long l2 = this.d;
        int n3 = this.e;
        ConfigAutoFetch configAutoFetch = this.a;
        Task task3 = this.b;
        Task task4 = this.c;
        return ConfigAutoFetch.a(configAutoFetch, task3, task4, l2, n3, task2);
    }
}

