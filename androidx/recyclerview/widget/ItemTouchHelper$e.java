/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.m;

public class ItemTouchHelper$e
implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final RecyclerView$B e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;

    public ItemTouchHelper$e(RecyclerView$B recyclerView$B, int n3, float f5, float f6, float f7, float f8) {
        this.f = n3;
        this.e = recyclerView$B;
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
        Object object = new float[]{0.0f, 1.0f};
        object = ValueAnimator.ofFloat((float[])object);
        this.g = (ValueAnimator)object;
        m m2 = new m(this);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)m2);
        recyclerView$B = recyclerView$B.itemView;
        object.setTarget((Object)recyclerView$B);
        object.addListener((Animator.AnimatorListener)this);
        this.m = 0.0f;
    }

    public final void onAnimationCancel(Animator animator2) {
        this.m = 1.0f;
    }

    public void onAnimationEnd(Animator object) {
        boolean bl2 = this.l;
        boolean bl3 = true;
        if (!bl2) {
            object = this.e;
            ((RecyclerView$B)object).setIsRecyclable(bl3);
        }
        this.l = bl3;
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

