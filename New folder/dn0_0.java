/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b$g;
import androidx.fragment.app.n$c;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dn0
 */
public final class dn0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dn0_0(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                TraceMetric traceMetric = (TraceMetric)this.c;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState)this.d;
                TransportManager.c((TransportManager)this.b, traceMetric, applicationProcessState);
                return;
            }
            case 0: 
        }
        Object object = (b$g)this.d;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Fragment fragment = ((n$c)this.b).c;
        Fragment fragment2 = ((n$c)this.c).c;
        boolean bl2 = ((b$g)object).o;
        object = ((b$g)object).n;
        CW0.a(fragment, fragment2, bl2, (Jp)object);
    }
}

