/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.HorizontalSide;
import com.google.accompanist.insets.SizeKt$navigationBarsHeight$1;
import com.google.accompanist.insets.SizeKt$navigationBarsWidth$1;
import com.google.accompanist.insets.SizeKt$statusBarsHeight$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class SizeKt {
    public static final LP1 navigationBarsHeight-3ABfNKs(LP1 lP1, float f5) {
        Intrinsics.checkNotNullParameter(lP1, "$this$navigationBarsHeight");
        SizeKt$navigationBarsHeight$1 sizeKt$navigationBarsHeight$1 = new SizeKt$navigationBarsHeight$1(f5);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, sizeKt$navigationBarsHeight$1);
    }

    public static LP1 navigationBarsHeight-3ABfNKs$default(LP1 lP1, float f5, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            f5 = 0.0f;
        }
        return SizeKt.navigationBarsHeight-3ABfNKs(lP1, f5);
    }

    public static final LP1 navigationBarsWidth-wH6b6FI(LP1 lP1, HorizontalSide object, float f5) {
        Intrinsics.checkNotNullParameter(lP1, "$this$navigationBarsWidth");
        Intrinsics.checkNotNullParameter(object, "side");
        SizeKt$navigationBarsWidth$1 sizeKt$navigationBarsWidth$1 = new SizeKt$navigationBarsWidth$1((HorizontalSide)((Object)object), f5);
        object = ji1.a;
        return a30_0.a(lP1, (Function1)object, sizeKt$navigationBarsWidth$1);
    }

    public static LP1 navigationBarsWidth-wH6b6FI$default(LP1 lP1, HorizontalSide horizontalSide, float f5, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            f5 = 0.0f;
        }
        return SizeKt.navigationBarsWidth-wH6b6FI(lP1, horizontalSide, f5);
    }

    public static final LP1 statusBarsHeight-3ABfNKs(LP1 lP1, float f5) {
        Intrinsics.checkNotNullParameter(lP1, "$this$statusBarsHeight");
        SizeKt$statusBarsHeight$1 sizeKt$statusBarsHeight$1 = new SizeKt$statusBarsHeight$1(f5);
        ji1$a ji1$a = ji1.a;
        return a30_0.a(lP1, ji1$a, sizeKt$statusBarsHeight$1);
    }

    public static LP1 statusBarsHeight-3ABfNKs$default(LP1 lP1, float f5, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            f5 = 0.0f;
        }
        return SizeKt.statusBarsHeight-3ABfNKs(lP1, f5);
    }
}

