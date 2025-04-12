/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsAnimationController
 */
package com.google.accompanist.insets;

import android.view.WindowInsetsAnimationController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class SimpleImeAnimationController$animateImeToVisibility$2
extends Lambda
implements Function0 {
    final /* synthetic */ WindowInsetsAnimationController $controller;

    public SimpleImeAnimationController$animateImeToVisibility$2(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.$controller = windowInsetsAnimationController;
        super(0);
    }

    public final Float invoke() {
        return Float.valueOf(su0_0.a(h53.a(this.$controller)));
    }
}

