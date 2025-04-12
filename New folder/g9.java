/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class g9
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ g9(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        Object object = q9_0.Companion;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((q9_0)object).R1;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

