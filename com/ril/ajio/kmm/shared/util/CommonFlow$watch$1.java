/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

final class CommonFlow$watch$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Function1 $block;
    /* synthetic */ Object L$0;
    int label;

    public CommonFlow$watch$1(Function1 function1, f80_0 f80_02) {
        this.$block = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.$block;
        CommonFlow$watch$1 commonFlow$watch$1 = new CommonFlow$watch$1(function1, f80_02);
        commonFlow$watch$1.L$0 = object;
        return commonFlow$watch$1;
    }

    public final Object invoke(Object object, f80_0 object2) {
        object = (CommonFlow$watch$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CommonFlow$watch$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.L$0;
            this.$block.invoke(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

