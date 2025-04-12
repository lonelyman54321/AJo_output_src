/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

public final class Vw3
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ Iterable b;

    public /* synthetic */ Vw3(Uploader uploader, Iterable iterable) {
        this.a = uploader;
        this.b = iterable;
    }

    public final Object execute() {
        Uploader uploader = this.a;
        Iterable iterable = this.b;
        return Uploader.e(uploader, iterable);
    }
}

