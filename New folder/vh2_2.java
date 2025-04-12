/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;

/*
 * Renamed from vh2
 */
public final class vh2_2
implements o60_0,
SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Object a;

    public /* synthetic */ vh2_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        object = (Throwable)object;
        object = ((wh2_2)this.a).b;
        if (object != null) {
            object.Q4(false);
        }
    }

    public Object execute() {
        return ((EventStore)this.a).cleanUp();
    }
}

