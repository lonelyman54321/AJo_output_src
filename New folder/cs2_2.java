/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cs2
 */
public final class cs2_2
implements Runnable {
    public final /* synthetic */ ds2_2 a;

    public /* synthetic */ cs2_2(ds2_2 ds2_22) {
        this.a = ds2_22;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ds2_2)object).e;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

