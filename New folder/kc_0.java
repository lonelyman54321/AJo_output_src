/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kc
 */
public final class kc_0
implements o60_0,
SynchronizationGuard$CriticalSection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object execute() {
        return WorkInitializer.a((WorkInitializer)this.b);
    }
}

