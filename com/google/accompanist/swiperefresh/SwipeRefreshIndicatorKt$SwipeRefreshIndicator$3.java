/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.CircularProgressPainter;
import com.google.accompanist.swiperefresh.Slingshot;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorSizes;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3
extends Lambda
implements Function2 {
    final /* synthetic */ boolean $arrowEnabled;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ boolean $fade;
    final /* synthetic */ float $indicatorRefreshTrigger;
    final /* synthetic */ SwipeRefreshIndicatorSizes $sizes;
    final /* synthetic */ Slingshot $slingshot;
    final /* synthetic */ SwipeRefreshState $state;

    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, boolean bl2, SwipeRefreshState swipeRefreshState, long l2, boolean bl3, float f5, Slingshot slingshot) {
        this.$sizes = swipeRefreshIndicatorSizes;
        this.$arrowEnabled = bl2;
        this.$state = swipeRefreshState;
        this.$contentColor = l2;
        this.$fade = bl3;
        this.$indicatorRefreshTrigger = f5;
        this.$slingshot = slingshot;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        int n4 = 2;
        float f5 = 2.8E-45f;
        if ((n3 &= 0xB) == n4 && (n3 = (int)(b30_02.h() ? 1 : 0)) != 0) {
            b30_02.D();
        } else {
            float f6;
            n3 = 1756693181;
            b30_02.u(n3);
            Object object = b30_02.v();
            Object object2 = b30$a.a;
            if (object == object2) {
                object = new CircularProgressPainter();
                b30_02.o(object);
            }
            object = (CircularProgressPainter)object;
            b30_02.I();
            f5 = this.$sizes.getArcRadius-D9Ej5fM();
            ((CircularProgressPainter)object).setArcRadius-0680j_4(f5);
            f5 = this.$sizes.getStrokeWidth-D9Ej5fM();
            ((CircularProgressPainter)object).setStrokeWidth-0680j_4(f5);
            f5 = this.$sizes.getArrowWidth-D9Ej5fM();
            ((CircularProgressPainter)object).setArrowWidth-0680j_4(f5);
            object2 = this.$sizes;
            f5 = ((SwipeRefreshIndicatorSizes)object2).getArrowHeight-D9Ej5fM();
            ((CircularProgressPainter)object).setArrowHeight-0680j_4(f5);
            n4 = (int)(this.$arrowEnabled ? 1 : 0);
            SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = null;
            if (n4 != 0 && (n4 = (int)(((SwipeRefreshState)(object2 = this.$state)).isRefreshing() ? 1 : 0)) == 0) {
                n4 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            ((CircularProgressPainter)object).setArrowEnabled(n4 != 0);
            long l2 = this.$contentColor;
            ((CircularProgressPainter)object).setColor-8_81llA(l2);
            n4 = this.$fade;
            float f7 = 1.0f;
            if (n4 != 0) {
                object2 = this.$state;
                f5 = ((SwipeRefreshState)object2).getIndicatorOffset();
                f6 = this.$indicatorRefreshTrigger;
                f5 /= f6;
                f6 = 0.0f;
                f7 = f.f(f5, 0.0f, f7);
            }
            ((CircularProgressPainter)object).setAlpha(f7);
            f5 = this.$slingshot.getStartTrim();
            ((CircularProgressPainter)object).setStartTrim(f5);
            f5 = this.$slingshot.getEndTrim();
            ((CircularProgressPainter)object).setEndTrim(f5);
            f5 = this.$slingshot.getRotation();
            ((CircularProgressPainter)object).setRotation(f5);
            f5 = this.$slingshot.getArrowScale();
            ((CircularProgressPainter)object).setArrowScale(f5);
            Boolean bl2 = this.$state.isRefreshing();
            n4 = 6;
            f5 = 8.4E-45f;
            f6 = 0.0f;
            int n7 = 100;
            Qs3 qs3 = Hl.c(n7, 0, null, n4);
            swipeRefreshIndicatorSizes = this.$sizes;
            long l3 = this.$contentColor;
            object2 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1(swipeRefreshIndicatorSizes, l3, (CircularProgressPainter)object);
            n3 = 39176424;
            u10 u102 = v10.b(b30_02, n3, (Lambda)object2);
            int n8 = 24960;
            we0_1.b(bl2, null, qs3, null, u102, b30_02, n8);
        }
    }
}

