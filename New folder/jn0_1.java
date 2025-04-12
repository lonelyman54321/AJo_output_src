/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

/*
 * Renamed from JN0
 */
public final class jn0_1
implements Runnable {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ jn0_1(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.a = firebaseMessaging;
        this.b = taskCompletionSource;
    }

    public final void run() {
        FirebaseMessaging firebaseMessaging = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        FirebaseMessaging.o(firebaseMessaging, taskCompletionSource);
    }
}

