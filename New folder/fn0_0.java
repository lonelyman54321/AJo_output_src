/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.transport.TransportManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fn0
 */
public final class fn0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fn0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                TransportManager.a((TransportManager)this.b);
                return;
            }
            case 0: 
        }
        ArrayList arrayList = (ArrayList)this.b;
        Intrinsics.checkNotNullParameter(arrayList, "$transitioningViews");
        CW0.c(4, arrayList);
    }
}

