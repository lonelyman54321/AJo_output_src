/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class WindowInsetsKt$LocalWindowInsets$1
extends Lambda
implements Function0 {
    public static final WindowInsetsKt$LocalWindowInsets$1 INSTANCE;

    static {
        WindowInsetsKt$LocalWindowInsets$1 windowInsetsKt$LocalWindowInsets$1;
        INSTANCE = windowInsetsKt$LocalWindowInsets$1 = new WindowInsetsKt$LocalWindowInsets$1();
    }

    public WindowInsetsKt$LocalWindowInsets$1() {
        super(0);
    }

    public final WindowInsets invoke() {
        return WindowInsets.Companion.getEmpty();
    }
}

