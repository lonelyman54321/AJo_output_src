/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class WindowInsetsKt$ProvideWindowInsets$2
extends Lambda
implements Function2 {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2 $content;

    public WindowInsetsKt$ProvideWindowInsets$2(Function2 function2, int n3) {
        this.$content = function2;
        this.$$dirty = n3;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        int n4 = 2;
        if ((n3 &= 0xB) == n4 && (n3 = (int)(b30_02.h() ? 1 : 0)) != 0) {
            b30_02.D();
        } else {
            Function2 function2 = this.$content;
            n4 = this.$$dirty >> 6 & 0xE;
            Integer n7 = n4;
            function2.invoke(b30_02, n7);
        }
    }
}

