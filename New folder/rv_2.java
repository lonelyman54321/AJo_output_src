/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.DecelerateInterpolator
 *  android.widget.LinearLayout
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.commonimpl.ToolbarAnimationListener;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rv
 */
public final class rv_2
implements Animation.AnimationListener {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ AjioCustomToolbar b;
    public final /* synthetic */ BaseActivity c;
    public final /* synthetic */ ToolbarAnimationListener d;

    public rv_2(LinearLayout linearLayout, AjioCustomToolbar ajioCustomToolbar, BaseActivity baseActivity) {
        this.a = linearLayout;
        this.b = ajioCustomToolbar;
        this.c = baseActivity;
    }

    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.a.setVisibility(0);
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.a.setVisibility(0);
        animation = this.b.animate().translationY(0.0f);
        Object object = new DecelerateInterpolator(1.0f);
        animation = animation.setInterpolator((TimeInterpolator)object);
        BaseActivity baseActivity = this.c;
        object = new rv$a_0(baseActivity);
        animation.setListener((Animator.AnimatorListener)object).start();
    }
}

