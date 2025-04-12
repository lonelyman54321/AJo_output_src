/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xa2
 */
public final class xa2_0
implements Animation.AnimationListener {
    public final /* synthetic */ View a;

    public xa2_0(View view) {
        this.a = view;
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

