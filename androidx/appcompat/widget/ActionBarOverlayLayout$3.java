/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.view.ViewPropertyAnimator
 */
package androidx.appcompat.widget;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout$a;

class ActionBarOverlayLayout$3
implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout a;

    public ActionBarOverlayLayout$3(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.i();
        ViewPropertyAnimator viewPropertyAnimator = actionBarOverlayLayout.d.animate();
        float f5 = -actionBarOverlayLayout.d.getHeight();
        viewPropertyAnimator = viewPropertyAnimator.translationY(f5);
        ActionBarOverlayLayout$a actionBarOverlayLayout$a = actionBarOverlayLayout.x;
        actionBarOverlayLayout.w = viewPropertyAnimator = viewPropertyAnimator.setListener((Animator.AnimatorListener)actionBarOverlayLayout$a);
    }
}

