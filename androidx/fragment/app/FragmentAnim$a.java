/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.view.animation.Animation
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

public final class FragmentAnim$a {
    public final Animation a;
    public final AnimatorSet b;

    public FragmentAnim$a(Animator animator2) {
        AnimatorSet animatorSet;
        this.a = null;
        this.b = animatorSet = new AnimatorSet();
        animatorSet.play(animator2);
    }

    public FragmentAnim$a(Animation animation) {
        this.a = animation;
        this.b = null;
    }
}

