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

public final class YX1
implements View.OnKeyListener {
    public final /* synthetic */ oy1_1 a;

    public /* synthetic */ YX1(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean onKey(View object, int n3, KeyEvent keyEvent) {
        void var5_10;
        int n4;
        object = "this$0";
        oy1_1 oy1_12 = this.a;
        Intrinsics.checkNotNullParameter(oy1_12, (String)object);
        int n42 = keyEvent.getAction();
        if (n42 == 0 && n3 == (n4 = 4)) {
            object = oy1_12.Qa();
            boolean bl2 = ((ky1_0)object).n();
            if (bl2) {
                n3 = 0;
                object = new fy1_2(oy1_12, 0);
                lq2_1 lq2_12 = oy1_12.a;
                lq2_12.a((Function1)object);
            } else {
                object = oy1_12.getActivity();
                if (object != null) {
                    ((ComponentActivity)object).onBackPressed();
                }
            }
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        return (boolean)var5_10;
    }
}

