/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class SwipeRefreshLayout$b
implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout a;

    public SwipeRefreshLayout$b(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation object) {
        object = this.a;
        boolean bl2 = object.r;
        if (!bl2) {
            Object object2;
            object.C = object2 = new ah3_1((SwipeRefreshLayout)object);
            long l2 = 150L;
            object2.setDuration(l2);
            object2 = object.t;
            ((KU)((Object)object2)).a = null;
            object2.clearAnimation();
            object2 = object.t;
            object = object.C;
            object2.startAnimation(object);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

