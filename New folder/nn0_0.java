/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

/*
 * Renamed from NN0
 */
public final class nn0_0
implements Runnable {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ nn0_0(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.a = firebaseMessaging;
        this.b = taskCompletionSource;
    }

    public final void run() {
        FirebaseMessaging firebaseMessaging = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        FirebaseMessaging.e(firebaseMessaging, taskCompletionSource);
    }
}

