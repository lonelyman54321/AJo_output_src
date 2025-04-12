/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1
extends Lambda
implements Function1 {
    final /* synthetic */ int $indicatorHeight;
    final /* synthetic */ float $indicatorRefreshTrigger;
    final /* synthetic */ tr1_0 $offset$delegate;
    final /* synthetic */ boolean $scale;
    final /* synthetic */ SwipeRefreshState $state;

    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1(int n3, boolean bl2, SwipeRefreshState swipeRefreshState, float f5, tr1_0 tr1_02) {
        this.$indicatorHeight = n3;
        this.$scale = bl2;
        this.$state = swipeRefreshState;
        this.$indicatorRefreshTrigger = f5;
        this.$offset$delegate = tr1_02;
        super(1);
    }

    public final void invoke(a11_0 a11_02) {
        Intrinsics.checkNotNullParameter(a11_02, "$this$graphicsLayer");
        Object object = this.$offset$delegate;
        float f5 = SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$4((tr1_0)object);
        float f6 = this.$indicatorHeight;
        a11_02.c(f5 -= f6);
        boolean bl2 = this.$scale;
        f6 = 1.0f;
        if (bl2 && !(bl2 = ((SwipeRefreshState)(object = this.$state)).isRefreshing())) {
            object = this.$offset$delegate;
            f5 = SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$4((tr1_0)object);
            float f7 = f.a(this.$indicatorRefreshTrigger, f6);
            f5 /= f7;
            f5 = ex0_0.b.a(f5);
            f7 = 0.0f;
            f6 = f.f(f5, 0.0f, f6);
        }
        a11_02.d(f6);
        a11_02.k(f6);
    }
}

