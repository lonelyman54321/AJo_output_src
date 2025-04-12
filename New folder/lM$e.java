/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

public final class lM$e
implements Animation.AnimationListener {
    public final /* synthetic */ lm_2 a;

    public lM$e(lm_2 lm_22) {
        this.a = lm_22;
    }

    public final void onAnimationEnd(Animation object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        FragmentActivity fragmentActivity = object.t;
        if (fragmentActivity != null) {
            Intrinsics.checkNotNull(fragmentActivity);
            int n3 = fragmentActivity.isFinishing();
            if (n3 == 0 && (object = object.j) != null) {
                n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

