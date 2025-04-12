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

public final class SwipeRefreshLayout$a
implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout a;

    public SwipeRefreshLayout$a(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation object) {
        object = this.a;
        int n3 = ((SwipeRefreshLayout)object).c;
        if (n3 != 0) {
            Object object2 = ((SwipeRefreshLayout)object).A;
            int n4 = 255;
            ((QU)((Object)object2)).setAlpha(n4);
            object2 = ((SwipeRefreshLayout)object).A;
            ((QU)((Object)object2)).start();
            n3 = ((SwipeRefreshLayout)object).G;
            if (n3 != 0 && (object2 = ((SwipeRefreshLayout)object).b) != null) {
                object2.a();
            }
            object2 = ((SwipeRefreshLayout)object).t;
            ((SwipeRefreshLayout)object).m = n3 = object2.getTop();
        } else {
            ((SwipeRefreshLayout)object).f();
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

