/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 */
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/*
 * Renamed from zD3
 */
public final class zd3_1 {
    public final WeakReference a;

    public zd3_1(View view) {
        WeakReference<View> weakReference;
        this.a = weakReference = new WeakReference<View>(view);
    }

    public final void a(float f5) {
        View view = (View)this.a.get();
        if (view != null) {
            view = view.animate();
            view.alpha(f5);
        }
    }

    public final void b() {
        View view = (View)this.a.get();
        if (view != null) {
            view = view.animate();
            view.cancel();
        }
    }

    public final void c(long l2) {
        View view = (View)this.a.get();
        if (view != null) {
            view = view.animate();
            view.setDuration(l2);
        }
    }

    public final void d(BD3 bD3) {
        View view = (View)this.a.get();
        if (view != null) {
            if (bD3 != null) {
                ViewPropertyAnimator viewPropertyAnimator = view.animate();
                yd3_0 yd3_02 = new yd3_0(bD3, view);
                viewPropertyAnimator.setListener((Animator.AnimatorListener)yd3_02);
            } else {
                bD3 = view.animate();
                view = null;
                bD3.setListener(null);
            }
        }
    }

    public final void e(float f5) {
        View view = (View)this.a.get();
        if (view != null) {
            view = view.animate();
            view.translationY(f5);
        }
    }
}

