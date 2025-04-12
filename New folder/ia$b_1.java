/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.view.View
 */
import android.animation.Animator;
import android.view.View;

/*
 * Renamed from iA$b
 */
public final class ia$b_1
implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public ia$b_1(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator animator2) {
        ai0_2.i(this.a);
        this.b.setEnabled(true);
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

