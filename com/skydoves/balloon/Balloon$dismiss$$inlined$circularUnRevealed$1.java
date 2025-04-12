/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.view.View
 *  android.view.ViewAnimationUtils
 */
package com.skydoves.balloon;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.skydoves.balloon.Balloon$dismiss$$inlined$circularUnRevealed$1$a;
import com.skydoves.balloon.Balloon$e;
import kotlin.jvm.functions.Function0;

public final class Balloon$dismiss$$inlined$circularUnRevealed$1
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function0 c;

    public Balloon$dismiss$$inlined$circularUnRevealed$1(View view, long l2, Balloon$e balloon$e) {
        this.a = view;
        this.b = l2;
        this.c = balloon$e;
    }

    public final void run() {
        View view = this.a;
        int n3 = view.isAttachedToWindow();
        if (n3 != 0) {
            n3 = view.getLeft();
            int n4 = (view.getRight() + n3) / 2;
            n3 = view.getTop();
            int n7 = (view.getBottom() + n3) / 2;
            n3 = view.getWidth();
            int n8 = view.getHeight();
            n3 = Math.max(n3, n8);
            float f5 = n3;
            n8 = 0;
            view = ViewAnimationUtils.createCircularReveal((View)view, (int)n4, (int)n7, (float)f5, (float)0.0f);
            long l2 = this.b;
            view.setDuration(l2);
            view.start();
            Balloon$e balloon$e = (Balloon$e)this.c;
            Balloon$dismiss$$inlined$circularUnRevealed$1$a balloon$dismiss$$inlined$circularUnRevealed$1$a = new Balloon$dismiss$$inlined$circularUnRevealed$1$a(balloon$e);
            view.addListener((Animator.AnimatorListener)balloon$dismiss$$inlined$circularUnRevealed$1$a);
        }
    }
}

