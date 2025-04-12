/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import androidx.compose.foundation.layout.j;
import com.google.accompanist.swiperefresh.CircularProgressPainter;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorSizes;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1
extends Lambda
implements gx0_2 {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ CircularProgressPainter $painter;
    final /* synthetic */ SwipeRefreshIndicatorSizes $sizes;

    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, long l2, CircularProgressPainter circularProgressPainter) {
        this.$sizes = swipeRefreshIndicatorSizes;
        this.$contentColor = l2;
        this.$painter = circularProgressPainter;
        super(3);
    }

    public final void invoke(boolean n3, b30_0 b30_02, int n4) {
        block12: {
            block11: {
                float f5;
                int n7;
                float f6;
                int n8;
                b30_0 b30_03;
                int n10;
                SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1 swipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1;
                block10: {
                    swipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1 = this;
                    n10 = n3;
                    b30_03 = b30_02;
                    int n14 = n4 & 0xE;
                    n8 = 2;
                    f6 = 2.8E-45f;
                    if (n14 == 0) {
                        n14 = (int)(b30_02.a(n3 != 0) ? 1 : 0);
                        n14 = n14 != 0 ? 4 : 2;
                        n14 = n4 | n14;
                    } else {
                        n14 = n4;
                    }
                    n7 = 18;
                    f5 = 2.5E-44f;
                    if ((n14 &= 0x5B) != n7 || (n14 = (int)(b30_02.h() ? 1 : 0)) == 0) break block10;
                    b30_02.D();
                    break block11;
                }
                Object object = LP1$a.b;
                LP1 lP1 = j.c;
                Object object2 = Nc$a.e;
                SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = swipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1.$sizes;
                long l2 = swipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1.$contentColor;
                CircularProgressPainter circularProgressPainter = swipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1.$painter;
                object2 = HA.e((Nc)object2, false);
                int n15 = b30_02.F();
                Object object3 = b30_02.m();
                lP1 = a30_0.c(b30_03, lP1);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = b30_02.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block12;
                b30_02.A();
                bl2 = b30_02.e();
                if (bl2) {
                    b30_03.C((Function0)((Object)serializable));
                } else {
                    b30_02.n();
                }
                serializable = N20$a.e;
                Ow3.a(b30_03, object2, (Function2)((Object)serializable));
                object2 = N20$a.d;
                Ow3.a(b30_03, object3, (Function2)object2);
                object2 = N20$a.f;
                int n16 = b30_02.e();
                if (n16 != 0 || (n16 = Intrinsics.areEqual(object3 = b30_02.v(), serializable = Integer.valueOf(n15))) == 0) {
                    re0_0.a(n15, b30_03, n15, (N20$a$a)object2);
                }
                object2 = N20$a.c;
                Ow3.a(b30_03, lP1, (Function2)object2);
                if (n10 != 0) {
                    n10 = -1527193583;
                    b30_03.u(n10);
                    float f7 = swipeRefreshIndicatorSizes.getArcRadius-D9Ej5fM();
                    f5 = swipeRefreshIndicatorSizes.getStrokeWidth-D9Ej5fM();
                    f7 += f5;
                    f6 = n8;
                    f5 = swipeRefreshIndicatorSizes.getStrokeWidth-D9Ej5fM();
                    LP1 lP12 = j.h((LP1)object, f7 *= f6);
                    long l3 = 0L;
                    n16 = 24;
                    boolean bl3 = false;
                    circularProgressPainter = null;
                    n15 = n16;
                    pB2.a(lP12, l2, f5, l3, 0, b30_02, 0, n16);
                    b30_02.I();
                } else {
                    n10 = -1527193245;
                    float f8 = -1.07934675E-16f;
                    b30_03.u(n10);
                    swipeRefreshIndicatorSizes = null;
                    object = "Refreshing";
                    n8 = 0;
                    f6 = 0.0f;
                    n7 = 0;
                    f5 = 0.0f;
                    lP1 = null;
                    object2 = null;
                    n16 = 124;
                    CircularProgressPainter circularProgressPainter2 = circularProgressPainter;
                    int n17 = 56;
                    n15 = n16;
                    Pd1.a(circularProgressPainter, (String)object, null, null, null, 0.0f, null, b30_02, n17, n16);
                    b30_02.I();
                }
                b30_02.p();
            }
            return;
        }
        s20.a();
        throw null;
    }
}

