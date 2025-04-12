/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vd3$b
 */
public final class vd3$b_0
implements Animator.AnimatorListener {
    public final /* synthetic */ ValueAnimator a;
    public final /* synthetic */ vd3_2 b;

    public vd3$b_0(ValueAnimator valueAnimator, vd3_2 vd3_22) {
        this.a = valueAnimator;
        this.b = vd3_22;
    }

    public final void a() {
        boolean bl2;
        boolean bl3;
        this.a.removeAllUpdateListeners();
        vd3_2 vd3_22 = this.b;
        ViewPager2 viewPager2 = vd3_22.f;
        if (viewPager2 != null && (bl3 = viewPager2.e()) == (bl2 = true) && (viewPager2 = vd3_22.f) != null) {
            viewPager2.b();
        }
        vd3_22.k = 0;
    }

    public final void onAnimationCancel(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
        this.a();
    }

    public final void onAnimationEnd(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
        this.a();
    }

    public final void onAnimationRepeat(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationStart(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }
}

