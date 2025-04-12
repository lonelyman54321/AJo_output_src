/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from Jd0
 */
public final class jd0_0
implements Continuation {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ CancellationTokenSource c;

    public /* synthetic */ jd0_0(TaskCompletionSource taskCompletionSource, AtomicBoolean atomicBoolean, CancellationTokenSource cancellationTokenSource) {
        this.a = taskCompletionSource;
        this.b = atomicBoolean;
        this.c = cancellationTokenSource;
    }

    public final Object then(Task task2) {
        AtomicBoolean atomicBoolean = this.b;
        CancellationTokenSource cancellationTokenSource = this.c;
        return CrashlyticsTasks.a(this.a, atomicBoolean, cancellationTokenSource, task2);
    }
}

