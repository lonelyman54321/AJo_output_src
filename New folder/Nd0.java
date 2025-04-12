/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;

public final class Nd0
implements Continuation {
    public final /* synthetic */ Callable a;

    public /* synthetic */ Nd0(Callable callable) {
        this.a = callable;
    }

    public final Object then(Task task2) {
        return CrashlyticsWorker.g(this.a, task2);
    }
}

