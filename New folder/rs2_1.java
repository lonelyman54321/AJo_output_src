/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rs2
 */
public final class rs2_1
implements Runnable {
    public final /* synthetic */ ss2_2 a;

    public /* synthetic */ rs2_1(ss2_2 ss2_22) {
        this.a = ss2_22;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ss2_2)object).h;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

