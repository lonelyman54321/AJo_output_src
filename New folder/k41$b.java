/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.view.ViewGroup$LayoutParams
 */
import android.animation.Animator;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

public final class k41$b
implements Animator.AnimatorListener {
    public final /* synthetic */ k41_0 a;

    public k41$b(k41_0 k41_02) {
        this.a = k41_02;
    }

    public final void onAnimationCancel(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationEnd(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationRepeat(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationStart(Animator object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        int n3 = object.e.getHeight();
        ViewGroup.LayoutParams layoutParams = object.e.getLayoutParams();
        layoutParams.height = n3;
        object.e.setLayoutParams(layoutParams);
    }
}

