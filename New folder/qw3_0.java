/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

/*
 * Renamed from Qw3
 */
public final class qw3_0
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ TransportContext b;
    public final /* synthetic */ int c;

    public /* synthetic */ qw3_0(Uploader uploader, TransportContext transportContext, int n3) {
        this.a = uploader;
        this.b = transportContext;
        this.c = n3;
    }

    public final Object execute() {
        TransportContext transportContext = this.b;
        int n3 = this.c;
        return Uploader.f(this.a, transportContext, n3);
    }
}

