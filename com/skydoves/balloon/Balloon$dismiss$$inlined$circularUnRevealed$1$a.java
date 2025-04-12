/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.skydoves.balloon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.skydoves.balloon.Balloon$e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Balloon$dismiss$$inlined$circularUnRevealed$1$a
extends AnimatorListenerAdapter {
    public final /* synthetic */ Function0 a;

    public Balloon$dismiss$$inlined$circularUnRevealed$1$a(Balloon$e balloon$e) {
        this.a = balloon$e;
    }

    public final void onAnimationEnd(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
        super.onAnimationEnd(animator2);
        this.a.invoke();
    }
}

