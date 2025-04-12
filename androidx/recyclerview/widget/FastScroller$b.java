/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.FastScroller;

public final class FastScroller$b
extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ FastScroller b;

    public FastScroller$b(FastScroller fastScroller) {
        this.b = fastScroller;
    }

    public final void onAnimationCancel(Animator animator2) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator object) {
        boolean bl2 = this.a;
        int n3 = 0;
        if (bl2) {
            this.a = false;
            return;
        }
        object = this.b;
        Float f5 = (Float)((FastScroller)object).z.getAnimatedValue();
        float f6 = f5.floatValue();
        float f7 = f6 - 0.0f;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 == false) {
            ((FastScroller)object).A = 0;
            ((FastScroller)object).i(0);
        } else {
            ((FastScroller)object).A = n3 = 2;
            object = ((FastScroller)object).s;
            object.invalidate();
        }
    }
}

