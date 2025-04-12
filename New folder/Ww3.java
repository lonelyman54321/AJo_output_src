/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import java.util.HashMap;
import java.util.Map;

public final class Ww3
implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ Map b;

    public /* synthetic */ Ww3(Uploader uploader, HashMap hashMap) {
        this.a = uploader;
        this.b = hashMap;
    }

    public final Object execute() {
        HashMap hashMap = (HashMap)this.b;
        return Uploader.h(this.a, hashMap);
    }
}

