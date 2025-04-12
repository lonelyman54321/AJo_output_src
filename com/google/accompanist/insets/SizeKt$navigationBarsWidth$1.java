/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.HorizontalSide;
import com.google.accompanist.insets.InsetsSizeModifier;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import com.google.accompanist.insets.WindowInsetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class SizeKt$navigationBarsWidth$1
extends Lambda
implements gx0_2 {
    final /* synthetic */ float $additional;
    final /* synthetic */ HorizontalSide $side;

    public SizeKt$navigationBarsWidth$1(HorizontalSide horizontalSide, float f5) {
        this.$side = horizontalSide;
        this.$additional = f5;
        super(3);
    }

    public final LP1 invoke(LP1 lP1, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "$this$composed");
        b30_02.u(1753628650);
        kb2_0 kb2_02 = WindowInsetsKt.getLocalWindowInsets();
        WindowInsets$Type windowInsets$Type = ((WindowInsets)b30_02.j(kb2_02)).getNavigationBars();
        HorizontalSide horizontalSide = this.$side;
        float f5 = this.$additional;
        lP1 = new InsetsSizeModifier(windowInsets$Type, horizontalSide, f5, null, 0.0f, 24, null);
        b30_02.I();
        return lP1;
    }
}

