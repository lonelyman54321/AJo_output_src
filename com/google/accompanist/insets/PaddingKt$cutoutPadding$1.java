/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import androidx.compose.foundation.layout.h;
import com.google.accompanist.insets.PaddingKt;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import com.google.accompanist.insets.WindowInsetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class PaddingKt$cutoutPadding$1
extends Lambda
implements gx0_2 {
    final /* synthetic */ boolean $bottom;
    final /* synthetic */ boolean $end;
    final /* synthetic */ boolean $start;
    final /* synthetic */ boolean $top;

    public PaddingKt$cutoutPadding$1(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.$start = bl2;
        this.$top = bl3;
        this.$end = bl4;
        this.$bottom = bl5;
        super(3);
    }

    public final LP1 invoke(LP1 lP1, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "$this$composed");
        b30_02.u(2141851488);
        Object object = WindowInsetsKt.getLocalWindowInsets();
        WindowInsets$Type windowInsets$Type = ((WindowInsets)b30_02.j((H30)object)).getDisplayCutout();
        boolean bl2 = this.$start;
        boolean bl3 = this.$top;
        boolean bl4 = this.$end;
        boolean bl5 = this.$bottom;
        object = PaddingKt.rememberInsetsPaddingValues-s2pLCVw(windowInsets$Type, bl2, bl3, bl4, bl5, 0.0f, 0.0f, 0.0f, 0.0f, b30_02, 0, 480);
        lP1 = h.d(lP1, (mk2_0)object);
        b30_02.I();
        return lP1;
    }
}

