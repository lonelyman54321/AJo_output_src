/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.SimpleImeAnimationController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class SimpleImeAnimationController$animateImeToVisibility$1
extends Lambda
implements Function1 {
    final /* synthetic */ SimpleImeAnimationController this$0;

    public SimpleImeAnimationController$animateImeToVisibility$1(SimpleImeAnimationController simpleImeAnimationController) {
        this.this$0 = simpleImeAnimationController;
        super(1);
    }

    public final void invoke(float f5) {
        SimpleImeAnimationController simpleImeAnimationController = this.this$0;
        int n3 = ok1_1.b(f5);
        simpleImeAnimationController.insetTo(n3);
    }
}

