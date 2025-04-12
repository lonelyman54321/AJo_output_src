/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;

public final class Ld0
implements Continuation,
SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Object a;

    public /* synthetic */ Ld0(Object object) {
        this.a = object;
    }

    public Object execute() {
        return ((ClientHealthMetricsStore)this.a).loadClientMetrics();
    }

    public Object then(Task task2) {
        return CrashlyticsWorker.b((Callable)this.a, task2);
    }
}

