/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from en0
 */
public final class en0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ en0_0(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric)this.c;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState)this.d;
                TransportManager.d((TransportManager)this.b, networkRequestMetric, applicationProcessState);
                return;
            }
            case 0: 
        }
        GW0 gW0 = (GW0)this.b;
        Intrinsics.checkNotNullParameter(gW0, "$impl");
        Rect rect = (Rect)this.d;
        Intrinsics.checkNotNullParameter(rect, "$lastInEpicenterRect");
        gW0.getClass();
        gW0 = (View)this.c;
        GW0.j(rect, (View)gW0);
    }
}

