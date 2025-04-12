/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView;

public final class ScrollingTabContainerView$c
extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ ScrollingTabContainerView b;

    public ScrollingTabContainerView$c(ScrollingTabContainerView scrollingTabContainerView) {
        this.b = scrollingTabContainerView;
    }

    public final void onAnimationCancel(Animator animator2) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator object) {
        boolean bl2 = this.a;
        if (bl2) {
            return;
        }
        object = this.b;
        object.getClass();
        object.setVisibility(0);
    }

    public final void onAnimationStart(Animator animator2) {
        this.b.setVisibility(0);
        this.a = false;
    }
}

