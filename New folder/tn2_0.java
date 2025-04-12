/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tN2
 */
public final class tn2_0
implements Runnable {
    public final /* synthetic */ yn2_2 a;

    public /* synthetic */ tn2_0(yn2_2 yn2_22) {
        this.a = yn2_22;
    }

    public final void run() {
        yn2_2 yn2_22 = this.a;
        Intrinsics.checkNotNullParameter(yn2_22, "this$0");
        TextView textView = yn2_22.x;
        if (textView != null) {
            ai0_2.i((View)textView);
        }
    }
}

