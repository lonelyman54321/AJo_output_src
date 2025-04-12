/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.support;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ClearDatabaseService$b
extends qg3_2
implements Function2 {
    public int a;

    public ClearDatabaseService$b() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ClearDatabaseService$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ClearDatabaseService$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
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
        object = bf0_0.a;
        if (object != null) {
            this.a = n4;
            object = ((lb1_0)object).a.b().c(this);
            if (object != j90_02) {
                object = Unit.a;
            }
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        String string2 = "You can't access the transaction repository if you don't initialize it!".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

