/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.widget.TextView
 */
import android.view.animation.Animation;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gv3
 */
public final class gv3_0
implements Animation.AnimationListener {
    public final /* synthetic */ TextView a;

    public gv3_0(TextView textView) {
        this.a = textView;
    }

    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

