/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

/*
 * Renamed from Tw3
 */
public final class tw3_0
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ TransportContext b;

    public /* synthetic */ tw3_0(Uploader uploader, TransportContext transportContext) {
        this.a = uploader;
        this.b = transportContext;
    }

    public final Object execute() {
        Uploader uploader = this.a;
        TransportContext transportContext = this.b;
        return Uploader.a(uploader, transportContext);
    }
}

