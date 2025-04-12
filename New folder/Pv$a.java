/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
import android.animation.Animator;
import com.ril.ajio.customviews.widgets.commonimpl.ToolbarAnimationListener;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

public final class Pv$a
implements Animator.AnimatorListener {
    public final /* synthetic */ BaseActivity a;
    public final /* synthetic */ ToolbarAnimationListener b;

    public Pv$a(BaseActivity baseActivity) {
        this.a = baseActivity;
        this.b = null;
    }

    public final void onAnimationCancel(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationEnd(Animator object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        this.a.w0 = false;
        object = this.b;
        if (object != null) {
            object.onAnimationEnd();
        }
    }

    public final void onAnimationRepeat(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationStart(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }
}

