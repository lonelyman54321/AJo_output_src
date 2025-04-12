/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshNestedScrollConnection;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SwipeRefreshNestedScrollConnection$onScroll$1
extends qg3_2
implements Function2 {
    final /* synthetic */ float $dragConsumed;
    int label;
    final /* synthetic */ SwipeRefreshNestedScrollConnection this$0;

    public SwipeRefreshNestedScrollConnection$onScroll$1(SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection, float f5, f80_0 f80_02) {
        this.this$0 = swipeRefreshNestedScrollConnection;
        this.$dragConsumed = f5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection = this.this$0;
        float f5 = this.$dragConsumed;
        object = new SwipeRefreshNestedScrollConnection$onScroll$1(swipeRefreshNestedScrollConnection, f5, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SwipeRefreshNestedScrollConnection$onScroll$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SwipeRefreshNestedScrollConnection$onScroll$1)object).invokeSuspend(object2);
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
            object = SwipeRefreshNestedScrollConnection.access$getState$p(this.this$0);
            float f5 = this.$dragConsumed;
            this.label = n4;
            object = ((SwipeRefreshState)object).dispatchScrollDelta$swiperefresh_release(f5, this);
            if (object != j90_02) return Unit.a;
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

