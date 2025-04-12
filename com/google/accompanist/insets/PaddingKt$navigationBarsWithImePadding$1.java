/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import androidx.compose.foundation.layout.h;
import com.google.accompanist.insets.PaddingKt;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import com.google.accompanist.insets.WindowInsetsKt;
import com.google.accompanist.insets.WindowInsetsTypeKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class PaddingKt$navigationBarsWithImePadding$1
extends Lambda
implements gx0_2 {
    public static final PaddingKt$navigationBarsWithImePadding$1 INSTANCE;

    static {
        PaddingKt$navigationBarsWithImePadding$1 paddingKt$navigationBarsWithImePadding$1;
        INSTANCE = paddingKt$navigationBarsWithImePadding$1 = new PaddingKt$navigationBarsWithImePadding$1();
    }

    public PaddingKt$navigationBarsWithImePadding$1() {
        super(3);
    }

    public final LP1 invoke(LP1 lP1, b30_0 b30_02, int n3) {
        WindowInsets$Type[] windowInsets$TypeArray;
        LP1 lP12 = lP1;
        b30_0 b30_03 = b30_02;
        Intrinsics.checkNotNullParameter(lP1, "$this$composed");
        int n4 = -849407493;
        b30_02.u(n4);
        Object object = WindowInsetsKt.getLocalWindowInsets();
        object = ((WindowInsets)b30_02.j((H30)object)).getIme();
        Object object2 = WindowInsetsKt.getLocalWindowInsets();
        object2 = ((WindowInsets)b30_02.j((H30)object2)).getNavigationBars();
        b30_02.u(511388516);
        int n7 = b30_02.J(object);
        int n8 = b30_02.J(object2);
        Object object3 = b30_02.v();
        if ((n7 |= n8) != 0 || object3 == (windowInsets$TypeArray = b30$a.a)) {
            n7 = 2;
            windowInsets$TypeArray = new WindowInsets$Type[n7];
            boolean bl2 = false;
            windowInsets$TypeArray[0] = object;
            n4 = 1;
            windowInsets$TypeArray[n4] = object2;
            object3 = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(windowInsets$TypeArray);
            b30_03.o(object3);
        }
        b30_02.I();
        object = object3;
        object = PaddingKt.rememberInsetsPaddingValues-s2pLCVw((WindowInsets$Type)object3, true, false, true, true, 0.0f, 0.0f, 0.0f, 0.0f, b30_02, 27696, 484);
        lP12 = h.d(lP1, (mk2_0)object);
        b30_02.I();
        return lP12;
    }
}

