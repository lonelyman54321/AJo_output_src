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
 * Renamed from aM
 */
public final class am_1
implements Runnable {
    public final /* synthetic */ lm_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ am_1(lm_2 lm_22, String string2) {
        this.a = lm_22;
        this.b = string2;
    }

    public final void run() {
        lm_2 lm_22 = this.a;
        Intrinsics.checkNotNullParameter(lm_22, "this$0");
        TextView textView = lm_22.j;
        if (textView != null) {
            String string2 = this.b;
            textView.setContentDescription((CharSequence)string2);
        }
        if ((lm_22 = lm_22.j) != null) {
            ai0_2.a((View)lm_22);
        }
    }
}

