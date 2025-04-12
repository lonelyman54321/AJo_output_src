/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class u$a$a$a$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    public u$a$a$a$a(Function2 function2, f80_0 f80_02) {
        this.c = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        u$a$a$a$a u$a$a$a$a = new u$a$a$a$a(function2, f80_02);
        u$a$a$a$a.b = object;
        return u$a$a$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u$a$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u$a$a$a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (i90_0)this.b;
            this.a = n4;
            Function2 function2 = this.c;
            object = function2.invoke(object, this);
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

