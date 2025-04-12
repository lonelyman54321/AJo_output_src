/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1$1;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ int $indicatorHeight;
    final /* synthetic */ tr1_0 $offset$delegate;
    final /* synthetic */ float $refreshingOffsetPx;
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(SwipeRefreshState swipeRefreshState, int n3, float f5, tr1_0 tr1_02, f80_0 f80_02) {
        this.$state = swipeRefreshState;
        this.$indicatorHeight = n3;
        this.$refreshingOffsetPx = f5;
        this.$offset$delegate = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SwipeRefreshState swipeRefreshState = this.$state;
        int n3 = this.$indicatorHeight;
        float f5 = this.$refreshingOffsetPx;
        tr1_0 tr1_02 = this.$offset$delegate;
        object = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(swipeRefreshState, n3, f5, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        float f5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        float f6 = SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$4(this.$offset$delegate);
        object = this.$state;
        int n7 = ((SwipeRefreshState)object).isRefreshing();
        if (n7 != 0) {
            n7 = this.$indicatorHeight;
            float f7 = n7;
            float f8 = this.$refreshingOffsetPx;
            f5 = f7 += f8;
        } else {
            n7 = 0;
            float f11 = 0.0f;
            object = null;
            f5 = 0.0f;
        }
        object = this.$offset$delegate;
        SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1$1 swipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1$1 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1$1((tr1_0)object);
        this.label = n4;
        int n8 = 12;
        object = mg3_0.c(f6, f5, null, swipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1$1, this, n8);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

