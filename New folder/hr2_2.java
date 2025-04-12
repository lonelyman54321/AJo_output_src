/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hr2
 */
public final class hr2_2
implements Runnable {
    public final /* synthetic */ ir2_2 a;

    public /* synthetic */ hr2_2(ir2_2 ir2_22) {
        this.a = ir2_22;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ir2_2)object).e;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

