/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;

/*
 * Renamed from Qd0
 */
public final class qd0_0
implements Continuation,
SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Object a;

    public /* synthetic */ qd0_0(Object object) {
        this.a = object;
    }

    public Object execute() {
        return Uploader.c((Uploader)this.a);
    }

    public Object then(Task task2) {
        return CrashlyticsWorker.e((SuccessContinuation)this.a, task2);
    }
}

