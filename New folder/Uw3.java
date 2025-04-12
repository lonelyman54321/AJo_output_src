/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

public final class Uw3
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ Iterable b;
    public final /* synthetic */ TransportContext c;
    public final /* synthetic */ long d;

    public /* synthetic */ Uw3(Uploader uploader, Iterable iterable, TransportContext transportContext, long l2) {
        this.a = uploader;
        this.b = iterable;
        this.c = transportContext;
        this.d = l2;
    }

    public final Object execute() {
        TransportContext transportContext = this.c;
        long l2 = this.d;
        Uploader uploader = this.a;
        Iterable iterable = this.b;
        return Uploader.b(uploader, iterable, transportContext, l2);
    }
}

