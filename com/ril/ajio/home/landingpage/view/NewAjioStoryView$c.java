/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
package com.ril.ajio.home.landingpage.view;

import android.animation.Animator;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView;

public final class NewAjioStoryView$c
implements Animator.AnimatorListener {
    public final /* synthetic */ NewAjioStoryView a;

    public NewAjioStoryView$c(NewAjioStoryView newAjioStoryView) {
        this.a = newAjioStoryView;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator animator2) {
        this.a.d();
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

