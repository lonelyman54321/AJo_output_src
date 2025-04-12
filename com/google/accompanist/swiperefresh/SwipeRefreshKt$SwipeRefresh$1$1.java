/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SwipeRefreshKt$SwipeRefresh$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    public SwipeRefreshKt$SwipeRefresh$1$1(SwipeRefreshState swipeRefreshState, f80_0 f80_02) {
        this.$state = swipeRefreshState;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SwipeRefreshState swipeRefreshState = this.$state;
        object = new SwipeRefreshKt$SwipeRefresh$1$1(swipeRefreshState, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SwipeRefreshKt$SwipeRefresh$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SwipeRefreshKt$SwipeRefresh$1$1)object).invokeSuspend(object2);
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
            object = this.$state;
            boolean bl2 = ((SwipeRefreshState)object).isSwipeInProgress();
            if (bl2) return Unit.a;
            object = this.$state;
            this.label = n4;
            n3 = 0;
            if ((object = ((SwipeRefreshState)object).animateOffsetTo$swiperefresh_release(0.0f, this)) != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

