/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsAnimationController
 */
package com.google.accompanist.insets;

import android.view.WindowInsetsAnimationController;
import com.google.accompanist.insets.SimpleImeAnimationController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class SimpleImeAnimationController$startAndFling$1
extends Lambda
implements Function1 {
    final /* synthetic */ Function1 $onFinished;
    final /* synthetic */ float $velocityY;
    final /* synthetic */ SimpleImeAnimationController this$0;

    public SimpleImeAnimationController$startAndFling$1(SimpleImeAnimationController simpleImeAnimationController, float f5, Function1 function1) {
        this.this$0 = simpleImeAnimationController;
        this.$velocityY = f5;
        this.$onFinished = function1;
        super(1);
    }

    public final void invoke(WindowInsetsAnimationController object) {
        Intrinsics.checkNotNullParameter(object, "it");
        object = this.this$0;
        Float f5 = Float.valueOf(this.$velocityY);
        Function1 function1 = this.$onFinished;
        ((SimpleImeAnimationController)object).animateToFinish(f5, function1);
    }
}

