/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.accompanist.insets;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.insets.RootWindowInsets;
import com.google.accompanist.insets.WindowInsetsKt$LocalWindowInsets$1;
import com.google.accompanist.insets.WindowInsetsKt$ProvideWindowInsets$1;
import com.google.accompanist.insets.WindowInsetsKt$ProvideWindowInsets$2;
import com.google.accompanist.insets.WindowInsetsKt$ProvideWindowInsets$3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class WindowInsetsKt {
    private static final kb2_0 LocalWindowInsets;

    static {
        WindowInsetsKt$LocalWindowInsets$1 windowInsetsKt$LocalWindowInsets$1 = WindowInsetsKt$LocalWindowInsets$1.INSTANCE;
        vc3_1 vc3_12 = new H30(windowInsetsKt$LocalWindowInsets$1);
        LocalWindowInsets = vc3_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void ProvideWindowInsets(boolean bl2, boolean bl3, Function2 function2, b30_0 b30_02, int n3, int n4) {
        int n7;
        int n8;
        Object var6_6 = null;
        int n10 = 2;
        int n14 = 4;
        Object object = "content";
        Intrinsics.checkNotNullParameter(function2, (String)object);
        b30_02 = b30_02.g(-184522253);
        int n15 = 1;
        int n16 = n4 & 1;
        if (n16 != 0) {
            n8 = n3 | 6;
        } else {
            n8 = n3 & 0xE;
            if (n8 == 0) {
                n8 = (int)(((j30_0)b30_02).a(bl2) ? 1 : 0);
                n8 = n8 != 0 ? 4 : 2;
                n8 |= n3;
            } else {
                n8 = n3;
            }
        }
        if ((n10 &= n4) != 0) {
            n8 |= 0x30;
        } else {
            n7 = n3 & 0x70;
            if (n7 == 0) {
                n7 = (int)(((j30_0)b30_02).a(bl3) ? 1 : 0);
                n7 = n7 != 0 ? 32 : 16;
                n8 |= n7;
            }
        }
        if ((n14 &= n4) != 0) {
            n8 |= 0x180;
        } else {
            n14 = n3 & 0x380;
            if (n14 == 0) {
                n14 = (int)(((j30_0)b30_02).x(function2) ? 1 : 0);
                n14 = n14 != 0 ? 256 : 128;
                n8 |= n14;
            }
        }
        n14 = n8 & 0x2DB;
        n7 = 146;
        if (n14 == n7 && (n14 = (int)(((j30_0)b30_02).h() ? 1 : 0)) != 0) {
            ((j30_0)b30_02).D();
        } else {
            if (n16 != 0) {
                bl2 = true;
            }
            if (n10 != 0) {
                bl3 = true;
            }
            Object object2 = AndroidCompositionLocals_androidKt.f;
            object2 = (View)((j30_0)b30_02).j((H30)object2);
            n14 = -492369756;
            ((j30_0)b30_02).u(n14);
            MB2[] mB2Array = ((j30_0)b30_02).v();
            Object object3 = b30$a.a;
            if (mB2Array == object3) {
                mB2Array = new RootWindowInsets();
                ((j30_0)b30_02).o(mB2Array);
            }
            ((j30_0)b30_02).T(false);
            mB2Array = (RootWindowInsets)mB2Array;
            object3 = new WindowInsetsKt$ProvideWindowInsets$1((View)object2, (RootWindowInsets)mB2Array, bl2, bl3);
            ly0_0.b(object2, (Function1)object3, b30_02);
            object2 = LocalWindowInsets.c(mB2Array);
            mB2Array = new MB2[n15];
            mB2Array[0] = object2;
            WindowInsetsKt$ProvideWindowInsets$2 windowInsetsKt$ProvideWindowInsets$2 = new WindowInsetsKt$ProvideWindowInsets$2(function2, n8);
            u10 u102 = v10.b(b30_02, -1033208141, windowInsetsKt$ProvideWindowInsets$2);
            n10 = 56;
            L30.b(mB2Array, u102, b30_02, n10);
        }
        n16 = (int)(bl2 ? 1 : 0);
        n8 = (int)(bl3 ? 1 : 0);
        CF2 cF2 = ((j30_0)b30_02).X();
        if (cF2 != null) {
            WindowInsetsKt$ProvideWindowInsets$3 windowInsetsKt$ProvideWindowInsets$3;
            object = windowInsetsKt$ProvideWindowInsets$3;
            windowInsetsKt$ProvideWindowInsets$3 = new WindowInsetsKt$ProvideWindowInsets$3(bl2, bl3, function2, n3, n4);
            cF2.d = windowInsetsKt$ProvideWindowInsets$3;
            return;
        }
    }

    public static final kb2_0 getLocalWindowInsets() {
        return LocalWindowInsets;
    }

    public static /* synthetic */ void getLocalWindowInsets$annotations() {
    }
}

