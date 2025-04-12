/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.InsetsPaddingValues;
import com.google.accompanist.insets.PaddingKt$cutoutPadding$1;
import com.google.accompanist.insets.PaddingKt$imePadding$1;
import com.google.accompanist.insets.PaddingKt$navigationBarsPadding$1;
import com.google.accompanist.insets.PaddingKt$navigationBarsWithImePadding$1;
import com.google.accompanist.insets.PaddingKt$statusBarsPadding$1;
import com.google.accompanist.insets.PaddingKt$systemBarsPadding$1;
import com.google.accompanist.insets.PaddingKt$systemBarsPadding$2;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PaddingKt {
    public static final LP1 cutoutPadding(LP1 lP1, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$cutoutPadding$1 paddingKt$cutoutPadding$1 = new PaddingKt$cutoutPadding$1(bl2, bl3, bl4, bl5);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$cutoutPadding$1);
    }

    public static /* synthetic */ LP1 cutoutPadding$default(LP1 lP1, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = true;
        }
        if ((n4 = n3 & 4) != 0) {
            bl4 = true;
        }
        if ((n3 &= 8) != 0) {
            bl5 = true;
        }
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$cutoutPadding$1 paddingKt$cutoutPadding$1 = new PaddingKt$cutoutPadding$1(bl2, bl3, bl4, bl5);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$cutoutPadding$1);
    }

    public static final LP1 imePadding(LP1 lP1) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$imePadding$1 paddingKt$imePadding$1 = PaddingKt$imePadding$1.INSTANCE;
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$imePadding$1);
    }

    public static final LP1 navigationBarsPadding(LP1 lP1, boolean bl2, boolean bl3, boolean bl4) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$navigationBarsPadding$1 paddingKt$navigationBarsPadding$1 = new PaddingKt$navigationBarsPadding$1(bl3, bl4, bl2);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$navigationBarsPadding$1);
    }

    public static /* synthetic */ LP1 navigationBarsPadding$default(LP1 lP1, boolean bl2, boolean bl3, boolean bl4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = true;
        }
        if ((n3 &= 4) != 0) {
            bl4 = true;
        }
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$navigationBarsPadding$1 paddingKt$navigationBarsPadding$1 = new PaddingKt$navigationBarsPadding$1(bl3, bl4, bl2);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$navigationBarsPadding$1);
    }

    public static final LP1 navigationBarsWithImePadding(LP1 lP1) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$navigationBarsWithImePadding$1 paddingKt$navigationBarsWithImePadding$1 = PaddingKt$navigationBarsWithImePadding$1.INSTANCE;
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$navigationBarsWithImePadding$1);
    }

    public static final mk2_0 rememberInsetsPaddingValues-s2pLCVw(Insets insets, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f5, float f6, float f7, float f8, b30_0 b30_02, int n3, int n4) {
        b30$a$a b30$a$a;
        Object object = "insets";
        Intrinsics.checkNotNullParameter(insets, (String)object);
        b30_02.u(-1165102418);
        n3 = n4 & 2;
        int n7 = 1;
        if (n3 != 0) {
            bl2 = true;
        }
        if ((n3 = n4 & 4) != 0) {
            bl3 = true;
        }
        if ((n3 = n4 & 8) != 0) {
            bl4 = true;
        }
        if ((n3 = n4 & 0x10) != 0) {
            bl5 = true;
        }
        n3 = n4 & 0x20;
        n7 = 0;
        Object object2 = null;
        if (n3 != 0) {
            f5 = 0.0f;
        }
        if ((n3 = n4 & 0x40) != 0) {
            f6 = 0.0f;
        }
        if ((n3 = n4 & 0x80) != 0) {
            f7 = 0.0f;
        }
        if ((n3 = n4 & 0x100) != 0) {
            f8 = 0.0f;
        }
        object = O30.f;
        object = (Vo0)b30_02.j((H30)object);
        b30_02.u(511388516);
        n4 = (int)(b30_02.J(object) ? 1 : 0);
        n7 = b30_02.J(insets);
        object2 = b30_02.v();
        if ((n4 |= n7) != 0 || object2 == (b30$a$a = b30$a.a)) {
            object2 = new InsetsPaddingValues(insets, (Vo0)object);
            b30_02.o(object2);
        }
        b30_02.I();
        object2 = (InsetsPaddingValues)object2;
        ((InsetsPaddingValues)object2).setApplyStart(bl2);
        ((InsetsPaddingValues)object2).setApplyTop(bl3);
        ((InsetsPaddingValues)object2).setApplyEnd(bl4);
        ((InsetsPaddingValues)object2).setApplyBottom(bl5);
        ((InsetsPaddingValues)object2).setAdditionalStart-0680j_4(f5);
        ((InsetsPaddingValues)object2).setAdditionalTop-0680j_4(f6);
        ((InsetsPaddingValues)object2).setAdditionalEnd-0680j_4(f7);
        ((InsetsPaddingValues)object2).setAdditionalBottom-0680j_4(f8);
        b30_02.I();
        return object2;
    }

    public static final LP1 statusBarsPadding(LP1 lP1) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$statusBarsPadding$1 paddingKt$statusBarsPadding$1 = PaddingKt$statusBarsPadding$1.INSTANCE;
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$statusBarsPadding$1);
    }

    public static final LP1 systemBarsPadding(LP1 lP1, boolean bl2) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$systemBarsPadding$1 paddingKt$systemBarsPadding$1 = new PaddingKt$systemBarsPadding$1(bl2);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$systemBarsPadding$1);
    }

    public static final LP1 systemBarsPadding(LP1 lP1, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$systemBarsPadding$2 paddingKt$systemBarsPadding$2 = new PaddingKt$systemBarsPadding$2(bl2, bl3, bl4, bl5);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$systemBarsPadding$2);
    }

    public static /* synthetic */ LP1 systemBarsPadding$default(LP1 lP1, boolean bl2, int n3, Object object) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = true;
        }
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$systemBarsPadding$1 paddingKt$systemBarsPadding$1 = new PaddingKt$systemBarsPadding$1(bl2);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$systemBarsPadding$1);
    }

    public static /* synthetic */ LP1 systemBarsPadding$default(LP1 lP1, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = true;
        }
        if ((n4 = n3 & 4) != 0) {
            bl4 = true;
        }
        if ((n3 &= 8) != 0) {
            bl5 = true;
        }
        Intrinsics.checkNotNullParameter(lP1, "<this>");
        PaddingKt$systemBarsPadding$2 paddingKt$systemBarsPadding$2 = new PaddingKt$systemBarsPadding$2(bl2, bl3, bl4, bl5);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, paddingKt$systemBarsPadding$2);
    }

    /*
     * WARNING - void declaration
     */
    public static final mk2_0 toPaddingValues-nbWgWpA(WindowInsets$Type windowInsets$Type, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f5, float f6, b30_0 b30_02, int n3, int n4) {
        void var16_33;
        void var15_29;
        void var14_25;
        void var11_14;
        Object object = "$this$toPaddingValues";
        Intrinsics.checkNotNullParameter(windowInsets$Type, (String)object);
        b30_02.u(-896109144);
        int bl6 = n4 & 1;
        boolean bl7 = true;
        float f7 = Float.MIN_VALUE;
        if (bl6 != 0) {
            boolean bl8 = true;
        } else {
            boolean bl9 = bl2;
        }
        int n7 = n4 & 2;
        if (n7 != 0) {
            boolean bl10 = true;
        } else {
            boolean bl11 = bl3;
        }
        int n8 = n4 & 4;
        if (n8 != 0) {
            boolean bl12 = true;
        } else {
            boolean bl13 = bl4;
        }
        int n10 = n4 & 8;
        if (n10 != 0) {
            boolean bl14 = true;
        } else {
            boolean bl15 = bl5;
        }
        int n14 = n4 & 0x10;
        int n15 = 0;
        float f8 = n14 != 0 ? (f7 = 0.0f) : f5;
        int n16 = n4 & 0x20;
        float f11 = n16 != 0 ? (f7 = 0.0f) : f6;
        int n17 = n3 & 0x3FFFFE;
        n15 = n3 << 6;
        int n18 = 0x1C00000 & n15;
        int n19 = n17 | n18;
        int n20 = n19 | (n15 &= 0xE000000);
        void var12_20 = var11_14;
        object = PaddingKt.rememberInsetsPaddingValues-s2pLCVw(windowInsets$Type, (boolean)var11_14, (boolean)var14_25, (boolean)var15_29, (boolean)var16_33, f8, f11, f8, f11, b30_02, n20, 0);
        b30_02.I();
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static final mk2_0 toPaddingValues-s2pLCVw(WindowInsets$Type windowInsets$Type, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f5, float f6, float f7, float f8, b30_0 b30_02, int n3, int n4) {
        void var19_35;
        void var18_31;
        void var17_27;
        void var14_17;
        int n7 = n4;
        String string2 = "$this$toPaddingValues";
        Intrinsics.checkNotNullParameter(windowInsets$Type, string2);
        b30_02.u(1016920616);
        int bl6 = n4 & 1;
        boolean bl7 = true;
        float f11 = Float.MIN_VALUE;
        if (bl6 != 0) {
            boolean bl8 = true;
        } else {
            boolean bl9 = bl2;
        }
        int n8 = n7 & 2;
        if (n8 != 0) {
            boolean bl10 = true;
        } else {
            boolean bl11 = bl3;
        }
        int n10 = n7 & 4;
        if (n10 != 0) {
            boolean bl12 = true;
        } else {
            boolean bl13 = bl4;
        }
        int n14 = n7 & 8;
        if (n14 != 0) {
            boolean bl14 = true;
        } else {
            boolean bl15 = bl5;
        }
        int n15 = n7 & 0x10;
        float f12 = 0.0f;
        float f14 = n15 != 0 ? (f11 = 0.0f) : f5;
        int n16 = n7 & 0x20;
        float f15 = n16 != 0 ? (f11 = 0.0f) : f6;
        int n17 = n7 & 0x40;
        float f16 = n17 != 0 ? (f11 = 0.0f) : f7;
        float f17 = (n7 &= 0x80) != 0 ? 0.0f : f8;
        int n18 = n3 & 0xFFFFFFE;
        void var15_22 = var14_17;
        f12 = f14;
        f14 = f15;
        f15 = f16;
        f16 = f17;
        mk2_0 mk2_02 = PaddingKt.rememberInsetsPaddingValues-s2pLCVw(windowInsets$Type, (boolean)var14_17, (boolean)var17_27, (boolean)var18_31, (boolean)var19_35, f12, f14, f15, f17, b30_02, n18, 0);
        b30_02.I();
        return mk2_02;
    }
}

