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
import kotlin.jvm.internal.Intrinsics;

public final class cD0
implements View.OnTouchListener {
    public final /* synthetic */ gD0$a a;

    public /* synthetic */ cD0(gD0$a gD0$a) {
        this.a = gD0$a;
    }

    public final boolean onTouch(View object, MotionEvent object2) {
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$this_apply");
        object = object2.h;
        if (object != null) {
            boolean bl2 = true;
            object.setCursorVisible(bl2);
        }
        return false;
    }
}

