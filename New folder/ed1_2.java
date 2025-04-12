/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eD1
 */
public final class ed1_2
implements Runnable {
    public final /* synthetic */ gd1_2 a;

    public /* synthetic */ ed1_2(gd1_2 gd1_22) {
        this.a = gd1_22;
    }

    public final void run() {
        gd1_2 gd1_22 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(gd1_22, string2);
        gd1_22 = gd1_22.l;
        if (gd1_22 != null) {
            ai0_2.a((View)gd1_22);
        }
    }
}

