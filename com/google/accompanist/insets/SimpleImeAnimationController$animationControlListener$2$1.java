/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsAnimationControlListener
 *  android.view.WindowInsetsAnimationController
 */
package com.google.accompanist.insets;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import com.google.accompanist.insets.SimpleImeAnimationController;
import kotlin.jvm.internal.Intrinsics;

public final class SimpleImeAnimationController$animationControlListener$2$1
implements WindowInsetsAnimationControlListener {
    final /* synthetic */ SimpleImeAnimationController this$0;

    public SimpleImeAnimationController$animationControlListener$2$1(SimpleImeAnimationController simpleImeAnimationController) {
        this.this$0 = simpleImeAnimationController;
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        SimpleImeAnimationController.access$reset(this.this$0);
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        Intrinsics.checkNotNullParameter(windowInsetsAnimationController, "controller");
        SimpleImeAnimationController.access$reset(this.this$0);
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int n3) {
        Intrinsics.checkNotNullParameter(windowInsetsAnimationController, "controller");
        SimpleImeAnimationController.access$onRequestReady(this.this$0, windowInsetsAnimationController);
    }
}

