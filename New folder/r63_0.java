/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
import android.animation.Animator;

/*
 * Renamed from R63
 */
public final class r63_0
implements Animator.AnimatorListener {
    public final /* synthetic */ O63 a;

    public r63_0(O63 o63) {
        this.a = o63;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator animator2) {
        animator2 = this.a.q;
        if (animator2 != null) {
            int n3 = 8;
            animator2.setVisibility(n3);
        }
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

