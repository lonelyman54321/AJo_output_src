/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.accompanist.insets;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.insets.ImeNestedScrollConnection;

public final class ImeNestedScrollConnectionKt {
    public static final oU1 rememberImeNestedScrollConnection(boolean bl2, boolean bl3, b30_0 b30_02, int n3, int n4) {
        b30_02.u(-1790778227);
        n3 = n4 & 1;
        int n7 = 1;
        if (n3 != 0) {
            bl2 = true;
        }
        if ((n3 = n4 & 2) != 0) {
            bl3 = true;
        }
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.f;
        vc3_12 = (View)b30_02.j(vc3_12);
        Object object = bl2;
        Object object2 = bl3;
        b30_02.u(1618982084);
        int n8 = b30_02.J(vc3_12);
        n4 = b30_02.J(object) | n8;
        n7 = b30_02.J(object2);
        object2 = b30_02.v();
        if ((n4 |= n7) != 0 || object2 == (object = b30$a.a)) {
            object2 = new ImeNestedScrollConnection((View)vc3_12, bl2, bl3);
            b30_02.o(object2);
        }
        b30_02.I();
        object2 = (ImeNestedScrollConnection)object2;
        b30_02.I();
        return object2;
    }
}

