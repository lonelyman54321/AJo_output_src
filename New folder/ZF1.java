/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class ZF1
implements Runnable {
    public final /* synthetic */ bG1 a;

    public /* synthetic */ ZF1(bG1 bG12) {
        this.a = bG12;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((q22_0)object).I;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

