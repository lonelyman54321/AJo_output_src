/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class WindowInsetsKt$ProvideWindowInsets$3
extends Lambda
implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $consumeWindowInsets;
    final /* synthetic */ Function2 $content;
    final /* synthetic */ boolean $windowInsetsAnimationsEnabled;

    public WindowInsetsKt$ProvideWindowInsets$3(boolean bl2, boolean bl3, Function2 function2, int n3, int n4) {
        this.$consumeWindowInsets = bl2;
        this.$windowInsetsAnimationsEnabled = bl3;
        this.$content = function2;
        this.$$changed = n3;
        this.$$default = n4;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        boolean bl2 = this.$consumeWindowInsets;
        boolean bl3 = this.$windowInsetsAnimationsEnabled;
        Function2 function2 = this.$content;
        int n4 = Me3.b(this.$$changed | 1);
        int n7 = this.$$default;
        WindowInsetsKt.ProvideWindowInsets(bl2, bl3, function2, b30_02, n4, n7);
    }
}

