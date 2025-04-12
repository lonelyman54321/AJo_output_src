/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

public final class Kd0
implements Continuation {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ Kd0(Runnable runnable2) {
        this.a = runnable2;
    }

    public final Object then(Task task2) {
        return CrashlyticsWorker.d(this.a, task2);
    }
}

