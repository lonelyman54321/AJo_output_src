/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gd3
 */
public final class gd3_1
implements Runnable {
    public final /* synthetic */ ld3_1 a;

    public /* synthetic */ gd3_1(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final void run() {
        Object object = ld3_1.Companion;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ld3_1)object).H;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

