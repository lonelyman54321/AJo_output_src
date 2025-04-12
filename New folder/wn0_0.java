/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/*
 * Renamed from WN0
 */
public final class wn0_0
implements Continuation {
    public final /* synthetic */ FirebaseRemoteConfig a;

    public /* synthetic */ wn0_0(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.a = firebaseRemoteConfig;
    }

    public final Object then(Task task2) {
        return FirebaseRemoteConfig.b(this.a, task2);
    }
}

