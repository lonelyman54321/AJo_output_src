/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity$b$a;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ExchangeReturnTabActivity$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ExchangeReturnTabActivity b;

    public ExchangeReturnTabActivity$b(ExchangeReturnTabActivity exchangeReturnTabActivity, f80_0 f80_02) {
        this.b = exchangeReturnTabActivity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ExchangeReturnTabActivity exchangeReturnTabActivity = this.b;
        object = new ExchangeReturnTabActivity$b(exchangeReturnTabActivity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ExchangeReturnTabActivity$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ExchangeReturnTabActivity$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = ExchangeReturnTabActivity.Companion;
            object = this.b;
            kb3_2 kb3_22 = ((ExchangeReturnTabActivity)object).y2().g;
            ExchangeReturnTabActivity$b$a exchangeReturnTabActivity$b$a = new ExchangeReturnTabActivity$b$a((ExchangeReturnTabActivity)object);
            this.a = n4;
            object = kb3_22.collect(exchangeReturnTabActivity$b$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

