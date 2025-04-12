/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

public final class k41$a
implements Animator.AnimatorListener {
    public final /* synthetic */ k41_0 a;

    public k41$a(k41_0 k41_02) {
        this.a = k41_02;
    }

    public final void onAnimationCancel(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationEnd(Animator object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        ((k41_0)object).w();
        ((k41_0)object).e.e.b.removeListener(this);
    }

    public final void onAnimationRepeat(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationStart(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }
}

