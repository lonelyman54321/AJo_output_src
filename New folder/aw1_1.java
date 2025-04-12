/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
import android.view.KeyEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aW1
 */
public final class aw1_1
implements View.OnKeyListener {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ aw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final boolean onKey(View object, int n3, KeyEvent keyEvent) {
        object = "this$0";
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, (String)object);
        int n4 = keyEvent.getAction();
        if (!n4 && n3 == (n4 = 4)) {
            object = ex1_02.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                n4 = 0;
                object = null;
            }
            if (n4 = ((wx1_1)object).g((n3 = (int)(ex1_02.pb() ? 1 : 0)) != 0)) {
                object = new ew1_2(ex1_02);
                lq2_1 lq2_12 = ex1_02.g;
                lq2_12.a((Function1)object);
            } else {
                object = ex1_02.getActivity();
                if (object != null) {
                    ((ComponentActivity)object).onBackPressed();
                }
            }
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4;
    }
}

