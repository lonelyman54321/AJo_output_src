/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.widget.LinearLayout
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.commonimpl.ToolbarAnimationListener;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pv
 */
public final class pv_2
implements Animation.AnimationListener {
    public final /* synthetic */ BaseActivity a;
    public final /* synthetic */ AjioCustomToolbar b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ToolbarAnimationListener d;

    public pv_2(BaseActivity baseActivity, AjioCustomToolbar ajioCustomToolbar, int n3) {
        this.a = baseActivity;
        this.b = ajioCustomToolbar;
        this.c = n3;
    }

    public final void onAnimationEnd(Animation animation) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(animation, string2);
        animation = this.a.p0;
        if (animation != null) {
            int n3 = 8;
            animation.setVisibility(n3);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation object) {
        Object object2;
        float f5;
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        LinearLayout linearLayout = object.p0;
        if (linearLayout != null) {
            f5 = 0.0f;
            object2 = null;
            linearLayout.setVisibility(0);
        }
        linearLayout = this.b.animate();
        f5 = -((float)this.c);
        linearLayout = linearLayout.translationY(f5);
        object2 = new AccelerateInterpolator(2.0f);
        linearLayout = linearLayout.setInterpolator((TimeInterpolator)object2);
        object2 = new Pv$a((BaseActivity)object);
        linearLayout.setListener((Animator.AnimatorListener)object2).start();
    }
}

