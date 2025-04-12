/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;

public final class TR2$a
implements Animator.AnimatorListener {
    public final /* synthetic */ LottieAnimationView a;

    public TR2$a(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    public final void onAnimationCancel(Animator object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        yc1_1 yc1_12 = object.e;
        int n3 = yc1_12.k();
        if (n3 == 0) {
            n3 = 8;
            object.setVisibility(n3);
        }
    }

    public final void onAnimationEnd(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
        this.a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationStart(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }
}

