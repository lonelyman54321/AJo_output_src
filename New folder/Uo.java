/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.firebase.perf.metrics.AppStartTrace;
import kotlin.jvm.internal.Intrinsics;

public final class Uo
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Uo(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                wt_0 wt_02 = (wt_0)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(wt_02, string2);
                wt_02 = wt_02.g;
                if (wt_02 != null) {
                    ai0_2.a((View)wt_02);
                }
                return;
            }
            case 0: 
        }
        AppStartTrace.c((AppStartTrace)this.b);
    }
}

