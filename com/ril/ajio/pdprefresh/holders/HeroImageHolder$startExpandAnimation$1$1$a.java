/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.widget.LinearLayout
 */
package com.ril.ajio.pdprefresh.holders;

import android.animation.Animator;
import android.widget.LinearLayout;

public final class HeroImageHolder$startExpandAnimation$1$1$a
implements Animator.AnimatorListener {
    public final /* synthetic */ M41 a;

    public HeroImageHolder$startExpandAnimation$1$1$a(M41 m41) {
        this.a = m41;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        LinearLayout linearLayout = object.n;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if ((object = object.m) != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

