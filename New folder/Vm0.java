/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

public final class Vm0
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ DefaultScheduler a;
    public final /* synthetic */ TransportContext b;
    public final /* synthetic */ EventInternal c;

    public /* synthetic */ Vm0(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        this.a = defaultScheduler;
        this.b = transportContext;
        this.c = eventInternal;
    }

    public final Object execute() {
        TransportContext transportContext = this.b;
        EventInternal eventInternal = this.c;
        return DefaultScheduler.a(this.a, transportContext, eventInternal);
    }
}

