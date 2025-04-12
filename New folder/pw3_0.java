/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

/*
 * Renamed from Pw3
 */
public final class pw3_0
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ TransportContext b;
    public final /* synthetic */ long c;

    public /* synthetic */ pw3_0(Uploader uploader, TransportContext transportContext, long l2) {
        this.a = uploader;
        this.b = transportContext;
        this.c = l2;
    }

    public final Object execute() {
        TransportContext transportContext = this.b;
        long l2 = this.c;
        return Uploader.g(this.a, transportContext, l2);
    }
}

