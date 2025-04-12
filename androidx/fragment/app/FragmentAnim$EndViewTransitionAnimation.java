/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationSet
 *  android.view.animation.Transformation
 */
package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

class FragmentAnim$EndViewTransitionAnimation
extends AnimationSet
implements Runnable {
    public final ViewGroup a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e = true;

    public FragmentAnim$EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        this.addAnimation(animation);
        viewGroup.post((Runnable)this);
    }

    public final boolean getTransformation(long l2, Transformation transformation) {
        boolean bl2;
        this.e = bl2 = true;
        boolean bl3 = this.c;
        if (bl3) {
            return this.d ^ bl2;
        }
        boolean bl4 = super.getTransformation(l2, transformation);
        if (!bl4) {
            this.c = bl2;
            ViewGroup viewGroup = this.a;
            x92.a((View)viewGroup, this);
        }
        return bl2;
    }

    public final boolean getTransformation(long l2, Transformation transformation, float f5) {
        boolean bl2;
        this.e = bl2 = true;
        boolean bl3 = this.c;
        if (bl3) {
            return this.d ^ bl2;
        }
        boolean bl4 = super.getTransformation(l2, transformation, f5);
        if (!bl4) {
            this.c = bl2;
            ViewGroup viewGroup = this.a;
            x92.a((View)viewGroup, this);
        }
        return bl2;
    }

    public final void run() {
        boolean bl2 = this.c;
        ViewGroup viewGroup = this.a;
        if (!bl2 && (bl2 = this.e)) {
            bl2 = false;
            Object var3_3 = null;
            this.e = false;
            viewGroup.post((Runnable)this);
        } else {
            View view = this.b;
            viewGroup.endViewTransition(view);
            this.d = bl2 = true;
        }
    }
}

