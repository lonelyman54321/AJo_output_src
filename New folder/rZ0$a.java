/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class rZ0$a
implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ rz0_0 a;

    public rZ0$a(rz0_0 rz0_02) {
        this.a = rz0_02;
    }

    public final boolean onPreDraw() {
        View view;
        rz0_0 rz0_02 = this.a;
        rz0_02.postInvalidateOnAnimation();
        ViewGroup viewGroup = rz0_02.a;
        if (viewGroup != null && (view = rz0_02.b) != null) {
            viewGroup.endViewTransition(view);
            rz0_02.a.postInvalidateOnAnimation();
            viewGroup = null;
            rz0_02.a = null;
            rz0_02.b = null;
        }
        return true;
    }
}

