/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/*
 * Renamed from TN0
 */
public final class tn0_2
implements Continuation {
    public final /* synthetic */ FirebaseRemoteConfig a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;

    public /* synthetic */ tn0_2(FirebaseRemoteConfig firebaseRemoteConfig, Task task2, Task task3) {
        this.a = firebaseRemoteConfig;
        this.b = task2;
        this.c = task3;
    }

    public final Object then(Task task2) {
        Task task3 = this.b;
        Task task4 = this.c;
        return FirebaseRemoteConfig.i(this.a, task3, task4, task2);
    }
}

