/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

final class SwipeRefreshState$animateOffsetTo$2
extends qg3_2
implements Function1 {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ SwipeRefreshState this$0;

    public SwipeRefreshState$animateOffsetTo$2(SwipeRefreshState swipeRefreshState, float f5, f80_0 f80_02) {
        this.this$0 = swipeRefreshState;
        this.$offset = f5;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        SwipeRefreshState swipeRefreshState = this.this$0;
        float f5 = this.$offset;
        SwipeRefreshState$animateOffsetTo$2 swipeRefreshState$animateOffsetTo$2 = new SwipeRefreshState$animateOffsetTo$2(swipeRefreshState, f5, f80_02);
        return swipeRefreshState$animateOffsetTo$2;
    }

    public final Object invoke(f80_0 f80_02) {
        f80_02 = (SwipeRefreshState$animateOffsetTo$2)this.create(f80_02);
        Unit unit = Unit.a;
        return ((SwipeRefreshState$animateOffsetTo$2)f80_02).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            Lj lj = SwipeRefreshState.access$get_indicatorOffset$p(this.this$0);
            float f5 = this.$offset;
            Float f6 = new Float(f5);
            this.label = n4;
            int n7 = 14;
            object = Lj.c(lj, f6, null, null, this, n7);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

