/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import androidx.compose.foundation.layout.h;
import com.google.accompanist.insets.PaddingKt;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class PaddingKt$imePadding$1
extends Lambda
implements gx0_2 {
    public static final PaddingKt$imePadding$1 INSTANCE;

    static {
        PaddingKt$imePadding$1 paddingKt$imePadding$1;
        INSTANCE = paddingKt$imePadding$1 = new PaddingKt$imePadding$1();
    }

    public PaddingKt$imePadding$1() {
        super(3);
    }

    public final LP1 invoke(LP1 lP1, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "$this$composed");
        b30_02.u(-782669375);
        Object object = WindowInsetsKt.getLocalWindowInsets();
        object = PaddingKt.rememberInsetsPaddingValues-s2pLCVw(((WindowInsets)b30_02.j((H30)object)).getIme(), true, false, true, true, 0.0f, 0.0f, 0.0f, 0.0f, b30_02, 27696, 484);
        lP1 = h.d(lP1, (mk2_0)object);
        b30_02.I();
        return lP1;
    }
}

