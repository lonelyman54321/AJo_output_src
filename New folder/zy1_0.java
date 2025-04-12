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

/*
 * Renamed from Zy1
 */
public final class zy1_0
implements View.OnTouchListener {
    public final /* synthetic */ fz1_2 a;

    public /* synthetic */ zy1_0(fz1_2 fz1_22) {
        this.a = fz1_22;
    }

    public final boolean onTouch(View object, MotionEvent object2) {
        object = fz1_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((Fragment)object2).getView();
        if (object != null) {
            ai0_2.j(object);
        }
        return true;
    }
}

