/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.InsetsSizeModifier;
import com.google.accompanist.insets.VerticalSide;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import com.google.accompanist.insets.WindowInsetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class SizeKt$navigationBarsHeight$1
extends Lambda
implements gx0_2 {
    final /* synthetic */ float $additional;

    public SizeKt$navigationBarsHeight$1(float f5) {
        this.$additional = f5;
        super(3);
    }

    public final LP1 invoke(LP1 lP1, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "$this$composed");
        b30_02.u(-1144818660);
        kb2_0 kb2_02 = WindowInsetsKt.getLocalWindowInsets();
        WindowInsets$Type windowInsets$Type = ((WindowInsets)b30_02.j(kb2_02)).getNavigationBars();
        VerticalSide verticalSide = VerticalSide.Bottom;
        float f5 = this.$additional;
        lP1 = new InsetsSizeModifier(windowInsets$Type, null, 0.0f, verticalSide, f5, 6, null);
        b30_02.I();
        return lP1;
    }
}

