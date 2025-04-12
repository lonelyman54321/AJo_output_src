/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class Ky1
implements View.OnTouchListener {
    public final /* synthetic */ ry1_1 a;

    public /* synthetic */ Ky1(ry1_1 ry1_12) {
        this.a = ry1_12;
    }

    public final boolean onTouch(View view, MotionEvent object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        view = ((Fragment)object).getView();
        if (view != null) {
            ai0_2.j(view);
        }
        return true;
    }
}

